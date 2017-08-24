package org.module.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.mzule.activityrouter.annotation.Router;
import com.github.mzule.activityrouter.router.Routers;

// 只有标记了才能使用路由导航
@Router("main")
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);
        findViewById(R.id.btn_jump_2_view).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // 不适用switch，主要是避免多个库之间出现资源冲突
        int viewId = v.getId();
        if (viewId == R.id.btn_jump_2_view) {
            Routers.open(this, "module://view");
        }
    }
}
