package j$.util;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

enum d implements Comparator, java.util.Comparator {
    INSTANCE;

    @Override
    public final int compare(Object object0, Object object1) {
        return ((Comparable)object0).compareTo(((Comparable)object1));
    }

    @Override  // j$.util.Comparator
    public final java.util.Comparator reversed() {
        return Comparator.-CC.reverseOrder();
    }

    @Override  // j$.util.Comparator
    public final java.util.Comparator thenComparing(java.util.Comparator comparator0) {
        return Comparator.-CC.$default$thenComparing(this, comparator0);
    }

    @Override  // j$.util.Comparator
    public final java.util.Comparator thenComparing(Function function0) {
        return Comparator.-CC.$default$thenComparing(this, function0);
    }

    @Override  // j$.util.Comparator
    public final java.util.Comparator thenComparing(Function function0, java.util.Comparator comparator0) {
        return Comparator.-CC.$default$thenComparing(this, function0, comparator0);
    }

    @Override  // j$.util.Comparator
    public final java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction0) {
        return Comparator.-CC.$default$thenComparingDouble(this, toDoubleFunction0);
    }

    @Override  // j$.util.Comparator
    public final java.util.Comparator thenComparingInt(ToIntFunction toIntFunction0) {
        return Comparator.-CC.$default$thenComparingInt(this, toIntFunction0);
    }

    @Override  // j$.util.Comparator
    public final java.util.Comparator thenComparingLong(ToLongFunction toLongFunction0) {
        return Comparator.-CC.$default$thenComparingLong(this, toLongFunction0);
    }
}

