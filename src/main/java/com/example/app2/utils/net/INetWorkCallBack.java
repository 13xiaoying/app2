package com.example.app2.utils.net;

public interface INetWorkCallBack<T> {
    void onInit(T a);
    void onError(String error);
}
