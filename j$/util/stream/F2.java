package j$.util.stream;

import j..util.Objects;
import j..util.Optional;
import j..util.Spliterator;
import j..util.Spliterators;
import j..util.function.a;
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

abstract class f2 extends b implements Stream {
    @Override  // j$.util.stream.b
    final J0 F(b b0, Spliterator spliterator0, boolean z, IntFunction intFunction0) {
        return x0.E(b0, spliterator0, z, intFunction0);
    }

    @Override  // j$.util.stream.b
    final boolean H(Spliterator spliterator0, n2 n20) {
        boolean z;
        do {
            z = n20.n();
        }
        while(!z && spliterator0.tryAdvance(n20));
        return z;
    }

    @Override  // j$.util.stream.b
    final d3 I() {
        return d3.REFERENCE;
    }

    @Override  // j$.util.stream.b
    final Spliterator N(Supplier supplier0) {
        return new p3(supplier0);
    }

    @Override  // j$.util.stream.b
    final B0 O(long v, IntFunction intFunction0) {
        return x0.D(v, intFunction0);
    }

    @Override  // j$.util.stream.b
    final Spliterator V(b b0, Supplier supplier0, boolean z) {
        return new L3(b0, supplier0, z);  // 初始化器: Lj$/util/stream/e3;-><init>(Lj$/util/stream/b;Ljava/util/function/Supplier;Z)V
    }

