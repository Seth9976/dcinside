package com.google.type;

import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;

public enum a implements EnumLite {
    class com.google.type.a.a implements EnumLiteMap {
        com.google.type.a.a() {
            super();
        }

        public a a(int v) {
            return a.a(v);
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
            return a.a(v) != null;
        }
    }

    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 3;
    public static final int o = 4;
    public static final int p = 5;
    public static final int q = 6;
    public static final int r = 7;
    private static final EnumLiteMap s;

    static {
        a.s = new com.google.type.a.a();
    }

    private a(int v1) {
        this.a = v1;
    }

    public static a a(int v) {
        switch(v) {
            case 0: {
                return a.b;
            }
            case 1: {
                return a.c;
            }
            case 2: {
                return a.d;
            }
            case 3: {
                return a.e;
            }
            case 4: {
                return a.f;
            }
            case 5: {
                return a.g;
            }
            case 6: {
                return a.h;
            }
            case 7: {
                return a.i;
            }
            default: {
                return null;
            }
        }
    }

    public static EnumLiteMap b() {
        return a.s;
    }

    public static EnumVerifier c() {
        return b.a;
    }

    @Deprecated
    public static a d(int v) {
        return a.a(v);
    }

    @Override  // com.google.protobuf.Internal$EnumLite
    public final int getNumber() {
        if(this == a.j) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

