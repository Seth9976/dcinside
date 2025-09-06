package com.kakao.adfit.common.matrix.transport;

import com.kakao.adfit.common.matrix.MatrixItemType;
import com.kakao.adfit.g.c;
import com.kakao.adfit.h.d;
import com.kakao.adfit.j.b;
import com.kakao.adfit.j.e;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class a implements b, Closeable {
    static final class com.kakao.adfit.common.matrix.transport.a.a implements ThreadFactory {
        private final AtomicInteger a;

        public com.kakao.adfit.common.matrix.transport.a.a() {
            this.a = new AtomicInteger();
        }

        @Override
        public Thread newThread(Runnable runnable0) {
            L.p(runnable0, "r");
            Thread thread0 = new Thread(runnable0, "AdFitMatrix-AsyncConnection-" + this.a.getAndIncrement());
            thread0.setDaemon(true);
            return thread0;
        }
    }

    public static final class com.kakao.adfit.common.matrix.transport.a.b {
        private com.kakao.adfit.common.matrix.transport.a.b() {
        }

        public com.kakao.adfit.common.matrix.transport.a.b(w w0) {
        }

        private final e a(int v, c c0) {
            f f0 = (Runnable runnable0, ThreadPoolExecutor threadPoolExecutor0) -> {
                L.p(c0, "$eventCache");
                if(runnable0 instanceof com.kakao.adfit.common.matrix.transport.a.c) {
                    if(!(((com.kakao.adfit.common.matrix.transport.a.c)runnable0).c() instanceof com.kakao.adfit.h.a)) {
                        c0.a(((com.kakao.adfit.common.matrix.transport.a.c)runnable0).b());
                    }
                    Object object0 = ((com.kakao.adfit.common.matrix.transport.a.c)runnable0).c();
                    a.e.a(object0, true);
                    com.kakao.adfit.m.f.e(("Event rejected: " + ((com.kakao.adfit.common.matrix.transport.a.c)runnable0).b().g()));
                }
            };
            e e0 = new e(v, v, 30L, TimeUnit.SECONDS, new com.kakao.adfit.common.matrix.transport.a.a(), f0);
            e0.allowCoreThreadTimeOut(true);
            return e0;
        }

        // 检测为 Lambda 实现
        private static final void a(c c0, Runnable runnable0, ThreadPoolExecutor threadPoolExecutor0) [...]

        private final void a(Object object0, boolean z) {
            if(object0 instanceof d) {
                ((d)object0).a(false);
            }
            if(object0 instanceof com.kakao.adfit.h.c) {
                ((com.kakao.adfit.h.c)object0).b(z);
            }
        }
    }

    static final class com.kakao.adfit.common.matrix.transport.a.c implements Runnable {
        private final com.kakao.adfit.j.c a;
        private final com.kakao.adfit.j.d b;
        private final c c;
        private final com.kakao.adfit.common.matrix.e d;
        private final Object e;
        private final com.kakao.adfit.common.matrix.transport.e f;

        public com.kakao.adfit.common.matrix.transport.a.c(com.kakao.adfit.j.c c0, com.kakao.adfit.j.d d0, c c1, com.kakao.adfit.common.matrix.e e0, Object object0) {
            L.p(c0, "transport");
            L.p(d0, "transportGate");
            L.p(c1, "eventCache");
            L.p(e0, "event");
            super();
            this.a = c0;
            this.b = d0;
            this.c = c1;
            this.d = e0;
            this.e = object0;
            this.f = com.kakao.adfit.common.matrix.transport.e.c.a(-1);
        }

        private final com.kakao.adfit.common.matrix.transport.e a() {
            com.kakao.adfit.common.matrix.transport.e e0 = this.f;
            this.c.a(this.d);
            Object object0 = this.e;
            if(object0 instanceof com.kakao.adfit.h.b) {
                ((com.kakao.adfit.h.b)object0).a();
                com.kakao.adfit.m.f.a(("Disk flush event fired: " + this.d.g()));
            }
            if(this.b.a()) {
                try {
                    e0 = this.a.a(this.d);
                    if(!e0.b()) {
                        throw new IllegalStateException("The transport failed to send the event with response code " + e0.a());
                    }
                    this.c.b(this.d);
                    return e0;
                }
                catch(IOException iOException0) {
                    Object object1 = this.e;
                    if(object1 instanceof com.kakao.adfit.h.c) {
                        ((com.kakao.adfit.h.c)object1).b(true);
                    }
                    throw new IllegalStateException("Sending the event failed.", iOException0);
                }
            }
            Object object2 = this.e;
            if(object2 instanceof com.kakao.adfit.h.c) {
                ((com.kakao.adfit.h.c)object2).b(true);
            }
            return e0;
        }

        public final com.kakao.adfit.common.matrix.e b() {
            return this.d;
        }

        public final Object c() {
            return this.e;
        }

        @Override
        public void run() {
            com.kakao.adfit.common.matrix.transport.e e1;
            com.kakao.adfit.common.matrix.transport.e e0;
            try {
                try {
                    e0 = this.f;
                    e1 = this.a();
                }
                catch(Exception exception0) {
                    com.kakao.adfit.m.f.b(("Event submission failed: " + this.d.g()));
                    throw exception0;
                }
            }
            catch(Throwable throwable0) {
                if(this.e instanceof d) {
                    com.kakao.adfit.m.f.a(("Marking event submission result: " + e0.b()));
                    ((d)this.e).a(e0.b());
                }
                throw throwable0;
            }
            if(this.e instanceof d) {
                com.kakao.adfit.m.f.a(("Marking event submission result: " + e1.b()));
                ((d)this.e).a(e1.b());
            }
        }
    }

    private final com.kakao.adfit.j.c a;
    private final com.kakao.adfit.j.d b;
    private final c c;
    private final ExecutorService d;
    public static final com.kakao.adfit.common.matrix.transport.a.b e;

    static {
        a.e = new com.kakao.adfit.common.matrix.transport.a.b(null);
    }

    public a(com.kakao.adfit.j.c c0, com.kakao.adfit.j.d d0, c c1, int v) {
        L.p(c0, "transport");
        L.p(d0, "transportGate");
        L.p(c1, "eventCache");
        this(c0, d0, c1, a.e.a(v, c1));
        com.kakao.adfit.g.a a0 = new com.kakao.adfit.g.a(this, c1, 0L, 4, null);
        this.d.submit(a0);
    }

    public a(com.kakao.adfit.j.c c0, com.kakao.adfit.j.d d0, c c1, ExecutorService executorService0) {
        L.p(c0, "transport");
        L.p(d0, "transportGate");
        L.p(c1, "eventCache");
        L.p(executorService0, "executor");
        super();
        this.a = c0;
        this.b = d0;
        this.c = c1;
        this.d = executorService0;
    }

    @Override  // com.kakao.adfit.j.b
    public void a(com.kakao.adfit.common.matrix.e e0, Object object0) {
        c c1;
        boolean z;
        L.p(e0, "event");
        c c0 = this.c;
        if(object0 instanceof com.kakao.adfit.h.a) {
            z = true;
            c1 = com.kakao.adfit.g.d.a;
        }
        else {
            c1 = c0;
            z = false;
        }
        if(this.a.a(MatrixItemType.Event)) {
            if(z) {
                this.c.b(e0);
            }
            a.e.a(object0, false);
            return;
        }
        com.kakao.adfit.common.matrix.transport.a.c a$c0 = new com.kakao.adfit.common.matrix.transport.a.c(this.a, this.b, c1, e0, object0);
        this.d.submit(a$c0);
    }

    @Override
    public void close() {
        this.d.shutdown();
        com.kakao.adfit.m.f.a("Shutting down AsyncConnection");
        try {
            if(!this.d.awaitTermination(1L, TimeUnit.MINUTES)) {
                com.kakao.adfit.m.f.e("Failed to shutdown the async connection async sender within 1 minute. Trying to force it now.");
                this.d.shutdownNow();
            }
            this.a.close();
        }
        catch(InterruptedException unused_ex) {
            com.kakao.adfit.m.f.a("Thread interrupted while closing the connection.");
            Thread.currentThread().interrupt();
        }
    }
}

