package com.google.firebase.perf.v1;

import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;

public enum g implements EnumLite {
    class a implements EnumLiteMap {
        a() {
            super();
        }

        public g a(int v) {
            return g.b(v);
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
            return g.b(v) != null;
        }
    }

    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    private final int a;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    private static final EnumLiteMap j;

    static {
        g.j = new a();
    }

    private g(int v1) {
        this.a = v1;
    }

    private static g[] a() [...] // Inlined contents

    public static g b(int v) {
        switch(v) {
            case 0: {
                return g.b;
            }
            case 1: {
                return g.c;
            }
            case 2: {
                return g.d;
            }
            case 3: {
                return g.e;
            }
            default: {
                return null;
            }
        }
    }

    public static EnumLiteMap c() {
        return g.j;
    }

    public static EnumVerifier d() {
        return b.a;
    }

    @Deprecated
    public static g e(int v) {
        return g.b(v);
    }

    @Override  // com.google.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.a;
    }
}

