package com.example.lxr.rxjavafengzhuang.base;

/**
 * Created by lxr on 2018/1/5.
 */

public abstract class BasePresenter<T> {
    public T view;
    public void attach(T view) {
        this.view = view;
    }
    //防止内存泄漏,将对象置为null
    public void detach() {
        this.view = null;
    }
}
