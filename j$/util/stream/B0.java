package j$.util.stream;

import j..util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

final class b0 extends d0 {
    @Override  // j$.util.stream.b
    final Spliterator N(Supplier supplier0) {
        return new m3(supplier0);  // 初始化器: Lj$/util/stream/p3;-><init>(Ljava/util/function/Supplier;)V
    }

    @Override  // j$.util.stream.b
    final boolean R() {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.stream.d0
    public final void forEach(IntConsumer intConsumer0) {
        if(!this.isParallel()) {
            d0.a0(this.U()).forEachRemaining(intConsumer0);
            return;
        }
        super.forEach(intConsumer0);
    }

    @Override  // j$.util.stream.d0
    public final void forEachOrdered(IntConsumer intConsumer0) {
        if(!this.isParallel()) {
            d0.a0(this.U()).forEachRemaining(intConsumer0);
            return;
        }
        super.forEachOrdered(intConsumer0);
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream parallel() {
        this.parallel();
        return this;
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream sequential() {
        this.sequential();
        return this;
    }

    @Override  // j$.util.stream.b, j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        return this.spliterator();
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !this.L() ? this : new x(this, c3.r, 2);
    }
}

