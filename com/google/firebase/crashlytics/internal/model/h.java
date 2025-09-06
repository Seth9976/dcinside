package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

final class h extends f {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.b {
        private String a;
        private String b;
        private String c;
        private long d;
        private Long e;
        private boolean f;
        private com.google.firebase.crashlytics.internal.model.F.f.a g;
        private com.google.firebase.crashlytics.internal.model.F.f.f h;
        private e i;
        private c j;
        private List k;
        private int l;
        private byte m;

        b() {
        }

        private b(f f$f0) {
            this.a = f$f0.g();
            this.b = f$f0.i();
            this.c = f$f0.c();
            this.d = f$f0.l();
            this.e = f$f0.e();
            this.f = f$f0.n();
            this.g = f$f0.b();
            this.h = f$f0.m();
            this.i = f$f0.k();
            this.j = f$f0.d();
            this.k = f$f0.f();
            this.l = f$f0.h();
            this.m = 7;
        }

        b(f f$f0, a h$a0) {
            this(f$f0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public f a() {
            if(this.m == 7) {
                String s = this.a;
                if(s != null) {
                    String s1 = this.b;
                    if(s1 != null) {
                        com.google.firebase.crashlytics.internal.model.F.f.a f$f$a0 = this.g;
                        if(f$f$a0 != null) {
                            return new h(s, s1, this.c, this.d, this.e, this.f, f$f$a0, this.h, this.i, this.j, this.k, this.l, null);
                        }
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" generator");
            }
            if(this.b == null) {
                stringBuilder0.append(" identifier");
            }
            if((this.m & 1) == 0) {
                stringBuilder0.append(" startedAt");
            }
            if((this.m & 2) == 0) {
                stringBuilder0.append(" crashed");
            }
            if(this.g == null) {
                stringBuilder0.append(" app");
            }
            if((this.m & 4) == 0) {
                stringBuilder0.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b b(com.google.firebase.crashlytics.internal.model.F.f.a f$f$a0) {
            if(f$f$a0 == null) {
                throw new NullPointerException("Null app");
            }
            this.g = f$f$a0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b c(@Nullable String s) {
            this.c = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b d(boolean z) {
            this.f = z;
            this.m = (byte)(this.m | 2);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b e(c f$f$c0) {
            this.j = f$f$c0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b f(Long long0) {
            this.e = long0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b g(List list0) {
            this.k = list0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b h(String s) {
            if(s == null) {
                throw new NullPointerException("Null generator");
            }
            this.a = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b i(int v) {
            this.l = v;
            this.m = (byte)(this.m | 4);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b j(String s) {
            if(s == null) {
                throw new NullPointerException("Null identifier");
            }
            this.b = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b l(e f$f$e0) {
            this.i = f$f$e0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b m(long v) {
            this.d = v;
            this.m = (byte)(this.m | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$b
        public com.google.firebase.crashlytics.internal.model.F.f.b n(com.google.firebase.crashlytics.internal.model.F.f.f f$f$f0) {
            this.h = f$f$f0;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final Long e;
    private final boolean f;
    private final com.google.firebase.crashlytics.internal.model.F.f.a g;
    private final com.google.firebase.crashlytics.internal.model.F.f.f h;
    private final e i;
    private final c j;
    private final List k;
    private final int l;

    private h(String s, String s1, @Nullable String s2, long v, @Nullable Long long0, boolean z, com.google.firebase.crashlytics.internal.model.F.f.a f$f$a0, @Nullable com.google.firebase.crashlytics.internal.model.F.f.f f$f$f0, @Nullable e f$f$e0, @Nullable c f$f$c0, @Nullable List list0, int v1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
        this.e = long0;
        this.f = z;
        this.g = f$f$a0;
        this.h = f$f$f0;
        this.i = f$f$e0;
        this.j = f$f$c0;
        this.k = list0;
        this.l = v1;
    }

    h(String s, String s1, String s2, long v, Long long0, boolean z, com.google.firebase.crashlytics.internal.model.F.f.a f$f$a0, com.google.firebase.crashlytics.internal.model.F.f.f f$f$f0, e f$f$e0, c f$f$c0, List list0, int v1, a h$a0) {
        this(s, s1, s2, v, long0, z, f$f$a0, f$f$f0, f$f$e0, f$f$c0, list0, v1);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    @NonNull
    public com.google.firebase.crashlytics.internal.model.F.f.a b() {
        return this.g;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    @Nullable
    public String c() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    @Nullable
    public c d() {
        return this.j;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    @Nullable
    public Long e() {
        return this.e;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof f) {
            String s = ((f)object0).g();
            if(this.a.equals(s)) {
                String s1 = ((f)object0).i();
                if(this.b.equals(s1)) {
                    String s2 = this.c;
                    if(s2 != null) {
                        if(s2.equals(((f)object0).c())) {
                        label_12:
                            long v = ((f)object0).l();
                            if(this.d == v) {
                                Long long0 = this.e;
                                if(long0 != null) {
                                    if(long0.equals(((f)object0).e())) {
                                    label_19:
                                        boolean z = ((f)object0).n();
                                        if(this.f == z) {
                                            com.google.firebase.crashlytics.internal.model.F.f.a f$f$a0 = ((f)object0).b();
                                            if(this.g.equals(f$f$a0)) {
                                                com.google.firebase.crashlytics.internal.model.F.f.f f$f$f0 = this.h;
                                                if(f$f$f0 != null) {
                                                    if(f$f$f0.equals(((f)object0).m())) {
                                                    label_28:
                                                        e f$f$e0 = this.i;
                                                        if(f$f$e0 != null) {
                                                            if(f$f$e0.equals(((f)object0).k())) {
                                                            label_33:
                                                                c f$f$c0 = this.j;
                                                                if(f$f$c0 != null) {
                                                                    if(f$f$c0.equals(((f)object0).d())) {
                                                                    label_38:
                                                                        List list0 = this.k;
                                                                        if(list0 != null) {
                                                                            if(list0.equals(((f)object0).f())) {
                                                                            label_43:
                                                                                int v1 = ((f)object0).h();
                                                                                return this.l == v1;
                                                                            }
                                                                        }
                                                                        else if(((f)object0).f() == null) {
                                                                            goto label_43;
                                                                        }
                                                                    }
                                                                }
                                                                else if(((f)object0).d() == null) {
                                                                    goto label_38;
                                                                }
                                                            }
                                                        }
                                                        else if(((f)object0).k() == null) {
                                                            goto label_33;
                                                        }
                                                    }
                                                }
                                                else if(((f)object0).m() == null) {
                                                    goto label_28;
                                                }
                                            }
                                        }
                                    }
                                }
                                else if(((f)object0).e() == null) {
                                    goto label_19;
                                }
                            }
                        }
                    }
                    else if(((f)object0).c() == null) {
                        goto label_12;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    @Nullable
    public List f() {
        return this.k;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    @NonNull
    public String g() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    public int h() {
        return this.l;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003;
        int v2 = this.e == null ? 0 : this.e.hashCode();
        int v3 = this.f ? 0x4CF : 0x4D5;
        int v4 = this.g.hashCode();
        int v5 = this.h == null ? 0 : this.h.hashCode();
        int v6 = this.i == null ? 0 : this.i.hashCode();
        int v7 = this.j == null ? 0 : this.j.hashCode();
        List list0 = this.k;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return (((((((v1 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v7) * 1000003 ^ v) * 1000003 ^ this.l;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    @NonNull
    @c2.a.b
    public String i() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    @Nullable
    public e k() {
        return this.i;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    public long l() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    @Nullable
    public com.google.firebase.crashlytics.internal.model.F.f.f m() {
        return this.h;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    public boolean n() {
        return this.f;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f
    public com.google.firebase.crashlytics.internal.model.F.f.b o() {
        return new b(this, null);
    }

    @Override
    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", appQualitySessionId=" + this.c + ", startedAt=" + this.d + ", endedAt=" + this.e + ", crashed=" + this.f + ", app=" + this.g + ", user=" + this.h + ", os=" + this.i + ", device=" + this.j + ", events=" + this.k + ", generatorType=" + this.l + "}";
    }
}

