package com.google.common.collect;

import j..util.function.Function.-CC;
import java.util.function.Function;

public final class e5 implements Function {
    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((b)object0).c();
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

