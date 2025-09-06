package com.dcinside.app.totalsearch.gallery;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum e {
    ALL,
    MAJOR,
    MINOR,
    MINI,
    PERSON;

    private static final e[] f;
    private static final a g;

    static {
        e.f = arr_e;
        L.p(arr_e, "entries");
        e.g = new d(arr_e);
    }

    private static final e[] a() [...] // Inlined contents

    @l
    public static a b() {
        return e.g;
    }
}

