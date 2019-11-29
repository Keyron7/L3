package com.example.homework;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class EyesActivity extends AppCompatActivity {

    private List<Eyes> eyesList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eyes);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        initEyes();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        EyesAdapter adapter = new EyesAdapter(eyesList);
        recyclerView.setAdapter(adapter);
    }
    private void initEyes(){
            Eyes t0 = new Eyes("吴亦凡觉得很赞",R.drawable.dianzan);
            eyesList.add(t0);
            Eyes t1 = new Eyes("GIAO哥觉得很赞",R.drawable.dianzan);
            eyesList.add(t1);
            Eyes t2 = new Eyes("奥利给觉得很赞",R.drawable.dianzan);
            eyesList.add(t2);
            Eyes t3 = new Eyes("司马老贼觉得很赞",R.drawable.dianzan);
            eyesList.add(t3);
            Eyes t4 = new Eyes("你太强了",R.drawable.dianzan);
            eyesList.add(t4);
            Eyes t5 = new Eyes("退群吧",R.drawable.dianzan);
            eyesList.add(t5);
            Eyes t6 = new Eyes("这个界面做的真丑",R.drawable.dianzan);
            eyesList.add(t6);
            Eyes t7 = new Eyes("我编不下去了",R.drawable.dianzan);
            eyesList.add(t7);
            Eyes t8 = new Eyes("那就这样吧",R.drawable.dianzan);
            eyesList.add(t8);
    }
}
