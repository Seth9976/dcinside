package j$.util.stream;

import j..util.Objects;
import j..util.T;
import jeb.synthetic.TWR;

final class z extends g2 {
    boolean b;
    s c;
    final A d;

    z(A a0, n2 n20) {
        this.d = a0;
        super(n20);
        Objects.requireNonNull(this.a);
        this.c = new s(this.a);
    }

    @Override  // j$.util.stream.k2
    public final void accept(double f) {
        DoubleStream doubleStream0 = (DoubleStream)((a)this.d.o).apply(f);
        if(doubleStream0 != null) {
            try {
                s s0 = this.c;
                if(this.b) {
                    T t0 = doubleStream0.sequential().spliterator();
                    while(!this.a.n() && t0.tryAdvance(s0)) {
                    }
                }
                else {
                    doubleStream0.sequential().forEach(s0);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(doubleStream0, throwable0);
                throw throwable0;
            }
        }
        if(doubleStream0 != null) {
            doubleStream0.close();
        }
    }

    @Override  // j$.util.stream.g2
    public final void l(long v) {
        this.a.l(-1L);
    }

    @Override  // j$.util.stream.g2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}

