package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.b.a;
import com.google.android.datatransport.runtime.r;

public final class o implements a {
    public final s a;
    public final Iterable b;
    public final r c;
    public final long d;

    public o(s s0, Iterable iterable0, r r0, long v) {
        this.a = s0;
        this.b = iterable0;
        this.c = r0;
        this.d = v;
    }

    @Override  // B1.b$a
    public final Object execute() {
        return this.a.n(this.b, this.c, this.d);
    }
}

