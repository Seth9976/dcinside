package j$.util.stream;

import j..util.Spliterator;
import java.util.function.Supplier;

abstract class c0 extends d0 {
    public final int m;

    public c0(b b0, int v, int v1) {
        this.m = v1;
        super(b0, v);
    }

    @Override  // j$.util.stream.b
    final Spliterator N(Supplier supplier0) {
        return new m3(supplier0);  // 初始化器: Lj$/util/stream/p3;-><init>(Ljava/util/function/Supplier;)V
    }

    @Override  // j$.util.stream.b
    final boolean R() {
        return this.m == 0;
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream parallel() {
        if(this.m != 0) {
            this.parallel();
            return this;
        }
        this.parallel();
        return this;
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream sequential() {
        if(this.m != 0) {
            this.sequential();
            return this;
        }
        this.sequential();
        return this;
    }

    @Override  // j$.util.stream.b, j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        return this.spliterator();
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        if(this.m != 0) {
            return !this.L() ? this : new x(this, c3.r, 2);
        }
        return !this.L() ? this : new x(this, c3.r, 2);
    }
}

