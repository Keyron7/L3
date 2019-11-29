package com.example.homework;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class resignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        final Data app = (Data)getApplication();
        setContentView(R.layout.activity_resign);
        ImageButton button5 = findViewById(R.id.button_back1);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(resignActivity.this,MainActivity.class);
                startActivity(intent3);
            }
        });
        final EditText t1 = findViewById(R.id.yonhuming2);
        Drawable drawable1 = t1.getResources().getDrawable(R.drawable.ic_user);
        drawable1.setBounds(0,0,50,50);
        t1.setCompoundDrawables(drawable1,null,null,null);
        final EditText t2 = findViewById(R.id.yonghumima1);
        Drawable drawable2 = t2.getResources().getDrawable(R.drawable.ic_lock);
        drawable2.setBounds(0,0,50,50);
        t2.setCompoundDrawables(drawable2,null,null,null);
        Button button1 = findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = findViewById(R.id.yonhuming2);
                EditText editText2 = findViewById(R.id.yonghumima1);
                final String newname = editText1.getText().toString();
                final String password = editText2.getText().toString();
                if (newname.length()!=0&&password.length()!=0){
                if (app.getName()==null){
                    app.setName(newname);
                    app.setPassword(password);
                }else if (!app.existence(newname)){
                    app.setName(newname);
                    app.setPassword(password);
                    Toast.makeText(resignActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
                }else if (app.existence(newname)) {
                    Toast.makeText(resignActivity.this, "账户已存在", Toast.LENGTH_SHORT).show();
                }}
                else {
                    Toast.makeText(resignActivity.this,"帐号或密码不能为空",Toast.LENGTH_SHORT).show();
                }
            }
        });
        findViewById(R.id.click2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.click2:
                        InputMethodManager imm = (InputMethodManager)
                                getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                        break;
                }
            }
        });
    }
}
