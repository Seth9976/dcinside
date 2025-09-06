package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.b.a;
import com.google.android.datatransport.runtime.r;

public final class j implements a {
    public final s a;
    public final r b;
    public final int c;

    public j(s s0, r r0, int v) {
        this.a = s0;
        this.b = r0;
        this.c = v;
    }

    @Override  // B1.b$a
    public final Object execute() {
        return this.a.s(this.b, this.c);
    }
}

