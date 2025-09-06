package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.t0.c;
import com.google.crypto.tink.shaded.protobuf.t0.d;
import com.google.crypto.tink.shaded.protobuf.t0.e;

public enum q0 implements c {
    class a implements d {
        a() {
            super();
        }

        public q0 a(int v) {
            return q0.a(v);
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
            return q0.a(v) != null;
        }
    }

    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    private static final d k;

    static {
        q0.k = new a();
    }

    private q0(int v1) {
        this.a = v1;
    }

    public static q0 a(int v) {
        switch(v) {
            case 0: {
                return q0.b;
            }
            case 1: {
                return q0.c;
            }
            case 2: {
                return q0.d;
            }
            case 3: {
                return q0.e;
            }
            default: {
                return null;
            }
        }
    }

    public static d b() {
        return q0.k;
    }

    public static e c() {
        return b.a;
    }

    @Deprecated
    public static q0 d(int v) {
        return q0.a(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$c
    public final int getNumber() {
        if(this == q0.f) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

