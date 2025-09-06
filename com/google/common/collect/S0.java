package com.google.common.collect;

import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;
import java.util.function.Function;

public final class s0 implements BiConsumer {
    public final Function a;
    public final Function b;

    public s0(Function function0, Function function1) {
        this.a = function0;
        this.b = function1;
    }

    @Override
    public final void accept(Object object0, Object object1) {
        a1.P(this.a, this.b, ((b)object0), object1);
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

