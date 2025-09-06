package j$.util.stream;

import j..util.Optional;
import j..util.P;
import j..util.Spliterator;
import j..util.d0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public final class Y2 implements Stream {
    public final java.util.stream.Stream a;

    private Y2(java.util.stream.Stream stream0) {
        this.a = stream0;
    }

    @Override  // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate0) {
        return this.a.allMatch(predicate0);
    }

    @Override  // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate0) {
        return this.a.anyMatch(predicate0);
    }

    @Override  // j$.util.stream.BaseStream
    public final void close() {
        this.a.close();
    }

    @Override  // j$.util.stream.Stream
    public final Object collect(Collector collector0) {
        java.util.stream.Collector collector1 = i.a(collector0);
        return this.a.collect(collector1);
    }

    @Override  // j$.util.stream.Stream
    public final Object collect(Supplier supplier0, BiConsumer biConsumer0, BiConsumer biConsumer1) {
        return this.a.collect(supplier0, biConsumer0, biConsumer1);
    }

    @Override  // j$.util.stream.Stream
    public final long count() {
        return this.a.count();
    }

    @Override  // j$.util.stream.Stream
    public final Stream distinct() {
        return Y2.j(this.a.distinct());
    }

    @Override  // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate0) {
        return Y2.j(this.a.dropWhile(predicate0));
    }

    @Override
    public final boolean equals(Object object0) {
        java.util.stream.Stream stream0 = this.a;
        if(object0 instanceof Y2) {
            object0 = ((Y2)object0).a;
        }
        return stream0.equals(object0);
    }

    @Override  // j$.util.stream.Stream
    public final Stream filter(Predicate predicate0) {
        return Y2.j(this.a.filter(predicate0));
    }

    @Override  // j$.util.stream.Stream
    public final Optional findAny() {
        return P.i(this.a.findAny());
    }

    @Override  // j$.util.stream.Stream
    public final Optional findFirst() {
        return P.i(this.a.findFirst());
    }

    @Override  // j$.util.stream.Stream
    public final void forEach(Consumer consumer0) {
        this.a.forEach(consumer0);
    }

    @Override  // j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer0) {
        this.a.forEachOrdered(consumer0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.isParallel();
    }

    @Override  // j$.util.stream.BaseStream
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public static Stream j(java.util.stream.Stream stream0) {
        if(stream0 == null) {
            return null;
        }
        return stream0 instanceof Stream.Wrapper ? ((Stream.Wrapper)stream0).a : new Y2(stream0);
    }

    @Override  // j$.util.stream.Stream
    public final Stream limit(long v) {
        return Y2.j(this.a.limit(v));
    }

    @Override  // j$.util.stream.Stream
    public final Stream m(m m0) {
        m m1 = x0.Q(m0);
        return Y2.j(this.a.flatMap(m1));
    }

    @Override  // j$.util.stream.Stream
    public final Stream map(Function function0) {
        return Y2.j(this.a.map(function0));
    }

    @Override  // j$.util.stream.Stream
    public final DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction0) {
        return E.j(this.a.mapToDouble(toDoubleFunction0));
    }

    @Override  // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction0) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(toIntFunction0));
    }

    @Override  // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction0) {
        return m0.j(this.a.mapToLong(toLongFunction0));
    }

    @Override  // j$.util.stream.Stream
    public final Optional max(Comparator comparator0) {
        return P.i(this.a.max(comparator0));
    }

    @Override  // j$.util.stream.Stream
    public final Optional min(Comparator comparator0) {
        return P.i(this.a.min(comparator0));
    }

    @Override  // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate0) {
        return this.a.noneMatch(predicate0);
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable0) {
        return f.j(this.a.onClose(runnable0));
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        return f.j(this.a.parallel());
    }

    @Override  // j$.util.stream.Stream
    public final Stream peek(Consumer consumer0) {
        return Y2.j(this.a.peek(consumer0));
    }

    @Override  // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator0) {
        return P.i(this.a.reduce(binaryOperator0));
    }

    @Override  // j$.util.stream.Stream
    public final Object reduce(Object object0, BiFunction biFunction0, BinaryOperator binaryOperator0) {
        return this.a.reduce(object0, biFunction0, binaryOperator0);
    }

    @Override  // j$.util.stream.Stream
    public final Object reduce(Object object0, BinaryOperator binaryOperator0) {
        return this.a.reduce(object0, binaryOperator0);
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        return f.j(this.a.sequential());
    }

    @Override  // j$.util.stream.Stream
    public final Stream skip(long v) {
        return Y2.j(this.a.skip(v));
    }

    @Override  // j$.util.stream.Stream
    public final Stream sorted() {
        return Y2.j(this.a.sorted());
    }

    @Override  // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator0) {
        return Y2.j(this.a.sorted(comparator0));
    }

    @Override  // j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        return d0.a(this.a.spliterator());
    }

    @Override  // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate0) {
        return Y2.j(this.a.takeWhile(predicate0));
    }

    @Override  // j$.util.stream.Stream
    public final Object[] toArray() {
        return this.a.toArray();
    }

    @Override  // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction0) {
        return this.a.toArray(intFunction0);
    }

    @Override  // j$.util.stream.Stream
    public final LongStream u(m m0) {
        m m1 = x0.Q(m0);
        return m0.j(this.a.flatMapToLong(m1));
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return f.j(this.a.unordered());
    }

    @Override  // j$.util.stream.Stream
    public final DoubleStream y(m m0) {
        m m1 = x0.Q(m0);
        return E.j(this.a.flatMapToDouble(m1));
    }

    @Override  // j$.util.stream.Stream
    public final IntStream z(m m0) {
        m m1 = x0.Q(m0);
        return IntStream.VivifiedWrapper.convert(this.a.flatMapToInt(m1));
    }
}

