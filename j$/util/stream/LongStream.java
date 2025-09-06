package j$.util.stream;

import j..util.A;
import j..util.B;
import j..util.D;
import j..util.PrimitiveIterator.OfLong;
import j..util.Z;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

public interface LongStream extends BaseStream {
    LongStream a();

    DoubleStream asDoubleStream();

    B average();

    LongStream b();

    Stream boxed();

    LongStream c();

    Object collect(Supplier arg1, ObjLongConsumer arg2, BiConsumer arg3);

    long count();

    LongStream d();

    LongStream distinct();

    LongStream e(a arg1);

    D findAny();

    D findFirst();

    void forEach(LongConsumer arg1);

    void forEachOrdered(LongConsumer arg1);

    PrimitiveIterator.OfLong iterator();

    DoubleStream k();

    LongStream limit(long arg1);

    Stream mapToObj(LongFunction arg1);

    D max();

    D min();

    boolean n();

    LongStream parallel();

    LongStream peek(LongConsumer arg1);

    boolean q();

    long reduce(long arg1, LongBinaryOperator arg2);

    D reduce(LongBinaryOperator arg1);

    LongStream sequential();

    LongStream skip(long arg1);

    LongStream sorted();

    Z spliterator();

    long sum();

    A summaryStatistics();

    long[] toArray();

    boolean v();

    IntStream w();
}

