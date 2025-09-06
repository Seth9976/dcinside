package com.google.common.collect;

import j..util.function.Function.-CC;
import java.util.function.Function;

public final class b0 implements Function {
    public final Function a;

    public b0(Function function0) {
        this.a = function0;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return a1.G(this.a, object0);
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

