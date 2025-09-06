package com.dcinside.app.post.fragments;

import android.view.ViewPropertyAnimator;

public final class p4 implements Runnable {
    public final ViewPropertyAnimator a;
    public final v4 b;

    public p4(ViewPropertyAnimator viewPropertyAnimator0, v4 v40) {
        this.a = viewPropertyAnimator0;
        this.b = v40;
    }

    @Override
    public final void run() {
        v4.Q(this.a, this.b);
    }
}

