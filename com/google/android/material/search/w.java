package com.google.android.material.search;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class w implements View.OnTouchListener {
    public final SearchView a;

    public w(SearchView searchView0) {
        this.a = searchView0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return this.a.K(view0, motionEvent0);
    }
}

