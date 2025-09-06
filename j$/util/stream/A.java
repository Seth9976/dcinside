package j$.util.stream;

import j..util.Map.-EL;
import j..util.Spliterator;
import j..util.StringJoiner;
import j..util.e;
import j..util.function.BiFunction.-CC;
import j..util.function.Consumer.-CC;
import j..util.function.Function.-CC;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;

public final class a implements BinaryOperator, BooleanSupplier, Consumer, DoubleFunction, Function, LongFunction, Supplier {
    public final int a;
    public Object b;

    public a(int v) {
        this.a = v;
        super();
    }

    public a(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public void accept(Object object0) {
        if(this.a != 4) {
            ((ArrayList)this.b).add(object0);
            return;
        }
        ((n2)this.b).accept(object0);
    }

    @Override
    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public Object apply(double f) {
        Object object0 = ((DoubleFunction)this.b).apply(f);
        if(object0 != null) {
            if(object0 instanceof DoubleStream) {
                return F.j(((DoubleStream)object0));
            }
            if(object0 instanceof java.util.stream.DoubleStream) {
                return E.j(((java.util.stream.DoubleStream)object0));
            }
            e.a("java.util.stream.DoubleStream", object0.getClass());
            throw null;
        }
        return null;
    }

    @Override
    public Object apply(long v) {
        Object object0 = ((LongFunction)this.b).apply(v);
        if(object0 != null) {
            if(object0 instanceof LongStream) {
                return n0.j(((LongStream)object0));
            }
            if(object0 instanceof java.util.stream.LongStream) {
                return m0.j(((java.util.stream.LongStream)object0));
            }
            e.a("java.util.stream.LongStream", object0.getClass());
            throw null;
        }
        return null;
    }

    @Override
    public Object apply(Object object0) {
        return ((Supplier)this.b).get();
    }

    @Override
    public Object apply(Object object0, Object object1) {
        for(Object object2: ((Map)object1).entrySet()) {
            Map.-EL.merge(((Map)object0), ((Map.Entry)object2).getKey(), ((Map.Entry)object2).getValue(), ((BinaryOperator)this.b));
        }
        return (Map)object0;
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }

    @Override
    public Object get() {
        switch(this.a) {
            case 0: {
                return ((b)this.b).M();
            }
            case 2: {
                return new StringJoiner(((CharSequence)this.b), "", "");
            }
            default: {
                return (Spliterator)this.b;
            }
        }
    }

    @Override
    public boolean getAsBoolean() {
        switch(this.a) {
            case 5: {
                return ((s3)this.b).d.tryAdvance(((s3)this.b).e);
            }
            case 6: {
                return ((u3)this.b).d.tryAdvance(((u3)this.b).e);
            }
            case 7: {
                return ((w3)this.b).d.tryAdvance(((w3)this.b).e);
            }
            default: {
                return ((L3)this.b).d.tryAdvance(((L3)this.b).e);
            }
        }
    }
}

