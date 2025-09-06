package com.google.api;

import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;

public enum u implements EnumLite {
    class a implements EnumLiteMap {
        a() {
            super();
        }

        public u a(int v) {
            return u.a(v);
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
            return u.a(v) != null;
        }
    }

    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    private static final EnumLiteMap k;

    static {
        u.k = new a();
    }

    private u(int v1) {
        this.a = v1;
    }

    public static u a(int v) {
        switch(v) {
            case 0: {
                return u.b;
            }
            case 1: {
                return u.c;
            }
            case 2: {
                return u.d;
            }
            case 3: {
                return u.e;
            }
            default: {
                return null;
            }
        }
    }

    public static EnumLiteMap b() {
        return u.k;
    }

    public static EnumVerifier c() {
        return b.a;
    }

    @Deprecated
    public static u d(int v) {
        return u.a(v);
    }

    @Override  // com.google.protobuf.Internal$EnumLite
    public final int getNumber() {
        if(this == u.f) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

