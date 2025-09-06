package com.kakao.adfit.common.matrix;

import android.content.Context;
import com.kakao.adfit.common.matrix.transport.HttpTransport;
import com.kakao.adfit.k.d;
import com.kakao.adfit.k.e;
import com.kakao.adfit.k.f;
import com.kakao.adfit.k.g;
import com.kakao.adfit.k.j;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.l;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.text.v;

public final class c implements b {
    public static final c a;
    private static AtomicReference b;
    private static AtomicReference c;

    static {
        c.a = new c();
        c.b = new AtomicReference(new h());
        c.c = new AtomicReference(new h());
    }

    private final b a() {
        Object object0 = c.b.get();
        L.o(object0, "clientReference.get()");
        return (b)object0;
    }

    private final com.kakao.adfit.j.b a(Context context0, a a0, d d0, com.kakao.adfit.j.c c0, com.kakao.adfit.j.d d1, com.kakao.adfit.g.c c1) {
        return new com.kakao.adfit.common.matrix.transport.a(c0, d1, c1, 10);
    }

    static com.kakao.adfit.j.b a(c c0, Context context0, a a0, d d0, com.kakao.adfit.j.c c1, com.kakao.adfit.j.d d1, com.kakao.adfit.g.c c2, int v, Object object0) {
        a a1 = (v & 2) == 0 ? a0 : a.f.a("https://c489f55600b04c3caa70db9cee302437@aem-kakao-collector.onkakao.net/3040");
        d d2 = (v & 4) == 0 ? d0 : new e();
        com.kakao.adfit.j.c c3 = (v & 8) == 0 ? c1 : new HttpTransport(a1, d2, new com.kakao.adfit.k.b(), null, 0, 0, 56, null);
        if((v & 16) != 0) {
            com.kakao.adfit.j.d d3 = new com.kakao.adfit.j.a(context0);
            return (v & 0x20) == 0 ? c0.a(context0, a1, d2, c3, d3, c2) : c0.a(context0, a1, d2, c3, d3, new com.kakao.adfit.g.b(context0, 10, d2));
        }
        return (v & 0x20) == 0 ? c0.a(context0, a1, d2, c3, d1, c2) : c0.a(context0, a1, d2, c3, d1, new com.kakao.adfit.g.b(context0, 10, d2));
    }

    private final List a(Context context0) {
        g g0 = new g(u.H(), u.k("com.kakao.adfit"));
        return u.O(new com.kakao.adfit.f.b[]{new com.kakao.adfit.f.c(new com.kakao.adfit.k.h(g0, false, 2, null), new f(g0)), new com.kakao.adfit.f.a(context0)});
    }

    private final Queue a(int v) {
        Queue queue0 = j.a(new com.kakao.adfit.k.a(v));
        L.o(queue0, "synchronizedQueue(Circul…FifoQueue(maxBreadcrumb))");
        return queue0;
    }

    static Queue a(c c0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 100;
        }
        return c0.a(v);
    }

    private final void a(b b0) {
        c.b.set(b0);
    }

    @Override  // com.kakao.adfit.common.matrix.b
    public com.kakao.adfit.common.matrix.f a(com.kakao.adfit.common.matrix.e e0) {
        return com.kakao.adfit.common.matrix.b.a.a(this, e0);
    }

    @Override  // com.kakao.adfit.common.matrix.b
    public com.kakao.adfit.common.matrix.f a(com.kakao.adfit.common.matrix.e e0, Object object0) {
        L.p(e0, "event");
        return this.a().a(e0, object0);
    }

    public final com.kakao.adfit.common.matrix.f a(Throwable throwable0) {
        L.p(throwable0, "throwable");
        return this.a(throwable0, null);
    }

    public com.kakao.adfit.common.matrix.f a(Throwable throwable0, Object object0) {
        return com.kakao.adfit.common.matrix.b.a.a(this, throwable0, object0);
    }

    @Override  // com.kakao.adfit.common.matrix.b
    public void a(com.kakao.adfit.i.b b0) {
        L.p(b0, "breadcrumb");
        this.a().a(b0);
    }

    private final b b() {
        Object object0 = c.c.get();
        L.o(object0, "eventClientReference.get()");
        return (b)object0;
    }

    private final void b(b b0) {
        c.c.set(b0);
    }

    public final com.kakao.adfit.common.matrix.f b(com.kakao.adfit.common.matrix.e e0) {
        L.p(e0, "event");
        return this.b().a(e0);
    }

    public final Throwable b(Throwable throwable0) {
        L.p(throwable0, "t");
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        if(arr_stackTraceElement == null) {
            return throwable0;
        }
        int v;
        for(v = 0; true; ++v) {
            if(v >= arr_stackTraceElement.length) {
                v = -1;
                break;
            }
            String s = arr_stackTraceElement[v].getClassName();
            if(s != null) {
                L.o(s, "className");
                if(!v.v2(s, "com.kakao.adfit", false, 2, null)) {
                    continue;
                }
                break;
            }
        }
        if(v > 0) {
            throwable0.setStackTrace(((StackTraceElement[])l.l1(arr_stackTraceElement, 0, v)));
        }
        return throwable0;
    }

    public final void b(Context context0) {
        L.p(context0, "context");
        if(this.c()) {
            return;
        }
        Context context1 = context0.getApplicationContext();
        if(context1 != null) {
            context0 = context1;
        }
        synchronized(this) {
            c c0 = c.a;
            if(c0.c()) {
                return;
            }
            List list0 = c0.a(context0);
            c0.a(new com.kakao.adfit.common.matrix.d(list0, c.a(c0, context0, null, null, null, null, null, 62, null), c.a(c0, 0, 1, null)));
            c0.b(new com.kakao.adfit.common.matrix.d(list0, c.a(c0, context0, a.f.a("https://53faf16a777b449f919b01839edfb449@aem-kakao-collector.onkakao.net/12221"), null, null, null, com.kakao.adfit.g.d.a, 28, null), c0.a(1)));
        }
        com.kakao.adfit.m.f.d("Matrix is initialized.");
        new com.kakao.adfit.common.matrix.g().a(context0);
    }

    public final boolean c() {
        return !(c.b.get() instanceof h);
    }
}

