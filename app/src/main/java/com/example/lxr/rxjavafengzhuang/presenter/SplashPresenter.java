package com.example.lxr.rxjavafengzhuang.presenter;

import com.example.lxr.rxjavafengzhuang.base.BasePresenter;
import com.example.lxr.rxjavafengzhuang.model.SplashModel;
import com.example.lxr.rxjavafengzhuang.view.SplashView;

/**
 * Created by lxr on 2018/1/5.
 */

public class SplashPresenter extends BasePresenter<SplashView> {

    private  SplashModel splashModel;

    public SplashPresenter() {
        splashModel = new SplashModel();
    }

    public void getData() {
        splashModel.getData();
    }
}
