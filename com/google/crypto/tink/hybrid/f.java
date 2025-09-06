package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.G.c;
import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.k;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.j;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

public class f implements H {
    static class a implements j {
        private final G a;
        private final com.google.crypto.tink.monitoring.b.a b;

        public a(G g0) {
            this.a = g0;
            if(g0.j()) {
                this.b = l.c().b().a(k.a(g0), "hybrid_decrypt", "decrypt");
                return;
            }
            this.b = k.a;
        }

        @Override  // com.google.crypto.tink.j
        public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
            if(arr_b.length > 5) {
                byte[] arr_b2 = Arrays.copyOfRange(arr_b, 0, 5);
                byte[] arr_b3 = Arrays.copyOfRange(arr_b, 5, arr_b.length);
                for(Object object0: this.a.g(arr_b2)) {
                    c g$c0 = (c)object0;
                    try {
                        byte[] arr_b4 = ((j)g$c0.h()).b(arr_b3, arr_b1);
                        this.b.b(g$c0.d(), ((long)arr_b3.length));
                        return arr_b4;
                    }
                    catch(GeneralSecurityException generalSecurityException0) {
                        f.a.info("ciphertext prefix matches a key, but cannot decrypt: " + generalSecurityException0.toString());
                    }
                }
            }
            for(Object object1: this.a.i()) {
                c g$c1 = (c)object1;
                try {
                    byte[] arr_b5 = ((j)g$c1.h()).b(arr_b, arr_b1);
                    this.b.b(g$c1.d(), ((long)arr_b.length));
                    return arr_b5;
                }
                catch(GeneralSecurityException unused_ex) {
                }
            }
            this.b.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    private static final Logger a;
    private static final f b;

    static {
        f.a = Logger.getLogger("com.google.crypto.tink.hybrid.f");
        f.b = new f();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return j.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return j.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.f(g0);
    }

    public static void e() throws GeneralSecurityException {
        O.H(f.b);
    }

    public j f(G g0) {
        return new a(g0);
    }
}

