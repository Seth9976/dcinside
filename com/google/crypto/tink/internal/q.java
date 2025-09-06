package com.google.crypto.tink.internal;

import com.google.crypto.tink.o;
import java.security.GeneralSecurityException;

public abstract class q {
    public interface b {
        Object a(o arg1) throws GeneralSecurityException;
    }

    private final Class a;
    private final Class b;

    private q(Class class0, Class class1) {
        this.a = class0;
        this.b = class1;
    }

    q(Class class0, Class class1, a q$a0) {
        this(class0, class1);
    }

    public abstract Object a(o arg1) throws GeneralSecurityException;

    public static q b(b q$b0, Class class0, Class class1) {
        class a extends q {
            final b c;

            a(Class class0, Class class1, b q$b0) {
                this.c = q$b0;
                super(class0, class1, null);
            }

            @Override  // com.google.crypto.tink.internal.q
            public Object a(o o0) throws GeneralSecurityException {
                return this.c.a(o0);
            }
        }

        return new a(class0, class1, q$b0);
    }

    public Class c() {
        return this.a;
    }

    public Class d() {
        return this.b;
    }
}

