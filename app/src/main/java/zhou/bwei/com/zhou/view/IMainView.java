package zhou.bwei.com.zhou.view;


import zhou.bwei.com.zhou.bean.Bean;

/**
 * Created by muhanxi on 17/12/1.
 */

public interface IMainView {


    public void onSuccess(Bean bean);
    public void onFailure(Exception e);

}
