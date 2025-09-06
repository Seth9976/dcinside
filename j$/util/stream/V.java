package j$.util.stream;

import java.util.function.Consumer;

final class v extends e2 {
    public final int n;
    final Object o;

    public v(b b0, int v, Object object0, int v1) {
        this.n = v1;
        this.o = object0;
        super(b0, v, 1);
    }

    public v(f2 f20, Consumer consumer0) {
        this.n = 3;
        this.o = consumer0;
        super(f20, 0, 1);
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        switch(this.n) {
            case 0: {
                return new u(this, n20, 0);
            }
            case 1: {
                return new X(this, n20, 0);
            }
            case 2: {
                return new f0(this, n20, 0);
            }
            case 3: {
                return new q(this, n20, 1);
            }
            case 4: {
                return new q(this, n20, 2);
            }
            case 5: {
                return new q(this, n20, 3);
            }
            default: {
                return new p(this, n20);
            }
        }
    }
}

