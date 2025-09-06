package j$.util;

import java.util.Comparator;
import java.util.SortedSet;

final class w extends u implements SortedSet {
    private final SortedSet b;
    private static final long serialVersionUID = 0xBB98248FEBECEF03L;

    w(SortedSet sortedSet0) {
        super(sortedSet0);
        this.b = sortedSet0;
    }

    @Override
    public final Comparator comparator() {
        return this.b.comparator();
    }

    @Override
    public final Object first() {
        return this.b.first();
    }

    @Override
    public final SortedSet headSet(Object object0) {
        return new w(this.b.headSet(object0));
    }

    @Override
    public final Object last() {
        return this.b.last();
    }

    @Override
    public final SortedSet subSet(Object object0, Object object1) {
        return new w(this.b.subSet(object0, object1));
    }

    @Override
    public final SortedSet tailSet(Object object0) {
        return new w(this.b.tailSet(object0));
    }
}

