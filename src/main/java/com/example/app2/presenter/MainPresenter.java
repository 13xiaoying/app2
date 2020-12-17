package com.example.app2.presenter;

import com.example.app2.base.BaseMainActivity;
import com.example.app2.base.BasePresenter;
import com.example.app2.bean.ProBean;
import com.example.app2.contract.MainContract;
import com.example.app2.model.MainModel;
import com.example.app2.utils.net.INetWorkCallBack;
import com.example.app2.utils.net.URLContstant;

import java.util.List;

public class MainPresenter extends BasePresenter<MainContract.MainView> implements MainContract.MainPresenter {
    public final MainModel mainModel;

    public MainPresenter(MainContract.MainView mainView) {
        this.mainModel = new MainModel(this);
    }

    @Override
    public void fun() {
        mainModel.getDate(URLContstant.url, new INetWorkCallBack<ProBean>() {
            @Override
            public void onInit(ProBean a) {
                List<ProBean.ResultsBean> results = a.getResults();
                iView.onInit(a);
            }

            @Override
            public void onError(String error) {
                iView.onError(error);
            }
        });
    }
}
