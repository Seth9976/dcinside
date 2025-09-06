package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;

final class b extends d {
    static class a {
    }

    static final class com.google.firebase.remoteconfig.interop.rollouts.b.b extends com.google.firebase.remoteconfig.interop.rollouts.d.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private long e;
        private byte f;

        @Override  // com.google.firebase.remoteconfig.interop.rollouts.d$a
        public d a() {
            if(this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
                return new b(this.a, this.b, this.c, this.d, this.e, null);
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" rolloutId");
            }
            if(this.b == null) {
                stringBuilder0.append(" variantId");
            }
            if(this.c == null) {
                stringBuilder0.append(" parameterKey");
            }
            if(this.d == null) {
                stringBuilder0.append(" parameterValue");
            }
            if((1 & this.f) == 0) {
                stringBuilder0.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.remoteconfig.interop.rollouts.d$a
        public com.google.firebase.remoteconfig.interop.rollouts.d.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.c = s;
            return this;
        }

        @Override  // com.google.firebase.remoteconfig.interop.rollouts.d$a
        public com.google.firebase.remoteconfig.interop.rollouts.d.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.d = s;
            return this;
        }

        @Override  // com.google.firebase.remoteconfig.interop.rollouts.d$a
        public com.google.firebase.remoteconfig.interop.rollouts.d.a d(String s) {
            if(s == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.a = s;
            return this;
        }

        @Override  // com.google.firebase.remoteconfig.interop.rollouts.d$a
        public com.google.firebase.remoteconfig.interop.rollouts.d.a e(long v) {
            this.e = v;
            this.f = (byte)(this.f | 1);
            return this;
        }

        @Override  // com.google.firebase.remoteconfig.interop.rollouts.d$a
        public com.google.firebase.remoteconfig.interop.rollouts.d.a f(String s) {
            if(s == null) {
                throw new NullPointerException("Null variantId");
            }
            this.b = s;
            return this;
        }
    }

    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final long k;

    private b(String s, String s1, String s2, String s3, long v) {
        this.g = s;
        this.h = s1;
        this.i = s2;
        this.j = s3;
        this.k = v;
    }

    b(String s, String s1, String s2, String s3, long v, a b$a0) {
        this(s, s1, s2, s3, v);
    }

    @Override  // com.google.firebase.remoteconfig.interop.rollouts.d
    @NonNull
    public String d() {
        return this.i;
    }

    @Override  // com.google.firebase.remoteconfig.interop.rollouts.d
    @NonNull
    public String e() {
        return this.j;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            String s = ((d)object0).f();
            if(this.g.equals(s)) {
                String s1 = ((d)object0).h();
                if(this.h.equals(s1)) {
                    String s2 = ((d)object0).d();
                    if(this.i.equals(s2)) {
                        String s3 = ((d)object0).e();
                        if(this.j.equals(s3)) {
                            long v = ((d)object0).g();
                            return this.k == v;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.remoteconfig.interop.rollouts.d
    @NonNull
    public String f() {
        return this.g;
    }

    @Override  // com.google.firebase.remoteconfig.interop.rollouts.d
    public long g() {
        return this.k;
    }

    @Override  // com.google.firebase.remoteconfig.interop.rollouts.d
    @NonNull
    public String h() {
        return this.h;
    }

    @Override
    public int hashCode() {
        return ((((this.g.hashCode() ^ 1000003) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode()) * 1000003 ^ this.j.hashCode()) * 1000003 ^ ((int)(this.k ^ this.k >>> 0x20));
    }

    @Override
    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.g + ", variantId=" + this.h + ", parameterKey=" + this.i + ", parameterValue=" + this.j + ", templateVersion=" + this.k + "}";
    }
}

