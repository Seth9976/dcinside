package com.dcinside.app.type;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum n {
    MANAGER("M"),
    SUB_MANAGER("S"),
    IN_REVIEW("W"),
    TRANSFER("T");

    @l
    private final String a;
    private static final n[] f;
    private static final a g;

    static {
        n.f = arr_n;
        L.p(arr_n, "entries");
        n.g = new d(arr_n);
    }

    private n(String s1) {
        this.a = s1;
    }

    private static final n[] a() [...] // Inlined contents

    @l
    public static a b() {
        return n.g;
    }

    @l
    public final String c() {
        return this.a;
    }
}

