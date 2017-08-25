package org.module.main.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import org.module.main.R;

/**
 * Url 动作工具类
 * 实现跨组件 Activity 跳转
 */
public class UrlActionUtil {

    /**
     * 调起 View Module 中的 MainViewActivity
     */
    public static void jump2MainViewActivity(Context context){
        String urlString = context.getString(R.string.app_scheme)
                + "://"
                + context.getString(R.string.host_module_view_MainViewActivity);
        Uri uri = Uri.parse(urlString);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        context.startActivity(intent);
    }


}
