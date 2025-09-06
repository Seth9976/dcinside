package com.dcinside.app.image.edit.crop;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum a {
    RATIO_0(0x7F15047E, 0),  // string:image_edit_crop_ratio0 "자유"
    RATIO_1(0x7F15047F, 0),  // string:image_edit_crop_ratio1 "1 : 1"
    RATIO_2(0x7F150480, 0),  // string:image_edit_crop_ratio2 "4 : 3"
    RATIO_3(0x7F150481, 0),  // string:image_edit_crop_ratio3 "3 : 2"
    RATIO_4(0x7F150482, 0);  // string:image_edit_crop_ratio4 "16 : 9"

    private final int a;
    private final int b;
    private static final a[] h;
    private static final kotlin.enums.a i;

    static {
        a.h = arr_a;
        L.p(arr_a, "entries");
        a.i = new d(arr_a);
    }

    private a(@StringRes int v1, @DrawableRes int v2) {
        this.a = v1;
        this.b = v2;
    }

    private static final a[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return a.i;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }
}

