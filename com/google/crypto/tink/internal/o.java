package com.google.crypto.tink.internal;

import com.google.crypto.tink.E;
import com.google.crypto.tink.util.a;
import java.security.GeneralSecurityException;

public abstract class o {
    public interface b {
        E a(w arg1) throws GeneralSecurityException;
    }

    private final a a;
    private final Class b;

    private o(a a0, Class class0) {
        this.a = a0;
        this.b = class0;
    }

    o(a a0, Class class0, com.google.crypto.tink.internal.o.a o$a0) {
        this(a0, class0);
    }

    public static o a(b o$b0, a a0, Class class0) {
        class com.google.crypto.tink.internal.o.a extends o {
            final b c;

            com.google.crypto.tink.internal.o.a(a a0, Class class0, b o$b0) {
                this.c = o$b0;
                super(a0, class0, null);
            }

            @Override  // com.google.crypto.tink.internal.o
            public E d(w w0) throws GeneralSecurityException {
                return this.c.a(w0);
            }
        }

        return new com.google.crypto.tink.internal.o.a(a0, class0, o$b0);
    }

    public final a b() {
        return this.a;
    }

    public final Class c() {
        return this.b;
    }

    public abstract E d(w arg1) throws GeneralSecurityException;
}

