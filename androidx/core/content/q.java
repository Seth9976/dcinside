package androidx.core.content;

import androidx.core.util.Predicate;
import androidx.core.util.i;

public final class q implements Predicate {
    @Override  // androidx.core.util.Predicate
    public Predicate a(Predicate predicate0) {
        return i.a(this, predicate0);
    }

    @Override  // androidx.core.util.Predicate
    public Predicate b(Predicate predicate0) {
        return i.c(this, predicate0);
    }

    @Override  // androidx.core.util.Predicate
    public Predicate negate() {
        return i.b(this);
    }

    @Override  // androidx.core.util.Predicate
    public final boolean test(Object object0) {
        return Builder.b(((String)object0));
    }
}

