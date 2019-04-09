package com.inner.lovetao.settings.mvp.ui.activity;

import android.os.Bundle;
import android.view.ViewGroup;

import com.inner.lovetao.R;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

/**
 * desc:我的徒弟
 * Created by xcz
 * on 2019/4/3.
 */
public class PupilActivity extends BaseActivity {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_pupil_flutter;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        FlutterView flutterView = Flutter.createView(this, getLifecycle(), "flutter_view");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        addContentView(flutterView, layoutParams);
    }
}

