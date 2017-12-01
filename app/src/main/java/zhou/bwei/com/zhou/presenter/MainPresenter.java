package zhou.bwei.com.zhou.presenter;


import zhou.bwei.com.zhou.bean.Bean;
import zhou.bwei.com.zhou.model.MainModelImpl;
import zhou.bwei.com.zhou.model.ModelCallBack;
import zhou.bwei.com.zhou.view.IMainView;

/**
 * Created by muhanxi on 17/12/1.
 */

public class MainPresenter {


    private IMainView iView ;
    private MainModelImpl mainModel ;
    public MainPresenter(IMainView view){
        this.iView = view;
        this.mainModel = new MainModelImpl();

    }


    public void get(){

        mainModel.getData(new ModelCallBack() {
            @Override
            public void onSuccess(Bean bean) {

                if(iView != null){
                    iView.onSuccess(bean);
                }
            }

            @Override
            public void onFailure(Exception e) {
                if(iView != null){
                    iView.onFailure(e);
                }
            }
        });
    }

    public void post(){
        mainModel.postData(new ModelCallBack() {
            @Override
            public void onSuccess(Bean bean) {
                if(iView != null){
                    iView.onSuccess(bean);
                }
            }

            @Override
            public void onFailure(Exception e) {
                if(iView != null){
                    iView.onFailure(e);
                }
            }
        });
    }

}
