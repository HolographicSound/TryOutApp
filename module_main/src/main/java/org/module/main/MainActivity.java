package org.module.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.module.main.util.UrlActionUtil;

// 只有标记了才能使用路由导航
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);
        findViewById(R.id.btn_jump_2_view).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // 不使用 switch ，主要是避免多个库之间出现资源冲突
        int viewId = v.getId();
        if (viewId == R.id.btn_jump_2_view) {
            UrlActionUtil.jump2MainViewActivity(this);
        }
    }
}
