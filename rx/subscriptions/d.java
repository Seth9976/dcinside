package rx.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.o;

public final class d implements o {
    static final class a extends AtomicInteger implements o {
        final d a;
        private static final long b = 0x61397AAF32B333BBL;

        public a(d d0) {
            this.a = d0;
        }

        @Override  // rx.o
        public boolean j() {
            return this.get() != 0;
        }

        @Override  // rx.o
        public void l() {
            if(this.compareAndSet(0, 1)) {
                this.a.b();
            }
        }
    }

    static final class b {
        final boolean a;
        final int b;

        b(boolean z, int v) {
            this.a = z;
            this.b = v;
        }

        b a() {
            return new b(this.a, this.b + 1);
        }

        b b() {
            return new b(this.a, this.b - 1);
        }

        b c() {
            return new b(true, this.b);
        }
    }

    private final o a;
    final AtomicReference b;
    static final b c;

    static {
        d.c = new b(false, 0);
    }

    public d(o o0) {
        this.b = new AtomicReference(d.c);
        if(o0 == null) {
            throw new IllegalArgumentException("s");
        }
        this.a = o0;
    }

    public o a() {
        AtomicReference atomicReference0 = this.b;
        do {
            b d$b0 = (b)atomicReference0.get();
            if(d$b0.a) {
                return f.e();
            }
        }
        while(!androidx.compose.animation.core.d.a(atomicReference0, d$b0, d$b0.a()));
        return new a(this);
    }

    void b() {
        b d$b1;
        AtomicReference atomicReference0 = this.b;
        do {
            b d$b0 = (b)atomicReference0.get();
            d$b1 = d$b0.b();
        }
        while(!androidx.compose.animation.core.d.a(atomicReference0, d$b0, d$b1));
        this.c(d$b1);
    }

    private void c(b d$b0) {
        if(d$b0.a && d$b0.b == 0) {
            this.a.l();
        }
    }

    @Override  // rx.o
    public boolean j() {
        return ((b)this.b.get()).a;
    }

    @Override  // rx.o
    public void l() {
        b d$b1;
        AtomicReference atomicReference0 = this.b;
        do {
            b d$b0 = (b)atomicReference0.get();
            if(d$b0.a) {
                return;
            }
            d$b1 = d$b0.c();
        }
        while(!androidx.compose.animation.core.d.a(atomicReference0, d$b0, d$b1));
        this.c(d$b1);
    }
}

