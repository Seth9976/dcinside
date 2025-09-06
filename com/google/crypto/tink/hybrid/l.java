package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.O;
import com.google.crypto.tink.aead.a;
import com.google.crypto.tink.daead.b;
import com.google.crypto.tink.i;
import com.google.crypto.tink.proto.V;
import com.google.crypto.tink.proto.W;
import com.google.crypto.tink.proto.f0;
import com.google.crypto.tink.proto.g0;
import com.google.crypto.tink.proto.h1;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.proto.o;
import com.google.crypto.tink.proto.p;
import com.google.crypto.tink.proto.z;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.subtle.n;
import java.security.GeneralSecurityException;
import java.util.Arrays;

class l implements n {
    private final String a;
    private final int b;
    private V c;
    private o d;
    private int e;
    private f0 f;

    l(n2 n20) throws GeneralSecurityException {
        String s = n20.getTypeUrl();
        this.a = s;
        if(s.equals(a.b)) {
            try {
                W w0 = W.Q2(n20.getValue(), com.google.crypto.tink.shaded.protobuf.V.d());
                this.c = (V)O.v(n20);
                this.b = w0.d();
                return;
            }
            catch(y0 y00) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", y00);
            }
        }
        if(s.equals(a.a)) {
            try {
                p p0 = p.U2(n20.getValue(), com.google.crypto.tink.shaded.protobuf.V.d());
                this.d = (o)O.v(n20);
                this.e = p0.W0().d();
                int v = p0.V().d();
                this.b = this.e + v;
                return;
            }
            catch(y0 y01) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", y01);
            }
        }
        if(s.equals(b.a)) {
            try {
                g0 g00 = g0.Q2(n20.getValue(), com.google.crypto.tink.shaded.protobuf.V.d());
                this.f = (f0)O.v(n20);
                this.b = g00.d();
                return;
            }
            catch(y0 y02) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", y02);
            }
        }
        throw new GeneralSecurityException("unsupported AEAD DEM key type: " + s);
    }

    @Override  // com.google.crypto.tink.subtle.n
    public int a() {
        return this.b;
    }

    @Override  // com.google.crypto.tink.subtle.n
    public com.google.crypto.tink.hybrid.subtle.a b(byte[] arr_b) throws GeneralSecurityException {
        if(arr_b.length != this.a()) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        Class class0 = com.google.crypto.tink.b.class;
        if(this.a.equals(a.b)) {
            V v0 = (V)((com.google.crypto.tink.proto.V.b)V.L2().K1(this.c)).S1(u.q(arr_b, 0, this.b)).B1();
            return new com.google.crypto.tink.hybrid.subtle.a(((com.google.crypto.tink.b)O.o(this.a, v0, class0)));
        }
        if(this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] arr_b1 = Arrays.copyOfRange(arr_b, 0, this.e);
            byte[] arr_b2 = Arrays.copyOfRange(arr_b, this.e, this.b);
            z z0 = (z)((com.google.crypto.tink.proto.z.b)z.Q2().K1(this.d.d0())).U1(u.p(arr_b1)).B1();
            h1 h10 = (h1)((com.google.crypto.tink.proto.h1.b)h1.Q2().K1(this.d.Q0())).U1(u.p(arr_b2)).B1();
            o o0 = (o)o.S2().Z1(this.d.getVersion()).W1(z0).Y1(h10).B1();
            return new com.google.crypto.tink.hybrid.subtle.a(((com.google.crypto.tink.b)O.o(this.a, o0, class0)));
        }
        if(!this.a.equals(b.a)) {
            throw new GeneralSecurityException("unknown DEM key type");
        }
        f0 f00 = (f0)((com.google.crypto.tink.proto.f0.b)f0.L2().K1(this.f)).S1(u.q(arr_b, 0, this.b)).B1();
        return new com.google.crypto.tink.hybrid.subtle.a(((i)O.o(this.a, f00, i.class)));
    }
}

