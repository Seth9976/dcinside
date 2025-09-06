package j$.util.stream;

final class q2 extends h2 {
    long b;
    long c;
    final r2 d;

    q2(r2 r20, n2 n20) {
        this.d = r20;
        super(n20);
        this.b = r20.n;
        this.c = r20.o >= 0L ? r20.o : 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // j$.util.stream.l2
    public final void accept(int v) {
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

    @Override  // j$.util.stream.h2
    public final void l(long v) {
        this.a.l(x0.A(v, this.d.n, this.c));
    }

    @Override  // j$.util.stream.h2
    public final boolean n() {
        return this.c == 0L || this.a.n();
    }
}

