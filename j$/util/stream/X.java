package j$.util.stream;

final class x extends c0 {
    public final int n;

    public x(b b0, int v, int v1) {
        this.n = v1;
        super(b0, v, 1);
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        switch(this.n) {
            case 0: {
                return new u(this, n20, 2);
            }
            case 1: {
                return new X(this, n20, 2);
            }
            case 2: {
                return n20;
            }
            case 3: {
                return new X(this, n20, 5);
            }
            default: {
                return new f0(this, n20, 2);
            }
        }
    }
}

