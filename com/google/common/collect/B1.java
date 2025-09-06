package com.google.common.collect;

import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class b1 implements BiConsumer {
    public final b a;

    public b1(b a1$b0) {
        this.a = a1$b0;
    }

    @Override
    public final void accept(Object object0, Object object1) {
        this.a.b(((Enum)object0), object1);
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

