package com.google.common.collect;

import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class l1 implements BiConsumer {
    @Override
    public final void accept(Object object0, Object object1) {
        ((k5)object0).f(object1);
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

