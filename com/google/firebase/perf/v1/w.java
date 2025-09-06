package com.google.firebase.perf.v1;

import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;

public enum w implements EnumLite {
    class a implements EnumLiteMap {
        a() {
            super();
        }

        public w a(int v) {
            return w.b(v);
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
            return w.b(v) != null;
        }
    }

    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    private final int a;
    public static final int d = 0;
    public static final int e = 1;
    private static final EnumLiteMap f;

    static {
        w.f = new a();
    }

    private w(int v1) {
        this.a = v1;
    }

    private static w[] a() [...] // Inlined contents

    public static w b(int v) {
        switch(v) {
            case 0: {
                return w.b;
            }
            case 1: {
                return w.c;
            }
            default: {
                return null;
            }
        }
    }

    public static EnumLiteMap c() {
        return w.f;
    }

    public static EnumVerifier d() {
        return b.a;
    }

    @Deprecated
    public static w e(int v) {
        return w.b(v);
    }

    @Override  // com.google.protobuf.Internal$EnumLite
    public final int getNumber() {
        return this.a;
    }
}

