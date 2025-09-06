package j$.util.stream;

final class o2 extends j2 {
    long b;
    long c;
    final p2 d;

    o2(p2 p20, n2 n20) {
        this.d = p20;
        super(n20);
        this.b = p20.n;
        this.c = p20.o >= 0L ? p20.o : 0x7FFFFFFFFFFFFFFFL;
    }

    @Override
    public final void accept(Object object0) {
        long v = this.b;
        if(v == 0L) {
            long v1 = this.c;
            if(v1 > 0L) {
                this.c = v1 - 1L;
                this.a.accept(object0);
            }
        }
        else {
            this.b = v - 1L;
        }
    }

    @Override  // j$.util.stream.j2
    public final void l(long v) {
        this.a.l(x0.A(v, this.d.n, this.c));
    }

    @Override  // j$.util.stream.j2
    public final boolean n() {
        return this.c == 0L || this.a.n();
    }
}

