package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.e;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;

@a
@f({"com.google.android.datatransport.runtime.time.WallTime"})
@g
public final class com.google.android.datatransport.runtime.scheduling.g implements c {
    private final r3.c a;

    public com.google.android.datatransport.runtime.scheduling.g(r3.c c0) {
        this.a = c0;
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.g a(com.google.android.datatransport.runtime.time.a a0) {
        return (com.google.android.datatransport.runtime.scheduling.jobscheduling.g)e.f(com.google.android.datatransport.runtime.scheduling.f.a(a0));
    }

    public static com.google.android.datatransport.runtime.scheduling.g b(r3.c c0) {
        return new com.google.android.datatransport.runtime.scheduling.g(c0);
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.g c() {
        return com.google.android.datatransport.runtime.scheduling.g.a(((com.google.android.datatransport.runtime.time.a)this.a.get()));
    }

    @Override  // r3.c
    public Object get() {
        return this.c();
    }
}

