package com.example.app2.utils.net;

public interface INetWorkInterface {
    public <T> void get(String url,INetWorkCallBack<T> callBack);
}
