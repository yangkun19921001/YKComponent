package com.devyk.modulea;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.devyk.componentlib.Constants;
import com.devyk.devykbus.core.YEventBus;
import com.devyk.devykbus.core.YSubscribe;

/**
 * <pre>
 *     author  : devyk on 2019-08-09 17:13
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ModuleAActivity
 * </pre>
 */
@Route(path = Constants.ARoutePath.module_A)
public class ModuleAActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_a_activity);


    }


    /**
     * 组件间通信
     * @param view
     */
    public void sendMessage(View view) {
        YEventBus.getDefault().post("component_send_message", "  ModuleAActivity");
    }


}
