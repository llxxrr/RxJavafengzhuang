package com.example.lxr.rxjavafengzhuang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lxr.rxjavafengzhuang.base.BaseMvpActivity;
import com.example.lxr.rxjavafengzhuang.base.BasePresenter;
import com.example.lxr.rxjavafengzhuang.base.IActivity;
import com.example.lxr.rxjavafengzhuang.presenter.SplashPresenter;
import com.example.lxr.rxjavafengzhuang.view.SplashView;

public class MainActivity extends BaseMvpActivity <SplashView,SplashPresenter>{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        basePresenter.getData();
    }

    @Override
    protected SplashPresenter initPresenter() {
        return new SplashPresenter();
    }


}
