package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.b.a;
import com.google.android.datatransport.runtime.r;

public final class i implements a {
    public final s a;
    public final r b;
    public final long c;

    public i(s s0, r r0, long v) {
        this.a = s0;
        this.b = r0;
        this.c = v;
    }

    @Override  // B1.b$a
    public final Object execute() {
        return this.a.r(this.b, this.c);
    }
}

