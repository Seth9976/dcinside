package com.google.crypto.tink.daead;

import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.O;
import com.google.crypto.tink.i;
import com.google.crypto.tink.internal.k;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.monitoring.b;
import com.google.crypto.tink.monitoring.c;
import com.google.crypto.tink.subtle.h;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

public class e implements H {
    static class a implements i {
        private final G a;
        private final com.google.crypto.tink.monitoring.b.a b;
        private final com.google.crypto.tink.monitoring.b.a c;

        public a(G g0) {
            this.a = g0;
            if(g0.j()) {
                b b0 = l.c().b();
                c c0 = k.a(g0);
                this.b = b0.a(c0, "daead", "encrypt");
                this.c = b0.a(c0, "daead", "decrypt");
                return;
            }
            this.b = k.a;
            this.c = k.a;
        }

        @Override  // com.google.crypto.tink.i
        public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
            if(arr_b.length > 5) {
                byte[] arr_b2 = Arrays.copyOf(arr_b, 5);
                byte[] arr_b3 = Arrays.copyOfRange(arr_b, 5, arr_b.length);
                for(Object object0: this.a.g(arr_b2)) {
                    com.google.crypto.tink.G.c g$c0 = (com.google.crypto.tink.G.c)object0;
                    try {
                        byte[] arr_b4 = ((i)g$c0.h()).a(arr_b3, arr_b1);
                        this.c.b(g$c0.d(), ((long)arr_b3.length));
                        return arr_b4;
                    }
                    catch(GeneralSecurityException generalSecurityException0) {
                        e.a.info("ciphertext prefix matches a key, but cannot decrypt: " + generalSecurityException0);
                    }
                }
            }
            for(Object object1: this.a.i()) {
                com.google.crypto.tink.G.c g$c1 = (com.google.crypto.tink.G.c)object1;
                try {
                    byte[] arr_b5 = ((i)g$c1.h()).a(arr_b, arr_b1);
                    this.c.b(g$c1.d(), ((long)arr_b.length));
                    return arr_b5;
                }
                catch(GeneralSecurityException unused_ex) {
                }
            }
            this.c.a();
            throw new GeneralSecurityException("decryption failed");
        }

        @Override  // com.google.crypto.tink.i
        public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
            try {
                byte[] arr_b2 = h.d(new byte[][]{this.a.f().b(), ((i)this.a.f().h()).b(arr_b, arr_b1)});
                this.b.b(this.a.f().d(), ((long)arr_b.length));
                return arr_b2;
            }
            catch(GeneralSecurityException generalSecurityException0) {
                this.b.a();
                throw generalSecurityException0;
            }
        }
    }

    private static final Logger a;
    private static final e b;

    static {
        e.a = Logger.getLogger("com.google.crypto.tink.daead.e");
        e.b = new e();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return i.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return i.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.f(g0);
    }

    public static void e() throws GeneralSecurityException {
        O.H(e.b);
    }

    public i f(G g0) {
        return new a(g0);
    }
}

