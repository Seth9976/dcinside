package com.google.crypto.tink.internal;

import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.u;
import com.google.crypto.tink.shaded.protobuf.y0;
import com.google.crypto.tink.t.b;
import com.google.crypto.tink.t;
import java.security.GeneralSecurityException;

public final class g {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[b.values().length];
            a.b = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[F2.values().length];
            a.a = arr_v1;
            try {
                arr_v1[F2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static t a(byte[] arr_b) throws GeneralSecurityException {
        try {
            return g.b(n2.d3(arr_b, V.d()));
        }
        catch(y0 y00) {
            throw new GeneralSecurityException("invalid key template", y00);
        }
    }

    public static t b(n2 n20) throws GeneralSecurityException {
        return t.a(n20.getTypeUrl(), n20.getValue().a0(), g.c(n20.y()));
    }

    public static b c(F2 f20) throws GeneralSecurityException {
        switch(f20) {
            case 1: {
                return b.a;
            }
            case 2: {
                return b.b;
            }
            case 3: {
                return b.c;
            }
            case 4: {
                return b.d;
            }
            default: {
                throw new GeneralSecurityException("Unknown output prefix type");
            }
        }
    }

    private static F2 d(b t$b0) throws GeneralSecurityException {
        switch(t$b0) {
            case 1: {
                return F2.c;
            }
            case 2: {
                return F2.d;
            }
            case 3: {
                return F2.e;
            }
            case 4: {
                return F2.f;
            }
            default: {
                throw new GeneralSecurityException("Unknown output prefix type");
            }
        }
    }

    public static byte[] e(t t0) throws GeneralSecurityException {
        return g.f(t0).toByteArray();
    }

    public static n2 f(t t0) throws GeneralSecurityException {
        return (n2)n2.Q2().V1(t0.e()).X1(u.p(t0.f())).T1(g.d(t0.c())).B1();
    }
}

