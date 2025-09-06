package j$.util.stream;

import j..util.M;
import j..util.P;
import j..util.Spliterator.Wrapper;
import j..util.Y;
import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.PrimitiveIterator.OfLong;
import java.util.Spliterator.OfLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final class n0 implements LongStream {
    public final j..util.stream.LongStream a;

    private n0(j..util.stream.LongStream longStream0) {
        this.a = longStream0;
    }

    @Override
    public final boolean allMatch(LongPredicate longPredicate0) {
        return this.a.q();
    }

    @Override
    public final boolean anyMatch(LongPredicate longPredicate0) {
        return this.a.v();
    }

    @Override
    public final DoubleStream asDoubleStream() {
        return F.j(this.a.asDoubleStream());
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
    public final Object collect(Supplier supplier0, ObjLongConsumer objLongConsumer0, BiConsumer biConsumer0) {
        return this.a.collect(supplier0, objLongConsumer0, biConsumer0);
    }

    @Override
    public final long count() {
        return this.a.count();
    }

    @Override
    public final LongStream distinct() {
        return n0.j(this.a.distinct());
    }

    @Override
    public final LongStream dropWhile(LongPredicate longPredicate0) {
        return n0.j(this.a.c());
    }

    @Override
    public final boolean equals(Object object0) {
        j..util.stream.LongStream longStream0 = this.a;
        if(object0 instanceof n0) {
            object0 = ((n0)object0).a;
        }
        return longStream0.equals(object0);
    }

    @Override
    public final LongStream filter(LongPredicate longPredicate0) {
        return n0.j(this.a.b());
    }

    @Override
    public final OptionalLong findAny() {
        return P.p(this.a.findAny());
    }

    @Override
    public final OptionalLong findFirst() {
        return P.p(this.a.findFirst());
    }

    @Override
    public final LongStream flatMap(LongFunction longFunction0) {
        a a0 = new a(11);
        a0.b = longFunction0;
        return n0.j(this.a.e(a0));
    }

    @Override
    public final void forEach(LongConsumer longConsumer0) {
        this.a.forEach(longConsumer0);
    }

    @Override
    public final void forEachOrdered(LongConsumer longConsumer0) {
        this.a.forEachOrdered(longConsumer0);
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
    public final PrimitiveIterator.OfLong iterator() {
        return M.a(this.a.iterator());
    }

    public static LongStream j(j..util.stream.LongStream longStream0) {
        if(longStream0 == null) {
            return null;
        }
        return longStream0 instanceof m0 ? ((m0)longStream0).a : new n0(longStream0);
    }

    @Override
    public final LongStream limit(long v) {
        return n0.j(this.a.limit(v));
    }

    @Override
    public final LongStream map(LongUnaryOperator longUnaryOperator0) {
        return n0.j(this.a.d());
    }

    @Override
    public final DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction0) {
        return F.j(this.a.k());
    }

    @Override
    public final IntStream mapToInt(LongToIntFunction longToIntFunction0) {
        return IntStream.Wrapper.convert(this.a.w());
    }

    @Override
    public final Stream mapToObj(LongFunction longFunction0) {
        return Stream.Wrapper.convert(this.a.mapToObj(longFunction0));
    }

    @Override
    public final OptionalLong max() {
        return P.p(this.a.max());
    }

    @Override
    public final OptionalLong min() {
        return P.p(this.a.min());
    }

    @Override
    public final boolean noneMatch(LongPredicate longPredicate0) {
        return this.a.n();
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
    public final LongStream parallel() {
        return n0.j(this.a.parallel());
    }

    @Override
    public final LongStream peek(LongConsumer longConsumer0) {
        return n0.j(this.a.peek(longConsumer0));
    }

    @Override
    public final long reduce(long v, LongBinaryOperator longBinaryOperator0) {
        return this.a.reduce(v, longBinaryOperator0);
    }

    @Override
    public final OptionalLong reduce(LongBinaryOperator longBinaryOperator0) {
        return P.p(this.a.reduce(longBinaryOperator0));
    }

    @Override
    public final BaseStream sequential() {
        return g.j(this.a.sequential());
    }

    @Override
    public final LongStream sequential() {
        return n0.j(this.a.sequential());
    }

    @Override
    public final LongStream skip(long v) {
        return n0.j(this.a.skip(v));
    }

    @Override
    public final LongStream sorted() {
        return n0.j(this.a.sorted());
    }

    @Override
    public final Spliterator.OfLong spliterator() {
        return Y.a(this.a.spliterator());
    }

    @Override
    public final Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override
    public final long sum() {
        return this.a.sum();
    }

    @Override
    public final LongSummaryStatistics summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override
    public final LongStream takeWhile(LongPredicate longPredicate0) {
        return n0.j(this.a.a());
    }

    @Override
    public final long[] toArray() {
        return this.a.toArray();
    }

    @Override
    public final BaseStream unordered() {
        return g.j(this.a.unordered());
    }
}

