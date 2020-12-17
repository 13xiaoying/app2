package com.example.app2.model;

import com.example.app2.contract.MainContract;
import com.example.app2.utils.net.INetWorkCallBack;

public class MainModel implements MainContract.MainModel {
    private MainContract.MainPresenter presenter;

    public MainModel(MainContract.MainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getDate(String url, INetWorkCallBack<T> callBack) {
        presenter.fun();
    }
}
