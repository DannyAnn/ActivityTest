package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "Activity";
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("extra_data","Hello FirstActivity");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG,"Task id is "+getTaskId());
        setContentView(R.layout.second_layout);

        Button button_2 = (Button)findViewById(R.id.button_2);
//        button_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = getIntent();
//                String data = intent.getStringExtra("extra_data");
//                Toast.makeText(SecondActivity.this,data,Toast.LENGTH_SHORT).show();
//            }
//        });

//        button_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.putExtra("extra_data","Hello First Activity");
//                setResult(RESULT_OK,intent);
//                finish();
//            }
//        });

//        button_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SecondActivity.this,FirstActivity.class);
//                startActivity(intent);
//            }
//        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }


}
