package com.devyk.ykcomponent;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.devyk.componentlib.Constants;
import com.devyk.devykbus.core.YEventBus;
import com.devyk.devykbus.core.YSubscribe;


public class MainActivity extends AppCompatActivity {

    private FragmentTransaction ft;
    private Fragment fragment_a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YEventBus.getDefault().register(this);
    }

    /**
     * 跳转 fragment
     *
     * @param view
     */
    public void startModuleA(View view) {
        if (fragment_a != null) {
            ft = getSupportFragmentManager().beginTransaction();
            ft.remove(fragment_a).commit();
            fragment_a = null;
        }
        fragment_a = (Fragment) ARouter.getInstance().build(Constants.ARoutePath.module_B).navigation();
        ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fl_con, fragment_a).commitAllowingStateLoss();

    }

    /**
     * 跳转 Activity
     *
     * @param view
     */
    public void startModuleB(View view) {
        ARouter.getInstance().build(
                Constants.ARoutePath.module_A
        ).navigation();
    }

    @YSubscribe(tag = "component_send_message")
    public void event(String message) {
        Toast.makeText(getApplicationContext(), "MainActivity 收到消息："+message, Toast.LENGTH_SHORT).show();
    }


}
