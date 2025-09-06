package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;

@a
@f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@g
public final class k implements c {
    private final r3.c a;
    private final r3.c b;
    private final r3.c c;

    public k(r3.c c0, r3.c c1, r3.c c2) {
        this.a = c0;
        this.b = c1;
        this.c = c2;
    }

    public static k a(r3.c c0, r3.c c1, r3.c c2) {
        return new k(c0, c1, c2);
    }

    public j b() {
        return k.c(((Context)this.a.get()), ((com.google.android.datatransport.runtime.time.a)this.b.get()), ((com.google.android.datatransport.runtime.time.a)this.c.get()));
    }

    public static j c(Context context0, com.google.android.datatransport.runtime.time.a a0, com.google.android.datatransport.runtime.time.a a1) {
        return new j(context0, a0, a1);
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

