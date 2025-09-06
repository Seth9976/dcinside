package rx.subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.d;
import rx.h;
import rx.i;
import rx.n;
import rx.o;

public final class c extends f {
    static final class a extends AtomicLong implements h, i, o {
        final b a;
        final n b;
        long c;
        private static final long d = 0x59896C1DF8E78B00L;

        public a(b c$b0, n n0) {
            this.a = c$b0;
            this.b = n0;
        }

        @Override  // rx.h
        public void d() {
            if(this.get() != 0x8000000000000000L) {
                this.b.d();
            }
        }

        @Override  // rx.o
        public boolean j() {
            return this.get() == 0x8000000000000000L;
        }

        @Override  // rx.o
        public void l() {
            if(this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
                this.a.x(this);
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.get() != 0x8000000000000000L) {
                this.b.onError(throwable0);
            }
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            long v = this.get();
            if(v != 0x8000000000000000L) {
                long v1 = this.c;
                if(v != v1) {
                    this.c = v1 + 1L;
                    this.b.onNext(object0);
                    return;
                }
                this.l();
                d d0 = new d("PublishSubject: could not emit value due to lack of requests");
                this.b.onError(d0);
            }
        }

        @Override  // rx.i
        public void request(long v) {
            if(rx.internal.operators.a.j(v)) {
                while(true) {
                    long v1 = this.get();
                    if(v1 == 0x8000000000000000L) {
                        return;
                    }
                    if(this.compareAndSet(v1, rx.internal.operators.a.a(v1, v))) {
                        break;
                    }
                }
            }
        }
    }

    static final class b extends AtomicReference implements rx.g.a, h {
        Throwable a;
        private static final long b = -7568940796666027140L;
        static final a[] c;
        static final a[] d;

        static {
            b.c = new a[0];
            b.d = new a[0];
        }

        public b() {
            this.lazySet(b.c);
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.q(((n)object0));
        }

        @Override  // rx.h
        public void d() {
            a[] arr_c$a = (a[])this.getAndSet(b.d);
            for(int v = 0; v < arr_c$a.length; ++v) {
                arr_c$a[v].d();
            }
        }

        boolean o(a c$a0) {
            do {
                a[] arr_c$a = (a[])this.get();
                if(arr_c$a == b.d) {
                    return false;
                }
                a[] arr_c$a1 = new a[arr_c$a.length + 1];
                System.arraycopy(arr_c$a, 0, arr_c$a1, 0, arr_c$a.length);
                arr_c$a1[arr_c$a.length] = c$a0;
            }
            while(!this.compareAndSet(arr_c$a, arr_c$a1));
            return true;
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.a = throwable0;
            a[] arr_c$a = (a[])this.getAndSet(b.d);
            List list0 = null;
            for(int v = 0; v < arr_c$a.length; ++v) {
                a c$a0 = arr_c$a[v];
                try {
                    c$a0.onError(throwable0);
                }
                catch(Throwable throwable1) {
                    if(list0 == null) {
                        list0 = new ArrayList(1);
                    }
                    list0.add(throwable1);
                }
            }
            rx.exceptions.c.d(list0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            a[] arr_c$a = (a[])this.get();
            for(int v = 0; v < arr_c$a.length; ++v) {
                arr_c$a[v].onNext(object0);
            }
        }

        public void q(n n0) {
            a c$a0 = new a(this, n0);
            n0.q(c$a0);
            n0.X(c$a0);
            if(!this.o(c$a0)) {
                Throwable throwable0 = this.a;
                if(throwable0 != null) {
                    n0.onError(throwable0);
                    return;
                }
                n0.d();
            }
            else if(c$a0.j()) {
                this.x(c$a0);
            }
        }

        void x(a c$a0) {
            a[] arr_c$a1;
            do {
                a[] arr_c$a = (a[])this.get();
                if(arr_c$a == b.d || arr_c$a == b.c) {
                    break;
                }
                int v = arr_c$a.length;
                int v1 = 0;
                while(true) {
                    if(v1 < v) {
                        if(arr_c$a[v1] == c$a0) {
                            break;
                        }
                        else {
                            ++v1;
                            continue;
                        }
                    }
                    v1 = -1;
                    break;
                }
                if(v1 < 0) {
                    return;
                }
                if(v == 1) {
                    arr_c$a1 = b.c;
                }
                else {
                    a[] arr_c$a2 = new a[v - 1];
                    System.arraycopy(arr_c$a, 0, arr_c$a2, 0, v1);
                    System.arraycopy(arr_c$a, v1 + 1, arr_c$a2, v1, v - v1 - 1);
                    arr_c$a1 = arr_c$a2;
                }
            }
            while(!this.compareAndSet(arr_c$a, arr_c$a1));
        }
    }

    final b b;

    protected c(b c$b0) {
        super(c$b0);
        this.b = c$b0;
    }

    @Override  // rx.subjects.f
    public boolean A7() {
        return ((a[])this.b.get()).length != 0;
    }

    public static c C7() {
        return new c(new b());
    }

    public Throwable D7() {
        return this.b.get() == b.d ? this.b.a : null;
    }

    public boolean E7() {
        return this.b.get() == b.d && this.b.a == null;
    }

    public boolean F7() {
        return this.b.get() == b.d && this.b.a != null;
    }

    @Override  // rx.h
    public void d() {
        this.b.d();
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.b.onError(throwable0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.b.onNext(object0);
    }
}

