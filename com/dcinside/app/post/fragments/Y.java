package com.dcinside.app.post.fragments;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class y implements View.OnTouchListener {
    public final z a;

    public y(z z0) {
        this.a = z0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return z.d(this.a, view0, motionEvent0);
    }
}

