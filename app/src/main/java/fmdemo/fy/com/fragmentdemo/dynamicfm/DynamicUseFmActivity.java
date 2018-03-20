package fmdemo.fy.com.fragmentdemo.dynamicfm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import fmdemo.fy.com.fragmentdemo.Fragment1;
import fmdemo.fy.com.fragmentdemo.R;

/**
 * 动态添加 fragment demo(含 activity 生命周期 日子打印)
 * Created by fangs on 2018/3/20.
 */
public class DynamicUseFmActivity extends AppCompatActivity{

    public static final String TAG = "Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG, "onCreate()");
        setContentView(R.layout.activity_layout_use_dynamic);

        Fragment1 fragment1 = new Fragment1();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_layout, fragment1)
                .commit();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy()");
    }
}
