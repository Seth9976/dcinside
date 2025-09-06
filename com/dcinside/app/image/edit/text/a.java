package com.dcinside.app.image.edit.text;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum a {
    NEW(0x7F1504C8, 0x7F08036F),  // string:image_edit_text_new "추가"
    CHANGE(0x7F1504C5, 0x7F080382),  // string:image_edit_text_change "입력"
    COLOR(0x7F1504C6, 0),  // string:image_edit_text_color "색상"
    ALIGN_LEFT(0x7F1504C3, 0x7F080372),  // string:image_edit_text_align_left "왼쪽"
    ALIGN_CENTER(0x7F1504C2, 0x7F080371),  // string:image_edit_text_align_center "가운데"
    ALIGN_RIGHT(0x7F1504C4, 0x7F080373);  // string:image_edit_text_align_right "오른쪽"

    private final int a;
    private final int b;
    private static final a[] i;
    private static final kotlin.enums.a j;

    static {
        a.i = arr_a;
        L.p(arr_a, "entries");
        a.j = new d(arr_a);
    }

    private a(@StringRes int v1, @DrawableRes int v2) {
        this.a = v1;
        this.b = v2;
    }

    private static final a[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return a.j;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }
}

