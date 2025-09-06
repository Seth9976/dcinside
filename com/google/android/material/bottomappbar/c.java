package com.google.android.material.bottomappbar;

import android.view.View;

public final class c implements Runnable {
    public final View a;

    public c(View view0) {
        this.a = view0;
    }

    @Override
    public final void run() {
        this.a.requestLayout();
    }
}

