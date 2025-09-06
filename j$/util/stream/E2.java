package j$.util.stream;

abstract class e2 extends f2 {
    public final int m;

    public e2(b b0, int v, int v1) {
        this.m = v1;
        super(b0, v);
    }

    @Override  // j$.util.stream.b
    final boolean R() {
        return this.m == 0;
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        if(this.m != 0) {
            return !this.L() ? this : new c2(this, c3.r, 1);  // 初始化器: Lj$/util/stream/e2;-><init>(Lj$/util/stream/b;II)V
        }
        return !this.L() ? this : new c2(this, c3.r, 1);  // 初始化器: Lj$/util/stream/e2;-><init>(Lj$/util/stream/b;II)V
    }
}

