package zhou.bwei.com.zhou;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import zhou.bwei.com.zhou.adapter.IApdater;
import zhou.bwei.com.zhou.bean.Bean;
import zhou.bwei.com.zhou.presenter.MainPresenter;
import zhou.bwei.com.zhou.view.IMainView;
//http://v.juhe.cn/toutiao/index?type="+data+"&key=2f092bd9ce76c0257052d6d3c93c11b4
public class MainActivity extends Activity implements IMainView{

    @BindView(R.id.recyclerview)
    RecyclerView recycleview;
    private MainPresenter presenter;
    private IApdater adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        presenter = new MainPresenter(this);
        presenter.get();


        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        adapter = new IApdater(this);

        recycleview.setLayoutManager(manager);
        recycleview.setAdapter(adapter);


        List<DataBean> listBeans =  IApplication.session.getDataBeanDao().loadAll();

        for(DataBean bean : listBeans){
            System.out.println(bean.toString());
        }



    }

    @Override
    public void onSuccess(Bean bean) {
        adapter.addData(bean);
    }

    @Override
    public void onFailure(Exception e) {

    }
}
