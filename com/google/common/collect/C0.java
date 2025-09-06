package com.google.common.collect;

import j..util.function.Function.-CC;
import java.util.function.Function;

public final class c0 implements Function {
    public final Function a;

    public c0(Function function0) {
        this.a = function0;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return a1.H(this.a, object0);
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

