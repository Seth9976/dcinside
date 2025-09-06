package com.dcinside.app.write.menu.ai.type;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum h {
    BALANCE(0x7F15057F, 0),  // string:make_ai_image_control_mode_balance_desc "프롬프트와 첨부 이미지 스타일 동일 적용"
    PROMPT(0x7F150583, 1),  // string:make_ai_image_control_mode_prompt_desc "프롬프트의 스타일을 우선 적용"
    CONTROL(0x7F150581, 2),  // string:make_ai_image_control_mode_control_desc "첨부 이미지 스타일을 우선 적용"
    UNSET(0x7F150583, 1);  // string:make_ai_image_control_mode_prompt_desc "프롬프트의 스타일을 우선 적용"

    private final int a;
    private final int b;
    private static final h[] g;
    private static final a h;

    static {
        h.g = arr_h;
        L.p(arr_h, "entries");
        h.h = new d(arr_h);
    }

    private h(int v1, int v2) {
        this.a = v1;
        this.b = v2;
    }

    private static final h[] a() [...] // Inlined contents

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    @l
    public static a d() {
        return h.h;
    }
}

