package org.jsoup.internal;

import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class j implements BiConsumer {
    @Override
    public final void accept(Object object0, Object object1) {
        ((a)object0).a(((CharSequence)object1));
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

