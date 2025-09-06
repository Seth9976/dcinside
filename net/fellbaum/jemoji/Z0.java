package net.fellbaum.jemoji;

import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class z0 implements Predicate {
    public final d0 a;

    public z0(d0 d00) {
        this.a = d00;
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
        return H0.E(this.a, ((f)object0));
    }
}

