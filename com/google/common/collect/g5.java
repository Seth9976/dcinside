package com.google.common.collect;

import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;
import java.util.function.Function;

public final class g5 implements BiConsumer {
    public final Function a;
    public final Function b;
    public final Function c;

    public g5(Function function0, Function function1, Function function2) {
        this.a = function0;
        this.b = function1;
        this.c = function2;
    }

    @Override
    public final void accept(Object object0, Object object1) {
        i5.i(this.a, this.b, this.c, ((a)object0), object1);
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

