package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.g;
import rx.internal.util.i;
import rx.n;
import rx.o;
import rx.subscriptions.e;

public final class h extends g {
    static final class a extends i implements rx.h {
        final g f;
        final e g;
        volatile c[] h;
        volatile boolean i;
        boolean j;
        static final c[] k;

        static {
            a.k = new c[0];
        }

        public a(g g0, int v) {
            super(v);
            this.f = g0;
            this.h = a.k;
            this.g = new e();
        }

        @Override  // rx.h
        public void d() {
            if(!this.j) {
                this.j = true;
                this.b(x.b());
                this.g.l();
                this.p();
            }
        }

        public void n(c h$c0) {
            synchronized(this.g) {
                c[] arr_h$c = this.h;
                c[] arr_h$c1 = new c[arr_h$c.length + 1];
                System.arraycopy(arr_h$c, 0, arr_h$c1, 0, arr_h$c.length);
                arr_h$c1[arr_h$c.length] = h$c0;
                this.h = arr_h$c1;
            }
        }

        public void o() {
            class rx.internal.operators.h.a.a extends n {
                final a f;

                @Override  // rx.h
                public void d() {
                    a.this.d();
                }

                @Override  // rx.h
                public void onError(Throwable throwable0) {
                    a.this.onError(throwable0);
                }

                @Override  // rx.h
                public void onNext(Object object0) {
                    a.this.onNext(object0);
                }
            }

            rx.internal.operators.h.a.a h$a$a0 = new rx.internal.operators.h.a.a(this);
            this.g.b(h$a$a0);
            this.f.N6(h$a$a0);
            this.i = true;
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(!this.j) {
                this.j = true;
                this.b(x.c(throwable0));
                this.g.l();
                this.p();
            }
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(!this.j) {
                this.b(x.j(object0));
                this.p();
            }
        }

        void p() {
            c[] arr_h$c = this.h;
            for(int v = 0; v < arr_h$c.length; ++v) {
                arr_h$c[v].b();
            }
        }

        public void q(c h$c0) {
            synchronized(this.g) {
                c[] arr_h$c = this.h;
                int v1;
                for(v1 = 0; true; ++v1) {
                    if(v1 >= arr_h$c.length) {
                        v1 = -1;
                        break;
                    }
                    if(arr_h$c[v1].equals(h$c0)) {
                        break;
                    }
                }
                if(v1 < 0) {
                    return;
                }
                if(arr_h$c.length == 1) {
                    this.h = a.k;
                    return;
                }
                c[] arr_h$c1 = new c[arr_h$c.length - 1];
                System.arraycopy(arr_h$c, 0, arr_h$c1, 0, v1);
                System.arraycopy(arr_h$c, v1 + 1, arr_h$c1, v1, arr_h$c.length - v1 - 1);
                this.h = arr_h$c1;
            }
        }
    }

    static final class b extends AtomicBoolean implements rx.g.a {
        final a a;
        private static final long b = 0xD8E555C98D8DFDB2L;

        public b(a h$a0) {
            this.a = h$a0;
        }

        public void a(n n0) {
            c h$c0 = new c(n0, this.a);
            this.a.n(h$c0);
            n0.q(h$c0);
            n0.X(h$c0);
            if(!this.get() && this.compareAndSet(false, true)) {
                this.a.o();
            }
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.a(((n)object0));
        }
    }

    static final class c extends AtomicLong implements rx.i, o {
        final n a;
        final a b;
        Object[] c;
        int d;
        int e;
        boolean f;
        boolean g;
        private static final long h = -2557562030197141021L;

        public c(n n0, a h$a0) {
            this.a = n0;
            this.b = h$a0;
        }

        public long a(long v) {
            return this.addAndGet(-v);
        }

