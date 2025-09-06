package com.google.logging.type;

import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;

public enum d implements EnumLite {
    class a implements EnumLiteMap {
        a() {
            super();
        }

        public d a(int v) {
            return d.a(v);
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
            return d.a(v) != null;
        }
    }

    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(700),
    EMERGENCY(800),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int l = 0;
    public static final int m = 100;
    public static final int n = 200;
    public static final int o = 300;
    public static final int p = 400;
    public static final int q = 500;
    public static final int r = 600;
    public static final int s = 700;
    public static final int t = 800;
    private static final EnumLiteMap u;

    static {
        d.u = new a();
    }

    private d(int v1) {
        this.a = v1;
    }

    public static d a(int v) {
        switch(v) {
            case 0: {
                return d.b;
            }
            case 100: {
                return d.c;
            }
            case 200: {
                return d.d;
            }
            case 300: {
                return d.e;
            }
            case 400: {
                return d.f;
            }
            case 500: {
                return d.g;
            }
            case 600: {
                return d.h;
            }
            case 700: {
                return d.i;
            }
            case 800: {
                return d.j;
            }
            default: {
                return null;
            }
        }
    }

    public static EnumLiteMap b() {
        return d.u;
    }

    public static EnumVerifier c() {
        return b.a;
    }

    @Deprecated
    public static d d(int v) {
        return d.a(v);
    }

    @Override  // com.google.protobuf.Internal$EnumLite
    public final int getNumber() {
        if(this == d.k) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

