package org.hjf.tryout;


import com.github.mzule.activityrouter.annotation.Modules;

import org.lib.common.base.BaseApplication;


// 使用 activity router 的注释处理器 管理我们申明的所有组件。注意：每个业务组件根目录下建立类，用 注解@Module 声明这个业务组件
@Modules({"main", "view"})
public class MyApplication extends BaseApplication {
}
