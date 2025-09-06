package com.dcinside.app.realm;

import com.dcinside.app.base.g;
import io.realm.F0.d.c;
import kotlin.jvm.internal.l0.h;

public final class q0 implements c {
    public final h a;
    public final g b;
    public final String c;

    public q0(h l0$h0, g g0, String s) {
        this.a = l0$h0;
        this.b = g0;
        this.c = s;
    }

    @Override  // io.realm.F0$d$c
    public final void onSuccess() {
        a.j(this.a, this.b, this.c);
    }
}

