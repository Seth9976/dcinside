package com.google.common.collect;

import j..util.function.BiFunction.-CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final class a5 implements BinaryOperator {
    public final BinaryOperator a;

    public a5(BinaryOperator binaryOperator0) {
        this.a = binaryOperator0;
    }

    @Override
    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        return i5.p(this.a, ((W4)object0), ((W4)object1));
    }
}

