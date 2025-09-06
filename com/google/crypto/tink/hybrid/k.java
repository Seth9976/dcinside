package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.O;
import com.google.crypto.tink.proto.G0;
import com.google.crypto.tink.proto.V0;
import com.google.crypto.tink.proto.Y0;
import com.google.crypto.tink.proto.q0;
import com.google.crypto.tink.subtle.w.b;
import com.google.crypto.tink.subtle.w.d;
import com.google.crypto.tink.subtle.w;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class k {
    static class a {
        static final int[] a;
        static final int[] b;
        static final int[] c;

        static {
            int[] arr_v = new int[q0.values().length];
            a.c = arr_v;
            try {
                arr_v[q0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.c[q0.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.c[q0.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[V0.values().length];
            a.b = arr_v1;
            try {
                arr_v1[V0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[V0.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[V0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v2 = new int[Y0.values().length];
            a.a = arr_v2;
            try {
                arr_v2[Y0.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Y0.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Y0.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Y0.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Y0.f.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

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
                throw new GeneralSecurityException("unknown curve type: " + v00);
            }
        }
    }

    public static String b(Y0 y00) throws NoSuchAlgorithmException {
        switch(a.a[y00.ordinal()]) {
            case 1: {
                return "HmacSha1";
            }
            case 2: {
                return "HmacSha224";
            }
            case 3: {
                return "HmacSha256";
            }
            case 4: {
                return "HmacSha384";
            }
            case 5: {
                return "HmacSha512";
            }
            default: {
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + y00);
            }
        }
    }

    public static d c(q0 q00) throws GeneralSecurityException {
        switch(a.c[q00.ordinal()]) {
            case 1: {
                return d.a;
            }
            case 2: {
                return d.c;
            }
            case 3: {
                return d.b;
            }
            default: {
                throw new GeneralSecurityException("unknown point format: " + q00);
            }
        }
    }

    public static void d(G0 g00) throws GeneralSecurityException {
        w.l(k.a(g00.F0().d1()));
        k.b(g00.F0().B());
        if(g00.P0() == q0.b) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        O.y(g00.o0().C0());
    }
}

