package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;

final class a extends d {
    static class com.google.firebase.installations.remote.a.a {
    }

    static final class b extends com.google.firebase.installations.remote.d.a {
        private String a;
        private String b;
        private String c;
        private f d;
        private com.google.firebase.installations.remote.d.b e;

        b() {
        }

        private b(d d0) {
            this.a = d0.f();
            this.b = d0.c();
            this.c = d0.d();
            this.d = d0.b();
            this.e = d0.e();
        }

        b(d d0, com.google.firebase.installations.remote.a.a a$a0) {
            this(d0);
        }

        @Override  // com.google.firebase.installations.remote.d$a
        public d a() {
            return new a(this.a, this.b, this.c, this.d, this.e, null);
        }

        @Override  // com.google.firebase.installations.remote.d$a
        public com.google.firebase.installations.remote.d.a b(f f0) {
            this.d = f0;
            return this;
        }

        @Override  // com.google.firebase.installations.remote.d$a
        public com.google.firebase.installations.remote.d.a c(String s) {
            this.b = s;
            return this;
        }

        @Override  // com.google.firebase.installations.remote.d$a
        public com.google.firebase.installations.remote.d.a d(String s) {
            this.c = s;
            return this;
        }

        @Override  // com.google.firebase.installations.remote.d$a
        public com.google.firebase.installations.remote.d.a e(com.google.firebase.installations.remote.d.b d$b0) {
            this.e = d$b0;
            return this;
        }

        @Override  // com.google.firebase.installations.remote.d$a
        public com.google.firebase.installations.remote.d.a f(String s) {
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final String c;
    private final f d;
    private final com.google.firebase.installations.remote.d.b e;

    private a(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable f f0, @Nullable com.google.firebase.installations.remote.d.b d$b0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = f0;
        this.e = d$b0;
    }

    a(String s, String s1, String s2, f f0, com.google.firebase.installations.remote.d.b d$b0, com.google.firebase.installations.remote.a.a a$a0) {
        this(s, s1, s2, f0, d$b0);
    }

    @Override  // com.google.firebase.installations.remote.d
    @Nullable
    public f b() {
        return this.d;
    }

    @Override  // com.google.firebase.installations.remote.d
    @Nullable
    public String c() {
        return this.b;
    }

    @Override  // com.google.firebase.installations.remote.d
    @Nullable
    public String d() {
        return this.c;
    }

    @Override  // com.google.firebase.installations.remote.d
    @Nullable
    public com.google.firebase.installations.remote.d.b e() {
        return this.e;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((d)object0).f())) {
                label_8:
                    String s1 = this.b;
                    if(s1 != null) {
                        if(s1.equals(((d)object0).c())) {
                        label_13:
                            String s2 = this.c;
                            if(s2 != null) {
                                if(s2.equals(((d)object0).d())) {
                                label_18:
                                    f f0 = this.d;
                                    if(f0 == null) {
                                        if(((d)object0).b() == null) {
                                            return this.e == null ? ((d)object0).e() == null : this.e.equals(((d)object0).e());
                                        }
                                    }
                                    else if(f0.equals(((d)object0).b())) {
                                        return this.e == null ? ((d)object0).e() == null : this.e.equals(((d)object0).e());
                                    }
                                }
                            }
                            else if(((d)object0).d() == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((d)object0).c() == null) {
                        goto label_13;
                    }
                }
            }
            else if(((d)object0).f() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.installations.remote.d
    @Nullable
    public String f() {
        return this.a;
    }

    @Override  // com.google.firebase.installations.remote.d
    public com.google.firebase.installations.remote.d.a g() {
        return new b(this, null);
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        com.google.firebase.installations.remote.d.b d$b0 = this.e;
        if(d$b0 != null) {
            v = d$b0.hashCode();
        }
        return ((((v1 ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v;
    }

    @Override
    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}

