package kotlin.comparisons;

import java.util.Comparator;

public final class c implements Comparator {
    public final Comparator a;
    public final Comparator b;

    public c(Comparator comparator0, Comparator comparator1) {
        this.a = comparator0;
        this.b = comparator1;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return g.H(this.a, this.b, object0, object1);
    }
}

