package com.google.crypto.tink;

import O1.j;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.shaded.protobuf.u;

@j
public final class t {
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

    public static enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY;

    }

    private final n2 a;

    private t(n2 n20) {
        this.a = n20;
    }

    public static t a(String s, byte[] arr_b, b t$b0) {
        return new t(((n2)n2.Q2().V1(s).X1(u.p(arr_b)).T1(t.g(t$b0)).B1()));
    }

    static b b(F2 f20) {
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
                throw new IllegalArgumentException("Unknown output prefix type");
            }
        }
    }

    public b c() {
        return t.b(this.a.y());
    }

    n2 d() {
        return this.a;
    }

    public String e() {
        return this.a.getTypeUrl();
    }

    public byte[] f() {
        return this.a.getValue().a0();
    }

    static F2 g(b t$b0) {
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
                throw new IllegalArgumentException("Unknown output prefix type");
            }
        }
    }
}

