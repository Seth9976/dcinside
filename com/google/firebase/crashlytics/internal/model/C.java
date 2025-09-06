package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

final class c extends a {
    static class com.google.firebase.crashlytics.internal.model.c.a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.a.b {
        private int a;
        private String b;
        private int c;
        private int d;
        private long e;
        private long f;
        private long g;
        private String h;
        private List i;
        private byte j;

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$b
        public a a() {
            if(this.j == 0x3F) {
                String s = this.b;
                if(s != null) {
                    return new c(this.a, s, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.j & 1) == 0) {
                stringBuilder0.append(" pid");
            }
            if(this.b == null) {
                stringBuilder0.append(" processName");
            }
            if((this.j & 2) == 0) {
                stringBuilder0.append(" reasonCode");
            }
            if((this.j & 4) == 0) {
                stringBuilder0.append(" importance");
            }
            if((this.j & 8) == 0) {
                stringBuilder0.append(" pss");
            }
            if((this.j & 16) == 0) {
                stringBuilder0.append(" rss");
            }
            if((this.j & 0x20) == 0) {
                stringBuilder0.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$b
        public com.google.firebase.crashlytics.internal.model.F.a.b b(@Nullable List list0) {
            this.i = list0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$b
        public com.google.firebase.crashlytics.internal.model.F.a.b c(int v) {
            this.d = v;
            this.j = (byte)(this.j | 4);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$b
        public com.google.firebase.crashlytics.internal.model.F.a.b d(int v) {
            this.a = v;
            this.j = (byte)(this.j | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$b
        public com.google.firebase.crashlytics.internal.model.F.a.b e(String s) {
            if(s == null) {
                throw new NullPointerException("Null processName");
            }
            this.b = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$b
        public com.google.firebase.crashlytics.internal.model.F.a.b f(long v) {
            this.e = v;
            this.j = (byte)(this.j | 8);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$b
        public com.google.firebase.crashlytics.internal.model.F.a.b g(int v) {
            this.c = v;
            this.j = (byte)(this.j | 2);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$b
        public com.google.firebase.crashlytics.internal.model.F.a.b h(long v) {
            this.f = v;
            this.j = (byte)(this.j | 16);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$b
        public com.google.firebase.crashlytics.internal.model.F.a.b i(long v) {
            this.g = v;
            this.j = (byte)(this.j | 0x20);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$b
        public com.google.firebase.crashlytics.internal.model.F.a.b j(@Nullable String s) {
            this.h = s;
            return this;
        }
    }

    private final int a;
    private final String b;
    private final int c;
    private final int d;
    private final long e;
    private final long f;
    private final long g;
    private final String h;
    private final List i;

    private c(int v, String s, int v1, int v2, long v3, long v4, long v5, @Nullable String s1, @Nullable List list0) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = s1;
        this.i = list0;
    }

    c(int v, String s, int v1, int v2, long v3, long v4, long v5, String s1, List list0, com.google.firebase.crashlytics.internal.model.c.a c$a0) {
        this(v, s, v1, v2, v3, v4, v5, s1, list0);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a
    @Nullable
    public List b() {
        return this.i;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a
    @NonNull
    public int c() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a
    @NonNull
    public int d() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a
    @NonNull
    public String e() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            int v = ((a)object0).d();
            if(this.a == v) {
                String s = ((a)object0).e();
                if(this.b.equals(s)) {
                    int v1 = ((a)object0).g();
                    if(this.c == v1) {
                        int v2 = ((a)object0).c();
                        if(this.d == v2) {
                            long v3 = ((a)object0).f();
                            if(this.e == v3) {
                                long v4 = ((a)object0).h();
                                if(this.f == v4) {
                                    long v5 = ((a)object0).i();
                                    if(this.g == v5) {
                                        String s1 = this.h;
                                        if(s1 == null) {
                                            if(((a)object0).j() == null) {
                                                return this.i == null ? ((a)object0).b() == null : this.i.equals(((a)object0).b());
                                            }
                                        }
                                        else if(s1.equals(((a)object0).j())) {
                                            return this.i == null ? ((a)object0).b() == null : this.i.equals(((a)object0).b());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a
    @NonNull
    public long f() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a
    @NonNull
    public int g() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a
    @NonNull
    public long h() {
        return this.f;
    }

    @Override
    public int hashCode() {
        int v = (((((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003 ^ ((int)(this.g ^ this.g >>> 0x20))) * 1000003;
        int v1 = 0;
        int v2 = this.h == null ? 0 : this.h.hashCode();
        List list0 = this.i;
        if(list0 != null) {
            v1 = list0.hashCode();
        }
        return (v ^ v2) * 1000003 ^ v1;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a
    @NonNull
    public long i() {
        return this.g;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a
    @Nullable
    public String j() {
        return this.h;
    }

    @Override
    public String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }
}

