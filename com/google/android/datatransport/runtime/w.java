package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.g;
import com.google.android.datatransport.m;
import com.google.android.datatransport.n;
import com.google.android.datatransport.runtime.scheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import com.google.android.datatransport.runtime.time.a;
import com.google.android.datatransport.runtime.time.b;
import com.google.android.datatransport.runtime.time.h;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import r3.f;

@f
public class w implements v {
    private final a a;
    private final a b;
    private final e c;
    private final s d;
    private static volatile x e;

    static {
    }

    @r3.a
    w(@h a a0, @b a a1, e e0, s s0, com.google.android.datatransport.runtime.scheduling.jobscheduling.w w0) {
        this.a = a0;
        this.b = a1;
        this.c = e0;
        this.d = s0;
        w0.c();
    }

    @Override  // com.google.android.datatransport.runtime.v
    public void a(q q0, n n0) {
        r r0 = q0.f().f(q0.c().d());
        j j0 = this.b(q0);
        this.c.a(r0, j0, n0);
    }

    private j b(q q0) {
        com.google.android.datatransport.runtime.j.a j$a0 = j.a().i(this.a.J()).o(this.b.J()).n(q0.g()).h(new i(q0.b(), q0.d())).g(q0.c().a());
        if(q0.c().e() != null && q0.c().e().a() != null) {
            j$a0.l(q0.c().e().a());
        }
        if(q0.c().b() != null) {
            g g0 = q0.c().b();
            if(g0.d() != null) {
                j$a0.m(g0.d());
            }
            if(g0.b() != null) {
                j$a0.j(g0.b());
            }
            if(g0.c() != null) {
                j$a0.k(g0.c());
            }
        }
        return j$a0.d();
    }

    public static w c() {
        x x0 = w.e;
        if(x0 == null) {
            throw new IllegalStateException("Not initialized!");
        }
        return x0.b();
    }

    // 去混淆评级： 低(20)
    private static Set d(com.google.android.datatransport.runtime.g g0) {
        return g0 instanceof com.google.android.datatransport.runtime.h ? DesugarCollections.unmodifiableSet(((com.google.android.datatransport.runtime.h)g0).a()) : Collections.singleton(com.google.android.datatransport.e.b("proto"));
    }

    @RestrictTo({Scope.b})
    public s e() {
        return this.d;
    }

    public static void f(Context context0) {
        if(w.e == null) {
            Class class0 = w.class;
            synchronized(class0) {
                if(w.e == null) {
                    w.e = com.google.android.datatransport.runtime.f.a().a(context0).build();
                }
            }
        }
    }

    public m g(com.google.android.datatransport.runtime.g g0) {
        return new com.google.android.datatransport.runtime.s(w.d(g0), r.a().b(g0.getName()).c(g0.getExtras()).a(), this);
    }

    @Deprecated
    public m h(String s) {
        return new com.google.android.datatransport.runtime.s(w.d(null), r.a().b(s).a(), this);
    }

    @RestrictTo({Scope.e})
    @VisibleForTesting
    static void i(x x0, Callable callable0) throws Throwable {
        x x1;
        synchronized(w.class) {
            x1 = w.e;
            w.e = x0;
        }
        try {
            callable0.call();
        }
        finally {
            synchronized(w.class) {
                w.e = x1;
            }
        }
    }
}

