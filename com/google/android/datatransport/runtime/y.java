package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;
import com.google.android.datatransport.runtime.scheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;

@a
@f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@g("javax.inject.Singleton")
public final class y implements c {
    private final r3.c a;
    private final r3.c b;
    private final r3.c c;
    private final r3.c d;
    private final r3.c e;

    public y(r3.c c0, r3.c c1, r3.c c2, r3.c c3, r3.c c4) {
        this.a = c0;
        this.b = c1;
        this.c = c2;
        this.d = c3;
        this.e = c4;
    }

    public static y a(r3.c c0, r3.c c1, r3.c c2, r3.c c3, r3.c c4) {
        return new y(c0, c1, c2, c3, c4);
    }

    public w b() {
        return y.c(((com.google.android.datatransport.runtime.time.a)this.a.get()), ((com.google.android.datatransport.runtime.time.a)this.b.get()), ((e)this.c.get()), ((s)this.d.get()), ((com.google.android.datatransport.runtime.scheduling.jobscheduling.w)this.e.get()));
    }

    public static w c(com.google.android.datatransport.runtime.time.a a0, com.google.android.datatransport.runtime.time.a a1, e e0, s s0, com.google.android.datatransport.runtime.scheduling.jobscheduling.w w0) {
        return new w(a0, a1, e0, s0, w0);
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

