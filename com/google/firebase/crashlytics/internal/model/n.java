package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

final class n extends b {
    static class a {
    }

    static final class com.google.firebase.crashlytics.internal.model.n.b extends com.google.firebase.crashlytics.internal.model.F.f.d.a.b.b {
        private List a;
        private c b;
        private com.google.firebase.crashlytics.internal.model.F.a c;
        private d d;
        private List e;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$b
        public b a() {
            d f$f$d$a$b$d0 = this.d;
            if(f$f$d$a$b$d0 != null) {
                List list0 = this.e;
                if(list0 != null) {
                    return new n(this.a, this.b, this.c, f$f$d$a$b$d0, list0, null);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.d == null) {
                stringBuilder0.append(" signal");
            }
            if(this.e == null) {
                stringBuilder0.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.b b(com.google.firebase.crashlytics.internal.model.F.a f$a0) {
            this.c = f$a0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.b c(List list0) {
            if(list0 == null) {
                throw new NullPointerException("Null binaries");
            }
            this.e = list0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.b d(c f$f$d$a$b$c0) {
            this.b = f$f$d$a$b$c0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.b e(d f$f$d$a$b$d0) {
            if(f$f$d$a$b$d0 == null) {
                throw new NullPointerException("Null signal");
            }
            this.d = f$f$d$a$b$d0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$b
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.b f(List list0) {
            this.a = list0;
            return this;
        }
    }

    private final List a;
    private final c b;
    private final com.google.firebase.crashlytics.internal.model.F.a c;
    private final d d;
    private final List e;

    private n(@Nullable List list0, @Nullable c f$f$d$a$b$c0, @Nullable com.google.firebase.crashlytics.internal.model.F.a f$a0, d f$f$d$a$b$d0, List list1) {
        this.a = list0;
        this.b = f$f$d$a$b$c0;
        this.c = f$a0;
        this.d = f$f$d$a$b$d0;
        this.e = list1;
    }

    n(List list0, c f$f$d$a$b$c0, com.google.firebase.crashlytics.internal.model.F.a f$a0, d f$f$d$a$b$d0, List list1, a n$a0) {
        this(list0, f$f$d$a$b$c0, f$a0, f$f$d$a$b$d0, list1);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b
    @Nullable
    public com.google.firebase.crashlytics.internal.model.F.a b() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b
    @NonNull
    public List c() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b
    @Nullable
    public c d() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b
    @NonNull
    public d e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof b) {
            List list0 = this.a;
            if(list0 != null) {
                if(list0.equals(((b)object0).f())) {
                label_8:
                    c f$f$d$a$b$c0 = this.b;
                    if(f$f$d$a$b$c0 != null) {
                        if(f$f$d$a$b$c0.equals(((b)object0).d())) {
                        label_13:
                            com.google.firebase.crashlytics.internal.model.F.a f$a0 = this.c;
                            if(f$a0 != null) {
                                if(f$a0.equals(((b)object0).b())) {
                                label_18:
                                    d f$f$d$a$b$d0 = ((b)object0).e();
                                    if(this.d.equals(f$f$d$a$b$d0)) {
                                        List list1 = ((b)object0).c();
                                        return this.e.equals(list1);
                                    }
                                }
                            }
                            else if(((b)object0).b() == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((b)object0).d() == null) {
                        goto label_13;
                    }
                }
            }
            else if(((b)object0).f() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b
    @Nullable
    public List f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        com.google.firebase.crashlytics.internal.model.F.a f$a0 = this.c;
        if(f$a0 != null) {
            v = f$a0.hashCode();
        }
        return ((((v1 ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    @Override
    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}

