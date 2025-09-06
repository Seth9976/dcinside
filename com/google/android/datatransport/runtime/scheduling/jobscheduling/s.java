package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.n;
import com.google.android.datatransport.runtime.i;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.scheduling.persistence.c;
import com.google.android.datatransport.runtime.scheduling.persistence.d;
import com.google.android.datatransport.runtime.scheduling.persistence.k;
import com.google.android.datatransport.runtime.time.a;
import com.google.android.datatransport.runtime.time.h;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;

public class s {
    private final Context a;
    private final e b;
    private final d c;
    private final y d;
    private final Executor e;
    private final b f;
    private final a g;
    private final a h;
    private final c i;
    private static final String j = "Uploader";
    private static final String k = "GDT_CLIENT_METRICS";

    @r3.a
    public s(Context context0, e e0, d d0, y y0, Executor executor0, b b0, @h a a0, @com.google.android.datatransport.runtime.time.b a a1, c c0) {
        this.a = context0;
        this.b = e0;
        this.c = d0;
        this.d = y0;
        this.e = executor0;
        this.f = b0;
        this.g = a0;
        this.h = a1;
        this.i = c0;
    }

    @VisibleForTesting
    public j j(n n0) {
        Objects.requireNonNull(this.i);
        l l0 = new l(this.i);
        com.google.android.datatransport.runtime.firebase.transport.a a0 = (com.google.android.datatransport.runtime.firebase.transport.a)this.f.e(l0);
        return n0.a(j.a().i(this.g.J()).o(this.h.J()).n("GDT_CLIENT_METRICS").h(new i(com.google.android.datatransport.e.b("proto"), new byte[0])).d());
    }

    boolean k() {
        NetworkInfo networkInfo0 = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    // 检测为 Lambda 实现
    private Boolean l(r r0) [...]

    // 检测为 Lambda 实现
    private Iterable m(r r0) [...]

    // 检测为 Lambda 实现
    private Object n(Iterable iterable0, r r0, long v) [...]

    // 检测为 Lambda 实现
    private Object o(Iterable iterable0) [...]

    // 检测为 Lambda 实现
    private Object p() [...]

    // 检测为 Lambda 实现
    private Object q(Map map0) [...]

    // 检测为 Lambda 实现
    private Object r(r r0, long v) [...]

    // 检测为 Lambda 实现
    private Object s(r r0, int v) [...]

    // 检测为 Lambda 实现
    private void t(r r0, int v, Runnable runnable0) [...]

    @O1.a
    @RestrictTo({Scope.b})
    public com.google.android.datatransport.runtime.backends.h u(r r0, int v) {
        com.google.android.datatransport.runtime.backends.h h1;
        String s = r0.b();
        n n0 = this.b.get(s);
        long v1 = 0L;
        com.google.android.datatransport.runtime.backends.h h0 = com.google.android.datatransport.runtime.backends.h.e(0L);
        while(true) {
            m m0 = () -> Boolean.valueOf(this.c.S2(r0));
            if(!((Boolean)this.f.e(m0)).booleanValue()) {
                break;
            }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.n n1 = () -> this.c.g3(r0);
            Iterable iterable0 = (Iterable)this.f.e(n1);
            if(!iterable0.iterator().hasNext()) {
                return h0;
            }
            if(n0 == null) {
                z1.a.c("Uploader", "Unknown backend for %s, deleting event batch for it...", r0);
                h1 = com.google.android.datatransport.runtime.backends.h.a();
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    arrayList0.add(((k)object0).b());
                }
                if(r0.e()) {
                    arrayList0.add(this.j(n0));
                }
                h1 = n0.b(g.a().b(arrayList0).c(r0.c()).a());
            }
            h0 = h1;
            if(h0.c() == com.google.android.datatransport.runtime.backends.h.a.b) {
                o o0 = () -> {
                    this.c.V2(iterable0);
                    long v1 = this.g.J();
                    this.c.u(r0, v1 + v1);
                    return null;
                };
                this.f.e(o0);
                this.d.a(r0, v + 1, true);
                return h0;
            }
            p p0 = () -> {
                this.c.V1(iterable0);
                return null;
            };
            this.f.e(p0);
            if(h0.c() == com.google.android.datatransport.runtime.backends.h.a.a) {
                v1 = Math.max(v1, h0.b());
                if(!r0.e()) {
                    continue;
                }
                q q0 = () -> {
                    this.i.a();
                    return null;
                };
                this.f.e(q0);
            }
            else if(h0.c() == com.google.android.datatransport.runtime.backends.h.a.d) {
                HashMap hashMap0 = new HashMap();
                for(Object object1: iterable0) {
                    String s1 = ((k)object1).b().p();
                    if(hashMap0.containsKey(s1)) {
                        hashMap0.put(s1, ((int)(((int)(((Integer)hashMap0.get(s1)))) + 1)));
                    }
                    else {
                        hashMap0.put(s1, 1);
                    }
                }
                com.google.android.datatransport.runtime.scheduling.jobscheduling.r r1 = () -> {
                    for(Object object0: hashMap0.entrySet()) {
                        long v = (long)(((int)(((Integer)((Map.Entry)object0).getValue()))));
                        String s = (String)((Map.Entry)object0).getKey();
                        this.i.c(v, com.google.android.datatransport.runtime.firebase.transport.c.b.g, s);
                    }
                    return null;
                };
                this.f.e(r1);
            }
        }
        com.google.android.datatransport.runtime.scheduling.jobscheduling.i i0 = () -> {
            long v1 = this.g.J();
            this.c.u(r0, v1 + v1);
            return null;
        };
        this.f.e(i0);
        return h0;
    }

    public void v(r r0, int v, Runnable runnable0) {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.k k0 = () -> try {
            Objects.requireNonNull(this.c);
            com.google.android.datatransport.runtime.scheduling.jobscheduling.h h0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.h(this.c);
            this.f.e(h0);
            if(this.k()) {
                this.u(r0, v);
            }
            else {
                com.google.android.datatransport.runtime.scheduling.jobscheduling.j j0 = () -> {
                    this.d.b(r0, v + 1);
                    return null;
                };
                this.f.e(j0);
            }
        }
        catch(B1.a unused_ex) {
            this.d.b(r0, v + 1);
        }
        finally {
            runnable0.run();
        };
        this.e.execute(k0);
    }
}

