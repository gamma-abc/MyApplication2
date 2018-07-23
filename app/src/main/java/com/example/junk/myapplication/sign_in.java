package com.example.junk.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class sign_in extends AppCompatActivity {
    private Button mBtnLogin;
    private EditText mEtUserName;
    private ImageView mImageView;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mBtnLogin=findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(sign_in.this,"登录成功",Toast.LENGTH_SHORT).show();
            }
        });
        /**
         * 监听事件
         */
        mEtUserName=findViewById(R.id.logon_user);
        mEtUserName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //log.d("edittext", savedInstanceState.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        mImageView=findViewById(R.id.login_back);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sign_in.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
