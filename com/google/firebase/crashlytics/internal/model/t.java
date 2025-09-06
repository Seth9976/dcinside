package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

final class t extends c {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.a.c.a {
        private String a;
        private int b;
        private int c;
        private boolean d;
        private byte e;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$c$a
        public c a() {
            if(this.e == 7) {
                String s = this.a;
                if(s != null) {
                    return new t(s, this.b, this.c, this.d, null);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" processName");
            }
            if((this.e & 1) == 0) {
                stringBuilder0.append(" pid");
            }
            if((this.e & 2) == 0) {
                stringBuilder0.append(" importance");
            }
            if((this.e & 4) == 0) {
                stringBuilder0.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.c.a b(boolean z) {
            this.d = z;
            this.e = (byte)(this.e | 4);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.c.a c(int v) {
            this.c = v;
            this.e = (byte)(this.e | 2);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.c.a d(int v) {
            this.b = v;
            this.e = (byte)(this.e | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.a.c.a e(String s) {
            if(s == null) {
                throw new NullPointerException("Null processName");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final int b;
    private final int c;
    private final boolean d;

    private t(String s, int v, int v1, boolean z) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = z;
    }

    t(String s, int v, int v1, boolean z, a t$a0) {
        this(s, v, v1, z);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$c
    public int b() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$c
    public int c() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$c
    @NonNull
    public String d() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$a$c
    public boolean e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof c) {
            String s = ((c)object0).d();
            if(this.a.equals(s)) {
                int v = ((c)object0).c();
                if(this.b == v) {
                    int v1 = ((c)object0).b();
                    if(this.c == v1) {
                        boolean z = ((c)object0).e();
                        return this.d == z;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003;
        return this.d ? v ^ 0x4CF : v ^ 0x4D5;
    }

    @Override
    public String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", defaultProcess=" + this.d + "}";
    }
}

