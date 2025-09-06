package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.e;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import com.google.android.datatransport.runtime.scheduling.persistence.d;

@a
@f({"com.google.android.datatransport.runtime.time.Monotonic"})
@g
public final class i implements c {
    private final r3.c a;
    private final r3.c b;
    private final r3.c c;
    private final r3.c d;

    public i(r3.c c0, r3.c c1, r3.c c2, r3.c c3) {
        this.a = c0;
        this.b = c1;
        this.c = c2;
        this.d = c3;
    }

    public static i a(r3.c c0, r3.c c1, r3.c c2, r3.c c3) {
        return new i(c0, c1, c2, c3);
    }

    public y b() {
        return i.c(((Context)this.a.get()), ((d)this.b.get()), ((com.google.android.datatransport.runtime.scheduling.jobscheduling.g)this.c.get()), ((com.google.android.datatransport.runtime.time.a)this.d.get()));
    }

    public static y c(Context context0, d d0, com.google.android.datatransport.runtime.scheduling.jobscheduling.g g0, com.google.android.datatransport.runtime.time.a a0) {
        return (y)e.f(h.b(context0, d0, g0, a0));
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

