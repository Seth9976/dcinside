package j$.util;

import j..util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public interface Collection {
    void forEach(Consumer arg1);

    Stream parallelStream();

    boolean removeIf(Predicate arg1);

    Spliterator spliterator();

    Stream stream();

    Object[] toArray(IntFunction arg1);
}

