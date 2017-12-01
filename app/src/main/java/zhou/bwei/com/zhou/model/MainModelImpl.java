package zhou.bwei.com.zhou.model;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import zhou.bwei.com.zhou.IApplication;
import zhou.bwei.com.zhou.bean.Bean;

/**
 * Created by muhanxi on 17/12/1.
 */

public class MainModelImpl {


    /**
     * get 请求
     * @param callBack
     */
    public void getData(final ModelCallBack callBack){

       Call<Bean> call =  IApplication.iGetDataBase.get("2f092bd9ce76c0257052d6d3c93c11b4");

        call.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {

              Bean bean =   response.body();
                callBack.onSuccess(bean);

                // 保存到数据库
                IApplication.session.getDataBeanDao().insertInTx(bean.getResult().getData());
            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {
                callBack.onFailure(new Exception(""));
            }
        });

    }


    /**
     * post 请求
     */
    public void postData(final ModelCallBack callBack){

       Call<Bean> call =  IApplication.iGetDataBase.post("2f092bd9ce76c0257052d6d3c93c11b4");

       call.enqueue(new Callback<Bean>() {
           @Override
           public void onResponse(Call<Bean> call, Response<Bean> response) {
               Bean bean = response.body() ;
                callBack.onSuccess(bean);

           }

           @Override
           public void onFailure(Call<Bean> call, Throwable t) {

               callBack.onFailure(new Exception(""));
           }
       });

    }

}
