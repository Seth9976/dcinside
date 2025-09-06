package kotlin.comparisons;

import java.util.Comparator;

public final class d implements Comparator {
    public final Comparator a;
    public final Comparator b;

    public d(Comparator comparator0, Comparator comparator1) {
        this.a = comparator0;
        this.b = comparator1;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return g.A(this.a, this.b, object0, object1);
    }
}

