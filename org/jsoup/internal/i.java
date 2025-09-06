package org.jsoup.internal;

import java.util.function.Supplier;

public final class i implements Supplier {
    public final String a;

    public i(String s) {
        this.a = s;
    }

    @Override
    public final Object get() {
        return n.q(this.a);
    }
}

