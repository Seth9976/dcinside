package com.dcinside.app.internal;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class t {
    @l
    private final WeakReference a;

    public t() {
        this(null, 1, null);
    }

    public t(@m Object object0) {
        this.a = new WeakReference(object0);
    }

    public t(Object object0, int v, w w0) {
        if((v & 1) != 0) {
            object0 = null;
        }
        this(object0);
    }

    @m
    public final Object a() {
        return this.a.get();
    }
}

