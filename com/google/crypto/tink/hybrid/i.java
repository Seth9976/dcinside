package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.k;
import com.google.crypto.tink.subtle.h;
import java.security.GeneralSecurityException;

public class i implements H {
    static class a implements k {
        final G a;
        private final com.google.crypto.tink.monitoring.b.a b;

        public a(G g0) {
            this.a = g0;
            if(g0.j()) {
                this.b = l.c().b().a(com.google.crypto.tink.internal.k.a(g0), "hybrid_encrypt", "encrypt");
                return;
            }
            this.b = com.google.crypto.tink.internal.k.a;
        }

        @Override  // com.google.crypto.tink.k
        public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
            if(this.a.f() != null) {
                try {
                    byte[] arr_b2 = h.d(new byte[][]{this.a.f().b(), ((k)this.a.f().h()).a(arr_b, arr_b1)});
                    this.b.b(this.a.f().d(), ((long)arr_b.length));
                    return arr_b2;
                }
                catch(GeneralSecurityException generalSecurityException0) {
                    this.b.a();
                    throw generalSecurityException0;
                }
            }
            this.b.a();
            throw new GeneralSecurityException("keyset without primary key");
        }
    }

    private static final i a;

    static {
        i.a = new i();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return k.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return k.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.e(g0);
    }

    public static void d() throws GeneralSecurityException {
        O.H(i.a);
    }

    public k e(G g0) {
        return new a(g0);
    }
}

