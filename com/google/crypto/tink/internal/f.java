package com.google.crypto.tink.internal;

import com.google.crypto.tink.proto.m2;

public final class f {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[com.google.crypto.tink.tinkkey.b.a.values().length];
            a.b = arr_v;
            try {
                arr_v[com.google.crypto.tink.tinkkey.b.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.google.crypto.tink.tinkkey.b.a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.google.crypto.tink.tinkkey.b.a.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[m2.values().length];
            a.a = arr_v1;
            try {
                arr_v1[m2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[m2.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[m2.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static com.google.crypto.tink.tinkkey.b.a a(m2 m20) {
        switch(m20) {
            case 1: {
                return com.google.crypto.tink.tinkkey.b.a.a;
            }
            case 2: {
                return com.google.crypto.tink.tinkkey.b.a.b;
            }
            case 3: {
                return com.google.crypto.tink.tinkkey.b.a.c;
            }
            default: {
                throw new IllegalArgumentException("Unknown key status type.");
            }
        }
    }

    public static m2 b(com.google.crypto.tink.tinkkey.b.a b$a0) {
        switch(b$a0) {
            case 1: {
                return m2.c;
            }
            case 2: {
                return m2.d;
            }
            case 3: {
                return m2.e;
            }
            default: {
                throw new IllegalArgumentException("Unknown key status type.");
            }
        }
    }
}

