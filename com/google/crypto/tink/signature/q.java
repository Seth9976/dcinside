package com.google.crypto.tink.signature;

import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.M;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.k;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.subtle.h;
import java.security.GeneralSecurityException;

public class q implements H {
    static class a implements M {
        private final G a;
        private final com.google.crypto.tink.monitoring.b.a b;

        public a(G g0) {
            this.a = g0;
            if(g0.j()) {
                this.b = l.c().b().a(k.a(g0), "public_key_sign", "sign");
                return;
            }
            this.b = k.a;
        }

        @Override  // com.google.crypto.tink.M
        public byte[] a(byte[] arr_b) throws GeneralSecurityException {
            if(this.a.f().f().equals(F2.d)) {
                arr_b = h.d(new byte[][]{arr_b, new byte[]{0}});
            }
            try {
                byte[] arr_b1 = h.d(new byte[][]{this.a.f().b(), ((M)this.a.f().h()).a(arr_b)});
                this.b.b(this.a.f().d(), ((long)arr_b.length));
                return arr_b1;
            }
            catch(GeneralSecurityException generalSecurityException0) {
                this.b.a();
                throw generalSecurityException0;
            }
        }
    }

    private static final byte[] a;
    private static final q b;

    static {
        q.a = new byte[]{0};
        q.b = new q();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return M.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return M.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.f(g0);
    }

    static byte[] d() [...] // 潜在的解密器

    public static void e() throws GeneralSecurityException {
        O.H(q.b);
    }

    public M f(G g0) {
        return new a(g0);
    }
}

