package com.kakao.adfit.g;

import com.kakao.adfit.common.matrix.e;
import java.util.Iterator;
import kotlin.collections.u;
import kotlin.jvm.internal.L;

public final class d implements c {
    public static final d a;

    static {
        d.a = new d();
    }

    @Override  // com.kakao.adfit.g.c
    public void a(e e0) {
        L.p(e0, "event");
    }

    @Override  // com.kakao.adfit.g.c
    public void b(e e0) {
        L.p(e0, "event");
    }

    @Override
    public Iterator iterator() {
        return u.H().iterator();
    }
}

