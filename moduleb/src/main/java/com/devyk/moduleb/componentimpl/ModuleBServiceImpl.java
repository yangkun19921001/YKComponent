package com.devyk.moduleb.componentimpl;


import androidx.fragment.app.Fragment;

import com.devyk.componentlib.componentservice.IComponentService;
import com.devyk.moduleb.ModuleBFragment;

/**
 * <pre>
 *     author  : devyk on 2019-08-08 20:03
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ModuleBServiceImpl 通过接口实现类 将组件入口暴露出去
 * </pre>
 */
public class ModuleBServiceImpl implements IComponentService {
    @Override
    public Fragment getComponentFragment() {
        return ModuleBFragment.newInstance();
    }
}
