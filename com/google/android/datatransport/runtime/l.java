package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.e;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;
import java.util.concurrent.Executor;

@a
@f
@g("javax.inject.Singleton")
public final class l implements c {
    static final class com.google.android.datatransport.runtime.l.a {
        private static final l a;

        static {
            com.google.android.datatransport.runtime.l.a.a = new l();
        }
    }

    public static l a() {
        return com.google.android.datatransport.runtime.l.a.a;
    }

    public static Executor b() {
        return (Executor)e.f(k.a());
    }

    public Executor c() {
        return l.b();
    }

    @Override  // r3.c
    public Object get() {
        return this.c();
    }
}

