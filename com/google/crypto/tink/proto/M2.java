package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.t0.c;
import com.google.crypto.tink.shaded.protobuf.t0.d;
import com.google.crypto.tink.shaded.protobuf.t0.e;

public enum m2 implements c {
    class a implements d {
        a() {
            super();
        }

        public m2 a(int v) {
            return m2.a(v);
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
            return m2.a(v) != null;
        }
    }

    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    private static final d k;

    static {
        m2.k = new a();
    }

    private m2(int v1) {
        this.a = v1;
    }

    public static m2 a(int v) {
        switch(v) {
            case 0: {
                return m2.b;
            }
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
                return null;
            }
        }
    }

    public static d b() {
        return m2.k;
    }

    public static e c() {
        return b.a;
    }

    @Deprecated
    public static m2 d(int v) {
        return m2.a(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$c
    public final int getNumber() {
        if(this == m2.f) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

