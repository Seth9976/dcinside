package com.dcinside.app.realm;

import io.realm.F0.d;
import io.realm.F0;

public final class p implements d {
    public final String a;
    public final boolean b;
    public final long c;

    public p(String s, boolean z, long v) {
        this.a = s;
        this.b = z;
        this.c = v;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        a.g(this.a, this.b, this.c, f00);
    }
}

