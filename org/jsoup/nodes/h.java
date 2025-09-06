package org.jsoup.nodes;

import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class h implements Predicate {
    public final Class a;

    public h(Class class0) {
        this.a = class0;
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
        return this.a.isInstance(((t)object0));
    }
}

