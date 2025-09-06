package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class o extends a {
    static class com.google.firebase.crashlytics.internal.model.o.a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a.a {
        private long a;
        private long b;
        private String c;
        private String d;
        private byte e;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$a$a
        public a a() {
            if(this.e == 3) {
                String s = this.c;
                if(s != null) {
                    return new o(this.a, this.b, s, this.d, null);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.e & 1) == 0) {
                stringBuilder0.append(" baseAddress");
            }
            if((this.e & 2) == 0) {
                stringBuilder0.append(" size");
            }
            if(this.c == null) {
                stringBuilder0.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a.a b(long v) {
            this.a = v;
            this.e = (byte)(this.e | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null name");
            }
            this.c = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a.a d(long v) {
            this.b = v;
            this.e = (byte)(this.e | 2);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a.a e(@Nullable String s) {
            this.d = s;
            return this;
        }
    }

    private final long a;
    private final long b;
    private final String c;
    private final String d;

    private o(long v, long v1, String s, @Nullable String s1) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
    }

    o(long v, long v1, String s, String s1, com.google.firebase.crashlytics.internal.model.o.a o$a0) {
        this(v, v1, s, s1);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$a
    @NonNull
    public long b() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$a
    @NonNull
    public String c() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$a
    public long d() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$a
    @Nullable
    @c2.a.b
    public String e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            long v = ((a)object0).b();
            if(this.a == v) {
                long v1 = ((a)object0).d();
                if(this.b == v1) {
                    String s = ((a)object0).c();
                    if(this.c.equals(s)) {
                        return this.d == null ? ((a)object0).e() == null : this.d.equals(((a)object0).e());
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = (((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003 ^ this.c.hashCode()) * 1000003;
        return this.d == null ? v : this.d.hashCode() ^ v;
    }

    @Override
    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }
}

