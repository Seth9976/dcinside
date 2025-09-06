package j$.util.stream;

import j..util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

final class i4 extends e {
    private final b h;
    private final IntFunction i;
    private final boolean j;
    private long k;
    private long l;

    i4(b b0, b b1, Spliterator spliterator0, IntFunction intFunction0) {
        super(b1, spliterator0);
        this.h = b0;
        this.i = intFunction0;
        this.j = c3.ORDERED.q(b1.K());
    }

    i4(i4 i40, Spliterator spliterator0) {
        super(i40, spliterator0);
        this.h = i40.h;
        this.i = i40.i;
        this.j = i40.j;
    }

    @Override  // j$.util.stream.e
    protected final Object a() {
        boolean z = this.d();
        long v = z || !this.j || !c3.SIZED.u(this.h.c) ? -1L : this.h.G(this.b);
        B0 b00 = this.a.O(v, this.i);
        h4 h40 = ((g4)this.h).j(b00, this.j && !z);
        this.a.W(this.b, h40);
        J0 j00 = b00.a();
        this.k = j00.count();
        this.l = h40.f();
        return j00;
    }

    @Override  // j$.util.stream.e
    protected final e e(Spliterator spliterator0) {
        return new i4(this, spliterator0);
    }

    @Override  // j$.util.stream.e
    public final void onCompletion(CountedCompleter countedCompleter0) {
        J0 j00;
        e e0 = this.d;
        if(e0 != null) {
            if(this.j) {
                long v = ((i4)e0).l;
                this.l = v;
                if(v == ((i4)e0).k) {
                    this.l = v + ((i4)this.e).l;
                }
            }
            long v1 = ((i4)e0).k;
            i4 i40 = (i4)this.e;
            this.k = v1 + i40.k;
            if(((i4)e0).k == 0L) {
                j00 = (J0)i40.c();
            }
            else if(i40.k == 0L) {
                j00 = (J0)((i4)e0).c();
            }
            else {
                j00 = x0.I(this.h.I(), ((J0)((i4)this.d).c()), ((J0)((i4)this.e).c()));
            }
            this.f((!this.d() || !this.j ? j00 : j00.h(this.l, j00.count(), this.i)));
        }
        super.onCompletion(countedCompleter0);
    }
}

