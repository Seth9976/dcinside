package j$.util.stream;

import java.util.function.LongConsumer;

final class i0 extends k0 {
    public final int n;
    final Object o;

    public i0(b b0, int v, Object object0, int v1) {
        this.n = v1;
        this.o = object0;
        super(b0, v, 1);
    }

    public i0(l0 l00, LongConsumer longConsumer0) {
        this.n = 1;
        this.o = longConsumer0;
        super(l00, 0, 1);
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        switch(this.n) {
            case 0: {
                return new h0(this, n20);
            }
            case 1: {
                return new f0(this, n20, 5);
            }
            case 2: {
                return new b2(this, n20);
            }
            default: {
                return new q(this, n20, 5);
            }
        }
    }
}

