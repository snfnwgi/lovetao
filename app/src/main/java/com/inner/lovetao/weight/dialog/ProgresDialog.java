package com.inner.lovetao.weight.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;

import com.inner.lovetao.R;

/**
 * desc:
 * Created by xcz
 * on 2019/3/4.
 */
public class ProgresDialog extends Dialog {
    public ProgresDialog(@NonNull Context context) {
        super(context, R.style.public_dialog_progress);
        setContentView(R.layout.public_dialog_porgress);
        setCanceledOnTouchOutside(false);
    }
}