package j$.util;

import java.util.function.LongConsumer;

public interface Z extends c0 {
    void forEachRemaining(LongConsumer arg1);

    boolean tryAdvance(LongConsumer arg1);

    Z trySplit();
}

