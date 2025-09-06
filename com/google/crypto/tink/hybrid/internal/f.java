package com.google.crypto.tink.hybrid.internal;

import O1.j;
import com.google.crypto.tink.proto.A1;
import com.google.crypto.tink.proto.C1;
import com.google.crypto.tink.proto.x1;
import java.security.GeneralSecurityException;
import java.util.Arrays;

@j
final class f implements com.google.crypto.tink.j {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[x1.values().length];
            a.a = arr_v;
            try {
                arr_v[x1.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[x1.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[x1.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[x1.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final l a;
    private final i b;
    private final h c;
    private final d d;
    private final int e;
    private static final byte[] f;

    static {
        f.f = new byte[0];
    }

    private f(l l0, i i0, h h0, d d0, int v) {
        this.a = l0;
        this.b = i0;
        this.c = h0;
        this.d = d0;
        this.e = v;
    }

    static f a(C1 c10) throws GeneralSecurityException {
        if(!c10.f()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if(!c10.e().b()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if(c10.e0().isEmpty()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        A1 a10 = c10.e().a();
        i i0 = m.e(a10);
        h h0 = m.c(a10);
        d d0 = m.a(a10);
        int v = f.c(a10.Y0());
        return new f(k.a(c10), i0, h0, d0, v);
    }

    @Override  // com.google.crypto.tink.j
    public byte[] b(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = this.e;
        if(arr_b.length < v) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        byte[] arr_b2 = Arrays.copyOf(arr_b, v);
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, this.e, arr_b.length);
        return e.d(arr_b2, this.a, this.b, this.c, this.d, arr_b1).k(arr_b3, f.f);
    }

    private static int c(x1 x10) {
        switch(x10) {
            case 1: {
                return 0x20;
            }
            case 2: {
                return 65;
            }
            case 3: {
                return 97;
            }
            case 4: {
                return 0x85;
            }
            default: {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for " + x10.name());
            }
        }
    }
}

