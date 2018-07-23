package com.example.junk.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView=findViewById(R.id.Bottom_Button_1);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到TEXT View
                Intent intent=new Intent(MainActivity.this,twopage.class);
                startActivity(intent);
            }
        });
        mBtnEditText=findViewById(R.id.bt_4);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到登录界面
                Intent intent=new Intent(MainActivity.this,sign_in.class);
                startActivity(intent);
            }
        });
    }
}
