package com.example.app2.base;

public class BasePresenter<T extends BaseView> {
    public T iView;

    public void attachView(T v) {
        iView = v;
    }
}
