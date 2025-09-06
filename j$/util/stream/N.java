package j$.util.stream;

import j..util.B;
import j..util.C;
import j..util.D;
import j..util.Optional;
import j..util.StringJoiner;
import j..util.function.BiConsumer.-CC;
import j..util.function.BiFunction.-CC;
import j..util.function.Function.-CC;
import j..util.function.Predicate.-CC;
import j..util.x;
import j..util.y;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public final class n implements BiConsumer, BinaryOperator, DoubleBinaryOperator, DoubleFunction, Function, IntBinaryOperator, IntFunction, ObjDoubleConsumer, ObjIntConsumer, Predicate, Supplier, ToDoubleFunction, ToIntFunction {
    public final int a;

    public n(int v) {
        this.a = v;
        super();
    }

    @Override
    public void accept(Object object0, double f) {
        ((x)object0).accept(f);
    }

    @Override
    public void accept(Object object0, int v) {
        if(this.a != 24) {
            ++((long[])object0)[0];
            ((long[])object0)[1] += (long)v;
            return;
        }
        ((y)object0).accept(v);
    }

    @Override
    public void accept(Object object0, Object object1) {
        switch(this.a) {
            case 4: {
                ((LinkedHashSet)object0).add(object1);
                return;
            }
            case 5: {
                ((LinkedHashSet)object0).addAll(((LinkedHashSet)object1));
                return;
            }
            case 9: {
                ((x)object0).b(((x)object1));
                return;
            }
            default: {
                ((y)object0).b(((y)object1));
            }
        }
    }

    @Override
    public Predicate and(Predicate predicate0) {
        switch(this.a) {
            case 15: {
                return Predicate.-CC.$default$and(this, predicate0);
            }
            case 16: {
                return Predicate.-CC.$default$and(this, predicate0);
            }
            case 17: {
                return Predicate.-CC.$default$and(this, predicate0);
            }
            default: {
                return Predicate.-CC.$default$and(this, predicate0);
            }
        }
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        switch(this.a) {
            case 4: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 5: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            case 9: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
            default: {
                return BiConsumer.-CC.$default$andThen(this, biConsumer0);
            }
        }
    }

    @Override
    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public Object apply(double f) {
        return f;
    }

    @Override
    public Object apply(int v) {
        switch(this.a) {
            case 12: {
                return new Double[v];
            }
            case 19: {
                return new Object[v];
            }
            case 20: {
                return new Integer[v];
            }
            default: {
                return v;
            }
        }
    }

    @Override
    public Object apply(Object object0) {
        return ((StringJoiner)object0).toString();
    }

    @Override
    public Object apply(Object object0, Object object1) {
        return ((StringJoiner)object0).c(((StringJoiner)object1));
    }

    @Override
    public double applyAsDouble(double f, double f1) {
        return this.a == 6 ? Math.min(f, f1) : Math.max(f, f1);
    }

    @Override
    public double applyAsDouble(Object object0) {
        return (double)(((Double)object0));
    }

    @Override
    public int applyAsInt(int v, int v1) {
        switch(this.a) {
            case 23: {
                return Math.min(v, v1);
            }
            case 26: {
                return v + v1;
            }
            default: {
                return Math.max(v, v1);
            }
        }
    }

    @Override
    public int applyAsInt(Object object0) {
        return (int)(((Integer)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }

    @Override
    public Object get() {
        switch(this.a) {
            case 2: {
                return new HashMap();
            }
            case 3: {
                return new LinkedHashSet();
            }
            case 7: {
                return new double[4];
            }
            case 14: {
                return new double[3];
            }
            default: {
                return new long[2];
            }
        }
    }

    @Override
    public Predicate negate() {
        switch(this.a) {
            case 15: {
                return Predicate.-CC.$default$negate(this);
            }
            case 16: {
                return Predicate.-CC.$default$negate(this);
            }
            case 17: {
                return Predicate.-CC.$default$negate(this);
            }
            default: {
                return Predicate.-CC.$default$negate(this);
            }
        }
    }

    @Override
    public Predicate or(Predicate predicate0) {
        switch(this.a) {
            case 15: {
                return Predicate.-CC.$default$or(this, predicate0);
            }
            case 16: {
                return Predicate.-CC.$default$or(this, predicate0);
            }
            case 17: {
                return Predicate.-CC.$default$or(this, predicate0);
            }
            default: {
                return Predicate.-CC.$default$or(this, predicate0);
            }
        }
    }

    @Override
    public boolean test(Object object0) {
        switch(this.a) {
            case 15: {
                return ((B)object0).c();
            }
            case 16: {
                return ((C)object0).c();
            }
            case 17: {
                return ((D)object0).c();
            }
            default: {
                return ((Optional)object0).isPresent();
            }
        }
    }
}

