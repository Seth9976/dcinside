package com.google.common.collect;

import J1.b;
import O1.e;
import java.util.Iterator;

@b
@C1
public abstract class u5 implements Iterator {
    @Override
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

