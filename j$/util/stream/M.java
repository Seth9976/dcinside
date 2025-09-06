package j$.util.stream;

import j..util.Map.-EL;
import j..util.e;
import j..util.function.BiFunction.-CC;
import j..util.function.Function.-CC;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class m implements BiFunction, Function {
    public final int a;
    public Function b;

    public m() {
        this.a = 2;
        super();
    }

    public m(Function function0, int v) {
        this.a = v;
        this.b = function0;
        super();
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
    public Object apply(Object object0) {
        if(this.a != 1) {
            Object object1 = this.b.apply(object0);
            if(object1 != null) {
                if(object1 instanceof Stream) {
                    return Stream.Wrapper.convert(((Stream)object1));
                }
                if(object1 instanceof java.util.stream.Stream) {
                    return Y2.j(((java.util.stream.Stream)object1));
                }
                if(object1 instanceof IntStream) {
                    return IntStream.Wrapper.convert(((IntStream)object1));
                }
                if(object1 instanceof java.util.stream.IntStream) {
                    return IntStream.VivifiedWrapper.convert(((java.util.stream.IntStream)object1));
                }
                if(object1 instanceof DoubleStream) {
                    return F.j(((DoubleStream)object1));
                }
                if(object1 instanceof java.util.stream.DoubleStream) {
                    return E.j(((java.util.stream.DoubleStream)object1));
                }
                if(object1 instanceof LongStream) {
                    return n0.j(((LongStream)object1));
                }
                if(object1 instanceof java.util.stream.LongStream) {
                    return m0.j(((java.util.stream.LongStream)object1));
                }
                e.a("java.util.stream.*Stream", object1.getClass());
                throw null;
            }
            return null;
        }
        Map.-EL.a(((Map)object0), new m(this.b, 0));
        return (Map)object0;
    }

    @Override
    public Object apply(Object object0, Object object1) {
        return this.b.apply(object1);
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

