package org.jsoup.internal;

import java.util.Stack;
import java.util.function.Supplier;

public final class m implements Supplier {
    @Override
    public final Object get() {
        return new Stack();
    }
}

