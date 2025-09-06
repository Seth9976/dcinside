package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

final class p extends c {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c.a {
        private String a;
        private String b;
        private List c;
        private c d;
        private int e;
        private byte f;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c$a
        public c a() {
            if(this.f == 1) {
                String s = this.a;
                if(s != null) {
                    List list0 = this.c;
                    if(list0 != null) {
                        return new p(s, this.b, list0, this.d, this.e, null);
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" type");
            }
            if(this.c == null) {
                stringBuilder0.append(" frames");
            }
            if((1 & this.f) == 0) {
                stringBuilder0.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c.a b(c f$f$d$a$b$c0) {
            this.d = f$f$d$a$b$c0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c.a c(List list0) {
            if(list0 == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = list0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c.a d(int v) {
            this.e = v;
            this.f = (byte)(this.f | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c.a e(String s) {
            this.b = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c.a f(String s) {
            if(s == null) {
                throw new NullPointerException("Null type");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final List c;
    private final c d;
    private final int e;

    private p(String s, @Nullable String s1, List list0, @Nullable c f$f$d$a$b$c0, int v) {
        this.a = s;
        this.b = s1;
        this.c = list0;
        this.d = f$f$d$a$b$c0;
        this.e = v;
    }

    p(String s, String s1, List list0, c f$f$d$a$b$c0, int v, a p$a0) {
        this(s, s1, list0, f$f$d$a$b$c0, v);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c
    @Nullable
    public c b() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c
    @NonNull
    public List c() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c
    public int d() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c
    @Nullable
    public String e() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof c) {
            String s = ((c)object0).f();
            if(this.a.equals(s)) {
                String s1 = this.b;
                if(s1 != null) {
                    if(s1.equals(((c)object0).e())) {
                    label_10:
                        List list0 = ((c)object0).c();
                        if(this.c.equals(list0)) {
                            c f$f$d$a$b$c0 = this.d;
                            if(f$f$d$a$b$c0 != null) {
                                if(f$f$d$a$b$c0.equals(((c)object0).b())) {
                                label_17:
                                    int v = ((c)object0).d();
                                    return this.e == v;
                                }
                            }
                            else if(((c)object0).b() == null) {
                                goto label_17;
                            }
                        }
                    }
                }
                else if(((c)object0).e() == null) {
                    goto label_10;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$c
    @NonNull
    public String f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c.hashCode();
        c f$f$d$a$b$c0 = this.d;
        if(f$f$d$a$b$c0 != null) {
            v1 = f$f$d$a$b$c0.hashCode();
        }
        return ((((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v1) * 1000003 ^ this.e;
    }

    @Override
    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }
}

