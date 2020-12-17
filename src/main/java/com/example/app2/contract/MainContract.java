package com.example.app2.contract;

import com.example.app2.bean.ProBean;
import com.example.app2.utils.net.INetWorkCallBack;

public class MainContract {
    public interface MainModel{
        <T> void getDate(String url, INetWorkCallBack<T> callBack);
    }
    public interface MainPresenter{
        void fun();
    }
    public interface MainView{
        void onInit(ProBean proBean);
        void onError(String Error);
    }
}
