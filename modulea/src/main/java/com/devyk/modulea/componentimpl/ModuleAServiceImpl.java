package com.devyk.modulea.componentimpl;


import androidx.fragment.app.Fragment;

import com.devyk.componentlib.componentservice.IComponentService;
import com.devyk.modulea.ModuleAFragment;

/**
 * <pre>
 *     author  : devyk on 2019-08-08 20:30
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ModuleAServiceImpl
 * </pre>
 */
public class ModuleAServiceImpl implements IComponentService {
    @Override
    public Fragment getComponentFragment() {
        return ModuleAFragment.newInstance();
    }
}
