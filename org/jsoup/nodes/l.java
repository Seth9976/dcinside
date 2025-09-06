package org.jsoup.nodes;

import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class l implements Consumer {
    public final StringBuilder a;

    public l(StringBuilder stringBuilder0) {
        this.a = stringBuilder0;
    }

    @Override
    public final void accept(Object object0) {
        o.h2(this.a, ((t)object0));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

