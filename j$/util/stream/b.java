package j$.util.stream;

import j..util.Spliterator;
import java.util.function.DoubleConsumer;
import java.util.function.Supplier;

final class B extends D {
    @Override  // j$.util.stream.b
    final Spliterator N(Supplier supplier0) {
        return new l3(supplier0);  // 初始化器: Lj$/util/stream/p3;-><init>(Ljava/util/function/Supplier;)V
    }

    @Override  // j$.util.stream.b
    final boolean R() {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        throw new UnsupportedOperationException();
    }

    @Override  // j$.util.stream.D
    public final void forEach(DoubleConsumer doubleConsumer0) {
        if(!this.isParallel()) {
            D.a0(this.U()).forEachRemaining(doubleConsumer0);
            return;
        }
        super.forEach(doubleConsumer0);
    }

    @Override  // j$.util.stream.D
    public final void forEachOrdered(DoubleConsumer doubleConsumer0) {
        if(!this.isParallel()) {
            D.a0(this.U()).forEachRemaining(doubleConsumer0);
            return;
        }
        super.forEachOrdered(doubleConsumer0);
    }

    @Override  // j$.util.stream.DoubleStream
    public final DoubleStream parallel() {
        this.parallel();
        return this;
    }

    @Override  // j$.util.stream.DoubleStream
    public final DoubleStream sequential() {
        this.sequential();
        return this;
    }

    @Override  // j$.util.stream.b, j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        return this.spliterator();
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !this.L() ? this : new w(this, c3.r, 1);
    }
}

