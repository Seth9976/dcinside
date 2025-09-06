package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

final class m extends a {
    static class com.google.firebase.crashlytics.internal.model.m.a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.a.a {
        private com.google.firebase.crashlytics.internal.model.F.f.d.a.b a;
        private List b;
        private List c;
        private Boolean d;
        private c e;
        private List f;
        private int g;
        private byte h;

        b() {
        }

        private b(a f$f$d$a0) {
            this.a = f$f$d$a0.f();
            this.b = f$f$d$a0.e();
            this.c = f$f$d$a0.g();
            this.d = f$f$d$a0.c();
            this.e = f$f$d$a0.d();
            this.f = f$f$d$a0.b();
            this.g = f$f$d$a0.h();
            this.h = 1;
        }

        b(a f$f$d$a0, com.google.firebase.crashlytics.internal.model.m.a m$a0) {
            this(f$f$d$a0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$a
        public a a() {
            if(this.h == 1) {
                com.google.firebase.crashlytics.internal.model.F.f.d.a.b f$f$d$a$b0 = this.a;
                if(f$f$d$a$b0 != null) {
                    return new m(f$f$d$a$b0, this.b, this.c, this.d, this.e, this.f, this.g, null);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" execution");
            }
            if((1 & this.h) == 0) {
                stringBuilder0.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.a b(@Nullable List list0) {
            this.f = list0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.a c(@Nullable Boolean boolean0) {
            this.d = boolean0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.a d(@Nullable c f$f$d$a$c0) {
            this.e = f$f$d$a$c0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.a e(List list0) {
            this.b = list0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.a f(com.google.firebase.crashlytics.internal.model.F.f.d.a.b f$f$d$a$b0) {
            if(f$f$d$a$b0 == null) {
                throw new NullPointerException("Null execution");
            }
            this.a = f$f$d$a$b0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.a g(List list0) {
            this.c = list0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.a h(int v) {
            this.g = v;
            this.h = (byte)(this.h | 1);
            return this;
        }
    }

    private final com.google.firebase.crashlytics.internal.model.F.f.d.a.b a;
    private final List b;
    private final List c;
    private final Boolean d;
    private final c e;
    private final List f;
    private final int g;

    private m(com.google.firebase.crashlytics.internal.model.F.f.d.a.b f$f$d$a$b0, @Nullable List list0, @Nullable List list1, @Nullable Boolean boolean0, @Nullable c f$f$d$a$c0, @Nullable List list2, int v) {
        this.a = f$f$d$a$b0;
        this.b = list0;
        this.c = list1;
        this.d = boolean0;
        this.e = f$f$d$a$c0;
        this.f = list2;
        this.g = v;
    }

    m(com.google.firebase.crashlytics.internal.model.F.f.d.a.b f$f$d$a$b0, List list0, List list1, Boolean boolean0, c f$f$d$a$c0, List list2, int v, com.google.firebase.crashlytics.internal.model.m.a m$a0) {
        this(f$f$d$a$b0, list0, list1, boolean0, f$f$d$a$c0, list2, v);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a
    @Nullable
    public List b() {
        return this.f;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a
    @Nullable
    public Boolean c() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a
    @Nullable
    public c d() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a
    @Nullable
    public List e() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            com.google.firebase.crashlytics.internal.model.F.f.d.a.b f$f$d$a$b0 = ((a)object0).f();
            if(this.a.equals(f$f$d$a$b0)) {
                List list0 = this.b;
                if(list0 != null) {
                    if(list0.equals(((a)object0).e())) {
                    label_10:
                        List list1 = this.c;
                        if(list1 != null) {
                            if(list1.equals(((a)object0).g())) {
                            label_15:
                                Boolean boolean0 = this.d;
                                if(boolean0 != null) {
                                    if(boolean0.equals(((a)object0).c())) {
                                    label_20:
                                        c f$f$d$a$c0 = this.e;
                                        if(f$f$d$a$c0 != null) {
                                            if(f$f$d$a$c0.equals(((a)object0).d())) {
                                            label_25:
                                                List list2 = this.f;
                                                if(list2 != null) {
                                                    if(list2.equals(((a)object0).b())) {
                                                    label_30:
                                                        int v = ((a)object0).h();
                                                        return this.g == v;
                                                    }
                                                }
                                                else if(((a)object0).b() == null) {
                                                    goto label_30;
                                                }
                                            }
                                        }
                                        else if(((a)object0).d() == null) {
                                            goto label_25;
                                        }
                                    }
                                }
                                else if(((a)object0).c() == null) {
                                    goto label_20;
                                }
                            }
                        }
                        else if(((a)object0).g() == null) {
                            goto label_15;
                        }
                    }
                }
                else if(((a)object0).e() == null) {
                    goto label_10;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a
    @NonNull
    public com.google.firebase.crashlytics.internal.model.F.f.d.a.b f() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a
    @Nullable
    public List g() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a
    public int h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        List list0 = this.f;
        if(list0 != null) {
            v1 = list0.hashCode();
        }
        return ((((((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v1) * 1000003 ^ this.g;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a
    public com.google.firebase.crashlytics.internal.model.F.f.d.a.a i() {
        return new b(this, null);
    }

    @Override
    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", internalKeys=" + this.c + ", background=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ", uiOrientation=" + this.g + "}";
    }
}

