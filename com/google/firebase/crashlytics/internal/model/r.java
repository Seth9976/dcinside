package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.List;

final class r extends e {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.a {
        private String a;
        private int b;
        private List c;
        private byte d;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$a
        public e a() {
            if(this.d == 1) {
                String s = this.a;
                if(s != null) {
                    List list0 = this.c;
                    if(list0 != null) {
                        return new r(s, this.b, list0, null);
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" name");
            }
            if((1 & this.d) == 0) {
                stringBuilder0.append(" importance");
            }
            if(this.c == null) {
                stringBuilder0.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.a b(List list0) {
            if(list0 == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = list0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.a c(int v) {
            this.b = v;
            this.d = (byte)(this.d | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.a d(String s) {
            if(s == null) {
                throw new NullPointerException("Null name");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final int b;
    private final List c;

    private r(String s, int v, List list0) {
        this.a = s;
        this.b = v;
        this.c = list0;
    }

    r(String s, int v, List list0, a r$a0) {
        this(s, v, list0);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e
    @NonNull
    public List b() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e
    public int c() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$b$e
    @NonNull
    public String d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof e) {
            String s = ((e)object0).d();
            if(this.a.equals(s)) {
                int v = ((e)object0).c();
                if(this.b == v) {
                    List list0 = ((e)object0).b();
                    return this.c.equals(list0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}

