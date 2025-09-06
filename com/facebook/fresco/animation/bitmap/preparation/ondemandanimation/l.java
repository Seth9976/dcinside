package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.m;

public final class l {
    public static enum a {
        SUCCESS,
        NEAREST,
        MISSING;

        private static final a[] d;
        private static final kotlin.enums.a e;

        static {
            a.d = arr_l$a;
            L.p(arr_l$a, "entries");
            a.e = new d(arr_l$a);
        }

        private static final a[] a() [...] // Inlined contents

        @y4.l
        public static kotlin.enums.a b() {
            return a.e;
        }
    }

    @m
    private final com.facebook.common.references.a a;
    @y4.l
    private final a b;

    public l(@m com.facebook.common.references.a a0, @y4.l a l$a0) {
        L.p(l$a0, "type");
        super();
        this.a = a0;
        this.b = l$a0;
    }

    @m
    public final com.facebook.common.references.a a() {
        return this.a;
    }

    @y4.l
    public final a b() {
        return this.b;
    }
}

