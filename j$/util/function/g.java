package j$.util.function;

import java.util.function.Predicate;

public final class g implements Predicate {
    public final int a;
    public final Predicate b;
    public final Predicate c;

    public g(Predicate predicate0, Predicate predicate1, int v) {
        this.a = v;
        this.b = predicate0;
        this.c = predicate1;
        super();
    }

    @Override
    public final Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public final Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public final Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean test(Object object0) {
        return this.a == 0 ? this.b.test(object0) && this.c.test(object0) : this.b.test(object0) || this.c.test(object0);
    }
}

