package com.kakao.adfit.n;

import kotlin.jvm.internal.L;

public final class d {
    public static final class a {
        private int a;
        private int b;
        private int c;
        private String d;

        public final a a(int v) {
            this.c = v;
            return this;
        }

        public final a a(String s) {
            this.d = s;
            return this;
        }

        public final d a() {
            return new d(this.a, this.b, this.c, this.d);
        }

        public final a b(int v) {
            this.b = v;
            return this;
        }

        public final a c(int v) {
            this.a = v;
            return this;
        }
    }

    private final int a;
    private final int b;
    private final int c;
    private final String d;

    public d(int v, int v1, int v2, String s) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(this.a != ((d)object0).a) {
            return false;
        }
        if(this.b != ((d)object0).b) {
            return false;
        }
        return this.c == ((d)object0).c ? L.g(this.d, ((d)object0).d) : false;
    }

    @Override
    public int hashCode() {
        int v = ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F;
        return this.d == null ? v : v + this.d.hashCode();
    }

    @Override
    public String toString() {
        return "VastMediaFile(width=" + this.a + ", height=" + this.b + ", bitrate=" + this.c + ", url=" + this.d + ')';
    }
}

