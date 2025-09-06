package com.google.crypto.tink.tinkkey;

import O1.j;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.proto.k2;
import com.google.crypto.tink.t;
import java.security.GeneralSecurityException;

@j
@Deprecated
public class b {
    public static enum a {
        ENABLED,
        DISABLED,
        DESTROYED;

    }

    private final d a;
    private final a b;
    private final int c;

    private b(d d0) {
        this.a = d0;
        this.b = a.a;
        this.c = z.c();
    }

    protected b(d d0, a b$a0, int v) {
        this.a = d0;
        this.b = b$a0;
        this.c = v;
    }

    private void a(com.google.crypto.tink.tinkkey.a a0) throws GeneralSecurityException {
        if(this.i() && !a0.a()) {
            throw new GeneralSecurityException("No access");
        }
    }

    @Deprecated
    public static b b(k2 k20, com.google.crypto.tink.t.b t$b0) {
        return new b(new N1.b(k20, t$b0));
    }

    public static b c(d d0, com.google.crypto.tink.tinkkey.a a0) throws GeneralSecurityException {
        b b0 = new b(d0);
        b0.a(a0);
        return b0;
    }

    public static b d(t t0) throws GeneralSecurityException {
        return new b(new N1.b(O.x(t0), t0.c()));
    }

    public int e() {
        return this.c;
    }

    public d f(com.google.crypto.tink.tinkkey.a a0) throws GeneralSecurityException {
        this.a(a0);
        return this.a;
    }

    public t g() {
        return this.a.b();
    }

    public a h() {
        return this.b;
    }

    public boolean i() {
        return this.a.a();
    }
}

