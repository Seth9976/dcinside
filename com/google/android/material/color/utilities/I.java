package com.google.android.material.color.utilities;

import j..util.function.Function.-CC;
import java.util.function.Function;

public final class i implements Function {
    public final l a;

    public i(l l0) {
        this.a = l0;
    }

    @Override
    public Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return j.l(this.a, ((k)object0));
    }

    @Override
    public Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

