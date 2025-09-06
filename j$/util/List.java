package j$.util;

import java.util.Comparator;
import java.util.function.UnaryOperator;

public interface List extends Collection {
    void replaceAll(UnaryOperator arg1);

    void sort(Comparator arg1);

    @Override  // j$.util.Collection
    Spliterator spliterator();
}

