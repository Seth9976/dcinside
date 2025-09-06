package com.dcinside.app.post.fragments;

import com.dcinside.app.rx.bus.A;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

final class S0.L extends N implements Function1 {
    final S0 e;

    S0.L(S0 s00) {
        this.e = s00;
        super(1);
    }

    public final void a(A a0) {
        L.m(a0);
        this.e.S3(a0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((A)object0));
        return kotlin.S0.a;
    }
}

