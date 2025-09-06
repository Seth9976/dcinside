package com.dcinside.app.archive.util;

import androidx.appcompat.app.AlertDialog;
import com.dcinside.app.view.k;
import rx.g.a;
import rx.n;

public final class p implements a {
    public final AlertDialog a;
    public final k b;

    public p(AlertDialog alertDialog0, k k0) {
        this.a = alertDialog0;
        this.b = k0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        u.v(this.a, this.b, ((n)object0));
    }
}

