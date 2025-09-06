package com.google.rpc;

import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;

public enum c implements EnumLite {
    class a implements EnumLiteMap {
        a() {
            super();
        }

        public c a(int v) {
            return c.a(v);
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
            return c.a(v) != null;
        }
    }

    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);

    public static final int A = 7;
    public static final int B = 16;
    public static final int C = 8;
    public static final int D = 9;
    public static final int E = 10;
    public static final int F = 11;
    public static final int G = 12;
    public static final int H = 13;
    public static final int I = 14;
    public static final int J = 15;
    private static final EnumLiteMap K = null;
    private final int a;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    public static final int y = 5;
    public static final int z = 6;

    static {
        c.K = new a();
    }

    private c(int v1) {
        this.a = v1;
    }

    public static c a(int v) {
        switch(v) {
            case 0: {
                return c.b;
            }
            case 1: {
                return c.c;
            }
            case 2: {
                return c.d;
            }
            case 3: {
                return c.e;
            }
            case 4: {
                return c.f;
            }
            case 5: {
                return c.g;
            }
            case 6: {
                return c.h;
            }
            case 7: {
                return c.i;
            }
            case 8: {
                return c.k;
            }
            case 9: {
                return c.l;
            }
            case 10: {
                return c.m;
            }
            case 11: {
                return c.n;
            }
            case 12: {
                return c.o;
            }
            case 13: {
                return c.p;
            }
            case 14: {
                return c.q;
            }
            case 15: {
                return c.r;
            }
            case 16: {
                return c.j;
            }
            default: {
                return null;
            }
        }
    }

    public static EnumLiteMap b() {
        return c.K;
    }

    public static EnumVerifier c() {
        return b.a;
    }

    @Deprecated
    public static c d(int v) {
        return c.a(v);
    }

    @Override  // com.google.protobuf.Internal$EnumLite
    public final int getNumber() {
        if(this == c.s) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

