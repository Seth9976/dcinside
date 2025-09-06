package com.dcinside.app.realm;

import io.realm.F0.d;
import io.realm.F0;
import kotlin.jvm.functions.Function1;

public final class u implements d {
    public final String a;
    public final Function1 b;

    public u(String s, Function1 function10) {
        this.a = s;
        this.b = function10;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        a.k(this.a, this.b, f00);
    }
}

