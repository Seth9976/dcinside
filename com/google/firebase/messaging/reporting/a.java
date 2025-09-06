package com.google.firebase.messaging.reporting;

public final class a {
    public static final class com.google.firebase.messaging.reporting.a.a {
        private long a;
        private String b;
        private String c;
        private c d;
        private d e;
        private String f;
        private String g;
        private int h;
        private int i;
        private String j;
        private long k;
        private b l;
        private String m;
        private long n;
        private String o;

        com.google.firebase.messaging.reporting.a.a() {
            this.a = 0L;
            this.b = "";
            this.c = "";
            this.d = c.b;
            this.e = d.b;
            this.f = "";
            this.g = "";
            this.h = 0;
            this.i = 0;
            this.j = "";
            this.k = 0L;
            this.l = b.b;
            this.m = "";
            this.n = 0L;
            this.o = "";
        }

        public a a() {
            return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }

        public com.google.firebase.messaging.reporting.a.a b(String s) {
            this.m = s;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a c(long v) {
            this.k = v;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a d(long v) {
            this.n = v;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a e(String s) {
            this.g = s;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a f(String s) {
            this.o = s;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a g(b a$b0) {
            this.l = a$b0;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a h(String s) {
            this.c = s;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a i(String s) {
            this.b = s;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a j(c a$c0) {
            this.d = a$c0;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a k(String s) {
            this.f = s;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a l(int v) {
            this.h = v;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a m(long v) {
            this.a = v;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a n(d a$d0) {
            this.e = a$d0;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a o(String s) {
            this.j = s;
            return this;
        }

        public com.google.firebase.messaging.reporting.a.a p(int v) {
            this.i = v;
            return this;
        }
    }

    public static enum b implements com.google.firebase.encoders.proto.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int a;

        private b(int v1) {
            this.a = v1;
        }

        private static b[] a() [...] // Inlined contents

        @Override  // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.a;
        }
    }

    public static enum c implements com.google.firebase.encoders.proto.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int a;

        private c(int v1) {
            this.a = v1;
        }

        private static c[] a() [...] // Inlined contents

        @Override  // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.a;
        }
    }

    public static enum d implements com.google.firebase.encoders.proto.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int a;

        private d(int v1) {
            this.a = v1;
        }

        private static d[] a() [...] // Inlined contents

        @Override  // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.a;
        }
    }

    private final long a;
    private final String b;
    private final String c;
    private final c d;
    private final d e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;
    private final String j;
    private final long k;
    private final b l;
    private final String m;
    private final long n;
    private final String o;
    private static final a p;

    static {
        a.p = new com.google.firebase.messaging.reporting.a.a().a();
    }

    a(long v, String s, String s1, c a$c0, d a$d0, String s2, String s3, int v1, int v2, String s4, long v3, b a$b0, String s5, long v4, String s6) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = a$c0;
        this.e = a$d0;
        this.f = s2;
        this.g = s3;
        this.h = v1;
        this.i = v2;
        this.j = s4;
        this.k = v3;
        this.l = a$b0;
        this.m = s5;
        this.n = v4;
        this.o = s6;
    }

    @com.google.firebase.encoders.proto.d(tag = 13)
    public String a() {
        return this.m;
    }

    @com.google.firebase.encoders.proto.d(tag = 11)
    public long b() {
        return this.k;
    }

    @com.google.firebase.encoders.proto.d(tag = 14)
    public long c() {
        return this.n;
    }

    @com.google.firebase.encoders.proto.d(tag = 7)
    public String d() {
        return this.g;
    }

    @com.google.firebase.encoders.proto.d(tag = 15)
    public String e() {
        return this.o;
    }

    public static a f() {
        return a.p;
    }

    @com.google.firebase.encoders.proto.d(tag = 12)
    public b g() {
        return this.l;
    }

    @com.google.firebase.encoders.proto.d(tag = 3)
    public String h() {
        return this.c;
    }

    @com.google.firebase.encoders.proto.d(tag = 2)
    public String i() {
        return this.b;
    }

    @com.google.firebase.encoders.proto.d(tag = 4)
    public c j() {
        return this.d;
    }

    @com.google.firebase.encoders.proto.d(tag = 6)
    public String k() {
        return this.f;
    }

    @com.google.firebase.encoders.proto.d(tag = 8)
    public int l() {
        return this.h;
    }

    @com.google.firebase.encoders.proto.d(tag = 1)
    public long m() {
        return this.a;
    }

    @com.google.firebase.encoders.proto.d(tag = 5)
    public d n() {
        return this.e;
    }

    @com.google.firebase.encoders.proto.d(tag = 10)
    public String o() {
        return this.j;
    }

    @com.google.firebase.encoders.proto.d(tag = 9)
    public int p() {
        return this.i;
    }

    public static com.google.firebase.messaging.reporting.a.a q() {
        return new com.google.firebase.messaging.reporting.a.a();
    }
}

