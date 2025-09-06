package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.proto.Y0;
import java.security.NoSuchAlgorithmException;

final class p {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[Y0.values().length];
            a.a = arr_v;
            try {
                arr_v[Y0.c.ordinal()] = 1;
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

    public static String a(Y0 y00) throws NoSuchAlgorithmException {
        switch(y00) {
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
}

