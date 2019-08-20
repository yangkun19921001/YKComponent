package com.devyk.modulea;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * <pre>
 *     author  : devyk on 2019-08-08 20:31
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ModuleAFragment
 * </pre>
 */

public class ModuleAFragment extends Fragment {


    private static ModuleAFragment fragment;

    public static Fragment newInstance() {
        if (fragment == null)
            fragment = new ModuleAFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_modulea,null);
    }
}
