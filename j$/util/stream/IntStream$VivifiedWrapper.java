package j$.util.stream;

import j..util.B;
import j..util.C;
import j..util.I;
import j..util.P;
import j..util.PrimitiveIterator.OfInt;
import j..util.Spliterator;
import j..util.U;
import j..util.W;
import j..util.d0;
import j..util.y;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public final class IntStream.VivifiedWrapper implements IntStream {
    public final java.util.stream.IntStream a;

    private IntStream.VivifiedWrapper(java.util.stream.IntStream intStream0) {
        this.a = intStream0;
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream a() {
        return IntStream.VivifiedWrapper.convert(this.a.takeWhile(null));
    }

    @Override  // j$.util.stream.IntStream
    public final DoubleStream asDoubleStream() {
        return E.j(this.a.asDoubleStream());
    }

    @Override  // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return m0.j(this.a.asLongStream());
    }

    @Override  // j$.util.stream.IntStream
    public final B average() {
        return P.j(this.a.average());
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream b() {
        return IntStream.VivifiedWrapper.convert(this.a.filter(null));
    }

    @Override  // j$.util.stream.IntStream
    public final Stream boxed() {
        return Y2.j(this.a.boxed());
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream c() {
        return IntStream.VivifiedWrapper.convert(this.a.dropWhile(null));
    }

    @Override  // j$.util.stream.BaseStream
    public final void close() {
        this.a.close();
    }

    @Override  // j$.util.stream.IntStream
    public final Object collect(Supplier supplier0, ObjIntConsumer objIntConsumer0, BiConsumer biConsumer0) {
        return this.a.collect(supplier0, objIntConsumer0, biConsumer0);
    }

    public static IntStream convert(java.util.stream.IntStream intStream0) {
        if(intStream0 == null) {
            return null;
        }
        return intStream0 instanceof IntStream.Wrapper ? ((IntStream.Wrapper)intStream0).a : new IntStream.VivifiedWrapper(intStream0);
    }

    @Override  // j$.util.stream.IntStream
    public final long count() {
        return this.a.count();
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream d() {
        return IntStream.VivifiedWrapper.convert(this.a.map(null));
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream distinct() {
        return IntStream.VivifiedWrapper.convert(this.a.distinct());
    }

    @Override
    public final boolean equals(Object object0) {
        java.util.stream.IntStream intStream0 = this.a;
        if(object0 instanceof IntStream.VivifiedWrapper) {
            object0 = ((IntStream.VivifiedWrapper)object0).a;
        }
        return intStream0.equals(object0);
    }

    @Override  // j$.util.stream.IntStream
    public final DoubleStream f() {
        return E.j(this.a.mapToDouble(null));
    }

    @Override  // j$.util.stream.IntStream
    public final C findAny() {
        return P.k(this.a.findAny());
    }

    @Override  // j$.util.stream.IntStream
    public final C findFirst() {
        return P.k(this.a.findFirst());
    }

    @Override  // j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer0) {
        this.a.forEach(intConsumer0);
    }

    @Override  // j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer0) {
        this.a.forEachOrdered(intConsumer0);
    }

    @Override  // j$.util.stream.IntStream
    public final boolean g() {
        return this.a.noneMatch(null);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.isParallel();
    }

    @Override  // j$.util.stream.IntStream
    public final PrimitiveIterator.OfInt iterator() {
        return I.a(this.a.iterator());
    }

    @Override  // j$.util.stream.BaseStream
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override  // j$.util.stream.IntStream
    public final LongStream l() {
        return m0.j(this.a.mapToLong(null));
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream limit(long v) {
        return IntStream.VivifiedWrapper.convert(this.a.limit(v));
    }

    @Override  // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction0) {
        return Y2.j(this.a.mapToObj(intFunction0));
    }

    @Override  // j$.util.stream.IntStream
    public final C max() {
        return P.k(this.a.max());
    }

    @Override  // j$.util.stream.IntStream
    public final C min() {
        return P.k(this.a.min());
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable0) {
        return f.j(this.a.onClose(runnable0));
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream p(P0 p00) {
        P0 p01 = new P0();  // 初始化器: Ljava/lang/Object;-><init>()V
        p01.a = p00;
        return IntStream.VivifiedWrapper.convert(this.a.flatMap(p01));
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        return f.j(this.a.parallel());
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream parallel() {
        return IntStream.VivifiedWrapper.convert(this.a.parallel());
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer0) {
        return IntStream.VivifiedWrapper.convert(this.a.peek(intConsumer0));
    }

    @Override  // j$.util.stream.IntStream
    public final boolean r() {
        return this.a.anyMatch(null);
    }

    @Override  // j$.util.stream.IntStream
    public final int reduce(int v, IntBinaryOperator intBinaryOperator0) {
        return this.a.reduce(v, intBinaryOperator0);
    }

    @Override  // j$.util.stream.IntStream
    public final C reduce(IntBinaryOperator intBinaryOperator0) {
        return P.k(this.a.reduce(intBinaryOperator0));
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        return f.j(this.a.sequential());
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream sequential() {
        return IntStream.VivifiedWrapper.convert(this.a.sequential());
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream skip(long v) {
        return IntStream.VivifiedWrapper.convert(this.a.skip(v));
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream sorted() {
        return IntStream.VivifiedWrapper.convert(this.a.sorted());
    }

    @Override  // j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        return d0.a(this.a.spliterator());
    }

    @Override  // j$.util.stream.IntStream
    public final W spliterator() {
        return U.a(this.a.spliterator());
    }

    @Override  // j$.util.stream.IntStream
    public final int sum() {
        return this.a.sum();
    }

    @Override  // j$.util.stream.IntStream
    public final y summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
    }

    @Override  // j$.util.stream.IntStream
    public final boolean t() {
        return this.a.allMatch(null);
    }

    @Override  // j$.util.stream.IntStream
    public final int[] toArray() {
        return this.a.toArray();
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return f.j(this.a.unordered());
    }
}

