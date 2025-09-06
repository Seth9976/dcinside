package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.b.a;

public final class p implements a {
    public final s a;
    public final Iterable b;

    public p(s s0, Iterable iterable0) {
        this.a = s0;
        this.b = iterable0;
    }

    @Override  // B1.b$a
    public final Object execute() {
        return this.a.o(this.b);
    }
}

