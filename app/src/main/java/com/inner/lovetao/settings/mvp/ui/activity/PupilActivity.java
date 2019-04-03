package com.inner.lovetao.settings.mvp.ui.activity;

import android.os.Bundle;

import com.inner.lovetao.settings.flutter.FlutterPluginCounter;
import com.inner.lovetao.settings.flutter.FlutterPluginJumpToAct;

import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.GeneratedPluginRegistrant;

/**
 * desc:我的徒弟
 * Created by xcz
 * on 2019/4/3.
 */
public class PupilActivity extends FlutterActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GeneratedPluginRegistrant.registerWith(this);
        registerCustomPlugin(this);
    }

    private static void registerCustomPlugin(PluginRegistry registrar) {
        FlutterPluginJumpToAct.registerWith(registrar.registrarFor(FlutterPluginJumpToAct.CHANNEL));
        FlutterPluginCounter.registerWith(registrar.registrarFor(FlutterPluginCounter.CHANNEL));
    }
}

