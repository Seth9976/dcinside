package net.fellbaum.jemoji;

import j..util.function.Function.-CC;
import java.util.Map;
import java.util.function.Function;

public final class x0 implements Function {
    public final String a;
    public final String b;

    public x0(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return H0.H(this.a, this.b, ((Map)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

