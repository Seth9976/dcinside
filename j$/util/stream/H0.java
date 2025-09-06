package j$.util.stream;

import j..util.Objects;
import j..util.Z;
import jeb.synthetic.TWR;

final class h0 extends i2 {
    boolean b;
    e0 c;
    final i0 d;

    h0(i0 i00, n2 n20) {
        this.d = i00;
        super(n20);
        Objects.requireNonNull(this.a);
        this.c = new e0(this.a);
    }

    @Override  // j$.util.stream.m2
    public final void accept(long v) {
        LongStream longStream0 = (LongStream)((a)this.d.o).apply(v);
        if(longStream0 != null) {
            try {
                e0 e00 = this.c;
                if(this.b) {
                    Z z0 = longStream0.sequential().spliterator();
                    while(!this.a.n() && z0.tryAdvance(e00)) {
                    }
                }
                else {
                    longStream0.sequential().forEach(e00);
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(longStream0, throwable0);
                throw throwable0;
            }
        }
        if(longStream0 != null) {
            longStream0.close();
        }
    }

    @Override  // j$.util.stream.i2
    public final void l(long v) {
        this.a.l(-1L);
    }

    @Override  // j$.util.stream.i2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}

