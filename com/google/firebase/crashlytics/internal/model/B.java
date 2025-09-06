package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class b extends F {
    static class a {
    }

    static final class com.google.firebase.crashlytics.internal.model.b.b extends c {
        private String a;
        private String b;
        private int c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private f j;
        private e k;
        private com.google.firebase.crashlytics.internal.model.F.a l;
        private byte m;

        com.google.firebase.crashlytics.internal.model.b.b() {
        }

        private com.google.firebase.crashlytics.internal.model.b.b(F f0) {
            this.a = f0.m();
            this.b = f0.i();
            this.c = f0.l();
            this.d = f0.j();
            this.e = f0.h();
            this.f = f0.g();
            this.g = f0.d();
            this.h = f0.e();
            this.i = f0.f();
            this.j = f0.n();
            this.k = f0.k();
            this.l = f0.c();
            this.m = 1;
        }

        com.google.firebase.crashlytics.internal.model.b.b(F f0, a b$a0) {
            this(f0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public F a() {
            if(this.m == 1 && this.a != null && this.b != null && this.d != null && this.h != null && this.i != null) {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" sdkVersion");
            }
            if(this.b == null) {
                stringBuilder0.append(" gmpAppId");
            }
            if((1 & this.m) == 0) {
                stringBuilder0.append(" platform");
            }
            if(this.d == null) {
                stringBuilder0.append(" installationUuid");
            }
            if(this.h == null) {
                stringBuilder0.append(" buildVersion");
            }
            if(this.i == null) {
                stringBuilder0.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c b(com.google.firebase.crashlytics.internal.model.F.a f$a0) {
            this.l = f$a0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c c(@Nullable String s) {
            this.g = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c d(String s) {
            if(s == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.h = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c e(String s) {
            if(s == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.i = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c f(@Nullable String s) {
            this.f = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c g(@Nullable String s) {
            this.e = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c h(String s) {
            if(s == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.b = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c i(String s) {
            if(s == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.d = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c j(e f$e0) {
            this.k = f$e0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c k(int v) {
            this.c = v;
            this.m = (byte)(this.m | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c l(String s) {
            if(s == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.a = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$c
        public c m(f f$f0) {
            this.j = f$f0;
            return this;
        }
    }

    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final f k;
    private final e l;
    private final com.google.firebase.crashlytics.internal.model.F.a m;

    private b(String s, String s1, int v, String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, String s6, String s7, @Nullable f f$f0, @Nullable e f$e0, @Nullable com.google.firebase.crashlytics.internal.model.F.a f$a0) {
        this.b = s;
        this.c = s1;
        this.d = v;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = s6;
        this.j = s7;
        this.k = f$f0;
        this.l = f$e0;
        this.m = f$a0;
    }

    b(String s, String s1, int v, String s2, String s3, String s4, String s5, String s6, String s7, f f$f0, e f$e0, com.google.firebase.crashlytics.internal.model.F.a f$a0, a b$a0) {
        this(s, s1, v, s2, s3, s4, s5, s6, s7, f$f0, f$e0, f$a0);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @Nullable
    public com.google.firebase.crashlytics.internal.model.F.a c() {
        return this.m;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @Nullable
    public String d() {
        return this.h;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @NonNull
    public String e() {
        return this.i;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof F) {
            String s = ((F)object0).m();
            if(this.b.equals(s)) {
                String s1 = ((F)object0).i();
                if(this.c.equals(s1)) {
                    int v = ((F)object0).l();
                    if(this.d == v) {
                        String s2 = ((F)object0).j();
                        if(this.e.equals(s2)) {
                            String s3 = this.f;
                            if(s3 != null) {
                                if(s3.equals(((F)object0).h())) {
                                label_16:
                                    String s4 = this.g;
                                    if(s4 != null) {
                                        if(s4.equals(((F)object0).g())) {
                                        label_21:
                                            String s5 = this.h;
                                            if(s5 != null) {
                                                if(s5.equals(((F)object0).d())) {
                                                label_26:
                                                    String s6 = ((F)object0).e();
                                                    if(this.i.equals(s6)) {
                                                        String s7 = ((F)object0).f();
                                                        if(this.j.equals(s7)) {
                                                            f f$f0 = this.k;
                                                            if(f$f0 != null) {
                                                                if(f$f0.equals(((F)object0).n())) {
                                                                label_35:
                                                                    e f$e0 = this.l;
                                                                    if(f$e0 == null) {
                                                                        if(((F)object0).k() == null) {
                                                                            return this.m == null ? ((F)object0).c() == null : this.m.equals(((F)object0).c());
                                                                        }
                                                                    }
                                                                    else if(f$e0.equals(((F)object0).k())) {
                                                                        return this.m == null ? ((F)object0).c() == null : this.m.equals(((F)object0).c());
                                                                    }
                                                                }
                                                            }
                                                            else if(((F)object0).n() == null) {
                                                                goto label_35;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else if(((F)object0).d() == null) {
                                                goto label_26;
                                            }
                                        }
                                    }
                                    else if(((F)object0).g() == null) {
                                        goto label_21;
                                    }
                                }
                            }
                            else if(((F)object0).h() == null) {
                                goto label_16;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @NonNull
    public String f() {
        return this.j;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @Nullable
    public String g() {
        return this.g;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @Nullable
    public String h() {
        return this.f;
    }

    @Override
    public int hashCode() {
        int v = ((((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d) * 1000003 ^ this.e.hashCode()) * 1000003;
        int v1 = 0;
        int v2 = this.f == null ? 0 : this.f.hashCode();
        int v3 = this.g == null ? 0 : this.g.hashCode();
        int v4 = this.h == null ? 0 : this.h.hashCode();
        int v5 = this.i.hashCode();
        int v6 = this.j.hashCode();
        int v7 = this.k == null ? 0 : this.k.hashCode();
        int v8 = this.l == null ? 0 : this.l.hashCode();
        com.google.firebase.crashlytics.internal.model.F.a f$a0 = this.m;
        if(f$a0 != null) {
            v1 = f$a0.hashCode();
        }
        return (((((((v ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v7) * 1000003 ^ v8) * 1000003 ^ v1;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @NonNull
    public String i() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @NonNull
    public String j() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @Nullable
    public e k() {
        return this.l;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    public int l() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @NonNull
    public String m() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    @Nullable
    public f n() {
        return this.k;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F
    protected c p() {
        return new com.google.firebase.crashlytics.internal.model.b.b(this, null);
    }

    @Override
    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}

