package com.bumptech.glide.provider;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.load.resource.transcode.g;
import com.bumptech.glide.util.l;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class c {
    private final ArrayMap a;
    private final AtomicReference b;
    private static final t c;

    static {
        List list0 = Collections.emptyList();
        g g0 = new g();
        List list1 = Collections.singletonList(new i(Object.class, Object.class, Object.class, list0, g0, null));
        c.c = new t(Object.class, Object.class, Object.class, list1, null);
    }

    public c() {
        this.a = new ArrayMap();
        this.b = new AtomicReference();
    }

    @Nullable
    public t a(Class class0, Class class1, Class class2) {
        t t0;
        l l0 = this.b(class0, class1, class2);
        synchronized(this.a) {
            t0 = (t)this.a.get(l0);
        }
        this.b.set(l0);
        return t0;
    }

    private l b(Class class0, Class class1, Class class2) {
        l l0 = (l)this.b.getAndSet(null);
        if(l0 == null) {
            l0 = new l();
        }
        l0.b(class0, class1, class2);
        return l0;
    }

    public boolean c(@Nullable t t0) {
        return c.c.equals(t0);
    }

    public void d(Class class0, Class class1, Class class2, @Nullable t t0) {
        synchronized(this.a) {
            ArrayMap arrayMap1 = this.a;
            l l0 = new l(class0, class1, class2);
            if(t0 == null) {
                t0 = c.c;
            }
            arrayMap1.put(l0, t0);
        }
    }
}

