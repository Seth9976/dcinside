package j$.util.stream;

import j..util.B;
import j..util.C;
import j..util.PrimitiveIterator.OfInt;
import j..util.W;
import j..util.y;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public interface IntStream extends BaseStream {
    IntStream a();

    DoubleStream asDoubleStream();

    LongStream asLongStream();

    B average();

    IntStream b();

    Stream boxed();

    IntStream c();

    Object collect(Supplier arg1, ObjIntConsumer arg2, BiConsumer arg3);

    long count();

    IntStream d();

    IntStream distinct();

    DoubleStream f();

    C findAny();

    C findFirst();

    void forEach(IntConsumer arg1);

    void forEachOrdered(IntConsumer arg1);

    boolean g();

    PrimitiveIterator.OfInt iterator();

    LongStream l();

    IntStream limit(long arg1);

    Stream mapToObj(IntFunction arg1);

    C max();

    C min();

    IntStream p(P0 arg1);

    IntStream parallel();

    IntStream peek(IntConsumer arg1);

    boolean r();

    int reduce(int arg1, IntBinaryOperator arg2);

    C reduce(IntBinaryOperator arg1);

    IntStream sequential();

    IntStream skip(long arg1);

    IntStream sorted();

    W spliterator();

    int sum();

    y summaryStatistics();

    boolean t();

    int[] toArray();
}

