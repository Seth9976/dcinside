package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

final class q extends d {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d.a {
        private String a;
        private String b;
        private long c;
        private byte d;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$d$a
        public d a() {
            if(this.d == 1) {
                String s = this.a;
                if(s != null) {
                    String s1 = this.b;
                    if(s1 != null) {
                        return new q(s, s1, this.c, null);
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" name");
            }
            if(this.b == null) {
                stringBuilder0.append(" code");
            }
            if((1 & this.d) == 0) {
                stringBuilder0.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$d$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d.a b(long v) {
            this.c = v;
            this.d = (byte)(this.d | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$d$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null code");
            }
            this.b = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$d$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d.a d(String s) {
            if(s == null) {
                throw new NullPointerException("Null name");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final long c;

    private q(String s, String s1, long v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    q(String s, String s1, long v, a q$a0) {
        this(s, s1, v);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$d
    @NonNull
    public long b() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$d
    @NonNull
    public String c() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$d
    @NonNull
    public String d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            String s = ((d)object0).d();
            if(this.a.equals(s)) {
                String s1 = ((d)object0).c();
                if(this.b.equals(s1)) {
                    long v = ((d)object0).b();
                    return this.c == v;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20));
    }

    @Override
    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }
}

