package com.dcinside.app.dccon.setting.list;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class k implements View.OnTouchListener {
    public final l a;

    public k(l l0) {
        this.a = l0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return l.i(this.a, view0, motionEvent0);
    }
}

