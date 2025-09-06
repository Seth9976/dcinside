package com.dcinside.app.realm;

import io.realm.F0.d.c;
import io.realm.F0;
import kotlin.jvm.functions.Function1;

public final class w implements c {
    public final Function1 a;
    public final F0 b;
    public final String c;

    public w(Function1 function10, F0 f00, String s) {
        this.a = function10;
        this.b = f00;
        this.c = s;
    }

    @Override  // io.realm.F0$d$c
    public final void onSuccess() {
        a.g(this.a, this.b, this.c);
    }
}

