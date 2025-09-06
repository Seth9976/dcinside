package j$.util.stream;

import j..util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

final class x2 extends c {
    private final b j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;
    private volatile boolean o;

    x2(b b0, b b1, Spliterator spliterator0, IntFunction intFunction0, long v, long v1) {
        super(b1, spliterator0);
        this.j = b0;
        this.k = intFunction0;
        this.l = v;
        this.m = v1;
    }

    x2(x2 x20, Spliterator spliterator0) {
        super(x20, spliterator0);
        this.j = x20.j;
        this.k = x20.k;
        this.l = x20.l;
        this.m = x20.m;
    }

    @Override  // j$.util.stream.e
    protected final Object a() {
        long v = -1L;
        if(this.d()) {
            if(c3.SIZED.u(this.j.c)) {
                v = this.j.G(this.b);
            }
            B0 b00 = this.j.O(v, this.k);
            n2 n20 = this.j.S(this.a.K(), b00);
            n2 n21 = this.a.X(n20);
            this.a.B(this.b, n21);
            return b00.a();
        }
        B0 b01 = this.j.O(-1L, this.k);
        if(this.l == 0L) {
            n2 n22 = this.j.S(this.a.K(), b01);
            n2 n23 = this.a.X(n22);
            this.a.B(this.b, n23);
        }
        else {
            this.a.W(this.b, b01);
        }
        J0 j00 = b01.a();
        this.n = j00.count();
        this.o = true;
        this.b = null;
        return j00;
    }

    @Override  // j$.util.stream.e
    protected final e e(Spliterator spliterator0) {
        return new x2(this, spliterator0);
    }

    @Override  // j$.util.stream.c
    protected final void h() {
        this.i = true;
        if(this.o) {
            this.f(x0.K(this.j.I()));
        }
    }

    @Override  // j$.util.stream.c
    protected final Object j() {
        return x0.K(this.j.I());
    }

    private long k(long v) {
        if(this.o) {
            return this.n;
        }
        x2 x20 = (x2)this.d;
        x2 x21 = (x2)this.e;
        if(x20 != null && x21 != null) {
            long v1 = x20.k(v);
            return v1 >= v ? v1 : v1 + x21.k(v);
        }
        return this.n;
    }

    @Override  // j$.util.stream.e
    public final void onCompletion(CountedCompleter countedCompleter0) {
        J0 j00;
        e e0 = this.d;
        if(e0 != null) {
            this.n = ((x2)e0).n + ((x2)this.e).n;
            if(this.i) {
                this.n = 0L;
                j00 = x0.K(this.j.I());
            }
            else if(this.n == 0L) {
                j00 = x0.K(this.j.I());
            }
            else if(((x2)this.d).n == 0L) {
                j00 = (J0)((x2)this.e).c();
            }
            else {
                j00 = x0.I(this.j.I(), ((J0)((x2)this.d).c()), ((J0)((x2)this.e).c()));
            }
            J0 j01 = j00;
            if(this.d()) {
                long v = this.m < 0L ? this.n : Math.min(j01.count(), this.l + this.m);
                j01 = j01.h(this.l, v, this.k);
            }
            this.f(j01);
            this.o = true;
        }
        if(this.m >= 0L && !this.d()) {
            long v1 = this.l + this.m;
            long v2 = this.o ? this.n : this.k(v1);
            if(v2 < v1) {
                x2 x20 = (x2)(((e)this.getCompleter()));
                x2 x21 = this;
                while(x20 != null) {
                    if(x21 == x20.e) {
                        x2 x22 = (x2)x20.d;
                        if(x22 != null) {
                            v2 += x22.k(v1);
                            if(v2 >= v1) {
                                this.i();
                                super.onCompletion(countedCompleter0);
                                return;
                            }
                        }
                    }
                    x21 = x20;
                    x20 = (x2)(((e)x20.getCompleter()));
                }
                if(v2 >= v1) {
                    this.i();
                }
            }
            else {
                this.i();
            }
        }
        super.onCompletion(countedCompleter0);
    }
}

