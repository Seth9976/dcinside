package j$.util.stream;

final class c4 extends g2 {
    boolean b;

    @Override  // j$.util.stream.k2
    public final void accept(double f) {
        if(this.b) {
            throw new NullPointerException();
        }
    }

    @Override  // j$.util.stream.g2
    public final void l(long v) {
        this.a.l(-1L);
    }

    // 去混淆评级： 低(20)
    @Override  // j$.util.stream.g2
    public final boolean n() {
        return !this.b || this.a.n();
    }
}

