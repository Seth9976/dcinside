package com.dcinside.app.post.fragments;

import android.widget.FrameLayout;

public final class f3 implements Runnable {
    public final FrameLayout a;

    public f3(FrameLayout frameLayout0) {
        this.a = frameLayout0;
    }

    @Override
    public final void run() {
        N3.v2(this.a);
    }
}

