package com.devyk.componentlib.componentservice;


import androidx.fragment.app.Fragment;

/**
 * <pre>
 *     author  : devyk on 2019-08-08 19:58
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is IComponentService 组件中的服务 通过接口暴露出来
 * </pre>
 */
public interface IComponentService {

    /**
     * 拿到组件的组件入口
     * @return
     */
    Fragment getComponentFragment();
}
