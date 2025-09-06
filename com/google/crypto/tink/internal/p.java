package com.google.crypto.tink.internal;

import com.google.crypto.tink.E;
import java.security.GeneralSecurityException;

public abstract class p {
    public interface b {
        w a(E arg1) throws GeneralSecurityException;
    }

    private final Class a;
    private final Class b;

    private p(Class class0, Class class1) {
        this.a = class0;
        this.b = class1;
    }

    p(Class class0, Class class1, a p$a0) {
        this(class0, class1);
    }

    public static p a(b p$b0, Class class0, Class class1) {
        class a extends p {
            final b c;

            a(Class class0, Class class1, b p$b0) {
                this.c = p$b0;
                super(class0, class1, null);
            }

            @Override  // com.google.crypto.tink.internal.p
            public w d(E e0) throws GeneralSecurityException {
                return this.c.a(e0);
            }
        }

        return new a(class0, class1, p$b0);
    }

    public Class b() {
        return this.a;
    }

    public Class c() {
        return this.b;
    }

    public abstract w d(E arg1) throws GeneralSecurityException;
}

