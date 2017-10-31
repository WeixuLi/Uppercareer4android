package cn.uppercareer.uppercareer_app;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by 欢欢盼盼和肉包 on 2017/10/31.
 */

public class MyLeanCloudApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this,"5ptNj5fF9TplwYYNYo34Ujmi-gzGzoHsz","oxEMyVyz3XmlI8URg87Xp1l5");
    }
}
