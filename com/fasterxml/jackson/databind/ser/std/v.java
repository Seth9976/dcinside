package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import java.io.IOException;

@Deprecated
public abstract class v extends L {
    protected v(Class class0) {
        super(class0);
    }

    protected v(Class class0, boolean z) {
        super(class0, z);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public final void n(Object object0, k k0, I i0, j j0) throws IOException {
        this.m(object0, k0, i0);
    }
}

