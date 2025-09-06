package com.google.crypto.tink.mac;

import O1.j;
import com.google.crypto.tink.G.c;
import com.google.crypto.tink.G;
import com.google.crypto.tink.H;
import com.google.crypto.tink.O;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class m implements H {
    static class a {
    }

    @j
    static class b implements com.google.crypto.tink.mac.j {
        private final G a;

        private b(G g0) {
            this.a = g0;
        }

        b(G g0, a m$a0) {
            this(g0);
        }

        @Override  // com.google.crypto.tink.mac.j
        public l a(byte[] arr_b) throws GeneralSecurityException {
            byte[] arr_b1 = Arrays.copyOf(arr_b, 5);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.a.g(arr_b1)) {
                arrayList0.add(this.c(((c)object0)).a(arr_b));
            }
            for(Object object1: this.a.i()) {
                arrayList0.add(this.c(((c)object1)).a(arr_b));
            }
            return new com.google.crypto.tink.mac.m.c(arrayList0, null);
        }

        @Override  // com.google.crypto.tink.mac.j
        public k b() throws GeneralSecurityException {
            return this.c(this.a.f()).b();
        }

        private com.google.crypto.tink.mac.j c(c g$c0) {
            return (com.google.crypto.tink.mac.j)g$c0.a();
        }
    }

    static class com.google.crypto.tink.mac.m.c implements l {
        private final List a;

        private com.google.crypto.tink.mac.m.c(List list0) {
            this.a = list0;
        }

        com.google.crypto.tink.mac.m.c(List list0, a m$a0) {
            this(list0);
        }

        @Override  // com.google.crypto.tink.mac.l
        public void a(ByteBuffer byteBuffer0) throws GeneralSecurityException {
            ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
            byteBuffer1.mark();
            for(Object object0: this.a) {
                byteBuffer1.reset();
                ((l)object0).a(byteBuffer1);
            }
            byteBuffer0.position(byteBuffer0.limit());
        }

        @Override  // com.google.crypto.tink.mac.l
        public void b() throws GeneralSecurityException {
            GeneralSecurityException generalSecurityException0 = new GeneralSecurityException("MAC verification failed for all suitable keys in keyset");
            for(Object object0: this.a) {
                l l0 = (l)object0;
                try {
                    l0.b();
                    return;
                }
                catch(GeneralSecurityException generalSecurityException1) {
                    generalSecurityException0.addSuppressed(generalSecurityException1);
                }
            }
            throw generalSecurityException0;
        }
    }

    private static final m a;

    static {
        m.a = new m();
    }

    @Override  // com.google.crypto.tink.H
    public Class a() {
        return com.google.crypto.tink.mac.j.class;
    }

    @Override  // com.google.crypto.tink.H
    public Class b() {
        return com.google.crypto.tink.mac.j.class;
    }

    @Override  // com.google.crypto.tink.H
    public Object c(G g0) throws GeneralSecurityException {
        return this.e(g0);
    }

    static void d() throws GeneralSecurityException {
        O.H(m.a);
    }

    public com.google.crypto.tink.mac.j e(G g0) throws GeneralSecurityException {
        if(g0 == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if(g0.f() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        for(Object object0: g0.d()) {
            for(Object object1: ((List)object0)) {
                com.google.crypto.tink.mac.j j0 = (com.google.crypto.tink.mac.j)((c)object1).a();
            }
        }
        return new b(g0, null);
    }
}

