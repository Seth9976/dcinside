package com.dcinside.app.type;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum f {
    REPLY,
    RECOMMEND,
    POST,
    LOGIN;

    private static final f[] e;
    private static final a f;

    static {
        f.e = arr_f;
        L.p(arr_f, "entries");
        f.f = new d(arr_f);
    }

    private static final f[] a() [...] // Inlined contents

    @l
    public static a b() {
        return f.f;
    }
}

