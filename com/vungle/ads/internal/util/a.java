package com.vungle.ads.internal.util;

import android.content.Context;

public final class a implements Runnable {
    public final Context a;
    public final b b;

    public a(Context context0, b b0) {
        this.a = context0;
        this.b = b0;
    }

    @Override
    public final void run() {
        b.init$lambda-0(this.a, this.b);
    }
}

