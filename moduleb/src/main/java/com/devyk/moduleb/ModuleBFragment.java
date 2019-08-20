package com.devyk.moduleb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.devyk.componentlib.Constants;

import org.jetbrains.annotations.Nullable;

/**
 * <pre>
 *     author  : devyk on 2019-08-08 20:04
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ModuleBFragment
 * </pre>
 */
@Route(path = Constants.ARoutePath.module_B)
public class ModuleBFragment extends Fragment {

    private View rootView;
    private static ModuleBFragment fragment;

    public static ModuleBFragment newInstance() {
        if (fragment == null)
            fragment = new ModuleBFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_module, container,
                    false);
        }
        return rootView;
    }
}