        public void b() {
            int v8;
            Object object0;
            int v7;
            int v6;
            int v5;
            Object[] arr_object;
            long v1;
            n n0;
            int v = 1;
            synchronized(this) {
                if(this.f) {
                    this.g = true;
                    return;
                }
                this.f = true;
            }
            try {
                n0 = this.a;
            alab1:
                while(true) {
                label_9:
                    v1 = this.get();
                    int v2 = Long.compare(v1, 0L);
                    if(v2 < 0) {
                        return;
                    }
                    int v3 = this.b.i();
                    if(v3 != 0) {
                        arr_object = this.c;
                        if(arr_object == null) {
                            arr_object = this.b.g();
                            this.c = arr_object;
                        }
                        int v4 = arr_object.length - 1;
                        v5 = this.e;
                        v6 = this.d;
                        if(v2 == 0) {
                            goto label_60;
                        }
                        else {
                            v7 = 0;
                            while(true) {
                            label_24:
                                if(v5 >= v3 || v1 <= 0L) {
                                    goto label_53;
                                }
                                if(n0.j()) {
                                    return;
                                }
                                if(v6 == v4) {
                                    arr_object = (Object[])arr_object[v4];
                                    v6 = 0;
                                }
                                object0 = arr_object[v6];
                                break alab1;
                            }
                        }
                    }
                    goto label_73;
                }
            }
            catch(Throwable throwable0) {
                v8 = 0;
                goto label_96;
            }
            try {
                if(x.a(n0, object0)) {
                    goto label_36;
                }
                goto label_48;
            }
            catch(Throwable throwable1) {
                v8 = 0;
                goto label_40;
            }
            try {
            label_36:
                this.l();
                return;
            }
            catch(Throwable throwable1) {
                v8 = 1;
            }
            try {
            label_40:
                rx.exceptions.c.e(throwable1);
            }
            catch(Throwable throwable0) {
                goto label_96;
            }
            try {
                this.l();
                if(!x.g(object0) && !x.f(object0)) {
                    n0.onError(rx.exceptions.h.a(throwable1, x.e(object0)));
                }
                return;
            }
            catch(Throwable throwable2) {
                throwable0 = throwable2;
                v8 = 1;
                goto label_96;
            }
            try {
            label_48:
                ++v6;
                ++v5;
                --v1;
                ++v7;
                goto label_24;
            label_53:
                if(n0.j()) {
                    return;
                }
                this.e = v5;
                this.d = v6;
                this.c = arr_object;
                this.a(((long)v7));
                goto label_73;
            label_60:
                Object object1 = arr_object[v6];
                if(x.f(object1)) {
                    goto label_66;
                }
                if(x.g(object1)) {
                    n0.onError(x.d(object1));
                    goto label_64;
                }
                goto label_73;
            }
            catch(Throwable throwable0) {
                v8 = 0;
                goto label_96;
            }
            try {
            label_64:
                this.l();
                return;
            }
            catch(Throwable throwable2) {
                throwable0 = throwable2;
                v8 = 1;
                goto label_96;
            }
            try {
            label_66:
                n0.d();
            }
            catch(Throwable throwable0) {
                v8 = 0;
                goto label_96;
            }
            try {
                this.l();
                return;
            }
            catch(Throwable throwable2) {
                throwable0 = throwable2;
                v8 = 1;
                goto label_96;
            }
            try {
            label_73:
                __monitor_enter(this);
            }
            catch(Throwable throwable0) {
                v8 = 0;
                goto label_96;
            }
            try {
                if(!this.g) {
                    this.f = false;
                    goto label_80;
                }
                goto label_82;
            }
            catch(Throwable throwable3) {
                goto label_86;
            }
            try {
            label_80:
                __monitor_exit(this);
                return;
            }
            catch(Throwable throwable3) {
                goto label_87;
            }
            try {
            label_82:
                this.g = false;
                __monitor_exit(this);
                goto label_9;
            }
            catch(Throwable throwable3) {
            label_86:
                v = 0;
                while(true) {
                    try {
                    label_87:
                        __monitor_exit(this);
                        throw throwable3;
                    }
                    catch(Throwable throwable3) {
                    }
                }
            }
            goto label_87;
            try {
                throw throwable3;
            }
            catch(Throwable throwable4) {
                v8 = v;
                throwable0 = throwable4;
            }
        label_96:
            if(v8 == 0) {
                synchronized(this) {
                    this.f = false;
                }
            }
            throw throwable0;
        }

        @Override  // rx.o
        public boolean j() {
            return this.get() < 0L;
        }

        @Override  // rx.o
        public void l() {
            if(this.get() >= 0L && this.getAndSet(-1L) >= 0L) {
                this.b.q(this);
            }
        }

        @Override  // rx.i
        public void request(long v) {
            do {
                long v1 = this.get();
                if(v1 < 0L) {
                    return;
                }
            }
            while(!this.compareAndSet(v1, (v1 + v >= 0L ? v1 + v : 0x7FFFFFFFFFFFFFFFL)));
            this.b();
        }
    }

    private final a b;

    private h(rx.g.a g$a0, a h$a0) {
        super(g$a0);
        this.b = h$a0;
    }

    public static h A7(g g0) {
        return h.B7(g0, 16);
    }

    public static h B7(g g0, int v) {
        if(v < 1) {
            throw new IllegalArgumentException("capacityHint > 0 required");
        }
        a h$a0 = new a(g0, v);
        return new h(new b(h$a0), h$a0);
    }

    boolean C7() {
        return this.b.h.length != 0;
    }

    boolean D7() {
        return this.b.i;
    }
}

