package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class a extends d {
    static class com.google.firebase.installations.local.a.a {
    }

    static final class b extends com.google.firebase.installations.local.d.a {
        private String a;
        private com.google.firebase.installations.local.c.a b;
        private String c;
        private String d;
        private Long e;
        private Long f;
        private String g;

        b() {
        }

        private b(d d0) {
            this.a = d0.d();
            this.b = d0.g();
            this.c = d0.b();
            this.d = d0.f();
            this.e = d0.c();
            this.f = d0.h();
            this.g = d0.e();
        }

        b(d d0, com.google.firebase.installations.local.a.a a$a0) {
            this(d0);
        }

        @Override  // com.google.firebase.installations.local.d$a
        public d a() {
            String s = this.b == null ? " registrationStatus" : "";
            if(this.e == null) {
                s = s + " expiresInSecs";
            }
            if(this.f == null) {
                s = s + " tokenCreationEpochInSecs";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new a(this.a, this.b, this.c, this.d, ((long)this.e), ((long)this.f), this.g, null);
        }

        @Override  // com.google.firebase.installations.local.d$a
        public com.google.firebase.installations.local.d.a b(@Nullable String s) {
            this.c = s;
            return this;
        }

        @Override  // com.google.firebase.installations.local.d$a
        public com.google.firebase.installations.local.d.a c(long v) {
            this.e = v;
            return this;
        }

        @Override  // com.google.firebase.installations.local.d$a
        public com.google.firebase.installations.local.d.a d(String s) {
            this.a = s;
            return this;
        }

        @Override  // com.google.firebase.installations.local.d$a
        public com.google.firebase.installations.local.d.a e(@Nullable String s) {
            this.g = s;
            return this;
        }

        @Override  // com.google.firebase.installations.local.d$a
        public com.google.firebase.installations.local.d.a f(@Nullable String s) {
            this.d = s;
            return this;
        }

        @Override  // com.google.firebase.installations.local.d$a
        public com.google.firebase.installations.local.d.a g(com.google.firebase.installations.local.c.a c$a0) {
            if(c$a0 == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = c$a0;
            return this;
        }

        @Override  // com.google.firebase.installations.local.d$a
        public com.google.firebase.installations.local.d.a h(long v) {
            this.f = v;
            return this;
        }
    }

    private final String b;
    private final com.google.firebase.installations.local.c.a c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private final String h;

    private a(@Nullable String s, com.google.firebase.installations.local.c.a c$a0, @Nullable String s1, @Nullable String s2, long v, long v1, @Nullable String s3) {
        this.b = s;
        this.c = c$a0;
        this.d = s1;
        this.e = s2;
        this.f = v;
        this.g = v1;
        this.h = s3;
    }

    a(String s, com.google.firebase.installations.local.c.a c$a0, String s1, String s2, long v, long v1, String s3, com.google.firebase.installations.local.a.a a$a0) {
        this(s, c$a0, s1, s2, v, v1, s3);
    }

    @Override  // com.google.firebase.installations.local.d
    @Nullable
    public String b() {
        return this.d;
    }

    @Override  // com.google.firebase.installations.local.d
    public long c() {
        return this.f;
    }

    @Override  // com.google.firebase.installations.local.d
    @Nullable
    public String d() {
        return this.b;
    }

    @Override  // com.google.firebase.installations.local.d
    @Nullable
    public String e() {
        return this.h;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            String s = this.b;
            if(s != null) {
                if(s.equals(((d)object0).d())) {
                label_8:
                    com.google.firebase.installations.local.c.a c$a0 = ((d)object0).g();
                    if(this.c.equals(c$a0)) {
                        String s1 = this.d;
                        if(s1 != null) {
                            if(s1.equals(((d)object0).b())) {
                            label_15:
                                String s2 = this.e;
                                if(s2 != null) {
                                    if(s2.equals(((d)object0).f())) {
                                    label_20:
                                        long v = ((d)object0).c();
                                        if(this.f == v) {
                                            long v1 = ((d)object0).h();
                                            if(this.g == v1) {
                                                return this.h == null ? ((d)object0).e() == null : this.h.equals(((d)object0).e());
                                            }
                                        }
                                    }
                                }
                                else if(((d)object0).f() == null) {
                                    goto label_20;
                                }
                            }
                        }
                        else if(((d)object0).b() == null) {
                            goto label_15;
                        }
                    }
                }
            }
            else if(((d)object0).d() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.installations.local.d
    @Nullable
    public String f() {
        return this.e;
    }

    @Override  // com.google.firebase.installations.local.d
    @NonNull
    public com.google.firebase.installations.local.c.a g() {
        return this.c;
    }

    @Override  // com.google.firebase.installations.local.d
    public long h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = (((((((this.b == null ? 0 : this.b.hashCode()) ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ (this.d == null ? 0 : this.d.hashCode())) * 1000003 ^ (this.e == null ? 0 : this.e.hashCode())) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003 ^ ((int)(this.g ^ this.g >>> 0x20))) * 1000003;
        String s = this.h;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 ^ v;
    }

    @Override  // com.google.firebase.installations.local.d
    public com.google.firebase.installations.local.d.a n() {
        return new b(this, null);
    }

    @Override
    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.c + ", authToken=" + this.d + ", refreshToken=" + this.e + ", expiresInSecs=" + this.f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }
}

