package j$.util.stream;

import j..util.Objects;
import j..util.T;
import j..util.W;
import j..util.Z;
import jeb.synthetic.TWR;

final class b2 extends j2 {
    public final int b;
    boolean c;
    Object d;
    final b e;

    public b2(A a0, n2 n20) {
        this.b = 2;
        this.e = a0;
        super(n20);
        Objects.requireNonNull(this.a);
        this.d = new s(this.a);
    }

    public b2(Y y0, n2 n20) {
        this.b = 1;
        this.e = y0;
        super(n20);
        Objects.requireNonNull(this.a);
        this.d = new V(this.a);
    }

    public b2(i0 i00, n2 n20) {
        this.b = 0;
        this.e = i00;
        super(n20);
        Objects.requireNonNull(this.a);
        this.d = new e0(this.a);
    }

    @Override
    public final void accept(Object object0) {
        switch(this.b) {
            case 0: {
                LongStream longStream0 = (LongStream)((m)((i0)this.e).o).apply(object0);
                if(longStream0 != null) {
                    try {
                        boolean z1 = this.c;
                    }
                    catch(Throwable throwable1) {
                        goto label_30;
                    }
                    e0 e00 = (e0)this.d;
                    try {
                        if(z1) {
                            Z z2 = longStream0.sequential().spliterator();
                            while(!this.a.n() && z2.tryAdvance(e00)) {
                            }
                        }
                        else {
                            longStream0.sequential().forEach(e00);
                        }
                    }
                    catch(Throwable throwable1) {
                    label_30:
                        TWR.safeClose$NT(longStream0, throwable1);
                        throw throwable1;
                    }
                }
                if(longStream0 != null) {
                    longStream0.close();
                }
                return;
            }
            case 1: {
                IntStream intStream0 = (IntStream)((m)((Y)this.e).o).apply(object0);
                if(intStream0 != null) {
                    try {
                        boolean z3 = this.c;
                    }
                    catch(Throwable throwable2) {
                        goto label_47;
                    }
                    V v0 = (V)this.d;
                    try {
                        if(z3) {
                            W w0 = intStream0.sequential().spliterator();
                            while(!this.a.n() && w0.tryAdvance(v0)) {
                            }
                        }
                        else {
                            intStream0.sequential().forEach(v0);
                        }
                    }
                    catch(Throwable throwable2) {
                    label_47:
                        TWR.safeClose$NT(intStream0, throwable2);
                        throw throwable2;
                    }
                }
                if(intStream0 != null) {
                    intStream0.close();
                }
                return;
            }
            default: {
                DoubleStream doubleStream0 = (DoubleStream)((m)((A)this.e).o).apply(object0);
                if(doubleStream0 != null) {
                    try {
                        boolean z = this.c;
                    }
                    catch(Throwable throwable0) {
                        goto label_13;
                    }
                    s s0 = (s)this.d;
                    try {
                        if(z) {
                            T t0 = doubleStream0.sequential().spliterator();
                            while(!this.a.n() && t0.tryAdvance(s0)) {
                            }
                        }
                        else {
                            doubleStream0.sequential().forEach(s0);
                        }
                    }
                    catch(Throwable throwable0) {
                    label_13:
                        TWR.safeClose$NT(doubleStream0, throwable0);
                        throw throwable0;
                    }
                }
                if(doubleStream0 != null) {
                    doubleStream0.close();
                }
            }
        }
    }

    @Override  // j$.util.stream.j2
    public final void l(long v) {
        switch(this.b) {
            case 0: {
                this.a.l(-1L);
                return;
            }
            case 1: {
                this.a.l(-1L);
                return;
            }
            default: {
                this.a.l(-1L);
            }
        }
    }

    @Override  // j$.util.stream.j2
    public final boolean n() {
        switch(this.b) {
            case 0: {
                this.c = true;
                return this.a.n();
            }
            case 1: {
                this.c = true;
                return this.a.n();
            }
            default: {
                this.c = true;
                return this.a.n();
            }
        }
    }
}

