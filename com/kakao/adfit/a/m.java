package com.kakao.adfit.a;

import java.util.List;
import kotlin.jvm.internal.L;

public final class m extends k {
    private final String a;
    private final String b;
    private final List c;
    private final t d;
    private final boolean e;

    public m(String s, String s1, List list0, t t0, boolean z) {
        L.p(s, "string");
        L.p(s1, "id");
        L.p(list0, "ads");
        super(null);
        this.a = s;
        this.b = s1;
        this.c = list0;
        this.d = t0;
        this.e = z;
    }

    public final List a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final t c() {
        return this.d;
    }
}

