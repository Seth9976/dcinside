package com.dcinside.app.totalsearch.gallery;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum z {
    POPULAR(0x7F1503D4),  // string:gallery_sort_population "인기순"
    NAME(0x7F1503D3);  // string:gallery_sort_name "가나다순"

    private final int a;
    private static final z[] d;
    private static final a e;

    static {
        z.d = arr_z;
        L.p(arr_z, "entries");
        z.e = new d(arr_z);
    }

    private z(int v1) {
        this.a = v1;
    }

    private static final z[] a() [...] // Inlined contents

    @l
    public static a b() {
        return z.e;
    }

    public final int c() {
        return this.a;
    }
}

