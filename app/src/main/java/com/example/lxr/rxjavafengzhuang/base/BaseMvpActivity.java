package com.example.lxr.rxjavafengzhuang.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lxr.rxjavafengzhuang.R;

public abstract class BaseMvpActivity<V,T extends BasePresenter<V>> extends IActivity {
     public T basePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_mvp);
        basePresenter=initPresenter();
    }

    protected abstract T initPresenter();

    @Override
    protected void onResume() {
        super.onResume();
        basePresenter.attach((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        basePresenter.detach();
    }
}
