package com.dcinside.app.post;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class x implements View.OnTouchListener {
    public final c0 a;

    public x(c0 c00) {
        this.a = c00;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return c0.S3(this.a, view0, motionEvent0);
    }
}

