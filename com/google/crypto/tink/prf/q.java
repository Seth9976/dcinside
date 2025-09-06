package com.google.crypto.tink.prf;

import O1.j;
import com.google.crypto.tink.G.c;
import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.proto.F2;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@j
public class q implements H {
    static class a {
    }

    static class b extends p {
        @j
        static class com.google.crypto.tink.prf.q.b.a implements k {
            private final k a;
            private final int b;
            private final com.google.crypto.tink.monitoring.b.a c;

            public com.google.crypto.tink.prf.q.b.a(k k0, int v, com.google.crypto.tink.monitoring.b.a b$a0) {
                this.a = k0;
                this.b = v;
                this.c = b$a0;
            }

            @Override  // com.google.crypto.tink.prf.k
            public byte[] a(byte[] arr_b, int v) throws GeneralSecurityException {
                try {
                    byte[] arr_b1 = this.a.a(arr_b, v);
                    this.c.b(this.b, ((long)arr_b.length));
                    return arr_b1;
                }
                catch(GeneralSecurityException generalSecurityException0) {
                    this.c.a();
                    throw generalSecurityException0;
                }
            }
        }

        private final Map a;
        private final int b;

        private b(G g0) throws GeneralSecurityException {
            if(g0.i().isEmpty()) {
                throw new GeneralSecurityException("No primitives provided.");
            }
            if(g0.f() == null) {
                throw new GeneralSecurityException("Primary key not set.");
            }
            com.google.crypto.tink.monitoring.b.a b$a0 = g0.j() ? l.c().b().a(com.google.crypto.tink.internal.k.a(g0), "prf", "compute") : com.google.crypto.tink.internal.k.a;
            this.b = g0.f().d();
            List list0 = g0.i();
            HashMap hashMap0 = new HashMap();
            for(Object object0: list0) {
                c g$c0 = (c)object0;
                if(!g$c0.f().equals(F2.e)) {
                    throw new GeneralSecurityException("Key " + g$c0.d() + " has non raw prefix type");
                }
                hashMap0.put(g$c0.d(), new com.google.crypto.tink.prf.q.b.a(((k)g$c0.h()), g$c0.d(), b$a0));
            }
            this.a = DesugarCollections.unmodifiableMap(hashMap0);
        }

        b(G g0, a q$a0) throws GeneralSecurityException {
            this(g0);
        }

        @Override  // com.google.crypto.tink.prf.p
        public Map b() throws GeneralSecurityException {
            return this.a;
        }

        @Override  // com.google.crypto.tink.prf.p
        public int c() {
            return this.b;
        }
    }

    private static final q a;

    static {
        q.a = new q();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return k.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return p.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.e(g0);
    }

    public static void d() throws GeneralSecurityException {
        O.H(q.a);
    }

    public p e(G g0) throws GeneralSecurityException {
        return new b(g0, null);
    }
}

