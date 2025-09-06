package com.dcinside.app.type;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum w {
    NORMAL(0, 0x7F150172),  // string:block_image_range_normal "보통 차단"
    WIDE(1, 0x7F150174);  // string:block_image_range_wide "넓은 차단"

    private final int a;
    private final int b;
    private static final w[] e;
    private static final a f;

    static {
        w.e = arr_w;
        L.p(arr_w, "entries");
        w.f = new d(arr_w);
    }

    private w(int v1, int v2) {
        this.a = v1;
        this.b = v2;
    }

    private static final w[] a() [...] // Inlined contents

    @l
    public static a b() {
        return w.f;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }
}

