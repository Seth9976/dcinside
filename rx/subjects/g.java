package rx.subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.functions.m;
import rx.g.a;
import rx.h;
import rx.internal.operators.x;
import rx.n;
import rx.subscriptions.f;

final class g extends AtomicReference implements a {
    public static final class b {
        final boolean a;
        final c[] b;
        static final c[] c;
        static final b d;
        static final b e;

        static {
            c[] arr_g$c = new c[0];
            b.c = arr_g$c;
            b.d = new b(true, arr_g$c);
            b.e = new b(false, arr_g$c);
        }

        public b(boolean z, c[] arr_g$c) {
            this.a = z;
            this.b = arr_g$c;
        }

        public b a(c g$c0) {
            c[] arr_g$c = new c[this.b.length + 1];
            System.arraycopy(this.b, 0, arr_g$c, 0, this.b.length);
            arr_g$c[this.b.length] = g$c0;
            return new b(this.a, arr_g$c);
        }

        public b b(c g$c0) {
            c[] arr_g$c = this.b;
            if(arr_g$c.length == 1 && arr_g$c[0] == g$c0) {
                return b.e;
            }
            if(arr_g$c.length == 0) {
                return this;
            }
            int v = arr_g$c.length - 1;
            c[] arr_g$c1 = new c[v];
            int v2 = 0;
            for(int v1 = 0; v1 < arr_g$c.length; ++v1) {
                c g$c1 = arr_g$c[v1];
                if(g$c1 != g$c0) {
                    if(v2 == v) {
                        return this;
                    }
                    arr_g$c1[v2] = g$c1;
                    ++v2;
                }
            }
            if(v2 == 0) {
                return b.e;
            }
            if(v2 < v) {
                c[] arr_g$c2 = new c[v2];
                System.arraycopy(arr_g$c1, 0, arr_g$c2, 0, v2);
                arr_g$c1 = arr_g$c2;
            }
            return new b(this.a, arr_g$c1);
        }
    }

    public static final class c implements h {
        final n a;
        boolean b;
        boolean c;
        List d;
        boolean e;
        volatile boolean f;
        private volatile Object g;

        public c(n n0) {
            this.b = true;
            this.a = n0;
        }

        void b(Object object0) {
            if(object0 != null) {
                x.a(this.a, object0);
            }
        }

        @Override  // rx.h
        public void d() {
            this.a.d();
        }

        void f(Object object0) {
            synchronized(this) {
                if(this.b && !this.c) {
                    boolean z = false;
                    this.b = false;
                    if(object0 != null) {
                        z = true;
                    }
                    this.c = z;
                    if(object0 != null) {
                        this.g(null, object0);
                    }
                }
            }
        }

        void g(List list0, Object object0) {
            boolean z = true;
            boolean z1 = true;
            while(true) {
                try {
                label_2:
                    if(list0 != null) {
                        for(Object object1: list0) {
                            this.b(object1);
                        }
                    }
                    if(z1) {
                        this.b(object0);
                        z1 = false;
                    }
                    __monitor_enter(this);
                }
                catch(Throwable throwable0) {
                    z = false;
                    break;
                }
                try {
                    list0 = this.d;
                    this.d = null;
                    if(list0 == null) {
                        this.c = false;
                        goto label_20;
                    }
                    goto label_22;
                }
                catch(Throwable throwable1) {
                    goto label_25;
                }
                try {
                label_20:
                    __monitor_exit(this);
                    return;
                }
                catch(Throwable throwable1) {
                    goto label_26;
                }
                try {
                label_22:
                    __monitor_exit(this);
                    goto label_2;
                }
                catch(Throwable throwable1) {
                label_25:
                    z = false;
                    while(true) {
                        try {
                        label_26:
                            __monitor_exit(this);
                            throw throwable1;
                        }
                        catch(Throwable throwable1) {
                        }
                    }
                }
                goto label_26;
            }
            if(!z) {
                synchronized(this) {
                    this.c = false;
                }
            }
            throw throwable0;
        }

        void h(Object object0) {
            if(!this.e) {
                synchronized(this) {
                    this.b = false;
                    if(this.c) {
                        if(this.d == null) {
                            this.d = new ArrayList();
                        }
                        this.d.add(object0);
                        return;
                    }
                }
                this.e = true;
            }
            x.a(this.a, object0);
        }

        h i() {
            return this.a;
        }

        public Object k() {
            return this.g;
        }

        public void m(Object object0) {
            this.g = object0;
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }
    }

    volatile Object a;
    boolean b;
    rx.functions.b c;
    rx.functions.b d;
    rx.functions.b e;
    private static final long f = 0x53C184D753C8B010L;

    public g() {
        super(b.e);
        this.b = true;
        this.c = m.a();
        this.d = m.a();
        this.e = m.a();
    }

    boolean a(c g$c0) {
        do {
            b g$b0 = (b)this.get();
            if(g$b0.a) {
                this.e.b(g$c0);
                return false;
            }
        }
        while(!this.compareAndSet(g$b0, g$b0.a(g$c0)));
        this.d.b(g$c0);
        return true;
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.d(((n)object0));
    }

    void c(n n0, c g$c0) {
        class rx.subjects.g.a implements rx.functions.a {
            final c a;
            final g b;

            rx.subjects.g.a(c g$c0) {
                this.a = g$c0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                g.this.o(this.a);
            }
        }

        n0.q(f.a(new rx.subjects.g.a(this, g$c0)));
    }

    public void d(n n0) {
        c g$c0 = new c(n0);
        this.c(n0, g$c0);
        this.c.b(g$c0);
        if(!n0.j() && this.a(g$c0) && n0.j()) {
            this.o(g$c0);
        }
    }

    Object e() {
        return this.a;
    }

    c[] j(Object object0) {
        this.q(object0);
        return ((b)this.get()).b;
    }

    c[] l() {
        return ((b)this.get()).b;
    }

    void o(c g$c0) {
        do {
            b g$b0 = (b)this.get();
            if(g$b0.a) {
                return;
            }
            b g$b1 = g$b0.b(g$c0);
        }
        while(g$b1 != g$b0 && !this.compareAndSet(g$b0, g$b1));
    }

    void q(Object object0) {
        this.a = object0;
    }

    c[] r(Object object0) {
        this.q(object0);
        this.b = false;
        return ((b)this.get()).a ? b.c : ((b)this.getAndSet(b.d)).b;
    }
}

