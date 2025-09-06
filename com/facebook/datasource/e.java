package com.facebook.datasource;

import com.facebook.common.internal.q;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class e {
    static class d {
        @h
        public Object a;

        private d() {
            this.a = null;
        }

        d(f f0) {
        }
    }

    public static q a(Throwable throwable0) {
        class com.facebook.datasource.e.a implements q {
            final Throwable a;

            com.facebook.datasource.e.a(Throwable throwable0) {
            }

            public com.facebook.datasource.d a() {
                return e.c(this.a);
            }

            @Override  // com.facebook.common.internal.q
            public Object get() {
                return this.a();
            }
        }

        return new com.facebook.datasource.e.a(throwable0);
    }

    public static com.facebook.datasource.d b(Object object0) {
        com.facebook.datasource.d d0 = m.x();
        ((m)d0).y(object0);
        return d0;
    }

    public static com.facebook.datasource.d c(Throwable throwable0) {
        com.facebook.datasource.d d0 = m.x();
        ((m)d0).o(throwable0);
        return d0;
    }

    public static com.facebook.datasource.d d() {
        return com.facebook.datasource.n.i;
    }

    @h
    public static Object e(com.facebook.datasource.d d0) throws Throwable {
        return e.f(d0, -1L, TimeUnit.MILLISECONDS);
    }

    @h
    public static Object f(com.facebook.datasource.d d0, long v, TimeUnit timeUnit0) throws Throwable {
        class b implements g {
            final d a;
            final CountDownLatch b;
            final d c;

            b(d e$d0, CountDownLatch countDownLatch0, d e$d1) {
                this.b = countDownLatch0;
                this.c = e$d1;
                super();
            }

            @Override  // com.facebook.datasource.g
            public void a(com.facebook.datasource.d d0) {
                this.b.countDown();
            }

            @Override  // com.facebook.datasource.g
            public void b(com.facebook.datasource.d d0) {
            }

            @Override  // com.facebook.datasource.g
            public void c(com.facebook.datasource.d d0) {
                try {
                    this.c.a = d0.c();
                }
                finally {
                    this.b.countDown();
                }
            }

            @Override  // com.facebook.datasource.g
            public void d(com.facebook.datasource.d d0) {
                if(!d0.g()) {
                    return;
                }
                try {
                    this.a.a = d0.getResult();
                }
                finally {
                    this.b.countDown();
                }
            }
        }


        class c implements Executor {
            c() {
                super();
            }

            @Override
            public void execute(Runnable runnable0) {
                runnable0.run();
            }
        }

        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        d e$d0 = new d(null);
        d e$d1 = new d(null);
        d0.d(new b(e$d0, countDownLatch0, e$d1), new c());
        if(v < 0L) {
            countDownLatch0.await();
        }
        else if(countDownLatch0.await(v, timeUnit0)) {
        }
        else {
            throw new TimeoutException();
        }
        Object object0 = e$d1.a;
        if(object0 != null) {
            throw (Throwable)object0;
        }
        return e$d0.a;
    }
}

