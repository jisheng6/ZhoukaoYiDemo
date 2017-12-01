package zhou.bwei.com.zhou;


import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import org.greenrobot.greendao.database.Database;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import zhou.bwei.com.zhou.dao.DaoMaster;
import zhou.bwei.com.zhou.dao.DaoSession;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/12/1 15:04
 */
public class IApplication  extends Application {
    public static IGetDataBase iGetDataBase;
    public static DaoSession session;


    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        Retrofit retrofit=new Retrofit.Builder().baseUrl("http://v.juhe.cn")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        iGetDataBase = retrofit.create(IGetDataBase.class);

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"test");

        Database database =  helper.getWritableDb();

        session = new DaoMaster(database).newSession();

    }
}
