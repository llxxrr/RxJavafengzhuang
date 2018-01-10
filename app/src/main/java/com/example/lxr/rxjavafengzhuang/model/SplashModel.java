package com.example.lxr.rxjavafengzhuang.model;

import android.util.Log;

import com.example.lxr.rxjavafengzhuang.net.BaseObserver;
import com.example.lxr.rxjavafengzhuang.net.RetrofitFactory;

/**
 * Created by lxr on 2018/1/5.
 */

public class SplashModel {

  /*  private  SplashPresenter splashPresenter;

    public SplashModel() {
        splashPresenter = new SplashPresenter();
    }*/

    public void getData() {

       RetrofitFactory.get("https://api-quality.jiemian.com/goodsCat/getBrandList")
                .subscribe(new BaseObserver() {
                    @Override
                    public void success(String s) {
                        Log.i("----",s);
                    }
                });
    }
}
