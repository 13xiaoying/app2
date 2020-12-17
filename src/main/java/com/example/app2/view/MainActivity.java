package com.example.app2.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app2.HomeMadapter;
import com.example.app2.R;
import com.example.app2.base.BaseMainActivity;
import com.example.app2.bean.ProBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView mViewRv;
    private ArrayList<ProBean.ResultsBean> list;
    private HomeMadapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mViewRv = (RecyclerView) findViewById(R.id.rv_view);
        list = new ArrayList<>();
        madapter = new HomeMadapter(this,list);
        mViewRv.setAdapter(madapter);
        mViewRv.setLayoutManager(new LinearLayoutManager(this));
        mViewRv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}
