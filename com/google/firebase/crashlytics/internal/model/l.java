package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class l extends d {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.b {
        private long a;
        private String b;
        private com.google.firebase.crashlytics.internal.model.F.f.d.a c;
        private c d;
        private com.google.firebase.crashlytics.internal.model.F.f.d.d e;
        private f f;
        private byte g;

        b() {
        }

        private b(d f$f$d0) {
            this.a = f$f$d0.f();
            this.b = f$f$d0.g();
            this.c = f$f$d0.b();
            this.d = f$f$d0.c();
            this.e = f$f$d0.d();
            this.f = f$f$d0.e();
            this.g = 1;
        }

        b(d f$f$d0, a l$a0) {
            this(f$f$d0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$b
        public d a() {
            if(this.g == 1) {
                String s = this.b;
                if(s != null) {
                    com.google.firebase.crashlytics.internal.model.F.f.d.a f$f$d$a0 = this.c;
                    if(f$f$d$a0 != null) {
                        c f$f$d$c0 = this.d;
                        if(f$f$d$c0 != null) {
                            return new l(this.a, s, f$f$d$a0, f$f$d$c0, this.e, this.f, null);
                        }
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if((1 & this.g) == 0) {
                stringBuilder0.append(" timestamp");
            }
            if(this.b == null) {
                stringBuilder0.append(" type");
            }
            if(this.c == null) {
                stringBuilder0.append(" app");
            }
            if(this.d == null) {
                stringBuilder0.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.b b(com.google.firebase.crashlytics.internal.model.F.f.d.a f$f$d$a0) {
            if(f$f$d$a0 == null) {
                throw new NullPointerException("Null app");
            }
            this.c = f$f$d$a0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.b c(c f$f$d$c0) {
            if(f$f$d$c0 == null) {
                throw new NullPointerException("Null device");
            }
            this.d = f$f$d$c0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.b d(com.google.firebase.crashlytics.internal.model.F.f.d.d f$f$d$d0) {
            this.e = f$f$d$d0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.b e(f f$f$d$f0) {
            this.f = f$f$d$f0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.b f(long v) {
            this.a = v;
            this.g = (byte)(this.g | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.b g(String s) {
            if(s == null) {
                throw new NullPointerException("Null type");
            }
            this.b = s;
            return this;
        }
    }

    private final long a;
    private final String b;
    private final com.google.firebase.crashlytics.internal.model.F.f.d.a c;
    private final c d;
    private final com.google.firebase.crashlytics.internal.model.F.f.d.d e;
    private final f f;

    private l(long v, String s, com.google.firebase.crashlytics.internal.model.F.f.d.a f$f$d$a0, c f$f$d$c0, @Nullable com.google.firebase.crashlytics.internal.model.F.f.d.d f$f$d$d0, @Nullable f f$f$d$f0) {
        this.a = v;
        this.b = s;
        this.c = f$f$d$a0;
        this.d = f$f$d$c0;
        this.e = f$f$d$d0;
        this.f = f$f$d$f0;
    }

    l(long v, String s, com.google.firebase.crashlytics.internal.model.F.f.d.a f$f$d$a0, c f$f$d$c0, com.google.firebase.crashlytics.internal.model.F.f.d.d f$f$d$d0, f f$f$d$f0, a l$a0) {
        this(v, s, f$f$d$a0, f$f$d$c0, f$f$d$d0, f$f$d$f0);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d
    @NonNull
    public com.google.firebase.crashlytics.internal.model.F.f.d.a b() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d
    @NonNull
    public c c() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d
    @Nullable
    public com.google.firebase.crashlytics.internal.model.F.f.d.d d() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d
    @Nullable
    public f e() {
        return this.f;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            long v = ((d)object0).f();
            if(this.a == v) {
                String s = ((d)object0).g();
                if(this.b.equals(s)) {
                    com.google.firebase.crashlytics.internal.model.F.f.d.a f$f$d$a0 = ((d)object0).b();
                    if(this.c.equals(f$f$d$a0)) {
                        c f$f$d$c0 = ((d)object0).c();
                        if(this.d.equals(f$f$d$c0)) {
                            com.google.firebase.crashlytics.internal.model.F.f.d.d f$f$d$d0 = this.e;
                            if(f$f$d$d0 == null) {
                                if(((d)object0).d() == null) {
                                    return this.f == null ? ((d)object0).e() == null : this.f.equals(((d)object0).e());
                                }
                            }
                            else if(f$f$d$d0.equals(((d)object0).d())) {
                                return this.f == null ? ((d)object0).e() == null : this.f.equals(((d)object0).e());
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d
    public long f() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d
    @NonNull
    public String g() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d
    public com.google.firebase.crashlytics.internal.model.F.f.d.b h() {
        return new b(this, null);
    }

    @Override
    public int hashCode() {
        int v = ((((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003;
        int v1 = 0;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        f f$f$d$f0 = this.f;
        if(f$f$d$f0 != null) {
            v1 = f$f$d$f0.hashCode();
        }
        return (v ^ v2) * 1000003 ^ v1;
    }

    @Override
    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}

