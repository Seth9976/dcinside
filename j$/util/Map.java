package j$.util;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface Map {
    Object compute(Object arg1, BiFunction arg2);

    Object computeIfAbsent(Object arg1, Function arg2);

    Object computeIfPresent(Object arg1, BiFunction arg2);

    void forEach(BiConsumer arg1);

    Object getOrDefault(Object arg1, Object arg2);

    Object merge(Object arg1, Object arg2, BiFunction arg3);

    Object putIfAbsent(Object arg1, Object arg2);

    boolean remove(Object arg1, Object arg2);

    Object replace(Object arg1, Object arg2);

    boolean replace(Object arg1, Object arg2, Object arg3);

    void replaceAll(BiFunction arg1);
}

