package com.example.app2.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseMainActivity<T> extends AppCompatActivity {
    public T paresent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getIcount());
        if(paresent==null){
            paresent=getInterface();
        }
        initView();
        initDate();
    }
    public abstract void initView();
    public abstract void initDate();
    public abstract int getIcount();
    public abstract T getInterface();
}
