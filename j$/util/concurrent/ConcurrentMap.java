package j$.util.concurrent;

import j..util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface ConcurrentMap extends Map {
    @Override  // j$.util.Map
    Object compute(Object arg1, BiFunction arg2);

    @Override  // j$.util.Map
    Object computeIfAbsent(Object arg1, Function arg2);

    @Override  // j$.util.Map
    Object computeIfPresent(Object arg1, BiFunction arg2);

    @Override  // j$.util.Map
    void forEach(BiConsumer arg1);

    @Override  // j$.util.Map
    Object getOrDefault(Object arg1, Object arg2);

    @Override  // j$.util.Map
    Object merge(Object arg1, Object arg2, BiFunction arg3);

    @Override  // j$.util.Map
    void replaceAll(BiFunction arg1);
}

