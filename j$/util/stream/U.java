package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

final class u extends g2 {
    public final int b;
    final b c;

    public u(b b0, n2 n20, int v) {
        this.b = v;
        this.c = b0;
        super(n20);
    }

    @Override  // j$.util.stream.k2
    public final void accept(double f) {
        switch(this.b) {
            case 0: {
                Object object0 = ((DoubleFunction)((v)this.c).o).apply(f);
                this.a.accept(object0);
                return;
            }
            case 1: {
                ((w)this.c).getClass();
                throw new NullPointerException();
            }
            case 2: {
                ((x)this.c).getClass();
                throw new NullPointerException();
            }
            case 3: {
                ((y)this.c).getClass();
                throw new NullPointerException();
            }
            case 4: {
                ((w)this.c).getClass();
                throw new NullPointerException();
            }
            default: {
                ((DoubleConsumer)((A)this.c).o).accept(f);
                this.a.accept(f);
            }
        }
    }

    @Override  // j$.util.stream.g2
    public void l(long v) {
        if(this.b != 4) {
            super.l(v);
            return;
        }
        this.a.l(-1L);
    }
}

