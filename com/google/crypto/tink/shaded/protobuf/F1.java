package com.google.crypto.tink.shaded.protobuf;

public enum f1 implements c {
    class a implements d {
        a() {
            super();
        }

        public f1 a(int v) {
            return f1.a(v);
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
            return f1.a(v) != null;
        }
    }

    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int d;
    private static final d e;

    static {
        f1.e = new a();
    }

    private f1(int v1) {
        this.a = v1;
    }

    public static f1 a(int v) {
        return v == 0 ? f1.b : null;
    }

    public static d b() {
        return f1.e;
    }

    public static e c() {
        return b.a;
    }

    @Deprecated
    public static f1 d(int v) {
        return f1.a(v);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.t0$c
    public final int getNumber() {
        if(this == f1.c) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

