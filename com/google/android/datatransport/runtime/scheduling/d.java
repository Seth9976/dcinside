package com.google.android.datatransport.runtime.scheduling;

import B1.b;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import java.util.concurrent.Executor;

@a
@f
@g
public final class d implements c {
    private final r3.c a;
    private final r3.c b;
    private final r3.c c;
    private final r3.c d;
    private final r3.c e;

    public d(r3.c c0, r3.c c1, r3.c c2, r3.c c3, r3.c c4) {
        this.a = c0;
        this.b = c1;
        this.c = c2;
        this.d = c3;
        this.e = c4;
    }

    public static d a(r3.c c0, r3.c c1, r3.c c2, r3.c c3, r3.c c4) {
        return new d(c0, c1, c2, c3, c4);
    }

    public com.google.android.datatransport.runtime.scheduling.c b() {
        return d.c(((Executor)this.a.get()), ((e)this.b.get()), ((y)this.c.get()), ((com.google.android.datatransport.runtime.scheduling.persistence.d)this.d.get()), ((b)this.e.get()));
    }

    public static com.google.android.datatransport.runtime.scheduling.c c(Executor executor0, e e0, y y0, com.google.android.datatransport.runtime.scheduling.persistence.d d0, b b0) {
        return new com.google.android.datatransport.runtime.scheduling.c(executor0, e0, y0, d0, b0);
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

