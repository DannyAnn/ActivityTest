package com.example.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity {

    private static final String TAG = "Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG,"Task id is "+getTaskId());
        setContentView(R.layout.third_activity);

        Button button_3 = (Button)findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCollector.finishAll();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }



}
