package com.google.protobuf.kotlin;

import B3.a;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

public final class UnmodifiableMapEntry implements a, Map.Entry {
    private final Map.Entry $$delegate_0;

    public UnmodifiableMapEntry(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "delegate");
        super();
        this.$$delegate_0 = map$Entry0;
    }

    @Override
    public Object getKey() {
        return this.$$delegate_0.getKey();
    }

    @Override
    public Object getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override
    public Object setValue(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

