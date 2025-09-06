package com.vungle.ads.internal;

import android.content.Context;
import kotlin.D;

public final class t implements Runnable {
    public final Context a;
    public final String b;
    public final w c;
    public final D d;

    public t(Context context0, String s, w w0, D d0) {
        this.a = context0;
        this.b = s;
        this.c = w0;
        this.d = d0;
    }

    @Override
    public final void run() {
        w.init$lambda-2(this.a, this.b, this.c, this.d);
    }
}

