package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.exc.b;
import com.fasterxml.jackson.core.y;

public final class s extends x {
    private final y o;

    public s(y y0, a a0) {
        super(a0);
        this.o = y0;
    }

    @Override  // com.fasterxml.jackson.core.util.x
    protected void T(int v) throws b {
        this.o.s(v);
    }
}

