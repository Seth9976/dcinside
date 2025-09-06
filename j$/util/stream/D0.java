package j$.util.stream;

import j..util.B;
import j..util.C;
import j..util.Objects;
import j..util.PrimitiveIterator.OfInt;
import j..util.Spliterator;
import j..util.Spliterators;
import j..util.W;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

abstract class d0 extends b implements IntStream {
    @Override  // j$.util.stream.b
    final J0 F(b b0, Spliterator spliterator0, boolean z, IntFunction intFunction0) {
        return x0.G(b0, spliterator0, z);
    }

    @Override  // j$.util.stream.b
    final boolean H(Spliterator spliterator0, n2 n20) {
        boolean z;
        IntConsumer intConsumer0;
        W w0 = d0.a0(spliterator0);
        if(n20 instanceof IntConsumer) {
            intConsumer0 = (IntConsumer)n20;
            goto label_7;
        }
        if(!Q3.a) {
            Objects.requireNonNull(n20);
            intConsumer0 = new V(n20);
            do {
            label_7:
                z = n20.n();
            }
            while(!z && w0.tryAdvance(intConsumer0));
            return z;
        }
        Q3.a(b.class, "using IntStream.adapt(Sink<Integer> s)");
        throw null;
    }

    @Override  // j$.util.stream.b
    final d3 I() {
        return d3.INT_VALUE;
    }

    @Override  // j$.util.stream.b
    final B0 O(long v, IntFunction intFunction0) {
        return x0.R(v);
    }

