package com.google.crypto.tink;

import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.r2.c;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class h {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[F2.values().length];
            a.a = arr_v;
            try {
                arr_v[F2.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[F2.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final int a = 5;
    public static final int b = 5;
    public static final byte c = 0;
    public static final int d = 5;
    public static final byte e = 1;
    public static final int f;
    public static final byte[] g;

    static {
        h.g = new byte[0];
    }

    public static byte[] a(c r2$c0) throws GeneralSecurityException {
        switch(r2$c0.y()) {
            case 1: 
            case 2: {
                return ByteBuffer.allocate(5).put(0).putInt(r2$c0.H()).array();
            }
            case 3: {
                return ByteBuffer.allocate(5).put(1).putInt(r2$c0.H()).array();
            }
            case 4: {
                return h.g;
            }
            default: {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
    }
}

