package com.kakao.adfit.l;

import android.content.Context;
import kotlin.jvm.internal.L;

public final class c implements com.kakao.adfit.l.b.c {
    public static final c a;
    private static com.kakao.adfit.l.b.c b;

    static {
        c.a = new c();
        c.b = new b();
    }

    @Override  // com.kakao.adfit.l.b$c
    public com.kakao.adfit.l.b a(Context context0, String s) {
        L.p(context0, "context");
        L.p(s, "path");
        return c.b.a(context0, s);
    }
}

