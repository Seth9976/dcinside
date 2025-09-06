package com.dcinside.app.base;

import androidx.core.view.WindowInsetsControllerCompat;

public final class a implements Runnable {
    public final WindowInsetsControllerCompat a;

    public a(WindowInsetsControllerCompat windowInsetsControllerCompat0) {
        this.a = windowInsetsControllerCompat0;
    }

    @Override
    public final void run() {
        d.C1(this.a);
    }
}

