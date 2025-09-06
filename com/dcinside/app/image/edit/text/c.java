package com.dcinside.app.image.edit.text;

import android.widget.FrameLayout;

public final class c implements Runnable {
    public final boolean a;
    public final FrameLayout b;

    public c(boolean z, FrameLayout frameLayout0) {
        this.a = z;
        this.b = frameLayout0;
    }

    @Override
    public final void run() {
        d.n0(this.a, this.b);
    }
}

