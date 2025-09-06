package j$.util.stream;

import j..util.P;
import j..util.Spliterator;
import j..util.T;
import j..util.W;
import j..util.Z;
import j..util.c0;
import java.util.ArrayDeque;
import java.util.Comparator;

abstract class n1 implements Spliterator {
    J0 a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    n1(J0 j00) {
        this.a = j00;
    }

    protected static J0 a(ArrayDeque arrayDeque0) {
        J0 j00;
    alab1:
        while(true) {
            do {
                j00 = (J0)arrayDeque0.pollFirst();
                if(j00 == null) {
                    break alab1;
                }
                if(j00.q() != 0) {
                    goto label_5;
                }
            }
            while(j00.count() <= 0L);
            return j00;
        label_5:
            for(int v = j00.q() - 1; v >= 0; --v) {
                arrayDeque0.addFirst(j00.b(v));
            }
        }
        return null;
    }

    protected final ArrayDeque b() {
        ArrayDeque arrayDeque0 = new ArrayDeque(8);
        for(int v = this.a.q() - 1; v >= this.b; --v) {
            arrayDeque0.addFirst(this.a.b(v));
        }
        return arrayDeque0;
    }

    protected final boolean c() {
        if(this.a == null) {
            return false;
        }
        if(this.d == null) {
            Spliterator spliterator0 = this.c;
            if(spliterator0 == null) {
                ArrayDeque arrayDeque0 = this.b();
                this.e = arrayDeque0;
                J0 j00 = n1.a(arrayDeque0);
                if(j00 != null) {
                    this.d = j00.spliterator();
                    return true;
                }
                this.a = null;
                return false;
            }
            this.d = spliterator0;
        }
        return true;
    }

    @Override  // j$.util.Spliterator
    public final int characteristics() {
        return 0x40;
    }

    @Override  // j$.util.Spliterator
    public final long estimateSize() {
        long v = 0L;
        if(this.a == null) {
            return 0L;
        }
        Spliterator spliterator0 = this.c;
        if(spliterator0 != null) {
            return spliterator0.estimateSize();
        }
        for(int v1 = this.b; v1 < this.a.q(); ++v1) {
            v += this.a.b(v1).count();
        }
        return v;
    }

    @Override  // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override  // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return P.d(this);
    }

    @Override  // j$.util.Spliterator
    public final boolean hasCharacteristics(int v) {
        return P.e(this, v);
    }

    @Override  // j$.util.Spliterator
    public final Spliterator trySplit() {
        J0 j00 = this.a;
        if(j00 != null && this.d == null) {
            Spliterator spliterator0 = this.c;
            if(spliterator0 != null) {
                return spliterator0.trySplit();
            }
            if(this.b < j00.q() - 1) {
                int v = this.b;
                this.b = v + 1;
                return this.a.b(v).spliterator();
            }
            J0 j01 = this.a.b(this.b);
            this.a = j01;
            if(j01.q() == 0) {
                Spliterator spliterator1 = this.a.spliterator();
                this.c = spliterator1;
                return spliterator1.trySplit();
            }
            this.b = 1;
            return this.a.b(0).spliterator();
        }
        return null;
    }

    public T trySplit() {
        return (T)this.trySplit();
    }

    public W trySplit() {
        return (W)this.trySplit();
    }

    public Z trySplit() {
        return (Z)this.trySplit();
    }

    public c0 trySplit() {
        return (c0)this.trySplit();
    }
}

