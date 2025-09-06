package com.dcinside.app.bookmark;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class b implements View.OnTouchListener {
    public final c a;

    public b(c c0) {
        this.a = c0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return c.f(this.a, view0, motionEvent0);
    }
}

