package rx.observables;

import D4.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.functions.b;
import rx.functions.d;
import rx.functions.o;
import rx.functions.p;
import rx.functions.r;
import rx.g;
import rx.n;
import rx.observers.f;
import rx.plugins.c;

@a
public abstract class rx.observables.a implements rx.g.a {
    static final class h extends rx.observables.a {
        private final o a;
        private final r b;
        private final b c;

        public h(o o0, r r0) {
            this(o0, r0, null);
        }

        h(o o0, r r0, b b0) {
            this.a = o0;
            this.b = r0;
            this.c = b0;
        }

        public h(r r0) {
            this(null, r0, null);
        }

        public h(r r0, b b0) {
            this(null, r0, b0);
        }

        @Override  // rx.observables.a
        public void b(Object object0) {
            super.a(((n)object0));
        }

        @Override  // rx.observables.a
        protected Object q() {
            return this.a == null ? null : this.a.call();
        }

        @Override  // rx.observables.a
        protected Object r(Object object0, long v, rx.h h0) {
            return this.b.m(object0, v, h0);
        }

        @Override  // rx.observables.a
        protected void s(Object object0) {
            b b0 = this.c;
            if(b0 != null) {
                b0.b(object0);
            }
        }
    }

    static final class i implements rx.h, rx.i, rx.o {
        final AtomicBoolean a;
        private final rx.observables.a b;
        private final f c;
        final rx.subscriptions.b d;
        private boolean e;
        private boolean f;
        private Object g;
        private final j h;
        boolean i;
        List j;
        rx.i k;
        long l;

        public i(rx.observables.a a0, Object object0, j a$j0) {
            this.d = new rx.subscriptions.b();
            this.b = a0;
            this.c = new f(this);
            this.g = object0;
            this.h = a$j0;
            this.a = new AtomicBoolean();
        }

        void b() {
            this.d.l();
            try {
                this.b.s(this.g);
            }
            catch(Throwable throwable0) {
                this.f(throwable0);
            }
        }

        @Override  // rx.h
        public void d() {
            if(this.e) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.e = true;
            this.h.d();
        }

        private void f(Throwable throwable0) {
            if(this.e) {
                c.I(throwable0);
                return;
            }
            this.e = true;
            this.h.onError(throwable0);
            this.b();
        }

        public void g(long v) {
            this.g = this.b.r(this.g, v, this.c);
        }

        public void h(g g0) {
            if(this.f) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.f = true;
            if(this.e) {
                return;
            }
            this.m(g0);
        }

        public void i(long v) {
            List list1;
            Iterator iterator0;
            int v1 = Long.compare(v, 0L);
            if(v1 == 0) {
                return;
            }
            if(v1 < 0) {
                throw new IllegalStateException("Request can\'t be negative! " + v);
            }
            synchronized(this) {
                if(this.i) {
                    List list0 = this.j;
                    if(list0 == null) {
                        list0 = new ArrayList();
                        this.j = list0;
                    }
                    list0.add(v);
                    return;
                }
                goto label_13;
            }
            return;
        label_13:
            this.i = true;
            if(this.n(v)) {
                return;
            }
            do {
                synchronized(this) {
                    list1 = this.j;
                    if(list1 == null) {
                        this.i = false;
                        return;
                    }
                    this.j = null;
                }
                iterator0 = list1.iterator();
            label_30:
            }
            while(!iterator0.hasNext());
            Object object0 = iterator0.next();
            if(!this.n(((long)(((Long)object0))))) {
                goto label_30;
            }
        }

        @Override  // rx.o
        public boolean j() {
            return this.a.get();
        }

        void k(rx.i i0) {
            if(this.k != null) {
                throw new IllegalStateException("setConcatProducer may be called at most once!");
            }
            this.k = i0;
        }

        @Override  // rx.o
        public void l() {
            if(this.a.compareAndSet(false, true)) {
                synchronized(this) {
                    if(this.i) {
                        ArrayList arrayList0 = new ArrayList();
                        this.j = arrayList0;
                        arrayList0.add(0L);
                        return;
                    }
                    this.i = true;
                }
                this.b();
            }
        }

