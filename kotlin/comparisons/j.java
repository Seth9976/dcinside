package kotlin.comparisons;

import j..util.Comparator.-CC;
import j..util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import kotlin.jvm.internal.L;
import y4.l;

final class j implements Comparator, java.util.Comparator {
    @l
    public static final j a;

    static {
        j.a = new j();
    }

    public int b(@l Comparable comparable0, @l Comparable comparable1) {
        L.p(comparable0, "a");
        L.p(comparable1, "b");
        return comparable0.compareTo(comparable1);
    }

    @Override
    public int compare(Object object0, Object object1) {
        return this.b(((Comparable)object0), ((Comparable)object1));
    }

    @Override  // j$.util.Comparator
    @l
    public final java.util.Comparator reversed() {
        return k.a;
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

