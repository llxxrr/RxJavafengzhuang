package com.example.lxr.rxjavafengzhuang.net;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by lxr on 2018/1/5.
 */

public abstract class BaseObserver implements Observer<String>{
    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(String s) {
          success(s);
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
   public abstract  void success(String s);
}
