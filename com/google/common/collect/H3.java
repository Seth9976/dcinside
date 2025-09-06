package com.google.common.collect;

import j..util.function.Function.-CC;
import java.util.Comparator;
import java.util.function.Function;

public final class h3 implements Function {
    public final Comparator a;

    public h3(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return j3.k0(this.a, ((S3)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

