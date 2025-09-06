package j$.util.stream;

import j..util.Spliterator;
import java.util.function.LongConsumer;
import java.util.function.Supplier;

final class j0 extends l0 {
    @Override  // j$.util.stream.b
    final Spliterator N(Supplier supplier0) {
        return new n3(supplier0);  // 初始化器: Lj$/util/stream/p3;-><init>(Ljava/util/function/Supplier;)V
    }

    @Override  // j$.util.stream.b
    final boolean R() {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.stream.l0
    public final void forEach(LongConsumer longConsumer0) {
        if(!this.isParallel()) {
            l0.a0(this.U()).forEachRemaining(longConsumer0);
            return;
        }
        super.forEach(longConsumer0);
    }

    @Override  // j$.util.stream.l0
    public final void forEachOrdered(LongConsumer longConsumer0) {
        if(!this.isParallel()) {
            l0.a0(this.U()).forEachRemaining(longConsumer0);
            return;
        }
        super.forEachOrdered(longConsumer0);
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream parallel() {
        this.parallel();
        return this;
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream sequential() {
        this.sequential();
        return this;
    }

    @Override  // j$.util.stream.b, j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        return this.spliterator();
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !this.L() ? this : new y(this, c3.r, 4);
    }
}

