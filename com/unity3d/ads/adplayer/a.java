package com.unity3d.ads.adplayer;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class a implements View.OnTouchListener {
    public final AndroidWebViewContainer a;

    public a(AndroidWebViewContainer androidWebViewContainer0) {
        this.a = androidWebViewContainer0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return AndroidWebViewContainer._init_$lambda$1(this.a, view0, motionEvent0);
    }
}

