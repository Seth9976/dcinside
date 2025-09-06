package com.dcinside.app.memo;

import android.view.View;

public final class k implements Runnable {
    public final View a;

    public k(View view0) {
        this.a = view0;
    }

    @Override
    public final void run() {
        b.d(this.a);
    }
}

