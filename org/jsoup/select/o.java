package org.jsoup.select;

import java.util.IdentityHashMap;
import java.util.function.Supplier;

public final class o implements Supplier {
    @Override
    public final Object get() {
        return new IdentityHashMap();
    }
}

