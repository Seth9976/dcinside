package com.google.crypto.tink.internal;

import com.google.crypto.tink.P;
import com.google.crypto.tink.o;
import com.google.crypto.tink.util.a;
import java.security.GeneralSecurityException;
import o3.h;

public abstract class d {
    public interface b {
        o a(w arg1, @h P arg2) throws GeneralSecurityException;
    }

    private final a a;
    private final Class b;

    private d(a a0, Class class0) {
        this.a = a0;
        this.b = class0;
    }

    d(a a0, Class class0, com.google.crypto.tink.internal.d.a d$a0) {
        this(a0, class0);
    }

    public static d a(b d$b0, a a0, Class class0) {
        class com.google.crypto.tink.internal.d.a extends d {
            final b c;

            com.google.crypto.tink.internal.d.a(a a0, Class class0, b d$b0) {
                this.c = d$b0;
                super(a0, class0, null);
            }

            @Override  // com.google.crypto.tink.internal.d
            public o d(w w0, @h P p0) throws GeneralSecurityException {
                return this.c.a(w0, p0);
            }
        }

        return new com.google.crypto.tink.internal.d.a(a0, class0, d$b0);
    }

    public final a b() {
        return this.a;
    }

    public final Class c() {
        return this.b;
    }

    public abstract o d(w arg1, @h P arg2) throws GeneralSecurityException;
}

