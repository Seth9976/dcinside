package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.e;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;

@a
@f({"javax.inject.Named"})
@g("javax.inject.Singleton")
public final class h implements c {
    private final r3.c a;

    public h(r3.c c0) {
        this.a = c0;
    }

    public static h a(r3.c c0) {
        return new h(c0);
    }

    public String b() {
        return h.c(((Context)this.a.get()));
    }

    public static String c(Context context0) {
        return (String)e.f(com.google.android.datatransport.runtime.scheduling.persistence.f.d(context0));
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

