package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

final class z extends e {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.e.a {
        private int a;
        private String b;
        private String c;
        private boolean d;
        private byte e;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$e$a
        public e a() {
            if(this.e == 3) {
                String s = this.b;
                if(s != null) {
                    String s1 = this.c;
                    if(s1 != null) {
                        return new z(this.a, s, s1, this.d, null);
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.e & 1) == 0) {
                stringBuilder0.append(" platform");
            }
            if(this.b == null) {
                stringBuilder0.append(" version");
            }
            if(this.c == null) {
                stringBuilder0.append(" buildVersion");
            }
            if((this.e & 2) == 0) {
                stringBuilder0.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.e.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.c = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.e.a c(boolean z) {
            this.d = z;
            this.e = (byte)(this.e | 2);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.e.a d(int v) {
            this.a = v;
            this.e = (byte)(this.e | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$e$a
        public com.google.firebase.crashlytics.internal.model.F.f.e.a e(String s) {
            if(s == null) {
                throw new NullPointerException("Null version");
            }
            this.b = s;
            return this;
        }
    }

    private final int a;
    private final String b;
    private final String c;
    private final boolean d;

    private z(int v, String s, String s1, boolean z) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = z;
    }

    z(int v, String s, String s1, boolean z, a z$a0) {
        this(v, s, s1, z);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$e
    @NonNull
    public String b() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$e
    public int c() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$e
    @NonNull
    public String d() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$e
    public boolean e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof e) {
            int v = ((e)object0).c();
            if(this.a == v) {
                String s = ((e)object0).d();
                if(this.b.equals(s)) {
                    String s1 = ((e)object0).b();
                    if(this.c.equals(s1)) {
                        boolean z = ((e)object0).e();
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
        int v = (((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
        return this.d ? v ^ 0x4CF : v ^ 0x4D5;
    }

    @Override
    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}

