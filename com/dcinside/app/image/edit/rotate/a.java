package com.dcinside.app.image.edit.rotate;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum a {
    Rotate(0x7F1504BE, 0x7F08038A),  // string:image_edit_rotate "회전"
    FLIP_HORIZONTAL(0x7F1504B3, 0x7F080388),  // string:image_edit_flip_horizontal "좌우 반전"
    FLIP_VERTICAL(0x7F1504B4, 0x7F080389);  // string:image_edit_flip_vertical "상하 반전"

    private final int a;
    private final int b;
    private static final a[] f;
    private static final kotlin.enums.a g;

    static {
        a.f = arr_a;
        L.p(arr_a, "entries");
        a.g = new d(arr_a);
    }

    private a(@StringRes int v1, @DrawableRes int v2) {
        this.a = v1;
        this.b = v2;
    }

    private static final a[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return a.g;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }
}

