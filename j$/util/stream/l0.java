package j$.util.stream;

abstract class L0 implements J0 {
    protected final J0 a;
    protected final J0 b;
    private final long c;

    L0(J0 j00, J0 j01) {
        this.a = j00;
        this.b = j01;
        this.c = j00.count() + j01.count();
    }

    public I0 b(int v) {
        return (I0)this.b(v);
    }

    @Override  // j$.util.stream.J0
    public final J0 b(int v) {
        if(v == 0) {
            return this.a;
        }
        if(v != 1) {
            throw new IndexOutOfBoundsException();
        }
        return this.b;
    }

    @Override  // j$.util.stream.J0
    public final long count() {
        return this.c;
    }

    @Override  // j$.util.stream.J0
    public final int q() {
        return 2;
    }
}

