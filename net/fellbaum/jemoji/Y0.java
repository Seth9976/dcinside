package net.fellbaum.jemoji;

import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class y0 implements Predicate {
    public final q1 a;

    public y0(q1 q10) {
        this.a = q10;
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
        return H0.F(this.a, ((f)object0));
    }
}

