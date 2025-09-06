package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.c;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.dagger.internal.g;

@a
@f
@g("javax.inject.Singleton")
public final class m implements c {
    private final r3.c a;
    private final r3.c b;

    public m(r3.c c0, r3.c c1) {
        this.a = c0;
        this.b = c1;
    }

    public static m a(r3.c c0, r3.c c1) {
        return new m(c0, c1);
    }

    public l b() {
        return m.c(((Context)this.a.get()), this.b.get());
    }

    public static l c(Context context0, Object object0) {
        return new l(context0, ((j)object0));
    }

    @Override  // r3.c
    public Object get() {
        return this.b();
    }
}

