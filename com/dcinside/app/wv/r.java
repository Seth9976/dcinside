package com.dcinside.app.wv;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum r {
    NONE,
    IMAGE,
    PDF;

    private static final r[] d;
    private static final a e;

    static {
        r.d = arr_r;
        L.p(arr_r, "entries");
        r.e = new d(arr_r);
    }

    private static final r[] a() [...] // Inlined contents

    @l
    public static a b() {
        return r.e;
    }
}

