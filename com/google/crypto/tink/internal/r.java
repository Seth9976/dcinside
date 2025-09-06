package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.R0;
import java.security.GeneralSecurityException;

public abstract class r {
    private final Class a;

    public r(Class class0) {
        this.a = class0;
    }

    public abstract Object a(R0 arg1) throws GeneralSecurityException;

    final Class b() {
        return this.a;
    }
}

