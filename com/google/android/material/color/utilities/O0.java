package com.google.android.material.color.utilities;

import j..util.function.Function.-CC;
import java.util.function.Function;

public final class o0 implements Function {
    public final v2 a;

    public o0(v2 v20) {
        this.a = v20;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return this.a.H2(((k)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

