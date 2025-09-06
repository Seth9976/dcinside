package com.google.common.collect;

import com.google.common.base.H;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class q0 implements Consumer {
    @Override
    public final void accept(Object object0) {
        H.E(object0);
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

