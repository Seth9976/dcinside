package j$.util.stream;

final class u2 extends g2 {
    long b;
    long c;
    final v2 d;

    u2(v2 v20, n2 n20) {
        this.d = v20;
        super(n20);
        this.b = v20.n;
        this.c = v20.o >= 0L ? v20.o : 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // j$.util.stream.k2
    public final void accept(double f) {
        long v = this.b;
        if(v == 0L) {
            long v1 = this.c;
            if(v1 > 0L) {
                this.c = v1 - 1L;
                this.a.accept(f);
            }
        }
        else {
            this.b = v - 1L;
        }
    }

    @Override  // j$.util.stream.g2
    public final void l(long v) {
        this.a.l(x0.A(v, this.d.n, this.c));
    }

    @Override  // j$.util.stream.g2
    public final boolean n() {
        return this.c == 0L || this.a.n();
    }
}

