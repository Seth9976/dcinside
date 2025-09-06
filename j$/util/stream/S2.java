package j$.util.stream;

final class s2 extends i2 {
    long b;
    long c;
    final t2 d;

    s2(t2 t20, n2 n20) {
        this.d = t20;
        super(n20);
        this.b = t20.n;
        this.c = t20.o >= 0L ? t20.o : 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // j$.util.stream.m2
    public final void accept(long v) {
        long v1 = this.b;
        if(v1 == 0L) {
            long v2 = this.c;
            if(v2 > 0L) {
                this.c = v2 - 1L;
                this.a.accept(v);
            }
        }
        else {
            this.b = v1 - 1L;
        }
    }

    @Override  // j$.util.stream.i2
    public final void l(long v) {
        this.a.l(x0.A(v, this.d.n, this.c));
    }

    @Override  // j$.util.stream.i2
    public final boolean n() {
        return this.c == 0L || this.a.n();
    }
}

