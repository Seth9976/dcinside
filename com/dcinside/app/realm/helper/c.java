package com.dcinside.app.realm.helper;

import io.realm.F0.d;
import io.realm.F0;
import java.util.List;
import kotlin.jvm.internal.l0.f;

public final class c implements d {
    public final List a;
    public final long b;
    public final f c;

    public c(List list0, long v, f l0$f0) {
        this.a = list0;
        this.b = v;
        this.c = l0$f0;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        a.g(this.a, this.b, this.c, f00);
    }
}

