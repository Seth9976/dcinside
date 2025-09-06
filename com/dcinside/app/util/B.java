package com.dcinside.app.util;

import rx.m;

public final class b implements io.realm.F0.d.b {
    public final m a;

    public b(m m0) {
        this.a = m0;
    }

    @Override  // io.realm.F0$d$b
    public final void onError(Throwable throwable0) {
        n.U(this.a, throwable0);
    }
}

