package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

public interface Spliterator {
    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer arg1);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int arg1);

    boolean tryAdvance(Consumer arg1);

    Spliterator trySplit();
}

