package com.google.crypto.tink.aead;

import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.O;
import com.google.crypto.tink.internal.k;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.monitoring.c;
import com.google.crypto.tink.subtle.h;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

public class f implements H {
    static class a {
    }

    static class b implements com.google.crypto.tink.b {
        private final G a;
        private final com.google.crypto.tink.monitoring.b.a b;
        private final com.google.crypto.tink.monitoring.b.a c;

        private b(G g0) {
            this.a = g0;
            if(g0.j()) {
                com.google.crypto.tink.monitoring.b b0 = l.c().b();
                c c0 = k.a(g0);
                this.b = b0.a(c0, "aead", "encrypt");
                this.c = b0.a(c0, "aead", "decrypt");
                return;
            }
            this.b = k.a;
            this.c = k.a;
        }

        b(G g0, a f$a0) {
            this(g0);
        }

        @Override  // com.google.crypto.tink.b
        public byte[] a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
            try {
                byte[] arr_b2 = h.d(new byte[][]{this.a.f().b(), ((com.google.crypto.tink.b)this.a.f().h()).a(arr_b, arr_b1)});
                int v = this.a.f().d();
                this.b.b(v, ((long)arr_b.length));
                return arr_b2;
            }
            catch(GeneralSecurityException generalSecurityException0) {
                this.b.a();
                throw generalSecurityException0;
            }
        }

        @Override  // com.google.crypto.tink.b
        public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
            if(arr_b.length > 5) {
                byte[] arr_b2 = Arrays.copyOf(arr_b, 5);
                byte[] arr_b3 = Arrays.copyOfRange(arr_b, 5, arr_b.length);
                for(Object object0: this.a.g(arr_b2)) {
                    com.google.crypto.tink.G.c g$c0 = (com.google.crypto.tink.G.c)object0;
                    try {
                        byte[] arr_b4 = ((com.google.crypto.tink.b)g$c0.h()).b(arr_b3, arr_b1);
                        this.c.b(g$c0.d(), ((long)arr_b3.length));
                        return arr_b4;
                    }
                    catch(GeneralSecurityException generalSecurityException0) {
                        f.a.info("ciphertext prefix matches a key, but cannot decrypt: " + generalSecurityException0);
                    }
                }
            }
            for(Object object1: this.a.i()) {
                com.google.crypto.tink.G.c g$c1 = (com.google.crypto.tink.G.c)object1;
                try {
                    byte[] arr_b5 = ((com.google.crypto.tink.b)g$c1.h()).b(arr_b, arr_b1);
                    this.c.b(g$c1.d(), ((long)arr_b.length));
                    return arr_b5;
                }
                catch(GeneralSecurityException unused_ex) {
                }
            }
            this.c.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    private static final Logger a;
    private static final f b;

    static {
        f.a = Logger.getLogger("com.google.crypto.tink.aead.f");
        f.b = new f();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return com.google.crypto.tink.b.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return com.google.crypto.tink.b.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.f(g0);
    }

    public static void e() throws GeneralSecurityException {
        O.H(f.b);
    }

    public com.google.crypto.tink.b f(G g0) throws GeneralSecurityException {
        return new b(g0, null);
    }
}

