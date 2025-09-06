package com.google.crypto.tink.jwt;

import O1.j;
import com.google.crypto.tink.G.c;
import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.O;
import com.google.crypto.tink.proto.F2;
import j..util.Optional;
import java.security.GeneralSecurityException;
import java.util.List;

class o implements H {
    @j
    static class a implements m {
        private final G a;

        public a(G g0) {
            this.a = g0;
        }

        @Override  // com.google.crypto.tink.jwt.m
        public String a(y y0) throws GeneralSecurityException {
            c g$c0 = this.a.f();
            Optional optional0 = e.j(g$c0.d(), g$c0.f());
            return ((n)this.a.f().h()).a(y0, optional0);
        }
    }

    private static final o a;

    static {
        o.a = new o();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return n.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return m.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.f(g0);
    }

    public static void d() throws GeneralSecurityException {
        O.H(o.a);
    }

    private static void e(G g0) throws GeneralSecurityException {
        if(g0.f() == null) {
            throw new GeneralSecurityException("Primitive set has no primary.");
        }
        for(Object object0: g0.d()) {
            for(Object object1: ((List)object0)) {
                if(((c)object1).f() != F2.e && ((c)object1).f() != F2.c) {
                    throw new GeneralSecurityException("unsupported OutputPrefixType");
                }
                if(false) {
                    break;
                }
            }
            if(false) {
                break;
            }
        }
    }

    public m f(G g0) throws GeneralSecurityException {
        o.e(g0);
        return new a(g0);
    }
}

