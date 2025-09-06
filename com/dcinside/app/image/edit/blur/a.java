package com.dcinside.app.image.edit.blur;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum a {
    NORMAL(0x7F15047C, 0x7F080378),  // string:image_edit_blur_normal "전체"
    OVAL(0x7F15047B, 0x7F080376);  // string:image_edit_blur_circle "원형"

    private final int a;
    private final int b;
    private static final a[] e;
    private static final kotlin.enums.a f;

    static {
        a.e = arr_a;
        L.p(arr_a, "entries");
        a.f = new d(arr_a);
    }

    private a(@StringRes int v1, @DrawableRes int v2) {
        this.a = v1;
        this.b = v2;
    }

    private static final a[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return a.f;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }
}

