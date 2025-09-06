package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;

@a
@f
@g
public final class j implements c {
    static final class com.google.android.datatransport.runtime.scheduling.persistence.j.a {
        private static final j a;

        static {
            com.google.android.datatransport.runtime.scheduling.persistence.j.a.a = new j();
        }
    }

    public static j a() {
        return com.google.android.datatransport.runtime.scheduling.persistence.j.a.a;
    }

    public e b() {
        return j.c();
    }

    public static e c() {
        return (e)com.google.android.datatransport.runtime.dagger.internal.e.f(com.google.android.datatransport.runtime.scheduling.persistence.f.f());
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

