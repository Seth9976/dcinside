package com.dcinside.app.totalsearch;

import com.dcinside.app.totalsearch.gallery.t;
import com.dcinside.app.totalsearch.gallery.w;
import rx.functions.b;

public final class i implements b {
    public final t a;
    public final String b;

    public i(t t0, String s) {
        this.a = t0;
        this.b = s;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        TotalSearchActivity.t2(this.a, this.b, ((w)object0));
    }
}

