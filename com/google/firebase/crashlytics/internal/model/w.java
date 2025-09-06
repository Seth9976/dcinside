package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

final class w extends e {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.e.a {
        private com.google.firebase.crashlytics.internal.model.F.f.d.e.b a;
        private String b;
        private String c;
        private long d;
        private byte e;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e$a
        public e a() {
            if(this.e == 1) {
                com.google.firebase.crashlytics.internal.model.F.f.d.e.b f$f$d$e$b0 = this.a;
                if(f$f$d$e$b0 != null) {
                    String s = this.b;
                    if(s != null) {
                        String s1 = this.c;
                        if(s1 != null) {
                            return new w(f$f$d$e$b0, s, s1, this.d, null);
                        }
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" rolloutVariant");
            }
            if(this.b == null) {
                stringBuilder0.append(" parameterKey");
            }
            if(this.c == null) {
                stringBuilder0.append(" parameterValue");
            }
            if((1 & this.e) == 0) {
                stringBuilder0.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.e.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.b = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.e.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.c = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.e.a d(com.google.firebase.crashlytics.internal.model.F.f.d.e.b f$f$d$e$b0) {
            if(f$f$d$e$b0 == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.a = f$f$d$e$b0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.e.a e(long v) {
            this.d = v;
            this.e = (byte)(this.e | 1);
            return this;
        }
    }

    private final com.google.firebase.crashlytics.internal.model.F.f.d.e.b a;
    private final String b;
    private final String c;
    private final long d;

    private w(com.google.firebase.crashlytics.internal.model.F.f.d.e.b f$f$d$e$b0, String s, String s1, long v) {
        this.a = f$f$d$e$b0;
        this.b = s;
        this.c = s1;
        this.d = v;
    }

    w(com.google.firebase.crashlytics.internal.model.F.f.d.e.b f$f$d$e$b0, String s, String s1, long v, a w$a0) {
        this(f$f$d$e$b0, s, s1, v);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e
    @NonNull
    public String b() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e
    @NonNull
    public String c() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e
    @NonNull
    public com.google.firebase.crashlytics.internal.model.F.f.d.e.b d() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e
    @NonNull
    public long e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof e) {
            com.google.firebase.crashlytics.internal.model.F.f.d.e.b f$f$d$e$b0 = ((e)object0).d();
            if(this.a.equals(f$f$d$e$b0)) {
                String s = ((e)object0).b();
                if(this.b.equals(s)) {
                    String s1 = ((e)object0).c();
                    if(this.c.equals(s1)) {
                        long v = ((e)object0).e();
                        return this.d == v;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20));
    }

    @Override
    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.a + ", parameterKey=" + this.b + ", parameterValue=" + this.c + ", templateVersion=" + this.d + "}";
    }
}

