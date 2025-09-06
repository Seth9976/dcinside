package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.e;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;

@a
@f({"com.google.android.datatransport.runtime.time.Monotonic"})
@g
public final class com.google.android.datatransport.runtime.time.f implements c {
    static final class com.google.android.datatransport.runtime.time.f.a {
        private static final com.google.android.datatransport.runtime.time.f a;

        static {
            com.google.android.datatransport.runtime.time.f.a.a = new com.google.android.datatransport.runtime.time.f();
        }
    }

    public static com.google.android.datatransport.runtime.time.f a() {
        return com.google.android.datatransport.runtime.time.f.a.a;
    }

    public com.google.android.datatransport.runtime.time.a b() {
        return com.google.android.datatransport.runtime.time.f.c();
    }

    public static com.google.android.datatransport.runtime.time.a c() {
        return (com.google.android.datatransport.runtime.time.a)e.f(d.b());
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

