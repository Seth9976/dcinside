package kotlin.comparisons;

import java.util.Comparator;

public final class f implements Comparator {
    public final Comparator a;

    public f(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return g.t(this.a, object0, object1);
    }
}

