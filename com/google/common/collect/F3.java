package com.google.common.collect;

import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public final class f3 implements BiConsumer {
    public final Function a;
    public final ToIntFunction b;

    public f3(Function function0, ToIntFunction toIntFunction0) {
        this.a = function0;
        this.b = toIntFunction0;
    }

    @Override
    public final void accept(Object object0, Object object1) {
        j3.i0(this.a, this.b, ((S3)object0), object1);
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

