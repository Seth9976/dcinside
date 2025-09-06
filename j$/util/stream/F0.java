package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;

final class f0 extends i2 {
    public final int b;
    final b c;

    public f0(b b0, n2 n20, int v) {
        this.b = v;
        this.c = b0;
        super(n20);
    }

    @Override  // j$.util.stream.m2
    public final void accept(long v) {
        switch(this.b) {
            case 0: {
                Object object0 = ((LongFunction)((v)this.c).o).apply(v);
                this.a.accept(object0);
                return;
            }
            case 1: {
                ((y)this.c).getClass();
                throw new NullPointerException();
            }
            case 2: {
                ((x)this.c).getClass();
                throw new NullPointerException();
            }
            case 3: {
                ((w)this.c).getClass();
                throw new NullPointerException();
            }
            case 4: {
                ((y)this.c).getClass();
                throw new NullPointerException();
            }
            default: {
                ((LongConsumer)((i0)this.c).o).accept(v);
                this.a.accept(v);
            }
        }
    }

    @Override  // j$.util.stream.i2
    public void l(long v) {
        if(this.b != 4) {
            super.l(v);
            return;
        }
        this.a.l(-1L);
    }
}

