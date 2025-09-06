package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;

@a
@f({"javax.inject.Named"})
@g
public final class i implements c {
    static final class com.google.android.datatransport.runtime.scheduling.persistence.i.a {
        private static final i a;

        static {
            com.google.android.datatransport.runtime.scheduling.persistence.i.a.a = new i();
        }
    }

    public static i a() {
        return com.google.android.datatransport.runtime.scheduling.persistence.i.a.a;
    }

    // 去混淆评级： 低(20)
    public Integer b() {
        return 7;
    }

    // 去混淆评级： 低(20)
    public static int c() [...] // 潜在的解密器

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

