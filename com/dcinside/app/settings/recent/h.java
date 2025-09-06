package com.dcinside.app.settings.recent;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class h implements View.OnTouchListener {
    public final j a;

    public h(j j0) {
        this.a = j0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return j.h(this.a, view0, motionEvent0);
    }
}

