package com.facebook.imagepipeline.core;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum n {
    ALWAYS,
    AUTO,
    NEVER;

    private static final n[] d;
    private static final a e;

    static {
        n.d = arr_n;
        L.p(arr_n, "entries");
        n.e = new d(arr_n);
    }

    private static final n[] a() [...] // Inlined contents

    @l
    public static a b() {
        return n.e;
    }
}

