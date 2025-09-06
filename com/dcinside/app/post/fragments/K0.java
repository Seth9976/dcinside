package com.dcinside.app.post.fragments;

import io.realm.F0.d;
import io.realm.F0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0.h;

public final class k0 implements d {
    public final h a;
    public final Function1 b;
    public final String c;

    public k0(h l0$h0, Function1 function10, String s) {
        this.a = l0$h0;
        this.b = function10;
        this.c = s;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        l0.Y0(this.a, this.b, this.c, f00);
    }
}

