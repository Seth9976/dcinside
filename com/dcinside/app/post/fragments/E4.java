package com.dcinside.app.post.fragments;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class e4 implements View.OnTouchListener {
    public final k4 a;

    public e4(k4 k40) {
        this.a = k40;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return k4.i(this.a, view0, motionEvent0);
    }
}

