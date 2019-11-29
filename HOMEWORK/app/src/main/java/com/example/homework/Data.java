package com.example.homework;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class Data extends Application {
    private List<String>Name=new ArrayList<>();
    private List<String>Password=new ArrayList<>();
    public List<String> getName() {
        return Name;
    }

    public void setName(String name) {
        Name.add(name);
    }

    public void setPassword(String password) {
        Password.add(password);
    }
    public int getindexOf(String name){
        return Name.indexOf(name);
    }
    public int getindexOf1(String password){
        return Password.indexOf(password);
    }
    public boolean existence(String name){ return Name.contains(name); }
    public boolean existence1(String password){ return Password.contains(password);}
}
