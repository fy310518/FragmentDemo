package fmdemo.fy.com.fragmentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import fmdemo.fy.com.fragmentdemo.dynamicfm.DynamicUseFmActivity;
import fmdemo.fy.com.fragmentdemo.layoutfm.LayoutUseFmActivity;

/**
 * MainActivity 进入不同demo 界面
 * Created by fangs on 2018/3/20.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tvUseOne).setOnClickListener(this);
        findViewById(R.id.tvUseTwo).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvUseOne:
                startActivity(new Intent(this, LayoutUseFmActivity.class));
                break;
            case R.id.tvUseTwo:
                startActivity(new Intent(this, DynamicUseFmActivity.class));
                break;
        }
    }
}
