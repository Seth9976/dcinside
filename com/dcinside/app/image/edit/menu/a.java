package com.dcinside.app.image.edit.menu;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum a {
    FILTER(0x7F150486, 0x7F080383),  // string:image_edit_filter "필터"
    BLUR(0x7F150479, 0x7F080374),  // string:image_edit_blur "흐리게"
    CROP(0x7F15047D, 0x7F080379),  // string:image_edit_crop "자르기"
    RESIZE(0x7F1504B8, 0x7F080386),  // string:image_edit_resize "크기"
    ROTATE(0x7F1504BE, 0x7F080387),  // string:image_edit_rotate "회전"
    DRAW(0x7F150483, 0x7F08037B),  // string:image_edit_draw "그리기"
    STICKER(0x7F1504C0, 0x7F08038C),  // string:image_edit_sticker "스티커"
    EMOJI(0x7F150484, 0x7F080381),  // string:image_edit_emoji "이모지"
    TEXT(0x7F1504C1, 0x7F08038D);  // string:image_edit_text "텍스트"

    private final int a;
    private final int b;
    private static final a[] l;
    private static final kotlin.enums.a m;

    static {
        a.l = arr_a;
        L.p(arr_a, "entries");
        a.m = new d(arr_a);
    }

    private a(@StringRes int v1, @DrawableRes int v2) {
        this.a = v1;
        this.b = v2;
    }

    private static final a[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return a.m;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }
}

