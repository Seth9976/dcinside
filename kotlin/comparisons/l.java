package kotlin.comparisons;

import j..util.Comparator.-CC;
import j..util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import kotlin.jvm.internal.L;

final class l implements Comparator, java.util.Comparator {
    @y4.l
    private final java.util.Comparator a;

    public l(@y4.l java.util.Comparator comparator0) {
        L.p(comparator0, "comparator");
        super();
        this.a = comparator0;
    }

    @y4.l
    public final java.util.Comparator b() {
        return this.a;
    }

    @Override
    public int compare(Object object0, Object object1) {
        return this.a.compare(object1, object0);
    }

    @Override  // j$.util.Comparator
    @y4.l
    public final java.util.Comparator reversed() {
        return this.a;
    }

    @Override  // j$.util.Comparator
    public java.util.Comparator thenComparing(java.util.Comparator comparator0) {
        return Comparator.-CC.$default$thenComparing(this, comparator0);
    }

    @Override  // j$.util.Comparator
    public java.util.Comparator thenComparing(Function function0) {
        return Comparator.-CC.$default$thenComparing(this, function0);
    }

    @Override  // j$.util.Comparator
    public java.util.Comparator thenComparing(Function function0, java.util.Comparator comparator0) {
        return Comparator.-CC.$default$thenComparing(this, function0, comparator0);
    }

    @Override  // j$.util.Comparator
    public java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction0) {
        return Comparator.-CC.$default$thenComparingDouble(this, toDoubleFunction0);
    }

    @Override  // j$.util.Comparator
    public java.util.Comparator thenComparingInt(ToIntFunction toIntFunction0) {
        return Comparator.-CC.$default$thenComparingInt(this, toIntFunction0);
    }

    @Override  // j$.util.Comparator
    public java.util.Comparator thenComparingLong(ToLongFunction toLongFunction0) {
        return Comparator.-CC.$default$thenComparingLong(this, toLongFunction0);
    }
}

