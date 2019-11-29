package com.example.homework;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        setContentView(R.layout.activity_main);
        final Button button1= findViewById(R.id.yonghuming);
        Drawable drawable = getResources().getDrawable(R.drawable.ic_user);
        drawable.setBounds(0,0,50,50);
        button1.setCompoundDrawables(drawable,null,null,null);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,loginActivity.class);
                startActivity(intent1);
            }
        });

        Button button2 = findViewById(R.id.xinlangLogin);
        Drawable drawable1 = getResources().getDrawable(R.drawable.account_sina);
        drawable1.setBounds(0,0,50,50);
        button2.setCompoundDrawables(drawable1,null,null,null);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "你选择了新浪微博登录", Toast.LENGTH_SHORT).show();
            }
        });

        Button button3 = findViewById(R.id.tengxun);
        Drawable drawable2 = getResources().getDrawable(R.drawable.account_tencent);
        drawable2.setBounds(0,0,50,50);
        button3.setCompoundDrawables(drawable2,null,null,null);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你选择了腾讯微博登录",Toast.LENGTH_SHORT).show();
            }
        });
        Button resign = findViewById(R.id.button2);
        resign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,resignActivity.class);
                startActivity(intent2);
            }
        });

    }
}
