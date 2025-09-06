package com.dcinside.app.image.edit.draw;

import android.widget.FrameLayout;

public final class b implements Runnable {
    public final boolean a;
    public final FrameLayout b;

    public b(boolean z, FrameLayout frameLayout0) {
        this.a = z;
        this.b = frameLayout0;
    }

    @Override
    public final void run() {
        c.n0(this.a, this.b);
    }
}

