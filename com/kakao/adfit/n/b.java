package com.kakao.adfit.n;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class b {
    public static final class a {
        private String a;
        private String b;
        private String c;

        public final a a(String s) {
            this.a = s;
            return this;
        }

        public final b a() {
            return new b(this.a, this.b, this.c);
        }

        public final a b(String s) {
            this.b = s;
            return this;
        }

        public final a c(String s) {
            this.c = s;
            return this;
        }
    }

    public static final class com.kakao.adfit.n.b.b {
        private com.kakao.adfit.n.b.b() {
        }

        public com.kakao.adfit.n.b.b(w w0) {
        }
    }

    private final String a;
    private final String b;
    private final String c;
    public static final com.kakao.adfit.n.b.b d;

    static {
        b.d = new com.kakao.adfit.n.b.b(null);
    }

    public b(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(!L.g(this.a, ((b)object0).a)) {
            return false;
        }
        return L.g(this.b, ((b)object0).b) ? L.g(this.c, ((b)object0).c) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "Tracking(event=" + this.a + ", offset=" + this.b + ", url=" + this.c + ')';
    }
}

