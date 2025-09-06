package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.t0.c;
import com.google.crypto.tink.shaded.protobuf.t0.d;
import com.google.crypto.tink.shaded.protobuf.t0.e;

public enum w1 implements c {
    class a implements d {
        a() {
            super();
        }

        public w1 a(int v) {
            return w1.a(v);
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
            return w1.a(v) != null;
        }
    }

    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    private static final d k;

    static {
        w1.k = new a();
    }

    private w1(int v1) {
        this.a = v1;
    }

    public static w1 a(int v) {
        switch(v) {
            case 0: {
                return w1.b;
            }
            case 1: {
                return w1.c;
            }
            case 2: {
                return w1.d;
            }
            case 3: {
                return w1.e;
            }
            default: {
                return null;
            }
        }
    }

    public static d b() {
        return w1.k;
    }

    public static e c() {
        return b.a;
    }

    @Deprecated
    public static w1 d(int v) {
        return w1.a(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$c
    public final int getNumber() {
        if(this == w1.f) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

