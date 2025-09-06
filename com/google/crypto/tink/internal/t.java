package com.google.crypto.tink.internal;

import L1.a;
import com.google.crypto.tink.shaded.protobuf.R0;
import java.security.GeneralSecurityException;

@a
public abstract class t extends h {
    private final Class d;

    @SafeVarargs
    protected t(Class class0, Class class1, r[] arr_r) {
        super(class0, arr_r);
        this.d = class1;
    }

    public abstract R0 l(R0 arg1) throws GeneralSecurityException;

    public final Class m() {
        return this.d;
    }
}

