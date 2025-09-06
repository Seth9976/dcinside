package com.facebook.cache.disk;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;
import k1.n.a;
import k1.n;
import o3.h;
import p3.d;

@n(a.a)
@d
public class g implements k, u0.a {
    @VisibleForTesting
    static class b {
        private boolean a;
        private long b;
        private long c;

        b() {
            this.a = false;
            this.b = -1L;
            this.c = -1L;
        }

        public long a() {
            synchronized(this) {
            }
            return this.c;
        }

        public long b() {
            synchronized(this) {
            }
            return this.b;
        }

        public void c(long v, long v1) {
            synchronized(this) {
                if(this.a) {
                    this.b += v;
                    this.c += v1;
                }
            }
        }

        public boolean d() {
            synchronized(this) {
            }
            return this.a;
        }

        public void e() {
            synchronized(this) {
                this.a = false;
                this.c = -1L;
                this.b = -1L;
            }
        }

        public void f(long v, long v1) {
            synchronized(this) {
                this.c = v1;
                this.b = v;
                this.a = true;
            }
        }
    }

    public static class c {
        public final long a;
        public final long b;
        public final long c;

        public c(long v, long v1, long v2) {
            this.a = v;
            this.b = v1;
            this.c = v2;
        }
    }

    private final long a;
    private final long b;
    private final CountDownLatch c;
    private long d;
    @h
    private final com.facebook.cache.common.d e;
    @VisibleForTesting
    @p3.a("mLock")
    final Set f;
    private long g;
    private final long h;
    private final com.facebook.common.statfs.a i;
    private final f j;
    private final j k;
    private final com.facebook.cache.common.b l;
    private final boolean m;
    private final b n;
    private final com.facebook.common.time.a o;
    private final Object p;
    private boolean q;
    private static final Class r = null;
    public static final int s = 1;
    private static final long t = 0L;
    private static final long u = 0L;
    private static final double v = 0.02;
    private static final long w = -1L;

    static {
        g.r = g.class;
        g.t = TimeUnit.HOURS.toMillis(2L);
        g.u = TimeUnit.MINUTES.toMillis(30L);
    }

    public g(f f0, j j0, c g$c0, @h com.facebook.cache.common.d d0, com.facebook.cache.common.b b0, @h u0.b b1, Executor executor0, boolean z) {
        class com.facebook.cache.disk.g.a implements Runnable {
            final g a;

            @Override
            public void run() {
                synchronized(g.this.p) {
                    g.this.v();
                }
                g.this.q = true;
                g.this.c.countDown();
            }
        }

        this.p = new Object();
        this.a = g$c0.b;
        this.b = g$c0.c;
        this.d = g$c0.c;
        this.i = com.facebook.common.statfs.a.e();
        this.j = f0;
        this.k = j0;
        this.g = -1L;
        this.e = d0;
        this.h = g$c0.a;
        this.l = b0;
        this.n = new b();
        this.o = com.facebook.common.time.g.a();
        this.m = z;
        this.f = new HashSet();
        if(b1 != null) {
            b1.b(this);
        }
        if(z) {
            this.c = new CountDownLatch(1);
            executor0.execute(new com.facebook.cache.disk.g.a(this));
            return;
        }
        this.c = new CountDownLatch(0);
    }

    @Override  // com.facebook.cache.disk.k
    public com.facebook.cache.disk.f.a a() throws IOException {
        return this.j.a();
    }

    @Override  // com.facebook.cache.disk.k
    public void b() {
        synchronized(this.p) {
            try {
                this.j.b();
                this.f.clear();
                com.facebook.cache.common.d d0 = this.e;
                if(d0 != null) {
                    d0.d();
                }
            }
            catch(IOException | NullPointerException iOException0) {
                this.l.a(com.facebook.cache.common.b.a.o, g.r, "clearAll: " + iOException0.getMessage(), iOException0);
            }
        }
        this.n.e();
    }

