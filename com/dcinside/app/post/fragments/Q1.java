package com.dcinside.app.post.fragments;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class q1 implements View.OnTouchListener {
    public final r1 a;

    public q1(r1 r10) {
        this.a = r10;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return r1.l0(this.a, view0, motionEvent0);
    }
}

