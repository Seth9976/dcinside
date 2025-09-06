package org.jsoup.parser;

import j..util.function.Consumer.-CC;
import java.util.Map.Entry;
import java.util.function.Consumer;

public final class p implements Consumer {
    public final Map.Entry a;

    public p(Map.Entry map$Entry0) {
        this.a = map$Entry0;
    }

    @Override
    public final void accept(Object object0) {
        q.B(this.a, ((q)object0));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

