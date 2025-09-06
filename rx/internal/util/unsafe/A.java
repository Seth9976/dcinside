package rx.internal.util.unsafe;

import java.util.Iterator;
import rx.internal.util.atomic.c;
import rx.internal.util.r;

@r
abstract class a extends b {
    long I;
    long J;
    long K;
    long L;
    long M;
    long M8;
    long N;
    long N8;
    long O;
    long O8;
    long P;
    long P8;
    long Q;
    long X;
    long Y;
    long Z;

    @Override
    public final boolean isEmpty() {
        return this.g() == this.b();
    }

    @Override
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        c c2;
        c c0 = this.g();
        c c1 = this.b();
        int v = 0;
        while(c0 != c1 && v < 0x7FFFFFFF) {
            do {
                c2 = c0.c();
            }
            while(c2 == null);
            ++v;
            c0 = c2;
        }
        return v;
    }
}

