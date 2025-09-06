package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.util.J;
import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class l implements BiConsumer {
    public final m a;
    public final a[] b;

    public l(m m0, a[] arr_m$a) {
        this.a = m0;
        this.b = arr_m$a;
    }

    @Override
    public final void accept(Object object0, Object object1) {
        this.a.d(this.b, ((J)object0), ((r)object1));
    }

    @Override
    public BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

