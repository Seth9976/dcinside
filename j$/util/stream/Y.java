package j$.util.stream;

final class y extends k0 {
    public final int n;

    public y(b b0, int v, int v1) {
        this.n = v1;
        super(b0, v, 1);
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        switch(this.n) {
            case 0: {
                return new u(this, n20, 3);
            }
            case 1: {
                return new Z(0, n20);
            }
            case 2: {
                return new X(this, n20, 3);
            }
            case 3: {
                return new f0(this, n20, 1);
            }
            case 4: {
                return n20;
            }
            default: {
                return new f0(this, n20, 4);
            }
        }
    }
}

