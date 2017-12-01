package zhou.bwei.com.zhou;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import zhou.bwei.com.zhou.bean.Bean;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/1 14:55
 */
//http://v.juhe.cn/toutiao/index?type="+data+"&key=2f092bd9ce76c0257052d6d3c93c11b4

public interface IGetDataBase {
    @GET("/toutiao/index")
    Call<Bean> get(@Query("key") String key);
/**
 * post请求
 *
 */
@FormUrlEncoded
    @POST("/toutiao/index")
    Call<Bean> post(@Field("key") String key);
}
