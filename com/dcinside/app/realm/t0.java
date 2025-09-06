package com.dcinside.app.realm;

import io.realm.F0.d;
import io.realm.F0;

public final class t0 implements d {
    public final Integer a;
    public final s0 b;
    public final boolean c;

    public t0(Integer integer0, s0 s00, boolean z) {
        this.a = integer0;
        this.b = s00;
        this.c = z;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        c.c(this.a, this.b, this.c, f00);
    }
}

