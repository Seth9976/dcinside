package com.dcinside.app.write.menu.ai.type;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum f {
    NEW("new"),
    OVERWRITE("modify");

    @l
    private final String a;
    private static final f[] d;
    private static final a e;

    static {
        f.d = arr_f;
        L.p(arr_f, "entries");
        f.e = new d(arr_f);
    }

    private f(String s1) {
        this.a = s1;
    }

    private static final f[] a() [...] // Inlined contents

    @l
    public static a b() {
        return f.e;
    }

    @l
    public final String c() {
        return this.a;
    }
}