        private void m(g g0) {
            class rx.observables.a.i.a extends n {
                long f;
                final long g;
                final rx.internal.operators.g h;
                final i i;

                rx.observables.a.i.a(long v, rx.internal.operators.g g0) {
                    this.g = v;
                    this.h = g0;
                    super();
                    this.f = v;
                }

                @Override  // rx.h
                public void d() {
                    this.h.d();
                    long v = this.f;
                    if(v > 0L) {
                        i.this.i(v);
                    }
                }

                @Override  // rx.h
                public void onError(Throwable throwable0) {
                    this.h.onError(throwable0);
                }

                @Override  // rx.h
                public void onNext(Object object0) {
                    --this.f;
                    this.h.onNext(object0);
                }
            }


            class rx.observables.a.i.b implements rx.functions.a {
                final n a;
                final i b;

                rx.observables.a.i.b(n n0) {
                    this.a = n0;
                    super();
                }

                @Override  // rx.functions.a
                public void call() {
                    i.this.d.e(this.a);
                }
            }

            rx.internal.operators.g g1 = rx.internal.operators.g.C7();
            rx.observables.a.i.a a$i$a0 = new rx.observables.a.i.a(this, this.l, g1);
            this.d.a(a$i$a0);
            g0.S1(new rx.observables.a.i.b(this, a$i$a0)).v5(a$i$a0);
            this.h.onNext(g1);
        }

        boolean n(long v) {
            if(this.j()) {
                this.b();
                return true;
            }
            try {
                this.f = false;
                this.l = v;
                this.g(v);
                if((!this.e || this.d.d()) && !this.j()) {
                    if(!this.f) {
                        this.f(new IllegalStateException("No events emitted!"));
                        return true;
                    }
                    return false;
                }
                this.b();
                return true;
            }
            catch(Throwable throwable0) {
            }
            this.f(throwable0);
            return true;
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.e) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.e = true;
            this.h.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.h(((g)object0));
        }

