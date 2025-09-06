package com.bumptech.glide.load.engine;

import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.m;
import com.bumptech.glide.util.i;
import com.bumptech.glide.util.pool.a.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class h implements a, f, Comparable, Runnable {
    static class com.bumptech.glide.load.engine.h.a {
        static final int[] a;
        static final int[] b;
        static final int[] c;

        static {
            int[] arr_v = new int[c.values().length];
            com.bumptech.glide.load.engine.h.a.c = arr_v;
            try {
                arr_v[c.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.load.engine.h.a.c[c.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[com.bumptech.glide.load.engine.h.h.values().length];
            com.bumptech.glide.load.engine.h.a.b = arr_v1;
            try {
                arr_v1[com.bumptech.glide.load.engine.h.h.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.load.engine.h.a.b[com.bumptech.glide.load.engine.h.h.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.load.engine.h.a.b[com.bumptech.glide.load.engine.h.h.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.load.engine.h.a.b[com.bumptech.glide.load.engine.h.h.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.load.engine.h.a.b[com.bumptech.glide.load.engine.h.h.a.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v2 = new int[g.values().length];
            com.bumptech.glide.load.engine.h.a.a = arr_v2;
            try {
                arr_v2[g.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.load.engine.h.a.a[g.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.load.engine.h.a.a[g.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    interface b {
        void b(q arg1);

        void c(v arg1, com.bumptech.glide.load.a arg2, boolean arg3);

        void d(h arg1);
    }

    final class com.bumptech.glide.load.engine.h.c implements com.bumptech.glide.load.engine.i.a {
        private final com.bumptech.glide.load.a a;
        final h b;

        com.bumptech.glide.load.engine.h.c(com.bumptech.glide.load.a a0) {
            this.a = a0;
        }

        @Override  // com.bumptech.glide.load.engine.i$a
        @NonNull
        public v a(@NonNull v v0) {
            return h.this.y(this.a, v0);
        }
    }

    static class d {
        private com.bumptech.glide.load.g a;
        private m b;
        private u c;

        void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        void b(e h$e0, j j0) {
            try {
                h$e0.a().a(this.a, new com.bumptech.glide.load.engine.e(this.b, this.c, j0));
            }
            finally {
                this.c.f();
            }
        }

        boolean c() {
            return this.c != null;
        }

        void d(com.bumptech.glide.load.g g0, m m0, u u0) {
            this.a = g0;
            this.b = m0;
            this.c = u0;
        }
    }

    interface e {
        com.bumptech.glide.load.engine.cache.a a();
    }

    static class com.bumptech.glide.load.engine.h.f {
        private boolean a;
        private boolean b;
        private boolean c;

        // 去混淆评级： 低(40)
        private boolean a(boolean z) {
            return (this.c || z || this.b) && this.a;
        }

        boolean b() {
            synchronized(this) {
                this.b = true;
                return this.a(false);
            }
        }

        boolean c() {
            synchronized(this) {
                this.c = true;
                return this.a(false);
            }
        }

        boolean d(boolean z) {
            synchronized(this) {
                this.a = true;
                return this.a(z);
            }
        }

        void e() {
            synchronized(this) {
                this.b = false;
                this.a = false;
                this.c = false;
            }
        }
    }

    static enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA;

        private static g[] a() [...] // Inlined contents
    }

    static enum com.bumptech.glide.load.engine.h.h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED;

        private static com.bumptech.glide.load.engine.h.h[] a() [...] // Inlined contents
    }

    private com.bumptech.glide.load.a A;
    private com.bumptech.glide.load.data.d B;
    private volatile com.bumptech.glide.load.engine.f C;
    private volatile boolean D;
    private volatile boolean E;
    private boolean F;
    private static final String G = "DecodeJob";
    private final com.bumptech.glide.load.engine.g a;
    private final List b;
    private final com.bumptech.glide.util.pool.c c;
    private final e d;
    private final Pool e;
    private final d f;
    private final com.bumptech.glide.load.engine.h.f g;
    private com.bumptech.glide.e h;
    private com.bumptech.glide.load.g i;
    private com.bumptech.glide.j j;
    private n k;
    private int l;
    private int m;
    private com.bumptech.glide.load.engine.j n;
    private j o;
    private b p;
    private int q;
    private com.bumptech.glide.load.engine.h.h r;
    private g s;
    private long t;
    private boolean u;
    private Object v;
    private Thread w;
    private com.bumptech.glide.load.g x;
    private com.bumptech.glide.load.g y;
    private Object z;

    h(e h$e0, Pool pools$Pool0) {
        this.a = new com.bumptech.glide.load.engine.g();
        this.b = new ArrayList();
        this.c = com.bumptech.glide.util.pool.c.a();
        this.f = new d();
        this.g = new com.bumptech.glide.load.engine.h.f();
        this.d = h$e0;
        this.e = pools$Pool0;
    }

    private void A() {
        this.g.e();
        this.f.a();
        this.a.a();
        this.D = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.r = null;
        this.C = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.t = 0L;
        this.E = false;
        this.v = null;
        this.b.clear();
        this.e.a(this);
    }

    private void B(g h$g0) {
        this.s = h$g0;
        this.p.d(this);
    }

    private void C() {
        this.w = Thread.currentThread();
        this.t = i.b();
        boolean z = false;
        while(!this.E && this.C != null) {
            z = this.C.a();
            if(z) {
                break;
            }
            this.r = this.k(this.r);
            this.C = this.j();
            if(this.r == com.bumptech.glide.load.engine.h.h.d) {
                this.B(g.b);
                return;
            }
            if(false) {
                break;
            }
        }
        if((this.r == com.bumptech.glide.load.engine.h.h.f || this.E) && !z) {
            this.u();
        }
    }

    private v D(Object object0, com.bumptech.glide.load.a a0, t t0) throws q {
        j j0 = this.l(a0);
        com.bumptech.glide.load.data.e e0 = this.h.i().l(object0);
        try {
            return t0.b(e0, j0, this.l, this.m, (v v0) -> {
                com.bumptech.glide.load.engine.d d0;
                c c0;
                v v1;
                com.bumptech.glide.load.n n1;
                Class class0 = v0.get().getClass();
                m m0 = null;
                if(a0 == com.bumptech.glide.load.a.d) {
                    v1 = v0;
                    n1 = null;
                }
                else {
                    com.bumptech.glide.load.n n0 = h.this.a.s(class0);
                    n1 = n0;
                    v1 = n0.a(h.this.h, v0, h.this.l, h.this.m);
                }
                if(!v0.equals(v1)) {
                    v0.recycle();
                }
                if(h.this.a.w(v1)) {
                    m0 = h.this.a.n(v1);
                    c0 = m0.b(h.this.o);
                }
                else {
                    c0 = c.c;
                }
                boolean z = h.this.a.y(h.this.x);
                if(h.this.n.d(!z, a0, c0)) {
                    if(m0 == null) {
                        throw new com.bumptech.glide.k.d(v1.get().getClass());
                    }
                    switch(c0) {
                        case 1: {
                            d0 = new com.bumptech.glide.load.engine.d(h.this.x, h.this.i);
                            break;
                        }
                        case 2: {
                            d0 = new x(h.this.a.b(), h.this.x, h.this.i, h.this.l, h.this.m, n1, class0, h.this.o);
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown strategy: " + c0);
                        }
                    }
                    v1 = u.c(v1);
                    h.this.f.d(d0, m0, ((u)v1));
                    return v1;
                }
                return v1;
            });
        }
        finally {
            e0.b();
        }
    }

    private void E() {
        switch(this.s) {
            case 1: {
                this.r = this.k(com.bumptech.glide.load.engine.h.h.a);
                this.C = this.j();
                this.C();
                return;
            }
            case 2: {
                this.C();
                return;
            }
            case 3: {
                this.i();
                return;
            }
            default: {
                throw new IllegalStateException("Unrecognized run reason: " + this.s);
            }
        }
    }

    private void F() {
        this.c.c();
        if(this.D) {
            throw new IllegalStateException("Already notified", (this.b.isEmpty() ? null : ((Throwable)this.b.get(this.b.size() - 1))));
        }
        this.D = true;
    }

    boolean G() {
        com.bumptech.glide.load.engine.h.h h$h0 = this.k(com.bumptech.glide.load.engine.h.h.a);
        return h$h0 == com.bumptech.glide.load.engine.h.h.b || h$h0 == com.bumptech.glide.load.engine.h.h.c;
    }

    public void a() {
        this.E = true;
        com.bumptech.glide.load.engine.f f0 = this.C;
        if(f0 != null) {
            f0.cancel();
        }
    }

    @Override  // com.bumptech.glide.load.engine.f$a
    public void b(com.bumptech.glide.load.g g0, Exception exception0, com.bumptech.glide.load.data.d d0, com.bumptech.glide.load.a a0) {
        d0.b();
        q q0 = new q("Fetching data failed", exception0);
        q0.k(g0, a0, d0.a());
        this.b.add(q0);
        if(Thread.currentThread() != this.w) {
            this.B(g.b);
            return;
        }
        this.C();
    }

    @Override  // com.bumptech.glide.load.engine.f$a
    public void c() {
        this.B(g.b);
    }

    @Override
    public int compareTo(@NonNull Object object0) {
        return this.f(((h)object0));
    }

    @Override  // com.bumptech.glide.load.engine.f$a
    public void d(com.bumptech.glide.load.g g0, Object object0, com.bumptech.glide.load.data.d d0, com.bumptech.glide.load.a a0, com.bumptech.glide.load.g g1) {
        this.x = g0;
        this.z = object0;
        this.B = d0;
        this.A = a0;
        this.y = g1;
        this.F = g0 != this.a.c().get(0);
        if(Thread.currentThread() != this.w) {
            this.B(g.c);
            return;
        }
        this.i();
    }

    @Override  // com.bumptech.glide.util.pool.a$f
    @NonNull
    public com.bumptech.glide.util.pool.c e() {
        return this.c;
    }

    public int f(@NonNull h h0) {
        int v = this.m() - h0.m();
        return v == 0 ? this.q - h0.q : v;
    }

    private v g(com.bumptech.glide.load.data.d d0, Object object0, com.bumptech.glide.load.a a0) throws q {
        try {
            if(object0 == null) {
                return null;
            }
            long v1 = i.b();
            v v2 = this.h(object0, a0);
            if(Log.isLoggable("DecodeJob", 2)) {
                this.p("Decoded result " + v2, v1);
            }
            return v2;
        }
        finally {
            d0.b();
        }
    }

    private v h(Object object0, com.bumptech.glide.load.a a0) throws q {
        Class class0 = object0.getClass();
        return this.D(object0, a0, this.a.h(class0));
    }

    private void i() {
        v v0;
        if(Log.isLoggable("DecodeJob", 2)) {
            this.r("Retrieved data", this.t, "data: " + this.z + ", cache key: " + this.x + ", fetcher: " + this.B);
        }
        try {
            v0 = this.g(this.B, this.z, this.A);
        }
        catch(q q0) {
            q0.j(this.y, this.A);
            this.b.add(q0);
            v0 = null;
        }
        if(v0 != null) {
            this.t(v0, this.A, this.F);
            return;
        }
        this.C();
    }

    private com.bumptech.glide.load.engine.f j() {
        switch(this.r) {
            case 1: {
                return new w(this.a, this);
            }
            case 2: {
                return new com.bumptech.glide.load.engine.c(this.a, this);
            }
            case 3: {
                return new z(this.a, this);
            }
            case 4: {
                return null;
            }
            default: {
                throw new IllegalStateException("Unrecognized stage: " + this.r);
            }
        }
    }

    private com.bumptech.glide.load.engine.h.h k(com.bumptech.glide.load.engine.h.h h$h0) {
        switch(h$h0) {
            case 1: {
                return this.n.a() ? com.bumptech.glide.load.engine.h.h.c : this.k(com.bumptech.glide.load.engine.h.h.c);
            }
            case 2: {
                return this.u ? com.bumptech.glide.load.engine.h.h.f : com.bumptech.glide.load.engine.h.h.d;
            }
            case 3: 
            case 4: {
                return com.bumptech.glide.load.engine.h.h.f;
            }
            case 5: {
                return this.n.b() ? com.bumptech.glide.load.engine.h.h.b : this.k(com.bumptech.glide.load.engine.h.h.b);
            }
            default: {
                throw new IllegalArgumentException("Unrecognized stage: " + h$h0);
            }
        }
    }

    @NonNull
    private j l(com.bumptech.glide.load.a a0) {
        j j0 = this.o;
        if(Build.VERSION.SDK_INT < 26) {
            return j0;
        }
        boolean z = a0 == com.bumptech.glide.load.a.d || this.a.x();
        com.bumptech.glide.load.i i0 = com.bumptech.glide.load.resource.bitmap.x.k;
        Boolean boolean0 = (Boolean)j0.c(i0);
        if(boolean0 != null && (!boolean0.booleanValue() || z)) {
            return j0;
        }
        j j1 = new j();
        j1.d(this.o);
        j1.f(i0, Boolean.valueOf(z));
        return j1;
    }

    private int m() {
        return this.j.ordinal();
    }

    h n(com.bumptech.glide.e e0, Object object0, n n0, com.bumptech.glide.load.g g0, int v, int v1, Class class0, Class class1, com.bumptech.glide.j j0, com.bumptech.glide.load.engine.j j1, Map map0, boolean z, boolean z1, boolean z2, j j2, b h$b0, int v2) {
        this.a.v(e0, object0, g0, v, v1, j1, class0, class1, j0, j2, map0, z, z1, this.d);
        this.h = e0;
        this.i = g0;
        this.j = j0;
        this.k = n0;
        this.l = v;
        this.m = v1;
        this.n = j1;
        this.u = z2;
        this.o = j2;
        this.p = h$b0;
        this.q = v2;
        this.s = g.a;
        this.v = object0;
        return this;
    }

    private void p(String s, long v) {
        this.r(s, v, null);
    }

    private void r(String s, long v, String s1) {
        Log.v("DecodeJob", s + " in " + i.a(v) + ", load key: " + this.k + (s1 == null ? "" : ", " + s1) + ", thread: " + "jeb-dexdec-sb-st-3722");
    }

    @Override
    public void run() {
        com.bumptech.glide.load.data.d d0;
        try {
            d0 = this.B;
            if(this.E) {
                this.u();
                if(d0 != null) {
                    goto label_4;
                }
                return;
            }
            goto label_6;
        }
        catch(com.bumptech.glide.load.engine.b b0) {
            throw b0;
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
    label_4:
        d0.b();
        return;
        try {
        label_6:
            this.E();
            goto label_21;
        }
        catch(com.bumptech.glide.load.engine.b b0) {
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
        try {
            throw b0;
        label_11:
            if(Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.E + ", stage: " + this.r, throwable0);
            }
            if(this.r != com.bumptech.glide.load.engine.h.h.e) {
                this.b.add(throwable0);
                this.u();
            }
            throw throwable0;
        label_18:
            if(d0 == null) {
                throw throwable1;
            }
        }
        catch(Throwable throwable1) {
            goto label_18;
        }
        d0.b();
        throw throwable1;
    label_21:
        if(d0 != null) {
            d0.b();
        }
    }

    private void s(v v0, com.bumptech.glide.load.a a0, boolean z) {
        this.F();
        this.p.c(v0, a0, z);
    }

    private void t(v v0, com.bumptech.glide.load.a a0, boolean z) {
        v v1;
        try {
            if(v0 instanceof r) {
                ((r)v0).initialize();
            }
            if(this.f.c()) {
                v0 = u.c(v0);
                v1 = v0;
            }
            else {
                v1 = null;
            }
            this.s(v0, a0, z);
            this.r = com.bumptech.glide.load.engine.h.h.e;
            try {
                if(this.f.c()) {
                    this.f.b(this.d, this.o);
                }
            }
            finally {
                if(v1 != null) {
                    ((u)v1).f();
                }
            }
            this.v();
            return;
        }
        catch(Throwable throwable0) {
        }
        throw throwable0;
    }

    private void u() {
        this.F();
        q q0 = new q("Failed to load resource", new ArrayList(this.b));
        this.p.b(q0);
        this.w();
    }

    private void v() {
        if(this.g.b()) {
            this.A();
        }
    }

    private void w() {
        if(this.g.c()) {
            this.A();
        }
    }

    // 检测为 Lambda 实现
    @NonNull
    v y(com.bumptech.glide.load.a a0, @NonNull v v0) [...]

    void z(boolean z) {
        if(this.g.d(z)) {
            this.A();
        }
    }
}

