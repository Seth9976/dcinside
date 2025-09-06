package com.dcinside.app.write.menu.setting;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum a {
    ALL("A", 0x7F1507A1),  // string:poll_permission_all "모두"
    LOGIN("M", 0x7F1507A2),  // string:poll_permission_login "고정닉만"
    MEMBER("G", 0x7F1507A3);  // string:poll_permission_member "멤버만"

    @l
    private final String a;
    private final int b;
    private static final a[] f;
    private static final kotlin.enums.a g;

    static {
        a.f = arr_a;
        L.p(arr_a, "entries");
        a.g = new d(arr_a);
    }

    private a(String s1, int v1) {
        this.a = s1;
        this.b = v1;
    }

    private static final a[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return a.g;
    }

    public final int c() {
        return this.b;
    }

    @l
    public final String d() {
        return this.a;
    }
}