        @Override  // rx.i
        public void request(long v) {
            List list1;
            Iterator iterator0;
            int v1 = Long.compare(v, 0L);
            if(v1 == 0) {
                return;
            }
            if(v1 < 0) {
                throw new IllegalStateException("Request can\'t be negative! " + v);
            }
            boolean z = true;
            synchronized(this) {
                if(this.i) {
                    List list0 = this.j;
                    if(list0 == null) {
                        list0 = new ArrayList();
                        this.j = list0;
                    }
                    list0.add(v);
                }
                else {
                    this.i = true;
                    z = false;
                }
            }
            this.k.request(v);
            if(z) {
                return;
            }
            if(this.n(v)) {
                return;
            }
            do {
                synchronized(this) {
                    list1 = this.j;
                    if(list1 == null) {
                        this.i = false;
                        return;
                    }
                    this.j = null;
                }
                iterator0 = list1.iterator();
            label_34:
            }
            while(!iterator0.hasNext());
            Object object0 = iterator0.next();
            if(!this.n(((long)(((Long)object0))))) {
                goto label_34;
            }
        }
    }

    static final class j extends g implements rx.h {
        static final class rx.observables.a.j.a implements rx.g.a {
            n a;

            public void a(n n0) {
                synchronized(this) {
                    if(this.a == null) {
                        this.a = n0;
                        return;
                    }
                }
                n0.onError(new IllegalStateException("There can be only one subscriber"));
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((n)object0));
            }
        }

        private final rx.observables.a.j.a b;

        protected j(rx.observables.a.j.a a$j$a0) {
            super(a$j$a0);
            this.b = a$j$a0;
        }

        public static j A7() {
            return new j(new rx.observables.a.j.a());
        }

        @Override  // rx.h
        public void d() {
            this.b.a.d();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.b.a.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.b.a.onNext(object0);
        }
    }

    public final void a(n n0) {
        class rx.observables.a.f extends n {
            final n f;
            final i g;
            final rx.observables.a h;

            rx.observables.a.f(n n0, i a$i0) {
                this.f = n0;
                this.g = a$i0;
                super();
            }

            @Override  // rx.n
            public void X(rx.i i0) {
                this.g.k(i0);
            }

            @Override  // rx.h
            public void d() {
                this.f.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.f.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.f.onNext(object0);
            }
        }


        class rx.observables.a.g implements p {
            final rx.observables.a a;

            public g a(g g0) {
                return g0.R3();
            }

            @Override  // rx.functions.p
            public Object b(Object object0) {
                return this.a(((g)object0));
            }
        }

        Object object0;
        try {
            object0 = this.q();
        }
        catch(Throwable throwable0) {
            n0.onError(throwable0);
            return;
        }
        j a$j0 = j.A7();
        i a$i0 = new i(this, object0, a$j0);
        rx.observables.a.f a$f0 = new rx.observables.a.f(this, n0, a$i0);
        a$j0.R3().d1(new rx.observables.a.g(this)).N6(a$f0);
        n0.q(a$f0);
        n0.q(a$i0);
        n0.X(a$i0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }

    public static rx.observables.a c(o o0, d d0) {
        static final class rx.observables.a.a implements r {
            final d a;

            rx.observables.a.a(d d0) {
                this.a = d0;
                super();
            }

            public Object a(Object object0, Long long0, rx.h h0) {
                this.a.m(object0, long0, h0);
                return object0;
            }

            @Override  // rx.functions.r
            public Object m(Object object0, Object object1, Object object2) {
                return this.a(object0, ((Long)object1), ((rx.h)object2));
            }
        }

        return new h(o0, new rx.observables.a.a(d0));
    }

    public static rx.observables.a d(o o0, d d0, b b0) {
        static final class rx.observables.a.b implements r {
            final d a;

            rx.observables.a.b(d d0) {
                this.a = d0;
                super();
            }

            public Object a(Object object0, Long long0, rx.h h0) {
                this.a.m(object0, long0, h0);
                return object0;
            }

            @Override  // rx.functions.r
            public Object m(Object object0, Object object1, Object object2) {
                return this.a(object0, ((Long)object1), ((rx.h)object2));
            }
        }

        return new h(o0, new rx.observables.a.b(d0), b0);
    }

    public static rx.observables.a e(o o0, r r0) {
        return new h(o0, r0);
    }

    public static rx.observables.a j(o o0, r r0, b b0) {
        return new h(o0, r0, b0);
    }

    public static rx.observables.a l(rx.functions.c c0) {
        static final class rx.observables.a.c implements r {
            final rx.functions.c a;

            rx.observables.a.c(rx.functions.c c0) {
                this.a = c0;
                super();
            }

            public Void a(Void void0, Long long0, rx.h h0) {
                this.a.p(long0, h0);
                return void0;
            }

            @Override  // rx.functions.r
            public Object m(Object object0, Object object1, Object object2) {
                return this.a(((Void)object0), ((Long)object1), ((rx.h)object2));
            }
        }

        return new h(new rx.observables.a.c(c0));
    }

    public static rx.observables.a o(rx.functions.c c0, rx.functions.a a0) {
        static final class rx.observables.a.d implements r {
            final rx.functions.c a;

            rx.observables.a.d(rx.functions.c c0) {
                this.a = c0;
                super();
            }

            public Void a(Void void0, Long long0, rx.h h0) {
                this.a.p(long0, h0);
                return null;
            }

            @Override  // rx.functions.r
            public Object m(Object object0, Object object1, Object object2) {
                return this.a(((Void)object0), ((Long)object1), ((rx.h)object2));
            }
        }


        static final class e implements b {
            final rx.functions.a a;

            e(rx.functions.a a0) {
                this.a = a0;
                super();
            }

            public void a(Void void0) {
                this.a.call();
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((Void)object0));
            }
        }

        return new h(new rx.observables.a.d(c0), new e(a0));
    }

    protected abstract Object q();

    protected abstract Object r(Object arg1, long arg2, rx.h arg3);

    protected void s(Object object0) {
    }
}

