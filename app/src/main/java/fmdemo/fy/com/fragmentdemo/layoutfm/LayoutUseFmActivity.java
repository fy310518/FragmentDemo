package fmdemo.fy.com.fragmentdemo.layoutfm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import fmdemo.fy.com.fragmentdemo.R;

/**
 * 布局加载 fragment demo
 * Created by fangs on 2018/3/20.
 */
public class LayoutUseFmActivity extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_layout_use_fm);
    }
}
