package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.b.a;
import java.util.Map;

public final class r implements a {
    public final s a;
    public final Map b;

    public r(s s0, Map map0) {
        this.a = s0;
        this.b = map0;
    }

    @Override  // B1.b$a
    public final Object execute() {
        return this.a.q(this.b);
    }
}

