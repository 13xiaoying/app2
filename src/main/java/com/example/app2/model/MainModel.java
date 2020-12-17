package com.example.app2.model;

import com.example.app2.contract.MainContract;
import com.example.app2.utils.net.INetWorkCallBack;
import com.example.app2.utils.net.RetrofitUrils;

public class MainModel implements MainContract.MainModel {
    public MainContract.MainPresenter presenter;

    public MainModel(MainContract.MainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getDate(String url, INetWorkCallBack<T> callBack) {
        RetrofitUrils.getInstance().get(url,callBack);
    }
}
