package com.kakao.adfit.n;

import kotlin.R0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.y;

public final class a {
    public static final class com.kakao.adfit.n.a.a {
        private com.kakao.adfit.n.a.a() {
        }

        public com.kakao.adfit.n.a.a(w w0) {
        }

        private final Void a() {
            throw new R0("property \"duration\" has not been initialized");
        }
    }

    public static final class b implements d {
        private final int a;
        private int b;
        private float c;
        private boolean d;

        public b(int v) {
            this.a = v;
        }

        @Override  // com.kakao.adfit.n.a$d
        public int a() {
            return this.a;
        }

        @Override  // com.kakao.adfit.n.a$d
        public void a(int v) {
            this.b = v;
            this.c = ((float)(this.a() * 100)) / ((float)v);
            this.d = true;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof b ? this.a == ((b)object0).a : false;
        }

        @Override
        public int hashCode() {
            return this.a;
        }

        @Override
        public String toString() {
            return "MillisTimeOffset(millis=" + this.a + ')';
        }
    }

    public static final class c implements d {
        private final float a;
        private int b;
        private int c;
        private boolean d;

        public c(float f) {
            this.a = f;
        }

        @Override  // com.kakao.adfit.n.a$d
        public int a() {
            Integer integer0 = this.d ? this.c : null;
            if(integer0 != null) {
                return (int)integer0;
            }
            a.c.a();
            throw new y();
        }

        @Override  // com.kakao.adfit.n.a$d
        public void a(int v) {
            this.b = v;
            this.c = (int)(((double)(((float)v) * this.b())) / 100.0);
            this.d = true;
        }

        public float b() {
            return this.a;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof c ? Float.compare(this.a, ((c)object0).a) == 0 : false;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        @Override
        public String toString() {
            return "PercentageTimeOffset(percentage=" + this.a + ')';
        }
    }

    public interface d {
        int a();

        void a(int arg1);
    }

    private final d a;
    private final String b;
    public static final com.kakao.adfit.n.a.a c;

    static {
        a.c = new com.kakao.adfit.n.a.a(null);
    }

    public a(float f, String s) {
        L.p(s, "url");
        this(new c(f), s);
    }

    public a(int v, String s) {
        L.p(s, "url");
        this(new b(v), s);
    }

    public a(d a$d0, String s) {
        L.p(a$d0, "offset");
        L.p(s, "url");
        super();
        this.a = a$d0;
        this.b = s;
    }

    public final d a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return L.g(this.a, ((a)object0).a) ? L.g(this.b, ((a)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public String toString() {
        return "ProgressTracking(offset=" + this.a + ", url=" + this.b + ')';
    }
}

