package net.fellbaum.jemoji;

import j..util.function.Predicate.-CC;
import java.util.Map;
import java.util.function.Predicate;

public final class w0 implements Predicate {
    public final String a;
    public final String b;

    public w0(String s, String s1) {
        this.a = s;
        this.b = s1;
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
        return H0.G(this.a, this.b, ((Map)object0));
    }
}

