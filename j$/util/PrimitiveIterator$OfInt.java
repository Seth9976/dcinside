package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public interface PrimitiveIterator.OfInt extends N {
    @Override
    void forEachRemaining(Consumer arg1);

    void forEachRemaining(IntConsumer arg1);

    Integer next();

    int nextInt();
}

