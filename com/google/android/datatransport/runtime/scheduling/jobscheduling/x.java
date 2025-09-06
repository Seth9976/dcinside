package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.b;
import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;
import com.google.android.datatransport.runtime.scheduling.persistence.d;
import java.util.concurrent.Executor;

@a
@f
@g
public final class x implements c {
    private final r3.c a;
    private final r3.c b;
    private final r3.c c;
    private final r3.c d;

    public x(r3.c c0, r3.c c1, r3.c c2, r3.c c3) {
        this.a = c0;
        this.b = c1;
        this.c = c2;
        this.d = c3;
    }

    public static x a(r3.c c0, r3.c c1, r3.c c2, r3.c c3) {
        return new x(c0, c1, c2, c3);
    }

    public w b() {
        return x.c(((Executor)this.a.get()), ((d)this.b.get()), ((y)this.c.get()), ((b)this.d.get()));
    }

    public static w c(Executor executor0, d d0, y y0, b b0) {
        return new w(executor0, d0, y0, b0);
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

