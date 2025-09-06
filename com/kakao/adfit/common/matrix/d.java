package com.kakao.adfit.common.matrix;

import java.io.IOException;
import java.util.List;
import java.util.Queue;
import kotlin.collections.u;
import kotlin.jvm.internal.L;

public final class d implements b {
    private final List a;
    private final com.kakao.adfit.j.b b;
    private final Queue c;

    public d(List list0, com.kakao.adfit.j.b b0, Queue queue0) {
        L.p(list0, "eventProcessors");
        L.p(b0, "connection");
        L.p(queue0, "breadcrumbs");
        super();
        this.a = list0;
        this.b = b0;
        this.c = queue0;
    }

    @Override  // com.kakao.adfit.common.matrix.b
    public f a(e e0) {
        return a.a(this, e0);
    }

    @Override  // com.kakao.adfit.common.matrix.b
    public f a(e e0, Object object0) {
        L.p(e0, "event");
        f f0 = e0.g();
        if(f0 == null) {
            f0 = f.b.b();
            e0.a(f0);
        }
        if(!(object0 instanceof com.kakao.adfit.h.a) && this.b(e0) == null) {
            com.kakao.adfit.m.f.a(("Event was dropped: " + f0));
            return f.b.a();
        }
        for(Object object1: this.a) {
            com.kakao.adfit.f.b b0 = (com.kakao.adfit.f.b)object1;
            if(b0.a(e0, object0) == null) {
                com.kakao.adfit.m.f.a(("Event was dropped by processor: " + f0 + ", " + b0.getClass().getName()));
                return f.b.a();
            }
            if(false) {
                break;
            }
        }
        try {
            this.b.a(e0, object0);
        }
        catch(IOException iOException0) {
            com.kakao.adfit.m.f.c(("Capturing event " + f0 + " failed."), iOException0);
        }
        return f0;
    }

    @Override  // com.kakao.adfit.common.matrix.b
    public void a(com.kakao.adfit.i.b b0) {
        L.p(b0, "breadcrumb");
        this.c.add(b0);
    }

    private final e b(e e0) {
        List list0 = e0.a();
        if(list0 == null) {
            e0.a(u.V5(this.c));
            return e0;
        }
        e0.a(u.D4(list0, this.c));
        return e0;
    }
}

