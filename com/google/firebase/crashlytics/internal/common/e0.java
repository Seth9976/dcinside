package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.F.f.d;

public final class e0 implements Runnable {
    public final f0 a;
    public final d b;
    public final String c;
    public final boolean d;

    public e0(f0 f00, d f$f$d0, String s, boolean z) {
        this.a = f00;
        this.b = f$f$d0;
        this.c = s;
        this.d = z;
    }

    @Override
    public final void run() {
        this.a.r(this.b, this.c, this.d);
    }
}

