package com.dcinside.app.util;

import io.realm.F0.d.c;
import java.util.List;

public final class m implements c {
    public final rx.m a;
    public final List b;

    public m(rx.m m0, List list0) {
        this.a = m0;
        this.b = list0;
    }

    @Override  // io.realm.F0$d$c
    public final void onSuccess() {
        n.T(this.a, this.b);
    }
}

