package com.google.crypto.tink.jwt;

import O1.j;
import com.google.crypto.tink.G.c;
import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.O;
import com.google.crypto.tink.proto.F2;
import java.security.GeneralSecurityException;
import java.util.List;

class k implements H {
    static class a {
    }

    @j
    static class b implements h {
        private final G a;

        private b(G g0) {
            this.a = g0;
        }

        b(G g0, a k$a0) {
            this(g0);
        }

        @Override  // com.google.crypto.tink.jwt.h
        public z a(String s, x x0) throws GeneralSecurityException {
            Throwable throwable0 = null;
            for(Object object0: this.a.d()) {
                for(Object object1: ((List)object0)) {
                    c g$c0 = (c)object1;
                    try {
                        return ((com.google.crypto.tink.jwt.j)g$c0.h()).a(s, x0, e.j(g$c0.d(), g$c0.f()));
                    }
                    catch(GeneralSecurityException generalSecurityException0) {
                        if(!(generalSecurityException0 instanceof g)) {
                            continue;
                        }
                        throwable0 = generalSecurityException0;
                    }
                }
            }
            if(throwable0 == null) {
                throw new GeneralSecurityException("invalid MAC");
            }
            throw throwable0;
        }

        @Override  // com.google.crypto.tink.jwt.h
        public String b(y y0) throws GeneralSecurityException {
            c g$c0 = this.a.f();
            return ((com.google.crypto.tink.jwt.j)g$c0.h()).b(y0, e.j(g$c0.d(), g$c0.f()));
        }
    }

    private static final k a;

    static {
        k.a = new k();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return com.google.crypto.tink.jwt.j.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return h.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.f(g0);
    }

    public static void d() throws GeneralSecurityException {
        O.H(k.a);
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

    public h f(G g0) throws GeneralSecurityException {
        k.e(g0);
        return new b(g0, null);
    }
}

