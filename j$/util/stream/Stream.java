package j$.util.stream;

import j..util.Optional;
import java.util.Comparator;
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

public interface Stream extends BaseStream {
    boolean allMatch(Predicate arg1);

    boolean anyMatch(Predicate arg1);

    Object collect(Collector arg1);

    Object collect(Supplier arg1, BiConsumer arg2, BiConsumer arg3);

    long count();

    Stream distinct();

    Stream dropWhile(Predicate arg1);

    Stream filter(Predicate arg1);

    Optional findAny();

    Optional findFirst();

    void forEach(Consumer arg1);

    void forEachOrdered(Consumer arg1);

    Stream limit(long arg1);

    Stream m(m arg1);

    Stream map(Function arg1);

    DoubleStream mapToDouble(ToDoubleFunction arg1);

    IntStream mapToInt(ToIntFunction arg1);

    LongStream mapToLong(ToLongFunction arg1);

    Optional max(Comparator arg1);

    Optional min(Comparator arg1);

    boolean noneMatch(Predicate arg1);

    Stream peek(Consumer arg1);

    Optional reduce(BinaryOperator arg1);

    Object reduce(Object arg1, BiFunction arg2, BinaryOperator arg3);

    Object reduce(Object arg1, BinaryOperator arg2);

    Stream skip(long arg1);

    Stream sorted();

    Stream sorted(Comparator arg1);

    Stream takeWhile(Predicate arg1);

    Object[] toArray();

    Object[] toArray(IntFunction arg1);

    LongStream u(m arg1);

    DoubleStream y(m arg1);

    IntStream z(m arg1);
}

