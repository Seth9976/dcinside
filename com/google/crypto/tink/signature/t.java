package com.google.crypto.tink.signature;

import com.google.crypto.tink.G.c;
import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.N;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.k;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.subtle.h;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

class t implements H {
    static class a implements N {
        private final G a;
        private final com.google.crypto.tink.monitoring.b.a b;

        public a(G g0) {
            this.a = g0;
            if(g0.j()) {
                this.b = l.c().b().a(k.a(g0), "public_key_verify", "verify");
                return;
            }
            this.b = k.a;
        }

        @Override  // com.google.crypto.tink.N
        public void a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
            if(arr_b.length > 5) {
                byte[] arr_b2 = Arrays.copyOf(arr_b, 5);
                byte[] arr_b3 = Arrays.copyOfRange(arr_b, 5, arr_b.length);
                for(Object object0: this.a.g(arr_b2)) {
                    c g$c0 = (c)object0;
                    byte[] arr_b4 = g$c0.f().equals(F2.d) ? h.d(new byte[][]{arr_b1, new byte[]{0}}) : arr_b1;
                    try {
                        ((N)g$c0.h()).a(arr_b3, arr_b4);
                        this.b.b(g$c0.d(), ((long)arr_b4.length));
                        return;
                    }
                    catch(GeneralSecurityException generalSecurityException0) {
                        t.a.info("signature prefix matches a key, but cannot verify: " + generalSecurityException0);
                    }
                }
                for(Object object1: this.a.i()) {
                    c g$c1 = (c)object1;
                    try {
                        ((N)g$c1.h()).a(arr_b, arr_b1);
                        this.b.b(g$c1.d(), ((long)arr_b1.length));
                        return;
                    }
                    catch(GeneralSecurityException unused_ex) {
                    }
                }
                this.b.a();
                throw new GeneralSecurityException("invalid signature");
            }
            this.b.a();
            throw new GeneralSecurityException("signature too short");
        }
    }

    private static final Logger a;
    private static final byte[] b;
    private static final t c;

    static {
        t.a = Logger.getLogger("com.google.crypto.tink.signature.t");
        t.b = new byte[]{0};
        t.c = new t();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return N.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return N.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.g(g0);
    }

    static byte[] d() [...] // 潜在的解密器

    public static void f() throws GeneralSecurityException {
        O.H(t.c);
    }

    public N g(G g0) {
        return new a(g0);
    }
}

