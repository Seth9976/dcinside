package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.t0.c;
import com.google.crypto.tink.shaded.protobuf.t0.d;
import com.google.crypto.tink.shaded.protobuf.t0.e;

public enum x1 implements c {
    class a implements d {
        a() {
            super();
        }

        public x1 a(int v) {
            return x1.a(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t0$d
        public c findValueByNumber(int v) {
            return this.a(v);
        }
    }

    static final class b implements e {
        static final e a;

        static {
            b.a = new b();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.t0$e
        public boolean isInRange(int v) {
            return x1.a(v) != null;
        }
    }

    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    private static final d m;

    static {
        x1.m = new a();
    }

    private x1(int v1) {
        this.a = v1;
    }

    public static x1 a(int v) {
        switch(v) {
            case 0: {
                return x1.b;
            }
            case 1: {
                return x1.c;
            }
            case 2: {
                return x1.d;
            }
            case 3: {
                return x1.e;
            }
            case 4: {
                return x1.f;
            }
            default: {
                return null;
            }
        }
    }

    public static d b() {
        return x1.m;
    }

    public static e c() {
        return b.a;
    }

    @Deprecated
    public static x1 d(int v) {
        return x1.a(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$c
    public final int getNumber() {
        if(this == x1.g) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

