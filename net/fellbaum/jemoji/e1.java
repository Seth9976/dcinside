package net.fellbaum.jemoji;

import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class E1 implements Predicate {
    public final String a;

    public E1(String s) {
        this.a = s;
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
        return F1.d(this.a, ((F1)object0));
    }
}

