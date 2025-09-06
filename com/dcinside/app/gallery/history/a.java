package com.dcinside.app.gallery.history;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum a {
    BLOCK("avoid"),
    DELETE("delete"),
    SETTING("setting");

    @l
    private final String a;
    private static final a[] e;
    private static final kotlin.enums.a f;

    static {
        a.e = arr_a;
        L.p(arr_a, "entries");
        a.f = new d(arr_a);
    }

    private a(String s1) {
        this.a = s1;
    }

    private static final a[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return a.f;
    }

    @l
    public final String c() {
        return this.a;
    }
}

