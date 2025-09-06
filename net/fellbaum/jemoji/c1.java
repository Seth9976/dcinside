package net.fellbaum.jemoji;

import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class C1 implements Predicate {
    public final String a;

    public C1(String s) {
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
        return D1.d(this.a, ((D1)object0));
    }
}

