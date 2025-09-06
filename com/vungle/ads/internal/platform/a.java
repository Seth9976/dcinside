package com.vungle.ads.internal.platform;

import androidx.core.util.Consumer;

public final class a implements Runnable {
    public final c a;
    public final Consumer b;

    public a(c c0, Consumer consumer0) {
        this.a = c0;
        this.b = consumer0;
    }

    @Override
    public final void run() {
        c.getUserAgentLazy$lambda-0(this.a, this.b);
    }
}

