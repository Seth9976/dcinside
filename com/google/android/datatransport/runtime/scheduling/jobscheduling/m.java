package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.b.a;
import com.google.android.datatransport.runtime.r;

public final class m implements a {
    public final s a;
    public final r b;

    public m(s s0, r r0) {
        this.a = s0;
        this.b = r0;
    }

    @Override  // B1.b$a
    public final Object execute() {
        return this.a.l(this.b);
    }
}