    @Override  // j$.util.stream.b
    final Spliterator V(b b0, Supplier supplier0, boolean z) {
        return new u3(b0, supplier0, z);  // 初始化器: Lj$/util/stream/e3;-><init>(Lj$/util/stream/b;Ljava/util/function/Supplier;Z)V
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream a() {
        Objects.requireNonNull(null);
        return new V3(this, p4.a, 0);  // 初始化器: Lj$/util/stream/c0;-><init>(Lj$/util/stream/b;II)V
    }

    private static W a0(Spliterator spliterator0) {
        if(spliterator0 instanceof W) {
            return (W)spliterator0;
        }
        if(!Q3.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        Q3.a(b.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override  // j$.util.stream.IntStream
    public final DoubleStream asDoubleStream() {
        return new w(this, 0, 3);
    }

    @Override  // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new y(this, 0, 1);
    }

    @Override  // j$.util.stream.IntStream
    public final B average() {
        long[] arr_v = (long[])this.collect(new n(28), new n(29), new j..util.stream.W(0));
        long v = arr_v[0];
        return v <= 0L ? B.a() : B.d(((double)arr_v[1]) / ((double)v));
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new x(this, c3.t, 3);
    }

    @Override  // j$.util.stream.IntStream
    public final Stream boxed() {
        return new v(this, 0, new n(22), 1);
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream c() {
        Objects.requireNonNull(null);
        return new X3(this, p4.b, 0);  // 初始化器: Lj$/util/stream/c0;-><init>(Lj$/util/stream/b;II)V
    }

    @Override  // j$.util.stream.IntStream
    public final Object collect(Supplier supplier0, ObjIntConsumer objIntConsumer0, BiConsumer biConsumer0) {
        Objects.requireNonNull(biConsumer0);
        t t0 = new t(biConsumer0, 1);
        Objects.requireNonNull(supplier0);
        Objects.requireNonNull(objIntConsumer0);
        Objects.requireNonNull(t0);
        return this.D(new D1(d3.INT_VALUE, t0, objIntConsumer0, supplier0, 4));
    }

    @Override  // j$.util.stream.IntStream
    public final long count() {
        return (long)(((Long)this.D(new F1(3))));
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream d() {
        Objects.requireNonNull(null);
        return new x(this, c3.p | c3.n, 1);
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((f2)this.boxed()).distinct().mapToInt(new n(21));
    }

    @Override  // j$.util.stream.IntStream
    public final DoubleStream f() {
        Objects.requireNonNull(null);
        return new w(this, c3.p | c3.n, 4);
    }

    @Override  // j$.util.stream.IntStream
    public final C findAny() {
        return (C)this.D(I.d);
    }

    @Override  // j$.util.stream.IntStream
    public final C findFirst() {
        return (C)this.D(I.c);
    }

    @Override  // j$.util.stream.IntStream
    public void forEach(IntConsumer intConsumer0) {
        Objects.requireNonNull(intConsumer0);
        this.D(new O(intConsumer0, false));
    }

    @Override  // j$.util.stream.IntStream
    public void forEachOrdered(IntConsumer intConsumer0) {
        Objects.requireNonNull(intConsumer0);
        this.D(new O(intConsumer0, true));
    }

    @Override  // j$.util.stream.IntStream
    public final boolean g() {
        return ((Boolean)this.D(x0.W(u0.NONE))).booleanValue();
    }

    @Override  // j$.util.stream.IntStream
    public final PrimitiveIterator.OfInt iterator() {
        return Spliterators.g(this.spliterator());
    }

    @Override  // j$.util.stream.BaseStream
    public Iterator iterator() {
        return this.iterator();
    }

    @Override  // j$.util.stream.IntStream
    public final LongStream l() {
        Objects.requireNonNull(null);
        return new y(this, c3.p | c3.n, 2);
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream limit(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException(Long.toString(v));
        }
        return x0.V(this, 0L, v);
    }

    @Override  // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction0) {
        Objects.requireNonNull(intFunction0);
        return new v(this, c3.p | c3.n, intFunction0, 1);
    }

    @Override  // j$.util.stream.IntStream
    public final C max() {
        return this.reduce(new n(27));
    }

    @Override  // j$.util.stream.IntStream
    public final C min() {
        return this.reduce(new n(23));
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream p(P0 p00) {
        Objects.requireNonNull(p00);
        return new Y(this, c3.p | c3.n | c3.t, p00, 1);
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer0) {
        Objects.requireNonNull(intConsumer0);
        return new Y(this, intConsumer0);
    }

    @Override  // j$.util.stream.IntStream
    public final boolean r() {
        return ((Boolean)this.D(x0.W(u0.ANY))).booleanValue();
    }

    @Override  // j$.util.stream.IntStream
    public final int reduce(int v, IntBinaryOperator intBinaryOperator0) {
        Objects.requireNonNull(intBinaryOperator0);
        return (int)(((Integer)this.D(new O1(d3.INT_VALUE, intBinaryOperator0, v))));
    }

    @Override  // j$.util.stream.IntStream
    public final C reduce(IntBinaryOperator intBinaryOperator0) {
        Objects.requireNonNull(intBinaryOperator0);
        return (C)this.D(new B1(d3.INT_VALUE, intBinaryOperator0, 3));
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream skip(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException(Long.toString(v));
        }
        return v1 == 0 ? this : x0.V(this, v, -1L);
    }

    @Override  // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new G2(this, c3.q | c3.o, 0);  // 初始化器: Lj$/util/stream/c0;-><init>(Lj$/util/stream/b;II)V
    }

    @Override  // j$.util.stream.IntStream
    public final W spliterator() {
        return d0.a0(super.spliterator());
    }

    @Override  // j$.util.stream.IntStream
    public final int sum() {
        return this.reduce(0, new n(26));
    }

    @Override  // j$.util.stream.IntStream
    public final j..util.y summaryStatistics() {
        return (j..util.y)this.collect(new j(25), new n(24), new n(25));
    }

    @Override  // j$.util.stream.IntStream
    public final boolean t() {
        return ((Boolean)this.D(x0.W(u0.ALL))).booleanValue();
    }

    @Override  // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[])x0.O(((F0)this.E(new n(20)))).d();
    }
}

