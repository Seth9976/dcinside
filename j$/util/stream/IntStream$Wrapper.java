package j$.util.stream;

import j..util.J;
import j..util.P;
import j..util.Spliterator.Wrapper;
import j..util.V;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator.OfInt;
import java.util.Spliterator.OfInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final class IntStream.Wrapper implements IntStream {
    public final j..util.stream.IntStream a;

    private IntStream.Wrapper(j..util.stream.IntStream intStream0) {
        this.a = intStream0;
    }

    @Override
    public final boolean allMatch(IntPredicate intPredicate0) {
        return this.a.t();
    }

    @Override
    public final boolean anyMatch(IntPredicate intPredicate0) {
        return this.a.r();
    }

    @Override
    public final DoubleStream asDoubleStream() {
        return F.j(this.a.asDoubleStream());
    }

    @Override
    public final LongStream asLongStream() {
        return n0.j(this.a.asLongStream());
    }

    @Override
    public final OptionalDouble average() {
        return P.n(this.a.average());
    }

    @Override
    public final Stream boxed() {
        return Stream.Wrapper.convert(this.a.boxed());
    }

    @Override
    public final void close() {
        this.a.close();
    }

    @Override
    public final Object collect(Supplier supplier0, ObjIntConsumer objIntConsumer0, BiConsumer biConsumer0) {
        return this.a.collect(supplier0, objIntConsumer0, biConsumer0);
    }

    public static IntStream convert(j..util.stream.IntStream intStream0) {
        if(intStream0 == null) {
            return null;
        }
        return intStream0 instanceof IntStream.VivifiedWrapper ? ((IntStream.VivifiedWrapper)intStream0).a : new IntStream.Wrapper(intStream0);
    }

    @Override
    public final long count() {
        return this.a.count();
    }

    @Override
    public final IntStream distinct() {
        return IntStream.Wrapper.convert(this.a.distinct());
    }

    @Override
    public final IntStream dropWhile(IntPredicate intPredicate0) {
        return IntStream.Wrapper.convert(this.a.c());
    }

    @Override
    public final boolean equals(Object object0) {
        j..util.stream.IntStream intStream0 = this.a;
        if(object0 instanceof IntStream.Wrapper) {
            object0 = ((IntStream.Wrapper)object0).a;
        }
        return intStream0.equals(object0);
    }

    @Override
    public final IntStream filter(IntPredicate intPredicate0) {
        return IntStream.Wrapper.convert(this.a.b());
    }

    @Override
    public final OptionalInt findAny() {
        return P.o(this.a.findAny());
    }

    @Override
    public final OptionalInt findFirst() {
        return P.o(this.a.findFirst());
    }

    @Override
    public final IntStream flatMap(IntFunction intFunction0) {
        P0 p00 = new P0();  // 初始化器: Ljava/lang/Object;-><init>()V
        p00.a = intFunction0;
        return IntStream.Wrapper.convert(this.a.p(p00));
    }

    @Override
    public final void forEach(IntConsumer intConsumer0) {
        this.a.forEach(intConsumer0);
    }

    @Override
    public final void forEachOrdered(IntConsumer intConsumer0) {
        this.a.forEachOrdered(intConsumer0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final boolean isParallel() {
        return this.a.isParallel();
    }

    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override
    public final PrimitiveIterator.OfInt iterator() {
        return J.a(this.a.iterator());
    }

    @Override
    public final IntStream limit(long v) {
        return IntStream.Wrapper.convert(this.a.limit(v));
    }

    @Override
    public final IntStream map(IntUnaryOperator intUnaryOperator0) {
        return IntStream.Wrapper.convert(this.a.d());
    }

    @Override
    public final DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction0) {
        return F.j(this.a.f());
    }

    @Override
    public final LongStream mapToLong(IntToLongFunction intToLongFunction0) {
        return n0.j(this.a.l());
    }

    @Override
    public final Stream mapToObj(IntFunction intFunction0) {
        return Stream.Wrapper.convert(this.a.mapToObj(intFunction0));
    }

    @Override
    public final OptionalInt max() {
        return P.o(this.a.max());
    }

    @Override
    public final OptionalInt min() {
        return P.o(this.a.min());
    }

    @Override
    public final boolean noneMatch(IntPredicate intPredicate0) {
        return this.a.g();
    }

    @Override
    public final BaseStream onClose(Runnable runnable0) {
        return g.j(this.a.onClose(runnable0));
    }

    @Override
    public final BaseStream parallel() {
        return g.j(this.a.parallel());
    }

    @Override
    public final IntStream parallel() {
        return IntStream.Wrapper.convert(this.a.parallel());
    }

    @Override
    public final IntStream peek(IntConsumer intConsumer0) {
        return IntStream.Wrapper.convert(this.a.peek(intConsumer0));
    }

    @Override
    public final int reduce(int v, IntBinaryOperator intBinaryOperator0) {
        return this.a.reduce(v, intBinaryOperator0);
    }

    @Override
    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator0) {
        return P.o(this.a.reduce(intBinaryOperator0));
    }

    @Override
    public final BaseStream sequential() {
        return g.j(this.a.sequential());
    }

    @Override
    public final IntStream sequential() {
        return IntStream.Wrapper.convert(this.a.sequential());
    }

    @Override
    public final IntStream skip(long v) {
        return IntStream.Wrapper.convert(this.a.skip(v));
    }

    @Override
    public final IntStream sorted() {
        return IntStream.Wrapper.convert(this.a.sorted());
    }

    @Override
    public final Spliterator.OfInt spliterator() {
        return V.a(this.a.spliterator());
    }

    @Override
    public final Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override
    public final int sum() {
        return this.a.sum();
    }

    @Override
    public final IntSummaryStatistics summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    @Override
    public final IntStream takeWhile(IntPredicate intPredicate0) {
        return IntStream.Wrapper.convert(this.a.a());
    }

    @Override
    public final int[] toArray() {
        return this.a.toArray();
    }

    @Override
    public final BaseStream unordered() {
        return g.j(this.a.unordered());
    }
}

