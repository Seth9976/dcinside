package com.dcinside.app.totalsearch;

import com.dcinside.app.totalsearch.gallery.t;
import rx.functions.b;

public final class j implements b {
    public final t a;

    public j(t t0) {
        this.a = t0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        TotalSearchActivity.q2(this.a, ((Throwable)object0));
    }
}

