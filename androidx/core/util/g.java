package androidx.core.util;

public final class g implements Predicate {
    public final Predicate a;
    public final Predicate b;

    public g(Predicate predicate0, Predicate predicate1) {
        this.a = predicate0;
        this.b = predicate1;
    }

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
        return i.d(this.a, this.b, object0);
    }
}

