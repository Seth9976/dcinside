package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class j implements View.OnTouchListener {
    public final p a;

    public j(p p0) {
        this.a = p0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return this.a.M(view0, motionEvent0);
    }
}

