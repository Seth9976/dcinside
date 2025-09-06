package com.fasterxml.jackson.core.util;

import java.util.function.Supplier;

public final class q implements Supplier {
    @Override
    public final Object get() {
        return c.f();
    }
}

