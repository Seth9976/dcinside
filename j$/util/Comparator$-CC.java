package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public final class Comparator.-CC {
    public static Comparator $default$thenComparing(Comparator comparator0, Comparator comparator1) {
        Objects.requireNonNull(comparator1);
        return new c(comparator0, comparator1, 0);
    }

    public static Comparator $default$thenComparing(Comparator comparator0, Function function0) {
        Objects.requireNonNull(function0);
        return Comparator.-EL.a(comparator0, new b(2, function0));
    }

    public static Comparator $default$thenComparing(Comparator comparator0, Function function0, Comparator comparator1) {
        return Comparator.-EL.a(comparator0, Comparator.-CC.comparing(function0, comparator1));
    }

    public static Comparator $default$thenComparingDouble(Comparator comparator0, ToDoubleFunction toDoubleFunction0) {
        Objects.requireNonNull(toDoubleFunction0);
        return Comparator.-EL.a(comparator0, new b(1, toDoubleFunction0));
    }

    public static Comparator $default$thenComparingInt(Comparator comparator0, ToIntFunction toIntFunction0) {
        return Comparator.-EL.a(comparator0, Comparator.-CC.comparingInt(toIntFunction0));
    }

    public static Comparator $default$thenComparingLong(Comparator comparator0, ToLongFunction toLongFunction0) {
        Objects.requireNonNull(toLongFunction0);
        return Comparator.-EL.a(comparator0, new b(3, toLongFunction0));
    }

    public static Comparator a() {
        return d.INSTANCE;
    }

    public static Comparator comparing(Function function0, Comparator comparator0) {
        Objects.requireNonNull(function0);
        Objects.requireNonNull(comparator0);
        return new c(comparator0, function0, 1);
    }

    public static Comparator comparingInt(ToIntFunction toIntFunction0) {
        Objects.requireNonNull(toIntFunction0);
        return new b(0, toIntFunction0);
    }

    public static Comparator reverseOrder() {
        return Collections.reverseOrder();
    }
}

