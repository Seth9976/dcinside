package com.google.crypto.tink.jwt;

import O1.j;
import com.google.crypto.tink.G.c;
import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.O;
import com.google.crypto.tink.proto.F2;
import java.security.GeneralSecurityException;
import java.util.List;

class r implements H {
    @j
    static class a implements p {
        private final G a;

        public a(G g0) {
            this.a = g0;
        }

        @Override  // com.google.crypto.tink.jwt.p
        public z a(String s, x x0) throws GeneralSecurityException {
            Throwable throwable0 = null;
            for(Object object0: this.a.d()) {
                for(Object object1: ((List)object0)) {
                    c g$c0 = (c)object1;
                    try {
                        return ((q)g$c0.h()).a(s, x0, e.j(g$c0.d(), g$c0.f()));
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
                throw new GeneralSecurityException("invalid JWT");
            }
            throw throwable0;
        }
    }

    private static final r a;

    static {
        r.a = new r();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return q.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return p.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.f(g0);
    }

    public static void d() throws GeneralSecurityException {
        O.H(r.a);
    }

    private static void e(G g0) throws GeneralSecurityException {
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

    public p f(G g0) throws GeneralSecurityException {
        r.e(g0);
        return new a(g0);
    }
}

