package com.vungle.ads.internal.ui.view;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class a implements View.OnTouchListener {
    public final b a;

    public a(b b0) {
        this.a = b0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return b.bindListeners$lambda-0(this.a, view0, motionEvent0);
    }
}

