package com.afollestad.dragselectrecyclerview;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum e {
    RANGE,
    PATH;

    private static final e[] c;
    private static final a d;

    static {
        e.c = arr_e;
        L.p(arr_e, "entries");
        e.d = new d(arr_e);
    }

    private static final e[] a() [...] // Inlined contents

    @l
    public static a b() {
        return e.d;
    }
}

