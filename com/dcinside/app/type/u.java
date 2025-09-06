package com.dcinside.app.type;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum u {
    NON_MEMBER(0),
    MEMBER(1),
    SUB_MANAGER(2),
    MANAGER(3);

    private final int a;
    private static final u[] f;
    private static final a g;

    static {
        u.f = arr_u;
        L.p(arr_u, "entries");
        u.g = new d(arr_u);
    }

    private u(int v1) {
        this.a = v1;
    }

    private static final u[] a() [...] // Inlined contents

    @l
    public static a b() {
        return u.g;
    }

    public final int c() {
        return this.a;
    }
}

