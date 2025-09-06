package j$.util.stream;

import j..util.A;
import j..util.B;
import j..util.D;
import j..util.L;
import j..util.P;
import j..util.PrimitiveIterator.OfLong;
import j..util.Spliterator;
import j..util.X;
import j..util.Z;
import j..util.d0;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

public final class m0 implements LongStream {
    public final java.util.stream.LongStream a;

    private m0(java.util.stream.LongStream longStream0) {
        this.a = longStream0;
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream a() {
        return m0.j(this.a.takeWhile(null));
    }

    @Override  // j$.util.stream.LongStream
    public final DoubleStream asDoubleStream() {
        return E.j(this.a.asDoubleStream());
    }

    @Override  // j$.util.stream.LongStream
    public final B average() {
        return P.j(this.a.average());
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream b() {
        return m0.j(this.a.filter(null));
    }

    @Override  // j$.util.stream.LongStream
    public final Stream boxed() {
        return Y2.j(this.a.boxed());
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream c() {
        return m0.j(this.a.dropWhile(null));
    }

    @Override  // j$.util.stream.BaseStream
    public final void close() {
        this.a.close();
    }

    @Override  // j$.util.stream.LongStream
    public final Object collect(Supplier supplier0, ObjLongConsumer objLongConsumer0, BiConsumer biConsumer0) {
        return this.a.collect(supplier0, objLongConsumer0, biConsumer0);
    }

    @Override  // j$.util.stream.LongStream
    public final long count() {
        return this.a.count();
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream d() {
        return m0.j(this.a.map(null));
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream distinct() {
        return m0.j(this.a.distinct());
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream e(a a0) {
        a a1 = new a(11);
        a1.b = a0;
        return m0.j(this.a.flatMap(a1));
    }

    @Override
    public final boolean equals(Object object0) {
        java.util.stream.LongStream longStream0 = this.a;
        if(object0 instanceof m0) {
            object0 = ((m0)object0).a;
        }
        return longStream0.equals(object0);
    }

    @Override  // j$.util.stream.LongStream
    public final D findAny() {
        return P.l(this.a.findAny());
    }

    @Override  // j$.util.stream.LongStream
    public final D findFirst() {
        return P.l(this.a.findFirst());
    }

    @Override  // j$.util.stream.LongStream
    public final void forEach(LongConsumer longConsumer0) {
        this.a.forEach(longConsumer0);
    }

    @Override  // j$.util.stream.LongStream
    public final void forEachOrdered(LongConsumer longConsumer0) {
        this.a.forEachOrdered(longConsumer0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.isParallel();
    }

    @Override  // j$.util.stream.LongStream
    public final PrimitiveIterator.OfLong iterator() {
        return L.a(this.a.iterator());
    }

    @Override  // j$.util.stream.BaseStream
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public static LongStream j(java.util.stream.LongStream longStream0) {
        if(longStream0 == null) {
            return null;
        }
        return longStream0 instanceof n0 ? ((n0)longStream0).a : new m0(longStream0);
    }

    @Override  // j$.util.stream.LongStream
    public final DoubleStream k() {
        return E.j(this.a.mapToDouble(null));
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream limit(long v) {
        return m0.j(this.a.limit(v));
    }

    @Override  // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction0) {
        return Y2.j(this.a.mapToObj(longFunction0));
    }

    @Override  // j$.util.stream.LongStream
    public final D max() {
        return P.l(this.a.max());
    }

    @Override  // j$.util.stream.LongStream
    public final D min() {
        return P.l(this.a.min());
    }

    @Override  // j$.util.stream.LongStream
    public final boolean n() {
        return this.a.noneMatch(null);
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable0) {
        return f.j(this.a.onClose(runnable0));
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        return f.j(this.a.parallel());
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream parallel() {
        return m0.j(this.a.parallel());
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer0) {
        return m0.j(this.a.peek(longConsumer0));
    }

    @Override  // j$.util.stream.LongStream
    public final boolean q() {
        return this.a.allMatch(null);
    }

    @Override  // j$.util.stream.LongStream
    public final long reduce(long v, LongBinaryOperator longBinaryOperator0) {
        return this.a.reduce(v, longBinaryOperator0);
    }

    @Override  // j$.util.stream.LongStream
    public final D reduce(LongBinaryOperator longBinaryOperator0) {
        return P.l(this.a.reduce(longBinaryOperator0));
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        return f.j(this.a.sequential());
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream sequential() {
        return m0.j(this.a.sequential());
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream skip(long v) {
        return m0.j(this.a.skip(v));
    }

    @Override  // j$.util.stream.LongStream
    public final LongStream sorted() {
        return m0.j(this.a.sorted());
    }

    @Override  // j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        return d0.a(this.a.spliterator());
    }

    @Override  // j$.util.stream.LongStream
    public final Z spliterator() {
        return X.a(this.a.spliterator());
    }

    @Override  // j$.util.stream.LongStream
    public final long sum() {
        return this.a.sum();
    }

    @Override  // j$.util.stream.LongStream
    public final A summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override  // j$.util.stream.LongStream
    public final long[] toArray() {
        return this.a.toArray();
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return f.j(this.a.unordered());
    }

    @Override  // j$.util.stream.LongStream
    public final boolean v() {
        return this.a.anyMatch(null);
    }

    @Override  // j$.util.stream.LongStream
    public final IntStream w() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }
}

