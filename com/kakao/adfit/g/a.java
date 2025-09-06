package com.kakao.adfit.g;

import com.kakao.adfit.common.matrix.e;
import com.kakao.adfit.h.b;
import com.kakao.adfit.h.c;
import com.kakao.adfit.h.d;
import com.kakao.adfit.m.f;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class a implements Runnable {
    static final class com.kakao.adfit.g.a.a implements com.kakao.adfit.h.a, b, c, d {
        private final long a;
        private boolean b;
        private boolean c;
        private final CountDownLatch d;

        public com.kakao.adfit.g.a.a(long v) {
            this.a = v;
            this.d = new CountDownLatch(1);
        }

        @Override  // com.kakao.adfit.h.b
        public void a() {
        }

        @Override  // com.kakao.adfit.h.d
        public void a(boolean z) {
            this.c = z;
            this.d.countDown();
        }

        @Override  // com.kakao.adfit.h.c
        public void b(boolean z) {
            this.b = z;
        }

        public boolean b() {
            return this.b;
        }

        public boolean c() {
            try {
                return this.d.await(this.a, TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                f.b("Exception while awaiting on lock.", interruptedException0);
                return false;
            }
        }
    }

    private final com.kakao.adfit.j.b a;
    private final com.kakao.adfit.g.c b;
    private final long c;

    public a(com.kakao.adfit.j.b b0, com.kakao.adfit.g.c c0, long v) {
        L.p(b0, "connection");
        L.p(c0, "eventCache");
        super();
        this.a = b0;
        this.b = c0;
        this.c = v;
    }

    public a(com.kakao.adfit.j.b b0, com.kakao.adfit.g.c c0, long v, int v1, w w0) {
        if((v1 & 4) != 0) {
            v = 15000L;
        }
        this(b0, c0, v);
    }

    @Override
    public void run() {
        for(Object object0: this.b) {
            e e0 = (e)object0;
            com.kakao.adfit.g.a.a a$a0 = new com.kakao.adfit.g.a.a(this.c);
            try {
                this.a.a(e0, a$a0);
                if(!a$a0.c()) {
                    f.e(("Timed out waiting for event submission: " + e0.g()));
                }
            }
            catch(IOException iOException0) {
                f.c(("Capturing cached event $" + e0.g() + " failed."), iOException0);
            }
            if(!a$a0.b()) {
                this.b.b(e0);
            }
        }
    }
}

