package com.devyk.ykcomponent;

import android.app.Application;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

import com.devyk.componentlib.ComponentManager;


/**
 * <pre>
 *     author  : devyk on 2019-08-09 17:21
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is App
 * </pre>
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MultiDex.install(this);
        //init 组件 UI 跳转框架
        ComponentManager.init(this);

    }
}
