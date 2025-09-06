package com.google.api;

import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;

public enum l0 implements EnumLite {
    class a implements EnumLiteMap {
        a() {
            super();
        }

        public l0 a(int v) {
            return l0.a(v);
        }

        @Override  // com.google.protobuf.Internal$EnumLiteMap
        public EnumLite findValueByNumber(int v) {
            return this.a(v);
        }
    }

    static final class b implements EnumVerifier {
        static final EnumVerifier a;

        static {
            b.a = new b();
        }

        @Override  // com.google.protobuf.Internal$EnumVerifier
        public boolean isInRange(int v) {
            return l0.a(v) != null;
        }
    }

    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 3;
    public static final int m = 4;
    public static final int n = 5;
    private static final EnumLiteMap o;

    static {
        l0.o = new a();
    }

    private l0(int v1) {
        this.a = v1;
    }

    public static l0 a(int v) {
        switch(v) {
            case 0: {
                return l0.b;
            }
            case 1: {
                return l0.c;
            }
            case 2: {
                return l0.d;
            }
            case 3: {
                return l0.e;
            }
            case 4: {
                return l0.f;
            }
            case 5: {
                return l0.g;
            }
            default: {
                return null;
            }
        }
    }

    public static EnumLiteMap b() {
        return l0.o;
    }

    public static EnumVerifier c() {
        return b.a;
    }

    @Deprecated
    public static l0 d(int v) {
        return l0.a(v);
    }

    @Override  // com.google.protobuf.Internal$EnumLite
    public final int getNumber() {
        if(this == l0.h) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

