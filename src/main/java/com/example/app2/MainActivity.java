package com.example.app2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app2.base.BaseMainActivity;
import com.example.app2.bean.ProBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView mViewRv;
    private ArrayList<ProBean.ResultsBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mViewRv = (RecyclerView) findViewById(R.id.rv_view);
        list = new ArrayList<>();

    }
}
