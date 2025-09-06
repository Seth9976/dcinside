package j$.util.stream;

import j..util.Objects;
import j..util.W;
import jeb.synthetic.TWR;

final class a0 extends h2 {
    boolean b;
    V c;
    final Y d;

    a0(Y y0, n2 n20) {
        this.d = y0;
        super(n20);
        Objects.requireNonNull(this.a);
        this.c = new V(this.a);
    }

    @Override  // j$.util.stream.l2
    public final void accept(int v) {
        IntStream intStream0 = (IntStream)((P0)this.d.o).apply(v);
        if(intStream0 != null) {
            try {
                V v1 = this.c;
                if(this.b) {
                    W w0 = intStream0.sequential().spliterator();
                    while(!this.a.n() && w0.tryAdvance(v1)) {
                    }
                }
                else {
                    intStream0.sequential().forEach(v1);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(intStream0, throwable0);
                throw throwable0;
            }
        }
        if(intStream0 != null) {
            intStream0.close();
        }
    }

    @Override  // j$.util.stream.h2
    public final void l(long v) {
        this.a.l(-1L);
    }

    @Override  // j$.util.stream.h2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}