    @Override  // com.facebook.cache.disk.k
    public boolean c(e e0) {
        Throwable throwable1;
        int v;
        IOException iOException1;
        String s1;
        Object object0;
        String s = null;
        try {
            object0 = this.p;
            __monitor_enter(object0);
        }
        catch(IOException iOException0) {
            s1 = null;
            iOException1 = iOException0;
            goto label_31;
        }
        try {
            List list0 = com.facebook.cache.common.f.b(e0);
            v = 0;
            while(true) {
            label_10:
                if(v >= list0.size()) {
                    __monitor_exit(object0);
                    return false;
                }
                s1 = (String)list0.get(v);
                break;
            }
        }
        catch(Throwable throwable0) {
            s1 = s;
            throwable1 = throwable0;
            goto label_28;
        }
        try {
            if(this.j.h(s1, e0)) {
                this.f.add(s1);
                __monitor_exit(object0);
                return true;
            }
            ++v;
            s = s1;
            goto label_10;
        label_28:
            __monitor_exit(object0);
        }
        catch(Throwable throwable1) {
            goto label_28;
        }
        try {
            throw throwable1;
        }
        catch(IOException iOException1) {
        }
    label_31:
        m m0 = m.h().k(e0).q(s1).o(iOException1);
        com.facebook.cache.common.d d0 = this.e;
        if(d0 != null) {
            d0.a(m0);
        }
        m0.i();
        return false;
    }

