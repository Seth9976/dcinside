package androidx.core.content;

import androidx.core.util.Predicate;

public final class i implements Predicate {
    public final Class a;
    public final Predicate b;

    public i(Class class0, Predicate predicate0) {
        this.a = class0;
        this.b = predicate0;
    }

    @Override  // androidx.core.util.Predicate
    public Predicate a(Predicate predicate0) {
        return androidx.core.util.i.a(this, predicate0);
    }

    @Override  // androidx.core.util.Predicate
    public Predicate b(Predicate predicate0) {
        return androidx.core.util.i.c(this, predicate0);
    }

    @Override  // androidx.core.util.Predicate
    public Predicate negate() {
        return androidx.core.util.i.b(this);
    }

    @Override  // androidx.core.util.Predicate
    public final boolean test(Object object0) {
        return Builder.c0(this.a, this.b, object0);
    }
}

