package androidx.core.content;

import androidx.core.util.Predicate;
import androidx.core.util.i;

public final class f implements Predicate {
    public final String a;

    public f(String s) {
        this.a = s;
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
        return this.a.equals(((String)object0));
    }
}

