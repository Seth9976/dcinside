package com.google.firebase.perf.config;

import android.content.Context;

public final class d implements Runnable {
    public final e a;
    public final Context b;

    public d(e e0, Context context0) {
        this.a = e0;
        this.b = context0;
    }

    @Override
    public final void run() {
        this.a.k(this.b);
    }
}

