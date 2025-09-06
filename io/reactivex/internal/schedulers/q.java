package io.reactivex.internal.schedulers;

import e3.o;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.util.k;
import io.reactivex.l;
import io.reactivex.processors.h;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class q extends J implements c {
    static final class a implements o {
        final class io.reactivex.internal.schedulers.q.a.a extends io.reactivex.c {
            final f a;
            final a b;

            io.reactivex.internal.schedulers.q.a.a(f q$f0) {
                this.a = q$f0;
            }

            @Override  // io.reactivex.c
            protected void J0(io.reactivex.f f0) {
                f0.b(this.a);
                this.a.b(a.this.a, f0);
            }
        }

        final io.reactivex.J.c a;

        a(io.reactivex.J.c j$c0) {
            this.a = j$c0;
        }

        public io.reactivex.c a(f q$f0) {
            return new io.reactivex.internal.schedulers.q.a.a(this, q$f0);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((f)object0));
        }
    }

    static class b extends f {
        private final Runnable a;
        private final long b;
        private final TimeUnit c;

        b(Runnable runnable0, long v, TimeUnit timeUnit0) {
            this.a = runnable0;
            this.b = v;
            this.c = timeUnit0;
        }

        @Override  // io.reactivex.internal.schedulers.q$f
        protected c c(io.reactivex.J.c j$c0, io.reactivex.f f0) {
            return j$c0.d(new d(this.a, f0), this.b, this.c);
        }
    }

    static class io.reactivex.internal.schedulers.q.c extends f {
        private final Runnable a;

        io.reactivex.internal.schedulers.q.c(Runnable runnable0) {
            this.a = runnable0;
        }

        @Override  // io.reactivex.internal.schedulers.q$f
        protected c c(io.reactivex.J.c j$c0, io.reactivex.f f0) {
            return j$c0.c(new d(this.a, f0));
        }
    }

    static class d implements Runnable {
        final io.reactivex.f a;
        final Runnable b;

        d(Runnable runnable0, io.reactivex.f f0) {
            this.b = runnable0;
            this.a = f0;
        }

        @Override
        public void run() {
            try {
                this.b.run();
            }
            finally {
                this.a.onComplete();
            }
        }
    }

    static final class e extends io.reactivex.J.c {
        private final AtomicBoolean a;
        private final io.reactivex.processors.c b;
        private final io.reactivex.J.c c;

        e(io.reactivex.processors.c c0, io.reactivex.J.c j$c0) {
            this.b = c0;
            this.c = j$c0;
            this.a = new AtomicBoolean();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.a.get();
        }

        @Override  // io.reactivex.J$c
        @d3.f
        public c c(@d3.f Runnable runnable0) {
            c c0 = new io.reactivex.internal.schedulers.q.c(runnable0);
            this.b.onNext(c0);
            return c0;
        }

        @Override  // io.reactivex.J$c
        @d3.f
        public c d(@d3.f Runnable runnable0, long v, @d3.f TimeUnit timeUnit0) {
            c c0 = new b(runnable0, v, timeUnit0);
            this.b.onNext(c0);
            return c0;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.a.compareAndSet(false, true)) {
                this.b.onComplete();
                this.c.dispose();
            }
        }
    }

    static abstract class f extends AtomicReference implements c {
        f() {
            super(q.e);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return ((c)this.get()).a();
        }

        void b(io.reactivex.J.c j$c0, io.reactivex.f f0) {
            c c0 = (c)this.get();
            if(c0 == q.f) {
                return;
            }
            c c1 = q.e;
            if(c0 != c1) {
                return;
            }
            c c2 = this.c(j$c0, f0);
            if(!this.compareAndSet(c1, c2)) {
                c2.dispose();
            }
        }

        protected abstract c c(io.reactivex.J.c arg1, io.reactivex.f arg2);

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            c c1;
            c c0 = q.f;
            do {
                c1 = (c)this.get();
                if(c1 == q.f) {
                    return;
                }
            }
            while(!this.compareAndSet(c1, c0));
            if(c1 != q.e) {
                c1.dispose();
            }
        }
    }

    static final class g implements c {
        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return false;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
        }
    }

    private final J b;
    private final io.reactivex.processors.c c;
    private c d;
    static final c e;
    static final c f;

    static {
        q.e = new g();
        q.f = io.reactivex.disposables.d.a();
    }

    public q(o o0, J j0) {
        this.b = j0;
        io.reactivex.processors.c c0 = h.U8().S8();
        this.c = c0;
        try {
            this.d = ((io.reactivex.c)o0.apply(c0)).G0();
        }
        catch(Throwable throwable0) {
            throw k.f(throwable0);
        }
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.d.a();
    }

    @Override  // io.reactivex.J
    @d3.f
    public io.reactivex.J.c d() {
        io.reactivex.J.c j$c0 = this.b.d();
        io.reactivex.processors.c c0 = h.U8().S8();
        l l0 = c0.M3(new a(j$c0));
        io.reactivex.J.c j$c1 = new e(c0, j$c0);
        this.c.onNext(l0);
        return j$c1;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        this.d.dispose();
    }
}

