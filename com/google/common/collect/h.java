package com.google.common.collect;

import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class H implements BiConsumer {
    @Override
    public final void accept(Object object0, Object object1) {
        ((c)object0).a(((Enum)object1));
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

