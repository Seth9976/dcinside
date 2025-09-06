package j$.util.stream;

import j..util.B;
import j..util.PrimitiveIterator.OfDouble;
import j..util.T;
import j..util.x;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

public interface DoubleStream extends BaseStream {
    DoubleStream a();

    B average();

    DoubleStream b();

    Stream boxed();

    DoubleStream c();

    Object collect(Supplier arg1, ObjDoubleConsumer arg2, BiConsumer arg3);

    long count();

    DoubleStream d();

    DoubleStream distinct();

    DoubleStream e(a arg1);

    B findAny();

    B findFirst();

    void forEach(DoubleConsumer arg1);

    void forEachOrdered(DoubleConsumer arg1);

    boolean h();

    LongStream i();

    PrimitiveIterator.OfDouble iterator();

    DoubleStream limit(long arg1);

    Stream mapToObj(DoubleFunction arg1);

    B max();

    B min();

    boolean o();

    DoubleStream parallel();

    DoubleStream peek(DoubleConsumer arg1);

    double reduce(double arg1, DoubleBinaryOperator arg2);

    B reduce(DoubleBinaryOperator arg1);

    IntStream s();

    DoubleStream sequential();

    DoubleStream skip(long arg1);

    DoubleStream sorted();

    T spliterator();

    double sum();

    x summaryStatistics();

    double[] toArray();

    boolean x();
}

