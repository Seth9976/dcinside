package com.dcinside.app.archive.util;

import androidx.appcompat.app.AlertDialog;
import com.dcinside.app.view.k;
import rx.functions.a;

public final class r implements a {
    public final k a;
    public final AlertDialog b;

    public r(k k0, AlertDialog alertDialog0) {
        this.a = k0;
        this.b = alertDialog0;
    }

    @Override  // rx.functions.a
    public final void call() {
        u.A(this.a, this.b);
    }
}

