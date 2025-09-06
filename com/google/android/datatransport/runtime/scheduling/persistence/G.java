package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;

@a
@f({"javax.inject.Named"})
@g
public final class com.google.android.datatransport.runtime.scheduling.persistence.g implements c {
    static final class com.google.android.datatransport.runtime.scheduling.persistence.g.a {
        private static final com.google.android.datatransport.runtime.scheduling.persistence.g a;

        static {
            com.google.android.datatransport.runtime.scheduling.persistence.g.a.a = new com.google.android.datatransport.runtime.scheduling.persistence.g();
        }
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.g a() {
        return com.google.android.datatransport.runtime.scheduling.persistence.g.a.a;
    }

    public static String b() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public String c() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    @Override  // r3.c
    public Object get() {
        return "com.google.android.datatransport.events";
    }
}

