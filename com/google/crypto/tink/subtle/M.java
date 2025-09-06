package com.google.crypto.tink.subtle;

import O1.j;
import com.google.crypto.tink.N;
import com.google.crypto.tink.config.internal.c.b;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.util.List;

@j
public final class m implements N {
    private final ECPublicKey a;
    private final String b;
    private final c c;
    public static final b d;

    static {
        m.d = b.b;
    }

    public m(ECPublicKey eCPublicKey0, a a$a0, c w$c0) throws GeneralSecurityException {
        if(!m.d.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        w.a(eCPublicKey0);
        this.b = a0.h(a$a0);
        this.a = eCPublicKey0;
        this.c = w$c0;
    }

    @Override  // com.google.crypto.tink.N
    public void a(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(this.c == c.a) {
            int v = w.i(this.a.getParams().getCurve());
            if(arr_b.length != v * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            arr_b = w.f(arr_b);
        }
        if(!w.z(arr_b)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        List list0 = y.c(new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"});
        Signature signature0 = (Signature)y.d.b(this.b, list0);
        signature0.initVerify(this.a);
        signature0.update(arr_b1);
        try {
            boolean z = false;
            z = signature0.verify(arr_b);
        }
        catch(RuntimeException unused_ex) {
        }
        if(!z) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}

