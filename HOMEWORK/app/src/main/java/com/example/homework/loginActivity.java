package com.example.homework;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        setContentView(R.layout.activity_main2);
        final Data app = (Data)getApplication();
        EditText t1 = findViewById(R.id.yonhuming1);
        Drawable drawable1 = t1.getResources().getDrawable(R.drawable.ic_user);
        drawable1.setBounds(0,0,50,50);
        t1.setCompoundDrawables(drawable1,null,null,null);
        EditText t2 = findViewById(R.id.yonghumima);
        Drawable drawable2 = t2.getResources().getDrawable(R.drawable.ic_lock);
        drawable2.setBounds(0,0,50,50);
        t2.setCompoundDrawables(drawable2,null,null,null);
        ImageButton button4 = findViewById(R.id.button_back);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(loginActivity.this,MainActivity.class);
                startActivity(intent2);
            }
        });
        Button button1 = findViewById(R.id.login);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText text1 = findViewById(R.id.yonhuming1);
                EditText text2 = findViewById(R.id.yonghumima);
                final String name = text1.getText().toString();
                final String password = text2.getText().toString();
                if (app.existence(name) && app.existence1(password)&&app.getindexOf(name)==app.getindexOf1(password)){
                    Toast.makeText(loginActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                    Intent intenteyes = new Intent(loginActivity.this,EyesActivity.class);
                    startActivity(intenteyes);
                }else if (!app.existence(name)||!app.existence1(password)||app.getindexOf(name)!=app.getindexOf1(password)){
                    Toast.makeText(loginActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
        findViewById(R.id.click1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.click1:
                        InputMethodManager imm = (InputMethodManager)
                                getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                        break;
                }
            }
        });

    }
}
