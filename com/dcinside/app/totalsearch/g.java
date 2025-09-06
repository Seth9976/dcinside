package com.dcinside.app.totalsearch;

import io.realm.F0.d.b;

public final class g implements b {
    public final TotalSearchActivity a;

    public g(TotalSearchActivity totalSearchActivity0) {
        this.a = totalSearchActivity0;
    }

    @Override  // io.realm.F0$d$b
    public final void onError(Throwable throwable0) {
        this.a.v2(throwable0);
    }
}

