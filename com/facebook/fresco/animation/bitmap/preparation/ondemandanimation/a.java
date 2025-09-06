package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import java.io.Closeable;
import kotlin.jvm.internal.L;
import y4.l;

public final class a implements Closeable {
    private int a;
    @l
    private final com.facebook.common.references.a b;

    public a(int v, @l com.facebook.common.references.a a0) {
        L.p(a0, "bitmap");
        super();
        this.a = v;
        this.b = a0;
    }

    @l
    public final com.facebook.common.references.a a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean c() {
        return this.b.q();
    }

    @Override
    public void close() {
        this.b.close();
    }

    public final boolean e(int v) {
        return this.a == v && this.b.q();
    }

    public final void f(int v) {
        this.a = v;
    }
}

