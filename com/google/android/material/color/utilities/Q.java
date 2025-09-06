package com.google.android.material.color.utilities;

import j..util.function.Function.-CC;
import java.util.function.Function;

public final class q implements Function {
    public final v2 a;

    public q(v2 v20) {
        this.a = v20;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return this.a.t3(((k)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

