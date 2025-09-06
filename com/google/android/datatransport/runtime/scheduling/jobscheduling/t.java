package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.b;
import android.content.Context;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;
import com.google.android.datatransport.runtime.scheduling.persistence.d;
import java.util.concurrent.Executor;

@a
@f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@g
public final class t implements c {
    private final r3.c a;
    private final r3.c b;
    private final r3.c c;
    private final r3.c d;
    private final r3.c e;
    private final r3.c f;
    private final r3.c g;
    private final r3.c h;
    private final r3.c i;

    public t(r3.c c0, r3.c c1, r3.c c2, r3.c c3, r3.c c4, r3.c c5, r3.c c6, r3.c c7, r3.c c8) {
        this.a = c0;
        this.b = c1;
        this.c = c2;
        this.d = c3;
        this.e = c4;
        this.f = c5;
        this.g = c6;
        this.h = c7;
        this.i = c8;
    }

    public static t a(r3.c c0, r3.c c1, r3.c c2, r3.c c3, r3.c c4, r3.c c5, r3.c c6, r3.c c7, r3.c c8) {
        return new t(c0, c1, c2, c3, c4, c5, c6, c7, c8);
    }

    public s b() {
        return t.c(((Context)this.a.get()), ((e)this.b.get()), ((d)this.c.get()), ((y)this.d.get()), ((Executor)this.e.get()), ((b)this.f.get()), ((com.google.android.datatransport.runtime.time.a)this.g.get()), ((com.google.android.datatransport.runtime.time.a)this.h.get()), ((com.google.android.datatransport.runtime.scheduling.persistence.c)this.i.get()));
    }

    public static s c(Context context0, e e0, d d0, y y0, Executor executor0, b b0, com.google.android.datatransport.runtime.time.a a0, com.google.android.datatransport.runtime.time.a a1, com.google.android.datatransport.runtime.scheduling.persistence.c c0) {
        return new s(context0, e0, d0, y0, executor0, b0, a0, a1, c0);
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

