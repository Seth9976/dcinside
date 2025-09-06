package com.facebook.imagepipeline.memory;

import kotlin.jvm.internal.w;
import y4.l;

public final class i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final int a;
    @l
    public static final a b = null;
    public static final int c = 0x180;

    static {
        i.b = new a(null);
    }

    public i() {
        this(0, 1, null);
    }

    public i(int v) {
        this.a = v;
    }

    public i(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0x180;
        }
        this(v);
    }

    public final int a() {
        return this.a;
    }
}

