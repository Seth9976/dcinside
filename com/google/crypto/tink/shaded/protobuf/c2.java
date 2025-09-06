package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

public final class c2 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.g.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.h.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.i.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.j.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.n.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.o.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.q.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.r.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.s.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.t.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.k.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.l.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.m.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.p.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static class b extends Enum {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.crypto.tink.shaded.protobuf.c2.b.a extends b {
            com.google.crypto.tink.shaded.protobuf.c2.b.a(String s, int v, c c2$c0, int v1) {
                super(s, v, c2$c0, v1, null);
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.c2$b
            public boolean c() {
                return false;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.crypto.tink.shaded.protobuf.c2.b.b extends b {
            com.google.crypto.tink.shaded.protobuf.c2.b.b(String s, int v, c c2$c0, int v1) {
                super(s, v, c2$c0, v1, null);
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.c2$b
            public boolean c() {
                return false;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.crypto.tink.shaded.protobuf.c2.b.c extends b {
            com.google.crypto.tink.shaded.protobuf.c2.b.c(String s, int v, c c2$c0, int v1) {
                super(s, v, c2$c0, v1, null);
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.c2$b
            public boolean c() {
                return false;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class d extends b {
            d(String s, int v, c c2$c0, int v1) {
                super(s, v, c2$c0, v1, null);
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.c2$b
            public boolean c() {
                return false;
            }
        }

        private final c a;
        private final int b;
        public static final enum b c;
        public static final enum b d;
        public static final enum b e;
        public static final enum b f;
        public static final enum b g;
        public static final enum b h;
        public static final enum b i;
        public static final enum b j;
        public static final enum b k;
        public static final enum b l;
        public static final enum b m;
        public static final enum b n;
        public static final enum b o;
        public static final enum b p;
        public static final enum b q;
        public static final enum b r;
        public static final enum b s;
        public static final enum b t;
        private static final b[] u;

        static {
            b.c = new b("DOUBLE", 0, c.e, 1);
            b.d = new b("FLOAT", 1, c.d, 5);
            b.e = new b("INT64", 2, c.c, 0);
            b.f = new b("UINT64", 3, c.c, 0);
            b.g = new b("INT32", 4, c.b, 0);
            b.h = new b("FIXED64", 5, c.c, 1);
            b.i = new b("FIXED32", 6, c.b, 5);
            b.j = new b("BOOL", 7, c.f, 0);
            com.google.crypto.tink.shaded.protobuf.c2.b.a c2$b$a0 = new com.google.crypto.tink.shaded.protobuf.c2.b.a("STRING", 8, c.g, 2);
            b.k = c2$b$a0;
            com.google.crypto.tink.shaded.protobuf.c2.b.b c2$b$b0 = new com.google.crypto.tink.shaded.protobuf.c2.b.b("GROUP", 9, c.j, 3);
            b.l = c2$b$b0;
            com.google.crypto.tink.shaded.protobuf.c2.b.c c2$b$c0 = new com.google.crypto.tink.shaded.protobuf.c2.b.c("MESSAGE", 10, c.j, 2);
            b.m = c2$b$c0;
            d c2$b$d0 = new d("BYTES", 11, c.h, 2);
            b.n = c2$b$d0;
            b.o = new b("UINT32", 12, c.b, 0);
            b.p = new b("ENUM", 13, c.i, 0);
            b.q = new b("SFIXED32", 14, c.b, 5);
            b.r = new b("SFIXED64", 15, c.c, 1);
            b.s = new b("SINT32", 16, c.b, 0);
            b.t = new b("SINT64", 17, c.c, 0);
            b.u = new b[]{b.c, b.d, b.e, b.f, b.g, b.h, b.i, b.j, c2$b$a0, c2$b$b0, c2$b$c0, c2$b$d0, b.o, b.p, b.q, b.r, b.s, b.t};
        }

        private b(String s, int v, c c2$c0, int v1) {
            super(s, v);
            this.a = c2$c0;
            this.b = v1;
        }

        b(String s, int v, c c2$c0, int v1, a c2$a0) {
            this(s, v, c2$c0, v1);
        }

        public c a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public boolean c() {
            return true;
        }

        public static b valueOf(String s) {
            return (b)Enum.valueOf(b.class, s);
        }

        public static b[] values() {
            return (b[])b.u.clone();
        }
    }

    public static enum c {
        INT(0),
        LONG(0L),
        FLOAT(0.0f),
        DOUBLE(0.0),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(u.e),
        ENUM(null),
        MESSAGE(null);

        private final Object a;

        private c(Object object0) {
            this.a = object0;
        }

        Object a() {
            return this.a;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    static abstract class com.google.crypto.tink.shaded.protobuf.c2.d extends Enum {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.crypto.tink.shaded.protobuf.c2.d.a extends com.google.crypto.tink.shaded.protobuf.c2.d {
            com.google.crypto.tink.shaded.protobuf.c2.d.a(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.c2$d
            Object a(z z0) throws IOException {
                return z0.X();
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.crypto.tink.shaded.protobuf.c2.d.b extends com.google.crypto.tink.shaded.protobuf.c2.d {
            com.google.crypto.tink.shaded.protobuf.c2.d.b(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.c2$d
            Object a(z z0) throws IOException {
                return z0.Y();
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.crypto.tink.shaded.protobuf.c2.d.c extends com.google.crypto.tink.shaded.protobuf.c2.d {
            com.google.crypto.tink.shaded.protobuf.c2.d.c(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.c2$d
            Object a(z z0) throws IOException {
                return z0.y();
            }
        }

        public static final enum com.google.crypto.tink.shaded.protobuf.c2.d a;
        public static final enum com.google.crypto.tink.shaded.protobuf.c2.d b;
        public static final enum com.google.crypto.tink.shaded.protobuf.c2.d c;
        private static final com.google.crypto.tink.shaded.protobuf.c2.d[] d;

        static {
            com.google.crypto.tink.shaded.protobuf.c2.d.a c2$d$a0 = new com.google.crypto.tink.shaded.protobuf.c2.d.a("LOOSE", 0);
            com.google.crypto.tink.shaded.protobuf.c2.d.a = c2$d$a0;
            com.google.crypto.tink.shaded.protobuf.c2.d.b c2$d$b0 = new com.google.crypto.tink.shaded.protobuf.c2.d.b("STRICT", 1);
            com.google.crypto.tink.shaded.protobuf.c2.d.b = c2$d$b0;
            com.google.crypto.tink.shaded.protobuf.c2.d.c c2$d$c0 = new com.google.crypto.tink.shaded.protobuf.c2.d.c("LAZY", 2);
            com.google.crypto.tink.shaded.protobuf.c2.d.c = c2$d$c0;
            com.google.crypto.tink.shaded.protobuf.c2.d.d = new com.google.crypto.tink.shaded.protobuf.c2.d[]{c2$d$a0, c2$d$b0, c2$d$c0};
        }

        private com.google.crypto.tink.shaded.protobuf.c2.d(String s, int v) {
            super(s, v);
        }

        com.google.crypto.tink.shaded.protobuf.c2.d(String s, int v, a c2$a0) {
            this(s, v);
        }

        abstract Object a(z arg1) throws IOException;

        public static com.google.crypto.tink.shaded.protobuf.c2.d valueOf(String s) {
            return (com.google.crypto.tink.shaded.protobuf.c2.d)Enum.valueOf(com.google.crypto.tink.shaded.protobuf.c2.d.class, s);
        }

        public static com.google.crypto.tink.shaded.protobuf.c2.d[] values() {
            return (com.google.crypto.tink.shaded.protobuf.c2.d[])com.google.crypto.tink.shaded.protobuf.c2.d.d.clone();
        }
    }

    static final int a = 4;
    static final int b = 8;
    static final int c = 5;
    static final int d = 10;
    static final int e = 10;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    static final int l = 3;
    static final int m = 7;
    static final int n = 1;
    static final int o = 2;
    static final int p = 3;
    static final int q;
    static final int r;
    static final int s;
    static final int t;

    static {
        c2.q = 11;
        c2.r = 12;
        c2.s = 16;
        c2.t = 26;
    }

    public static int a(int v) [...] // Inlined contents

    public static int b(int v) [...] // Inlined contents

    static int c(int v, int v1) [...] // Inlined contents

    static Object d(z z0, b c2$b0, com.google.crypto.tink.shaded.protobuf.c2.d c2$d0) throws IOException {
        switch(c2$b0) {
            case 1: {
                return z0.z();
            }
            case 2: {
                return z0.D();
            }
            case 3: {
                return z0.H();
            }
            case 4: {
                return z0.b0();
            }
            case 5: {
                return z0.G();
            }
            case 6: {
                return z0.C();
            }
            case 7: {
                return z0.B();
            }
            case 8: {
                return Boolean.valueOf(z0.v());
            }
            case 9: {
                return z0.y();
            }
            case 10: {
                return z0.a0();
            }
            case 11: {
                return z0.T();
            }
            case 12: {
                return z0.U();
            }
            case 13: {
                return z0.V();
            }
            case 14: {
                return z0.W();
            }
            case 15: {
                return c2$d0.a(z0);
            }
            case 16: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            }
            case 17: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            }
            case 18: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }
}

