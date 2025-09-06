package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.g.a;
import rx.i;
import rx.n;

public final class a0 implements a {
    static final class rx.internal.operators.a0.a extends AtomicLong implements i {
        private final n a;
        private final int b;
        private long c;
        private static final long d = 0x391941E9D0FD3194L;

        rx.internal.operators.a0.a(n n0, int v, int v1) {
            this.a = n0;
            this.c = (long)v;
            this.b = v1;
        }

        void a() {
            long v = ((long)this.b) + 1L;
            n n0 = this.a;
            for(long v1 = this.c; v1 != v; ++v1) {
                if(n0.j()) {
                    return;
                }
                n0.onNext(((int)v1));
            }
            if(!n0.j()) {
                n0.d();
            }
        }

        void b(long v) {
            long v1 = ((long)this.b) + 1L;
            long v2 = this.c;
            n n0 = this.a;
            do {
                long v3 = 0L;
                while(true) {
                    if(v3 != v && v2 != v1) {
                        if(n0.j()) {
                            return;
                        }
                        n0.onNext(((int)v2));
                        ++v2;
                        ++v3;
                    }
                    else {
                        if(n0.j()) {
                            return;
                        }
                        if(v2 == v1) {
                            n0.d();
                            return;
                        }
                        long v4 = this.get();
                        if(v4 == v3) {
                            break;
                        }
                        v = v4;
                    }
                }
                this.c = v2;
                v = this.addAndGet(-v3);
            }
            while(v != 0L);
        }

        @Override  // rx.i
        public void request(long v) {
            if(this.get() == 0x7FFFFFFFFFFFFFFFL) {
                return;
            }
            if(v == 0x7FFFFFFFFFFFFFFFL && this.compareAndSet(0L, 0x7FFFFFFFFFFFFFFFL)) {
                this.a();
                return;
            }
            if(v > 0L && rx.internal.operators.a.b(this, v) == 0L) {
                this.b(v);
            }
        }
    }

    private final int a;
    private final int b;

    public a0(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public void a(n n0) {
        n0.X(new rx.internal.operators.a0.a(n0, this.a, this.b));
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