    @Override  // com.facebook.cache.disk.k
    @h
    public r0.a d(e e0) {
        r0.a a0;
        m m0 = m.h().k(e0);
        try {
            synchronized(this.p) {
                List list0 = com.facebook.cache.common.f.b(e0);
                String s = null;
                a0 = null;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    s = (String)list0.get(v2);
                    m0.q(s);
                    a0 = this.j.i(s, e0);
                    if(a0 != null) {
                        break;
                    }
                }
                if(a0 == null) {
                    com.facebook.cache.common.d d0 = this.e;
                    if(d0 != null) {
                        d0.e(m0);
                    }
                    this.f.remove(s);
                }
                else {
                    com.facebook.common.internal.n.i(s);
                    com.facebook.cache.common.d d1 = this.e;
                    if(d1 != null) {
                        d1.h(m0);
                    }
                    this.f.add(s);
                }
                return a0;
            }
        }
        catch(IOException iOException0) {
            this.l.a(com.facebook.cache.common.b.a.p, g.r, "getResource", iOException0);
            m0.o(iOException0);
            com.facebook.cache.common.d d2 = this.e;
            if(d2 != null) {
                d2.a(m0);
            }
            return null;
        }
        finally {
            m0.i();
        }
    }

    @Override  // u0.a
    public void e() {
        this.b();
    }

    @Override  // com.facebook.cache.disk.k
    public boolean f(e e0) {
        synchronized(this.p) {
            List list0 = com.facebook.cache.common.f.b(e0);
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                String s = (String)list0.get(v1);
                if(this.f.contains(s)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override  // u0.a
    public void g() {
        synchronized(this.p) {
            this.v();
            long v1 = this.n.b();
            long v2 = this.h;
            if(v2 > 0L && v1 > 0L && v1 >= v2) {
                double f = 1.0 - ((double)v2) / ((double)v1);
                if(f > 0.02) {
                    this.y(f);
                }
            }
        }
    }

    @Override  // com.facebook.cache.disk.k
    public long getCount() {
        return this.n.a();
    }

    @Override  // com.facebook.cache.disk.k
    public long getSize() {
        return this.n.b();
    }

    @Override  // com.facebook.cache.disk.k
    public boolean h(e e0) {
        Object object0 = this.p;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.f(e0)) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return true;
        }
        try {
            List list0 = com.facebook.cache.common.f.b(e0);
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                String s = (String)list0.get(v1);
                if(this.j.e(s, e0)) {
                    this.f.add(s);
                    FIN.finallyExec$NT(v);
                    return true;
                }
            }
            FIN.finallyExec$NT(v);
        }
        catch(IOException unused_ex) {
            FIN.finallyExec$NT(v);
        }
        return false;
    }

    @Override  // com.facebook.cache.disk.k
    public long i(long v) {
        long v7;
        Iterator iterator0;
        long v6;
        long v5;
        int v4;
        long v3;
        long v2;
        synchronized(this.p) {
            try {
                v2 = this.o.now();
                Collection collection0 = this.j.T();
                v3 = this.n.b();
                v4 = 0;
                v5 = 0L;
                v6 = 0L;
                iterator0 = collection0.iterator();
            }
            catch(IOException iOException0) {
                this.l.a(com.facebook.cache.common.b.a.o, g.r, "clearOldEntries: " + iOException0.getMessage(), iOException0);
                return 0L;
            }
        }
        try {
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                com.facebook.cache.disk.f.c f$c0 = (com.facebook.cache.disk.f.c)object1;
                long v8 = Math.max(1L, Math.abs(v2 - f$c0.getTimestamp()));
                if(v8 >= v) {
                    long v9 = this.j.c(f$c0);
                    String s = f$c0.getId();
                    this.f.remove(s);
                    if(v9 <= 0L) {
                        continue;
                    }
                    ++v4;
                    v5 += v9;
                    m m0 = m.h().q(f$c0.getId()).n(com.facebook.cache.common.d.a.b).p(v9).m(v3 - v5);
                    com.facebook.cache.common.d d0 = this.e;
                    if(d0 != null) {
                        d0.c(m0);
                    }
                    m0.i();
                }
                else {
                    v6 = Math.max(v6, v8);
                }
            }
            this.j.g();
            if(v4 > 0) {
                this.v();
                this.n.c(-v5, ((long)(-v4)));
            }
            return v6;
        }
        catch(IOException iOException0) {
            v7 = v6;
        }
        this.l.a(com.facebook.cache.common.b.a.o, g.r, "clearOldEntries: " + iOException0.getMessage(), iOException0);
        return v7;
    }

    @Override  // com.facebook.cache.disk.k
    public boolean isEnabled() {
        return this.j.isEnabled();
    }

    @Override  // com.facebook.cache.disk.k
    public void j(e e0) {
        synchronized(this.p) {
            try {
                List list0 = com.facebook.cache.common.f.b(e0);
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    String s = (String)list0.get(v1);
                    this.j.remove(s);
                    this.f.remove(s);
                }
            }
            catch(IOException iOException0) {
                this.l.a(com.facebook.cache.common.b.a.n, g.r, "delete: " + iOException0.getMessage(), iOException0);
            }
        }
    }

    @Override  // com.facebook.cache.disk.k
    public r0.a k(e e0, com.facebook.cache.common.m m0) throws IOException {
        String s;
        r0.a a0;
        int v2;
        m m1 = m.h().k(e0);
        com.facebook.cache.common.d d0 = this.e;
        if(d0 != null) {
            d0.b(m1);
        }
        synchronized(this.p) {
            s = com.facebook.cache.common.f.a(e0);
        }
        m1.q(s);
        try {
            com.facebook.cache.disk.f.d f$d0 = this.x(s, e0);
            v2 = FIN.finallyOpen$NT();
            f$d0.C(m0, e0);
            a0 = this.q(f$d0, e0, s);
            m1.p(a0.size()).m(this.n.b());
            com.facebook.cache.common.d d1 = this.e;
            if(d1 != null) {
                d1.f(m1);
            }
            FIN.finallyCodeBegin$NT(v2);
            if(!f$d0.A()) {
                x0.a.q(g.r, "Failed to delete temp file");
            }
        }
        catch(IOException iOException0) {
            m1.o(iOException0);
            com.facebook.cache.common.d d2 = this.e;
            if(d2 != null) {
                d2.g(m1);
            }
            x0.a.r(g.r, "Failed inserting a file into the cache", iOException0);
            throw iOException0;
        }
        finally {
            m1.i();
        }
        FIN.finallyCodeEnd$NT(v2);
        return a0;
    }

    @VisibleForTesting
    protected void p() {
        try {
            this.c.await();
        }
        catch(InterruptedException unused_ex) {
            x0.a.q(g.r, "Memory Index is not ready yet. ");
        }
    }

    private r0.a q(com.facebook.cache.disk.f.d f$d0, e e0, String s) throws IOException {
        synchronized(this.p) {
            r0.a a0 = f$d0.D(e0);
            this.f.add(s);
            long v1 = a0.size();
            this.n.c(v1, 1L);
            return a0;
        }
    }

    @p3.a("mLock")
    private void r(long v, com.facebook.cache.common.d.a d$a0) throws IOException {
        try {
            Collection collection0 = this.s(this.j.T());
        }
        catch(IOException iOException0) {
            this.l.a(com.facebook.cache.common.b.a.o, g.r, "evictAboveSize: " + iOException0.getMessage(), iOException0);
            throw iOException0;
        }
        long v1 = this.n.b();
        int v2 = 0;
        long v3 = 0L;
        for(Object object0: collection0) {
            com.facebook.cache.disk.f.c f$c0 = (com.facebook.cache.disk.f.c)object0;
            if(v3 > v1 - v) {
                break;
            }
            long v4 = this.j.c(f$c0);
            String s = f$c0.getId();
            this.f.remove(s);
            if(v4 > 0L) {
                ++v2;
                v3 += v4;
                m m0 = m.h().q(f$c0.getId()).n(d$a0).p(v4).m(v1 - v3).l(v);
                com.facebook.cache.common.d d0 = this.e;
                if(d0 != null) {
                    d0.c(m0);
                }
                m0.i();
            }
        }
        this.n.c(-v3, ((long)(-v2)));
        this.j.g();
    }

    private Collection s(Collection collection0) {
        long v = this.o.now() + g.t;
        Collection collection1 = new ArrayList(collection0.size());
        ArrayList arrayList0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            com.facebook.cache.disk.f.c f$c0 = (com.facebook.cache.disk.f.c)object0;
            if(f$c0.getTimestamp() > v) {
                ((ArrayList)collection1).add(f$c0);
            }
            else {
                arrayList0.add(f$c0);
            }
        }
        Collections.sort(arrayList0, this.k.get());
        ((ArrayList)collection1).addAll(arrayList0);
        return collection1;
    }

    // 去混淆评级： 低(20)
    public boolean t() {
        return this.q || !this.m;
    }

    private void u() throws IOException {
        synchronized(this.p) {
            boolean z = this.v();
            this.z();
            long v1 = this.n.b();
            if(v1 > this.d && !z) {
                this.n.e();
                this.v();
            }
            long v2 = this.d;
            if(v1 > v2) {
                this.r(v2 * 9L / 10L, com.facebook.cache.common.d.a.a);
            }
        }
    }

    @p3.a("mLock")
    private boolean v() {
        long v = this.o.now();
        return !this.n.d() || (this.g == -1L || v - this.g > g.u) ? this.w() : false;
    }

    @p3.a("mLock")
    private boolean w() {
        Set set0;
        long v = this.o.now();
        long v1 = g.t + v;
        if(this.m && this.f.isEmpty()) {
            set0 = this.f;
        }
        else if(this.m) {
            set0 = new HashSet();
        }
        else {
            set0 = null;
        }
        try {
            long v2 = 0L;
            long v3 = -1L;
            int v4 = 0;
            boolean z = false;
            int v5 = 0;
            int v6 = 0;
            for(Object object0: this.j.T()) {
                com.facebook.cache.disk.f.c f$c0 = (com.facebook.cache.disk.f.c)object0;
                ++v5;
                v2 += f$c0.getSize();
                if(f$c0.getTimestamp() > v1) {
                    ++v6;
                    v4 = (int)(((long)v4) + f$c0.getSize());
                    v3 = Math.max(f$c0.getTimestamp() - v, v3);
                    z = true;
                }
                else if(this.m) {
                    com.facebook.common.internal.n.i(set0);
                    set0.add(f$c0.getId());
                }
            }
            if(z) {
                this.l.a(com.facebook.cache.common.b.a.d, g.r, "Future timestamp found in " + v6 + " files , with a total size of " + v4 + " bytes, and a maximum time delta of " + v3 + "ms", null);
            }
            if(this.n.a() != ((long)v5) || this.n.b() != v2) {
                if(this.m && this.f != set0) {
                    com.facebook.common.internal.n.i(set0);
                    this.f.clear();
                    this.f.addAll(set0);
                }
                this.n.f(v2, ((long)v5));
            }
            this.g = v;
            return true;
        }
        catch(IOException iOException0) {
        }
        this.l.a(com.facebook.cache.common.b.a.p, g.r, "calcFileCacheSize: " + iOException0.getMessage(), iOException0);
        return false;
    }

    private com.facebook.cache.disk.f.d x(String s, e e0) throws IOException {
        this.u();
        return this.j.d(s, e0);
    }

    private void y(double f) {
        synchronized(this.p) {
            try {
                this.n.e();
                this.v();
                long v1 = this.n.b();
                this.r(v1 - ((long)(f * ((double)v1))), com.facebook.cache.common.d.a.d);
            }
            catch(IOException iOException0) {
                this.l.a(com.facebook.cache.common.b.a.o, g.r, "trimBy: " + iOException0.getMessage(), iOException0);
            }
        }
    }

    @p3.a("mLock")
    private void z() {
        com.facebook.common.statfs.a.a a$a0 = this.j.isExternal() ? com.facebook.common.statfs.a.a.b : com.facebook.common.statfs.a.a.a;
        long v = this.n.b();
        if(this.i.l(a$a0, this.b - v)) {
            this.d = this.a;
            return;
        }
        this.d = this.b;
    }
}

