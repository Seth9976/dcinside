package j$.util.stream;

import j..util.P;
import j..util.Spliterator.Wrapper;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
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
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final class Stream.Wrapper implements Stream {
    public final j..util.stream.Stream a;

    private Stream.Wrapper(j..util.stream.Stream stream0) {
        this.a = stream0;
    }

    @Override
    public final boolean allMatch(Predicate predicate0) {
        return this.a.allMatch(predicate0);
    }

    @Override
    public final boolean anyMatch(Predicate predicate0) {
        return this.a.anyMatch(predicate0);
    }

    @Override
    public final void close() {
        this.a.close();
    }

    @Override
    public final Object collect(Supplier supplier0, BiConsumer biConsumer0, BiConsumer biConsumer1) {
        return this.a.collect(supplier0, biConsumer0, biConsumer1);
    }

    @Override
    public final Object collect(Collector collector0) {
        j..util.stream.Collector collector1 = h.a(collector0);
        return this.a.collect(collector1);
    }

    public static Stream convert(j..util.stream.Stream stream0) {
        if(stream0 == null) {
            return null;
        }
        return stream0 instanceof Y2 ? ((Y2)stream0).a : new Stream.Wrapper(stream0);
    }

    @Override
    public final long count() {
        return this.a.count();
    }

    @Override
    public final Stream distinct() {
        return Stream.Wrapper.convert(this.a.distinct());
    }

    @Override
    public final Stream dropWhile(Predicate predicate0) {
        return Stream.Wrapper.convert(this.a.dropWhile(predicate0));
    }

    @Override
    public final boolean equals(Object object0) {
        j..util.stream.Stream stream0 = this.a;
        if(object0 instanceof Stream.Wrapper) {
            object0 = ((Stream.Wrapper)object0).a;
        }
        return stream0.equals(object0);
    }

    @Override
    public final Stream filter(Predicate predicate0) {
        return Stream.Wrapper.convert(this.a.filter(predicate0));
    }

    @Override
    public final Optional findAny() {
        return P.m(this.a.findAny());
    }

    @Override
    public final Optional findFirst() {
        return P.m(this.a.findFirst());
    }

    @Override
    public final Stream flatMap(Function function0) {
        m m0 = x0.Q(function0);
        return Stream.Wrapper.convert(this.a.m(m0));
    }

    @Override
    public final DoubleStream flatMapToDouble(Function function0) {
        m m0 = x0.Q(function0);
        return F.j(this.a.y(m0));
    }

    @Override
    public final IntStream flatMapToInt(Function function0) {
        m m0 = x0.Q(function0);
        return IntStream.Wrapper.convert(this.a.z(m0));
    }

    @Override
    public final LongStream flatMapToLong(Function function0) {
        m m0 = x0.Q(function0);
        return n0.j(this.a.u(m0));
    }

    @Override
    public final void forEach(Consumer consumer0) {
        this.a.forEach(consumer0);
    }

    @Override
    public final void forEachOrdered(Consumer consumer0) {
        this.a.forEachOrdered(consumer0);
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
    public final Stream limit(long v) {
        return Stream.Wrapper.convert(this.a.limit(v));
    }

    @Override
    public final Stream map(Function function0) {
        return Stream.Wrapper.convert(this.a.map(function0));
    }

    @Override
    public final DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction0) {
        return F.j(this.a.mapToDouble(toDoubleFunction0));
    }

    @Override
    public final IntStream mapToInt(ToIntFunction toIntFunction0) {
        return IntStream.Wrapper.convert(this.a.mapToInt(toIntFunction0));
    }

    @Override
    public final LongStream mapToLong(ToLongFunction toLongFunction0) {
        return n0.j(this.a.mapToLong(toLongFunction0));
    }

    @Override
    public final Optional max(Comparator comparator0) {
        return P.m(this.a.max(comparator0));
    }

    @Override
    public final Optional min(Comparator comparator0) {
        return P.m(this.a.min(comparator0));
    }

    @Override
    public final boolean noneMatch(Predicate predicate0) {
        return this.a.noneMatch(predicate0);
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
    public final Stream peek(Consumer consumer0) {
        return Stream.Wrapper.convert(this.a.peek(consumer0));
    }

    @Override
    public final Object reduce(Object object0, BiFunction biFunction0, BinaryOperator binaryOperator0) {
        return this.a.reduce(object0, biFunction0, binaryOperator0);
    }

    @Override
    public final Object reduce(Object object0, BinaryOperator binaryOperator0) {
        return this.a.reduce(object0, binaryOperator0);
    }

    @Override
    public final Optional reduce(BinaryOperator binaryOperator0) {
        return P.m(this.a.reduce(binaryOperator0));
    }

    @Override
    public final BaseStream sequential() {
        return g.j(this.a.sequential());
    }

    @Override
    public final Stream skip(long v) {
        return Stream.Wrapper.convert(this.a.skip(v));
    }

    @Override
    public final Stream sorted() {
        return Stream.Wrapper.convert(this.a.sorted());
    }

    @Override
    public final Stream sorted(Comparator comparator0) {
        return Stream.Wrapper.convert(this.a.sorted(comparator0));
    }

    @Override
    public final Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override
    public final Stream takeWhile(Predicate predicate0) {
        return Stream.Wrapper.convert(this.a.takeWhile(predicate0));
    }

    @Override
    public final Object[] toArray() {
        return this.a.toArray();
    }

    @Override
    public final Object[] toArray(IntFunction intFunction0) {
        return this.a.toArray(intFunction0);
    }

    @Override
    public final BaseStream unordered() {
        return g.j(this.a.unordered());
    }
}

