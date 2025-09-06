package com.google.common.collect;

import java.util.function.Supplier;

public final class G implements Supplier {
    @Override
    public final Object get() {
        return a1.S();
    }
}

