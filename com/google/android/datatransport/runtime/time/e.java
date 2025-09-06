package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;

@a
@f({"com.google.android.datatransport.runtime.time.WallTime"})
@g
public final class e implements c {
    static final class com.google.android.datatransport.runtime.time.e.a {
        private static final e a;

        static {
            com.google.android.datatransport.runtime.time.e.a.a = new e();
        }
    }

    public static e a() {
        return com.google.android.datatransport.runtime.time.e.a.a;
    }

    public static com.google.android.datatransport.runtime.time.a b() {
        return (com.google.android.datatransport.runtime.time.a)com.google.android.datatransport.runtime.dagger.internal.e.f(d.a());
    }

    public com.google.android.datatransport.runtime.time.a c() {
        return e.b();
    }

    @Override  // r3.c
    public Object get() {
        return this.c();
    }
}

