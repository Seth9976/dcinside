package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.t0.c;
import com.google.crypto.tink.shaded.protobuf.t0.d;
import com.google.crypto.tink.shaded.protobuf.t0.e;

public enum d2 implements c {
    class a implements d {
        a() {
            super();
        }

        public d2 a(int v) {
            return d2.a(v);
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
            return d2.a(v) != null;
        }
    }

    PS_UNKNOWN(0),
    PS256(1),
    PS384(2),
    PS512(3),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    private static final d k;

    static {
        d2.k = new a();
    }

    private d2(int v1) {
        this.a = v1;
    }

    public static d2 a(int v) {
        switch(v) {
            case 0: {
                return d2.b;
            }
            case 1: {
                return d2.c;
            }
            case 2: {
                return d2.d;
            }
            case 3: {
                return d2.e;
            }
            default: {
                return null;
            }
        }
    }

    public static d b() {
        return d2.k;
    }

    public static e c() {
        return b.a;
    }

    @Deprecated
    public static d2 d(int v) {
        return d2.a(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$c
    public final int getNumber() {
        if(this == d2.f) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

