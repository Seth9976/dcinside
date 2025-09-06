package org.jsoup.select;

import j..util.function.Predicate.-CC;
import java.util.function.Predicate;
import org.jsoup.nodes.o;

public final class f implements Predicate {
    public final g a;
    public final o b;

    public f(g g0, o o0) {
        this.a = g0;
        this.b = o0;
    }

    @Override
    public Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    @Override
    public final boolean test(Object object0) {
        return this.a.d(this.b, ((o)object0));
    }
}

