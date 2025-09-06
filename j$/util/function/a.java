package j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public final class a implements BinaryOperator, Predicate {
    public final int a;
    public final Object b;

    public a(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public Object apply(Object object0, Object object1) {
        if(this.a != 0) {
            return ((Comparator)this.b).compare(object0, object1) <= 0 ? object0 : object1;
        }
        return ((Comparator)this.b).compare(object0, object1) >= 0 ? object0 : object1;
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
    public boolean test(Object object0) {
        return !((Predicate)this.b).test(object0);
    }
}

