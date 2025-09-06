package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

public interface PrimitiveIterator.OfLong extends N {
    @Override
    void forEachRemaining(Consumer arg1);

    void forEachRemaining(LongConsumer arg1);

    Long next();

    long nextLong();
}

