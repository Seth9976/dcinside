package com.dcinside.app.archive.util;

import androidx.appcompat.app.AlertDialog;
import kotlin.jvm.internal.L;
import rx.n;
import y4.l;
import y4.m;

public final class v {
    @m
    private AlertDialog a;
    @m
    private n b;

    @m
    public final AlertDialog a() {
        return this.a;
    }

    @m
    public final n b() {
        return this.b;
    }

    public final void c() {
        this.a = null;
        this.b = null;
    }

    public final void d(@l AlertDialog alertDialog0) {
        L.p(alertDialog0, "dialog");
        this.a = alertDialog0;
    }

    public final void e(@l n n0) {
        L.p(n0, "subscriber");
        this.b = n0;
    }
}

