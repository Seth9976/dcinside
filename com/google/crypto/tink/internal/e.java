package com.google.crypto.tink.internal;

import com.google.crypto.tink.P;
import com.google.crypto.tink.o;
import java.security.GeneralSecurityException;
import o3.h;

public abstract class e {
    public interface b {
        w a(o arg1, @h P arg2) throws GeneralSecurityException;
    }

    private final Class a;
    private final Class b;

    private e(Class class0, Class class1) {
        this.a = class0;
        this.b = class1;
    }

    e(Class class0, Class class1, a e$a0) {
        this(class0, class1);
    }

    public static e a(b e$b0, Class class0, Class class1) {
        class a extends e {
            final b c;

            a(Class class0, Class class1, b e$b0) {
                this.c = e$b0;
                super(class0, class1, null);
            }

            @Override  // com.google.crypto.tink.internal.e
            public w d(o o0, @h P p0) throws GeneralSecurityException {
                return this.c.a(o0, p0);
            }
        }

        return new a(class0, class1, e$b0);
    }

    public Class b() {
        return this.a;
    }

    public Class c() {
        return this.b;
    }

    public abstract w d(o arg1, @h P arg2) throws GeneralSecurityException;
}

