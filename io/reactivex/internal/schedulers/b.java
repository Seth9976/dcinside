package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.d;
import io.reactivex.J.c;
import io.reactivex.J;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.disposables.f;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends J implements o {
    static final class a extends c {
        private final f a;
        private final io.reactivex.disposables.b b;
        private final f c;
        private final io.reactivex.internal.schedulers.b.c d;
        volatile boolean e;

        a(io.reactivex.internal.schedulers.b.c b$c0) {
            this.d = b$c0;
            f f0 = new f();
            this.a = f0;
            io.reactivex.disposables.b b0 = new io.reactivex.disposables.b();
            this.b = b0;
            f f1 = new f();
            this.c = f1;
            f1.d(f0);
            f1.d(b0);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.e;
        }

        @Override  // io.reactivex.J$c
        @d3.f
        public io.reactivex.disposables.c c(@d3.f Runnable runnable0) {
            return this.e ? e.a : this.d.f(runnable0, 0L, TimeUnit.MILLISECONDS, this.a);
        }

        @Override  // io.reactivex.J$c
        @d3.f
        public io.reactivex.disposables.c d(@d3.f Runnable runnable0, long v, @d3.f TimeUnit timeUnit0) {
            return this.e ? e.a : this.d.f(runnable0, v, timeUnit0, this.b);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.e) {
                this.e = true;
                this.c.dispose();
            }
        }
    }

    static final class io.reactivex.internal.schedulers.b.b implements o {
        final int a;
        final io.reactivex.internal.schedulers.b.c[] b;
        long c;

        io.reactivex.internal.schedulers.b.b(int v, ThreadFactory threadFactory0) {
            this.a = v;
            this.b = new io.reactivex.internal.schedulers.b.c[v];
            for(int v1 = 0; v1 < v; ++v1) {
                this.b[v1] = new io.reactivex.internal.schedulers.b.c(threadFactory0);
            }
        }

        public io.reactivex.internal.schedulers.b.c a() {
            int v = this.a;
            if(v == 0) {
                return b.i;
            }
            long v1 = this.c;
            this.c = v1 + 1L;
            return this.b[((int)(v1 % ((long)v)))];
        }

        @Override  // io.reactivex.internal.schedulers.o
        public void b(int v, io.reactivex.internal.schedulers.o.a o$a0) {
            int v1 = this.a;
            if(v1 == 0) {
                for(int v2 = 0; v2 < v; ++v2) {
                    o$a0.a(v2, b.i);
                }
                return;
            }
            int v3 = ((int)this.c) % v1;
            for(int v4 = 0; v4 < v; ++v4) {
                o$a0.a(v4, new a(this.b[v3]));
                ++v3;
                v3 = v3 == v1 ? 0 : v3 + 1;
            }
            this.c = (long)v3;
        }

        public void c() {
            io.reactivex.internal.schedulers.b.c[] arr_b$c = this.b;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].dispose();
            }
        }
    }

    static final class io.reactivex.internal.schedulers.b.c extends i {
        io.reactivex.internal.schedulers.b.c(ThreadFactory threadFactory0) {
            super(threadFactory0);
        }
    }

    final ThreadFactory b;
    final AtomicReference c;
    static final io.reactivex.internal.schedulers.b.b d = null;
    private static final String e = "RxComputationThreadPool";
    static final k f = null;
    static final String g = "rx2.computation-threads";
    static final int h = 0;
    static final io.reactivex.internal.schedulers.b.c i = null;
    private static final String j = "rx2.computation-priority";

    static {
        b.h = 8;
        io.reactivex.internal.schedulers.b.c b$c0 = new io.reactivex.internal.schedulers.b.c(new k("RxComputationShutdown"));
        b.i = b$c0;
        b$c0.dispose();
        k k0 = new k("RxComputationThreadPool", 5, true);
        b.f = k0;
        io.reactivex.internal.schedulers.b.b b$b0 = new io.reactivex.internal.schedulers.b.b(0, k0);
        b.d = b$b0;
        b$b0.c();
    }

    public b() {
        this(b.f);
    }

    public b(ThreadFactory threadFactory0) {
        this.b = threadFactory0;
        this.c = new AtomicReference(b.d);
        this.j();
    }

    @Override  // io.reactivex.internal.schedulers.o
    public void b(int v, io.reactivex.internal.schedulers.o.a o$a0) {
        io.reactivex.internal.functions.b.h(v, "number > 0 required");
        ((io.reactivex.internal.schedulers.b.b)this.c.get()).b(v, o$a0);
    }

    @Override  // io.reactivex.J
    @d3.f
    public c d() {
        return new a(((io.reactivex.internal.schedulers.b.b)this.c.get()).a());
    }

    @Override  // io.reactivex.J
    @d3.f
    public io.reactivex.disposables.c g(@d3.f Runnable runnable0, long v, TimeUnit timeUnit0) {
        return ((io.reactivex.internal.schedulers.b.b)this.c.get()).a().g(runnable0, v, timeUnit0);
    }

    @Override  // io.reactivex.J
    @d3.f
    public io.reactivex.disposables.c h(@d3.f Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        return ((io.reactivex.internal.schedulers.b.b)this.c.get()).a().h(runnable0, v, v1, timeUnit0);
    }

    @Override  // io.reactivex.J
    public void i() {
        io.reactivex.internal.schedulers.b.b b$b0;
        do {
            b$b0 = (io.reactivex.internal.schedulers.b.b)this.c.get();
            io.reactivex.internal.schedulers.b.b b$b1 = b.d;
            if(b$b0 == b$b1) {
                return;
            }
        }
        while(!d.a(this.c, b$b0, b$b1));
        b$b0.c();
    }

    @Override  // io.reactivex.J
    public void j() {
        io.reactivex.internal.schedulers.b.b b$b0 = new io.reactivex.internal.schedulers.b.b(b.h, this.b);
        if(!d.a(this.c, b.d, b$b0)) {
            b$b0.c();
        }
    }

    static int l(int v, int v1) [...] // 潜在的解密器
}

