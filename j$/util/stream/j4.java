package j$.util.stream;

import j..util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

final class j4 extends c {
    private final b j;
    private final IntFunction k;
    private final boolean l;
    private long m;
    private boolean n;
    private volatile boolean o;

    j4(b b0, b b1, Spliterator spliterator0, IntFunction intFunction0) {
        super(b1, spliterator0);
        this.j = b0;
        this.k = intFunction0;
        this.l = c3.ORDERED.q(b1.K());
    }

    j4(j4 j40, Spliterator spliterator0) {
        super(j40, spliterator0);
        this.j = j40.j;
        this.k = j40.k;
        this.l = j40.l;
    }

    @Override  // j$.util.stream.e
    protected final Object a() {
        B0 b00 = this.a.O(-1L, this.k);
        n2 n20 = this.j.S(this.a.K(), b00);
        n2 n21 = this.a.X(n20);
        boolean z = this.a.B(this.b, n21);
        this.n = z;
        if(z) {
            this.i();
        }
        J0 j00 = b00.a();
        this.m = j00.count();
        return j00;
    }

    @Override  // j$.util.stream.e
    protected final e e(Spliterator spliterator0) {
        return new j4(this, spliterator0);
    }

    @Override  // j$.util.stream.c
    protected final void h() {
        this.i = true;
        if(this.l && this.o) {
            this.f(x0.K(this.j.I()));
        }
    }

    @Override  // j$.util.stream.c
    protected final Object j() {
        return x0.K(this.j.I());
    }

    @Override  // j$.util.stream.e
    public final void onCompletion(CountedCompleter countedCompleter0) {
        J0 j00;
        e e0 = this.d;
        if(e0 != null) {
            this.n = ((j4)e0).n | ((j4)this.e).n;
            if(this.l && this.i) {
                this.m = 0L;
                j00 = x0.K(this.j.I());
            }
            else if(this.l) {
                j4 j40 = (j4)this.d;
                if(j40.n) {
                    this.m = j40.m;
                    j00 = (J0)j40.c();
                    this.f(j00);
                    this.o = true;
                    super.onCompletion(countedCompleter0);
                    return;
                }
                goto label_13;
            }
            else {
            label_13:
                j4 j41 = (j4)this.d;
                long v = j41.m;
                j4 j42 = (j4)this.e;
                this.m = v + j42.m;
                if(j41.m == 0L) {
                    j00 = (J0)j42.c();
                }
                else if(j42.m == 0L) {
                    j00 = (J0)j41.c();
                }
                else {
                    j00 = x0.I(this.j.I(), ((J0)((j4)this.d).c()), ((J0)((j4)this.e).c()));
                }
            }
            this.f(j00);
        }
        this.o = true;
        super.onCompletion(countedCompleter0);
    }
}

