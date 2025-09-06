package com.dcinside.app.type;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum z {
    ONLY_TITLE(0, 0x7F150845),  // string:read_best_box_type_only_title "제목만 보기"
    WITH_THUMBNAIL(1, 0x7F150847),  // string:read_best_box_type_with_thumbnail "섬네일로 보기"
    UNUSED(2, 0x7F150846);  // string:read_best_box_type_unused "사용 안 함"

    private final int a;
    private final int b;
    private static final z[] f;
    private static final a g;

    static {
        z.f = arr_z;
        L.p(arr_z, "entries");
        z.g = new d(arr_z);
    }

    private z(int v1, int v2) {
        this.a = v1;
        this.b = v2;
    }

    private static final z[] a() [...] // Inlined contents

    @l
    public static a b() {
        return z.g;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }
}

