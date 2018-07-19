package com.example.junk.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class twopage extends AppCompatActivity {
    private Button mBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twopage);
        mBtn3=findViewById(R.id.bt_4);
        //一种常用的点击弹窗的方法
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(twopage.this,"我也被点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }
    //这种点击弹窗的方法基本不用
    public void show_Toast(View View){
        //Toast.makeText(this,"你好",Toast.LENGTH_SHORT ).show();
        Toast.makeText(this,"你好啊,我被点击了",Toast.LENGTH_SHORT).show();
    }
}
