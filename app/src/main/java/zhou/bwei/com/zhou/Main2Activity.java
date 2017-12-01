package zhou.bwei.com.zhou;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends Activity {


    @BindView(R.id.simple)
    SimpleDraweeView simple;
    @BindView(R.id.text_view)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        EventBus.getDefault().register(this);


    }

    @Subscribe(sticky = true)
    public void event(EventBean eventBean) {
        simple.setImageURI(eventBean.getUrl());
        textView.setText(eventBean.getTitle());
         Toast.makeText(this, ""+ eventBean.getUrl() + "  " + eventBean.getTitle(), Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
