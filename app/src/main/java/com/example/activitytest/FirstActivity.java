package com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG = "Activity";
    //@Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        switch (requestCode){
//            case 1:
//                if(resultCode==RESULT_OK)
//                {
//                    Toast.makeText(this,data.getStringExtra("extra_data").toString(),Toast.LENGTH_SHORT).show();
//                }
//
//                break;
//            default:
//        }
//    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    Toast.makeText(FirstActivity.this,data.getStringExtra("extra_data").toString(),Toast.LENGTH_SHORT).show();
                }
            default:
        }
    }

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.d(TAG,this.toString());
        Log.d(TAG,"Task id is "+getTaskId());
        setContentView(R.layout.first_layout);

        Button button_1 = (Button)findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Toast在活动中创建
//                Toast.makeText(FirstActivity.this,"You clicked the Button",Toast.LENGTH_SHORT).show();
//
//                使用显式intent
//                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
//                startActivity(intent);

//                隐式intent
//                隐式intent通过指定一系列action，category等信息，然后交给系统分析并且帮我们找到合适intent
//                其中action 和 category 中的属性值都可以自己定义
//                Intent intent = new Intent("com.example.activitytest.ACTION_START");
//                intent.addCategory("com.example.activitytest.MY_CATEGORY");
//                startActivity(intent);

//                隐式intent的更多用法
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                startActivity(intent);


//                隐式intent的更多用法 用来呼叫电话
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:1008611"));
//                startActivity(intent);


//                向下一个活动传递数据
//                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
//                intent.putExtra("extra_data","Hello SecondActivity");
//                startActivity(intent);


//                向上一个活动返回数据
//                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
//                startActivityForResult(intent,1);

//                standrad 是活动默认的启动方式，该方式无论栈顶是哪一个活动，
//                都会创建一个新的活动加入到栈顶的位置
//                Intent intent = new Intent(FirstActivity.this,FirstActivity.class);
//                startActivity(intent);

//                singleTop 启动方式会先检查一下栈顶是否为该活动
//                如果是的话不再创建，否则的话就会创建一个新的活动
//                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
//                startActivity(intent);

//                singleTask启动方式会检查一下栈内是否存在该活动
//                如果存在的话置入栈顶，否则的话重新创建
//                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
//                startActivity(intent);

                //singleInstance会启动一个返回栈来管理这个活动
                //这个活动在返回栈中被封装成类似的单例模式，可以由多个程序共享
                //但每次只能允许一个程序对其进行操作
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });




    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    //    在活动中使用menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //第一个参数是按钮布局文件所在的位置
        //第二个参数是需要将指定菜单项添加到一个menu对象中，我们直接使用传入的menu
        getMenuInflater().inflate(R.menu.main,menu);
        return  true;
    }

    //为menu创建监听事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return  true;
    }


}
