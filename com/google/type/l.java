package com.google.type;

import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;

public enum l implements EnumLite {
    class a implements EnumLiteMap {
        a() {
            super();
        }

        public l a(int v) {
            return l.a(v);
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
            return l.a(v) != null;
        }
    }

    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
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
        l.s = new a();
    }

    private l(int v1) {
        this.a = v1;
    }

    public static l a(int v) {
        switch(v) {
            case 0: {
                return l.b;
            }
            case 1: {
                return l.c;
            }
            case 2: {
                return l.d;
            }
            case 3: {
                return l.e;
            }
            case 4: {
                return l.f;
            }
            case 5: {
                return l.g;
            }
            case 6: {
                return l.h;
            }
            case 7: {
                return l.i;
            }
            default: {
                return null;
            }
        }
    }

    public static EnumLiteMap b() {
        return l.s;
    }

    public static EnumVerifier c() {
        return b.a;
    }

    @Deprecated
    public static l d(int v) {
        return l.a(v);
    }

    @Override  // com.google.protobuf.Internal$EnumLite
    public final int getNumber() {
        if(this == l.j) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

