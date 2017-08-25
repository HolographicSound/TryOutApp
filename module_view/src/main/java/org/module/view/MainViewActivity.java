package org.module.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

// 只有标记了才能使用路由导航
public class MainViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main_view);
    }
}
