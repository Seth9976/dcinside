package com.dcinside.app.archive.folder;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class e implements View.OnTouchListener {
    public final g a;

    public e(g g0) {
        this.a = g0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return g.h(this.a, view0, motionEvent0);
    }
}

