package kotlin.comparisons;

import java.util.Comparator;

public final class b implements Comparator {
    public final Comparator a;

    public b(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return g.w(this.a, object0, object1);
    }
}

