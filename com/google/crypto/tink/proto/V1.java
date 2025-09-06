package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.t0.c;
import com.google.crypto.tink.shaded.protobuf.t0.d;
import com.google.crypto.tink.shaded.protobuf.t0.e;

public enum v1 implements c {
    class a implements d {
        a() {
            super();
        }

        public v1 a(int v) {
            return v1.a(v);
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
            return v1.a(v) != null;
        }
    }

    AEAD_UNKNOWN(0),
    AES_128_GCM(1),
    AES_256_GCM(2),
    CHACHA20_POLY1305(3),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    private static final d k;

    static {
        v1.k = new a();
    }

    private v1(int v1) {
        this.a = v1;
    }

    public static v1 a(int v) {
        switch(v) {
            case 0: {
                return v1.b;
            }
            case 1: {
                return v1.c;
            }
            case 2: {
                return v1.d;
            }
            case 3: {
                return v1.e;
            }
            default: {
                return null;
            }
        }
    }

    public static d b() {
        return v1.k;
    }

    public static e c() {
        return b.a;
    }

    @Deprecated
    public static v1 d(int v) {
        return v1.a(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$c
    public final int getNumber() {
        if(this == v1.f) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