    @Override  // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate0) {
        return ((Boolean)this.D(x0.Z(u0.ALL, predicate0))).booleanValue();
    }

    @Override  // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate0) {
        return ((Boolean)this.D(x0.Z(u0.ANY, predicate0))).booleanValue();
    }

    @Override  // j$.util.stream.Stream
    public final Object collect(Collector collector0) {
        Object object0;
        if(this.isParallel() && collector0.characteristics().contains(Characteristics.CONCURRENT) && (!this.L() || collector0.characteristics().contains(Characteristics.UNORDERED))) {
            object0 = collector0.supplier().get();
            this.forEach(new k(4, collector0.accumulator(), object0));
            return collector0.characteristics().contains(Characteristics.IDENTITY_FINISH) ? object0 : collector0.finisher().apply(object0);
        }
        Supplier supplier0 = ((Collector)Objects.requireNonNull(collector0)).supplier();
        BiConsumer biConsumer0 = collector0.accumulator();
        BinaryOperator binaryOperator0 = collector0.combiner();
        object0 = this.D(new K1(d3.REFERENCE, binaryOperator0, biConsumer0, supplier0, collector0));
        return collector0.characteristics().contains(Characteristics.IDENTITY_FINISH) ? object0 : collector0.finisher().apply(object0);
    }

    @Override  // j$.util.stream.Stream
    public final Object collect(Supplier supplier0, BiConsumer biConsumer0, BiConsumer biConsumer1) {
        Objects.requireNonNull(supplier0);
        Objects.requireNonNull(biConsumer0);
        Objects.requireNonNull(biConsumer1);
        return this.D(new D1(d3.REFERENCE, biConsumer1, biConsumer0, supplier0, 3));
    }

    @Override  // j$.util.stream.Stream
    public final long count() {
        return (long)(((Long)this.D(new F1(2))));
    }

    @Override  // j$.util.stream.Stream
    public final Stream distinct() {
        return new r(this, c3.m | c3.t, 0);  // 初始化器: Lj$/util/stream/e2;-><init>(Lj$/util/stream/b;II)V
    }

    @Override  // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate0) {
        Objects.requireNonNull(predicate0);
        return new T3(this, p4.b, predicate0);
    }

    @Override  // j$.util.stream.Stream
    public final Stream filter(Predicate predicate0) {
        Objects.requireNonNull(predicate0);
        return new v(this, c3.t, predicate0, 4);
    }

    @Override  // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional)this.D(K.d);
    }

    @Override  // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional)this.D(K.c);
    }

    @Override  // j$.util.stream.Stream
    public void forEach(Consumer consumer0) {
        Objects.requireNonNull(consumer0);
        this.D(new Q(consumer0, false));
    }

    @Override  // j$.util.stream.Stream
    public void forEachOrdered(Consumer consumer0) {
        Objects.requireNonNull(consumer0);
        this.D(new Q(consumer0, true));
    }

    @Override  // j$.util.stream.BaseStream
    public final Iterator iterator() {
        return Spliterators.i(this.spliterator());
    }

    @Override  // j$.util.stream.Stream
    public final Stream limit(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException(Long.toString(v));
        }
        return x0.a0(this, 0L, v);
    }

    @Override  // j$.util.stream.Stream
    public final Stream m(m m0) {
        Objects.requireNonNull(m0);
        return new v(this, c3.p | c3.n | c3.t, m0, 6);
    }

    @Override  // j$.util.stream.Stream
    public final Stream map(Function function0) {
        Objects.requireNonNull(function0);
        return new v(this, c3.p | c3.n, function0, 5);
    }

    @Override  // j$.util.stream.Stream
    public final DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction0) {
        Objects.requireNonNull(toDoubleFunction0);
        return new A(this, c3.p | c3.n, toDoubleFunction0, 2);
    }

    @Override  // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction0) {
        Objects.requireNonNull(toIntFunction0);
        return new Y(this, c3.p | c3.n, toIntFunction0, 2);
    }

    @Override  // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction0) {
        Objects.requireNonNull(toLongFunction0);
        return new i0(this, c3.p | c3.n, toLongFunction0, 3);
    }

    @Override  // j$.util.stream.Stream
    public final Optional max(Comparator comparator0) {
        Objects.requireNonNull(comparator0);
        return this.reduce(new a(0, comparator0));
    }

    @Override  // j$.util.stream.Stream
    public final Optional min(Comparator comparator0) {
        Objects.requireNonNull(comparator0);
        return this.reduce(new a(1, comparator0));
    }

    @Override  // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate0) {
        return ((Boolean)this.D(x0.Z(u0.NONE, predicate0))).booleanValue();
    }

    @Override  // j$.util.stream.Stream
    public final Stream peek(Consumer consumer0) {
        Objects.requireNonNull(consumer0);
        return new v(this, consumer0);
    }

    @Override  // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator0) {
        Objects.requireNonNull(binaryOperator0);
        return (Optional)this.D(new B1(d3.REFERENCE, binaryOperator0, 2));
    }

    @Override  // j$.util.stream.Stream
    public final Object reduce(Object object0, BiFunction biFunction0, BinaryOperator binaryOperator0) {
        Objects.requireNonNull(biFunction0);
        Objects.requireNonNull(binaryOperator0);
        return this.D(new D1(d3.REFERENCE, binaryOperator0, biFunction0, object0, 2));
    }

    @Override  // j$.util.stream.Stream
    public final Object reduce(Object object0, BinaryOperator binaryOperator0) {
        Objects.requireNonNull(binaryOperator0);
        Objects.requireNonNull(binaryOperator0);
        return this.D(new D1(d3.REFERENCE, binaryOperator0, binaryOperator0, object0, 2));
    }

    @Override  // j$.util.stream.Stream
    public final Stream skip(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(Long.toString(v));
        }
        return v1 == 0 ? this : x0.a0(this, v, -1L);
    }

    @Override  // j$.util.stream.Stream
    public final Stream sorted() {
        return new I2(this);
    }

    @Override  // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator0) {
        return new I2(this, comparator0);
    }

    @Override  // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate0) {
        Objects.requireNonNull(predicate0);
        return new R3(this, p4.a, predicate0);
    }

    @Override  // j$.util.stream.Stream
    public final Object[] toArray() {
        return this.toArray(new W(14));
    }

    @Override  // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction0) {
        return x0.M(this.E(intFunction0), intFunction0).o(intFunction0);
    }

    @Override  // j$.util.stream.Stream
    public final LongStream u(m m0) {
        Objects.requireNonNull(m0);
        return new i0(this, c3.p | c3.n | c3.t, m0, 2);
    }

    @Override  // j$.util.stream.Stream
    public final DoubleStream y(m m0) {
        Objects.requireNonNull(m0);
        return new A(this, c3.p | c3.n | c3.t, m0, 3);
    }

    @Override  // j$.util.stream.Stream
    public final IntStream z(m m0) {
        Objects.requireNonNull(m0);
        return new Y(this, c3.p | c3.n | c3.t, m0, 3);
    }
}

