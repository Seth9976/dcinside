package j$.util.stream;

import j..util.P;
import j..util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

abstract class e3 implements Spliterator {
    final boolean a;
    final b b;
    private Supplier c;
    Spliterator d;
    n2 e;
    BooleanSupplier f;
    long g;
    d h;
    boolean i;

    e3(b b0, Spliterator spliterator0, boolean z) {
        this.b = b0;
        this.c = null;
        this.d = spliterator0;
        this.a = z;
    }

    e3(b b0, Supplier supplier0, boolean z) {
        this.b = b0;
        this.c = supplier0;
        this.d = null;
        this.a = z;
    }

    final boolean a() {
        d d0 = this.h;
        if(d0 == null) {
            if(this.i) {
                return false;
            }
            this.c();
            this.d();
            this.g = 0L;
            this.e.l(this.d.getExactSizeIfKnown());
            return this.b();
        }
        long v = this.g + 1L;
        this.g = v;
        if(v >= d0.count()) {
            this.g = 0L;
            this.h.clear();
            return this.b();
        }
        return true;
    }

    private boolean b() {
        while(this.h.count() == 0L) {
            if(this.e.n() || !this.f.getAsBoolean()) {
                if(this.i) {
                    return false;
                }
                this.e.k();
                this.i = true;
            }
        }
        return true;
    }

    final void c() {
        if(this.d == null) {
            this.d = (Spliterator)this.c.get();
            this.c = null;
        }
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        this.c();
        int v = c3.z(this.b.K()) & c3.f;
        return (v & 0x40) == 0 ? v : v & 0xFFFFBFBF | this.d.characteristics() & 0x4040;
    }

    abstract void d();

    abstract e3 e(Spliterator arg1);

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        this.c();
        return this.d.estimateSize();
    }

    @Override  // j$.util.Spliterator
    public final Comparator getComparator() {
        if(!P.e(this, 4)) {
            throw new IllegalStateException();
        }
        return null;
    }

    @Override  // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        this.c();
        return c3.SIZED.q(this.b.K()) ? this.d.getExactSizeIfKnown() : -1L;
    }

    @Override  // j$.util.Spliterator
    public final boolean hasCharacteristics(int v) {
        return P.e(this, v);
    }

    @Override
    public final String toString() {
        return String.format("%s[%s]", this.getClass().getName(), this.d);
    }

    @Override  // j$.util.Spliterator
    public Spliterator trySplit() {
        if(this.a && this.h == null && !this.i) {
            this.c();
            Spliterator spliterator0 = this.d.trySplit();
            if(spliterator0 != null) {
                return this.e(spliterator0);
            }
        }
        return null;
    }
}

