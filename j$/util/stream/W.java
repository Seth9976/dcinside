package j$.util.stream;

final class w extends C {
    public final int n;

    public w(b b0, int v, int v1) {
        this.n = v1;
        super(b0, v, 1);
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        switch(this.n) {
            case 0: {
                return new u(this, n20, 1);
            }
            case 1: {
                return n20;
            }
            case 2: {
                return new u(this, n20, 4);
            }
            case 3: {
                return new Z(1, n20);
            }
            case 4: {
                return new X(this, n20, 4);
            }
            case 5: {
                return new g0(n20);  // 初始化器: Lj$/util/stream/i2;-><init>(Lj$/util/stream/n2;)V
            }
            default: {
                return new f0(this, n20, 3);
            }
        }
    }
}

