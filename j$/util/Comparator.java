package j$.util;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public interface Comparator {
    java.util.Comparator reversed();

    java.util.Comparator thenComparing(java.util.Comparator arg1);

    java.util.Comparator thenComparing(Function arg1);

    java.util.Comparator thenComparing(Function arg1, java.util.Comparator arg2);

    java.util.Comparator thenComparingDouble(ToDoubleFunction arg1);

    java.util.Comparator thenComparingInt(ToIntFunction arg1);

    java.util.Comparator thenComparingLong(ToLongFunction arg1);
}

