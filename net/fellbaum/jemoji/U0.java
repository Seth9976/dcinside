package net.fellbaum.jemoji;

import j..util.function.Function.-CC;
import java.util.function.Function;

public final class u0 implements Function {
    public final String a;

    public u0(String s) {
        this.a = s;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return H0.j(this.a, ((f)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

