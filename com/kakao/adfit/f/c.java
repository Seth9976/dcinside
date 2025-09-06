package com.kakao.adfit.f;

import com.kakao.adfit.common.matrix.e;
import com.kakao.adfit.h.a;
import com.kakao.adfit.i.m;
import com.kakao.adfit.k.f;
import com.kakao.adfit.k.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;

public final class c implements b {
    private final h a;
    private final f b;

    public c(h h0, f f0) {
        L.p(h0, "threadFactory");
        L.p(f0, "exceptionFactory");
        super();
        this.a = h0;
        this.b = f0;
    }

    private final String a() [...] // Inlined contents

    private final void a(e e0) {
        if(e0.i() == null) {
            e0.d("AdFit-network@3.17.2+@912573df-78e9-4e24-9347-3dfd3ae483ec");
        }
        if(e0.k() == null) {
            e0.e("network");
        }
        if(e0.j() == null) {
            e0.a(this.b());
        }
        if(e0.m() == null) {
            List list0 = e0.f();
            List list1 = null;
            if(list0 != null) {
                for(Object object0: list0) {
                    Long long0 = ((com.kakao.adfit.i.h)object0).a();
                    if(((com.kakao.adfit.i.h)object0).b() != null && long0 != null) {
                        if(list1 == null) {
                            list1 = new ArrayList();
                        }
                        list1.add(long0);
                    }
                }
            }
            e0.c(this.a.a(list1));
        }
    }

    @Override  // com.kakao.adfit.f.b
    public e a(e e0, Object object0) {
        L.p(e0, "event");
        if(e0.h() == null) {
            e0.c("java");
        }
        Throwable throwable0 = e0.n();
        if(throwable0 != null) {
            e0.b(this.b.b(throwable0));
        }
        if(!(object0 instanceof a)) {
            this.a(e0);
        }
        return e0;
    }

    private final m b() {
        return new m("com.kakao.adfit.ads", "3.17.2", null, 4, null);
    }

    private final String c() [...] // Inlined contents
}

