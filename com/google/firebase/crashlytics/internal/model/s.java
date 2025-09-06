package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class s extends b {
    static class a {
    }

    static final class com.google.firebase.crashlytics.internal.model.s.b extends com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.a {
        private long a;
        private String b;
        private String c;
        private long d;
        private int e;
        private byte f;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b$a
        public b a() {
            if(this.f == 7) {
                String s = this.b;
                if(s != null) {
                    return new s(this.a, s, this.c, this.d, this.e, null);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.f & 1) == 0) {
                stringBuilder0.append(" pc");
            }
            if(this.b == null) {
                stringBuilder0.append(" symbol");
            }
            if((this.f & 2) == 0) {
                stringBuilder0.append(" offset");
            }
            if((this.f & 4) == 0) {
                stringBuilder0.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.a b(String s) {
            this.c = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.a c(int v) {
            this.e = v;
            this.f = (byte)(this.f | 4);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.a d(long v) {
            this.d = v;
            this.f = (byte)(this.f | 2);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.a e(long v) {
            this.a = v;
            this.f = (byte)(this.f | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.a f(String s) {
            if(s == null) {
                throw new NullPointerException("Null symbol");
            }
            this.b = s;
            return this;
        }
    }

    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;

    private s(long v, String s, @Nullable String s1, long v1, int v2) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = v1;
        this.e = v2;
    }

    s(long v, String s, String s1, long v1, int v2, a s$a0) {
        this(v, s, s1, v1, v2);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b
    @Nullable
    public String b() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b
    public int c() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b
    public long d() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b
    public long e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof b) {
            long v = ((b)object0).e();
            if(this.a == v) {
                String s = ((b)object0).f();
                if(this.b.equals(s)) {
                    String s1 = this.c;
                    if(s1 != null) {
                        if(s1.equals(((b)object0).b())) {
                        label_12:
                            long v1 = ((b)object0).d();
                            if(this.d == v1) {
                                int v2 = ((b)object0).c();
                                return this.e == v2;
                            }
                        }
                    }
                    else if(((b)object0).b() == null) {
                        goto label_12;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$b
    @NonNull
    public String f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
        return this.c == null ? this.e ^ (v * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003 : this.e ^ ((v ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d >>> 0x20 ^ this.d))) * 1000003;
    }

    @Override
    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.d + ", importance=" + this.e + "}";
    }
}

