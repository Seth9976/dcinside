package com.dcinside.app.gallery.info;

import rx.functions.b;

public final class r implements b {
    public final boolean a;
    public final u b;
    public final MinorMoreActivity c;

    public r(boolean z, u u0, MinorMoreActivity minorMoreActivity0) {
        this.a = z;
        this.b = u0;
        this.c = minorMoreActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        u.r0(this.a, this.b, this.c, ((Throwable)object0));
    }
}

