package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class i extends a {
    static class com.google.firebase.crashlytics.internal.model.i.a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.a.a {
        private String a;
        private String b;
        private String c;
        private com.google.firebase.crashlytics.internal.model.F.f.a.b d;
        private String e;
        private String f;
        private String g;

        b() {
        }

        private b(a f$f$a0) {
            this.a = f$f$a0.e();
            this.b = f$f$a0.h();
            this.c = f$f$a0.d();
            this.d = f$f$a0.g();
            this.e = f$f$a0.f();
            this.f = f$f$a0.b();
            this.g = f$f$a0.c();
        }

        b(a f$f$a0, com.google.firebase.crashlytics.internal.model.i.a i$a0) {
            this(f$f$a0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$a
        public a a() {
            String s = this.a;
            if(s != null) {
                String s1 = this.b;
                if(s1 != null) {
                    return new i(s, s1, this.c, this.d, this.e, this.f, this.g, null);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" identifier");
            }
            if(this.b == null) {
                stringBuilder0.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.a.a b(@Nullable String s) {
            this.f = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.a.a c(@Nullable String s) {
            this.g = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.a.a d(String s) {
            this.c = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.a.a e(String s) {
            if(s == null) {
                throw new NullPointerException("Null identifier");
            }
            this.a = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.a.a f(String s) {
            this.e = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.a.a g(com.google.firebase.crashlytics.internal.model.F.f.a.b f$f$a$b0) {
            this.d = f$f$a$b0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.a.a h(String s) {
            if(s == null) {
                throw new NullPointerException("Null version");
            }
            this.b = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final String c;
    private final com.google.firebase.crashlytics.internal.model.F.f.a.b d;
    private final String e;
    private final String f;
    private final String g;

    private i(String s, String s1, @Nullable String s2, @Nullable com.google.firebase.crashlytics.internal.model.F.f.a.b f$f$a$b0, @Nullable String s3, @Nullable String s4, @Nullable String s5) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = f$f$a$b0;
        this.e = s3;
        this.f = s4;
        this.g = s5;
    }

    i(String s, String s1, String s2, com.google.firebase.crashlytics.internal.model.F.f.a.b f$f$a$b0, String s3, String s4, String s5, com.google.firebase.crashlytics.internal.model.i.a i$a0) {
        this(s, s1, s2, f$f$a$b0, s3, s4, s5);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$a
    @Nullable
    public String b() {
        return this.f;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$a
    @Nullable
    public String c() {
        return this.g;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$a
    @Nullable
    public String d() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$a
    @NonNull
    public String e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            String s = ((a)object0).e();
            if(this.a.equals(s)) {
                String s1 = ((a)object0).h();
                if(this.b.equals(s1)) {
                    String s2 = this.c;
                    if(s2 != null) {
                        if(s2.equals(((a)object0).d())) {
                        label_12:
                            com.google.firebase.crashlytics.internal.model.F.f.a.b f$f$a$b0 = this.d;
                            if(f$f$a$b0 != null) {
                                if(f$f$a$b0.equals(((a)object0).g())) {
                                label_17:
                                    String s3 = this.e;
                                    if(s3 != null) {
                                        if(s3.equals(((a)object0).f())) {
                                        label_22:
                                            String s4 = this.f;
                                            if(s4 == null) {
                                                if(((a)object0).b() == null) {
                                                    return this.g == null ? ((a)object0).c() == null : this.g.equals(((a)object0).c());
                                                }
                                            }
                                            else if(s4.equals(((a)object0).b())) {
                                                return this.g == null ? ((a)object0).c() == null : this.g.equals(((a)object0).c());
                                            }
                                        }
                                    }
                                    else if(((a)object0).f() == null) {
                                        goto label_22;
                                    }
                                }
                            }
                            else if(((a)object0).g() == null) {
                                goto label_17;
                            }
                        }
                    }
                    else if(((a)object0).d() == null) {
                        goto label_12;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$a
    @Nullable
    public String f() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$a
    @Nullable
    public com.google.firebase.crashlytics.internal.model.F.f.a.b g() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$a
    @NonNull
    public String h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        String s = this.g;
        if(s != null) {
            v2 = s.hashCode();
        }
        return ((((((v ^ 1000003) * 1000003 ^ v1) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v2;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$a
    protected com.google.firebase.crashlytics.internal.model.F.f.a.a i() {
        return new b(this, null);
    }

    @Override
    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + this.d + ", installationUuid=" + this.e + ", developmentPlatform=" + this.f + ", developmentPlatformVersion=" + this.g + "}";
    }
}

