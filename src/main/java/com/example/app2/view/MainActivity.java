package com.example.app2.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app2.HomeMadapter;
import com.example.app2.R;
import com.example.app2.base.BaseMainActivity;
import com.example.app2.base.BaseView;
import com.example.app2.bean.ProBean;
import com.example.app2.contract.MainContract;
import com.example.app2.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseMainActivity<MainPresenter> implements MainContract.MainView {

    public RecyclerView mViewRv;
    public ArrayList<ProBean.ResultsBean> list;
    public HomeMadapter madapter;

    @Override
    public void initView() {
        mViewRv = (RecyclerView) findViewById(R.id.rv_view);
        list = new ArrayList<>();
        madapter = new HomeMadapter(this, list);
        mViewRv.setAdapter(madapter);
        mViewRv.setLayoutManager(new LinearLayoutManager(this));
        mViewRv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }


    @Override
    public void initDate() {
        paresent.fun();
    }

    @Override
    public int getIcount() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenter getInterface() {
        return new MainPresenter(this);
    }

    @Override
    public void onInit(ProBean proBean) {
        List<ProBean.ResultsBean> results = proBean.getResults();
        list.addAll(results);
        madapter.notifyDataSetChanged();
    }

    @Override
    public void onError(String Error) {

    }
}
