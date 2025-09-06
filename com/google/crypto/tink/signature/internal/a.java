package com.google.crypto.tink.signature.internal;

import com.google.crypto.tink.proto.A0;
import com.google.crypto.tink.proto.L2;
import com.google.crypto.tink.proto.U2;
import com.google.crypto.tink.proto.V0;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.u0;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.subtle.w.b;
import com.google.crypto.tink.subtle.w.c;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

public final class a {
    static class com.google.crypto.tink.signature.internal.a.a {
        static final int[] a;
        static final int[] b;
        static final int[] c;

        static {
            int[] arr_v = new int[Y0.values().length];
            com.google.crypto.tink.signature.internal.a.a.c = arr_v;
            try {
                arr_v[Y0.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.internal.a.a.c[Y0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.internal.a.a.c[Y0.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[V0.values().length];
            com.google.crypto.tink.signature.internal.a.a.b = arr_v1;
            try {
                arr_v1[V0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.internal.a.a.b[V0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.internal.a.a.b[V0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v2 = new int[A0.values().length];
            com.google.crypto.tink.signature.internal.a.a.a = arr_v2;
            try {
                arr_v2[A0.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.crypto.tink.signature.internal.a.a.a[A0.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static final String a = "Invalid ECDSA parameters";

    public static b a(V0 v00) throws GeneralSecurityException {
        switch(v00) {
            case 1: {
                return b.a;
            }
            case 2: {
                return b.b;
            }
            case 3: {
                return b.c;
            }
            default: {
                throw new GeneralSecurityException("unknown curve type: " + v00.name());
            }
        }
    }

    public static c b(A0 a00) throws GeneralSecurityException {
        switch(a00) {
            case 1: {
                return c.b;
            }
            case 2: {
                return c.a;
            }
            default: {
                throw new GeneralSecurityException("unknown ECDSA encoding: " + a00.name());
            }
        }
    }

    public static com.google.crypto.tink.subtle.A.a c(Y0 y00) throws GeneralSecurityException {
        switch(y00) {
            case 1: {
                return com.google.crypto.tink.subtle.A.a.c;
            }
            case 2: {
                return com.google.crypto.tink.subtle.A.a.d;
            }
            case 3: {
                return com.google.crypto.tink.subtle.A.a.e;
            }
            default: {
                throw new GeneralSecurityException("unsupported hash type: " + y00.name());
            }
        }
    }

    public static u d(BigInteger bigInteger0) {
        byte[] arr_b = bigInteger0.toByteArray();
        return arr_b[0] == 0 ? u.q(arr_b, 1, arr_b.length - 1) : u.p(arr_b);
    }

    public static void e(u0 u00) throws GeneralSecurityException {
        A0 a00 = u00.a0();
        Y0 y00 = u00.F();
        V0 v00 = u00.T0();
        switch(a00) {
            case 1: 
            case 2: {
                int v = com.google.crypto.tink.signature.internal.a.a.b[v00.ordinal()];
                switch(v) {
                    case 1: {
                        if(y00 != Y0.e) {
                            throw new GeneralSecurityException("Invalid ECDSA parameters");
                        }
                        break;
                    }
                    case 2: {
                        if(y00 != Y0.d && y00 != Y0.f) {
                            throw new GeneralSecurityException("Invalid ECDSA parameters");
                        }
                        break;
                    }
                    default: {
                        if(v != 3 || y00 != Y0.f) {
                            throw new GeneralSecurityException("Invalid ECDSA parameters");
                        }
                    }
                }
                return;
            }
            default: {
                throw new GeneralSecurityException("unsupported signature encoding");
            }
        }
    }

    public static void f(L2 l20) throws GeneralSecurityException {
        a.c(l20.F());
    }

    public static void g(U2 u20) throws GeneralSecurityException {
        a.c(u20.G0());
        if(u20.G0() != u20.B0()) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        if(u20.H0() < 0) {
            throw new GeneralSecurityException("salt length is negative");
        }
    }
}

