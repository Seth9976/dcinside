package com.dcinside.app.archive.util;

import androidx.appcompat.app.AlertDialog;
import com.dcinside.app.view.q0;
import rx.g.a;
import rx.n;

public final class m implements a {
    public final AlertDialog a;
    public final q0 b;

    public m(AlertDialog alertDialog0, q0 q00) {
        this.a = alertDialog0;
        this.b = q00;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        u.F(this.a, this.b, ((n)object0));
    }
}

