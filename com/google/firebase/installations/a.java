package com.google.firebase.installations;

import androidx.annotation.NonNull;

final class a extends p {
    static class com.google.firebase.installations.a.a {
    }

    static final class b extends com.google.firebase.installations.p.a {
        private String a;
        private Long b;
        private Long c;

        b() {
        }

        private b(p p0) {
            this.a = p0.b();
            this.b = p0.d();
            this.c = p0.c();
        }

        b(p p0, com.google.firebase.installations.a.a a$a0) {
            this(p0);
        }

        @Override  // com.google.firebase.installations.p$a
        public p a() {
            String s = this.a == null ? " token" : "";
            if(this.b == null) {
                s = s + " tokenExpirationTimestamp";
            }
            if(this.c == null) {
                s = s + " tokenCreationTimestamp";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new a(this.a, ((long)this.b), ((long)this.c), null);
        }

        @Override  // com.google.firebase.installations.p$a
        public com.google.firebase.installations.p.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null token");
            }
            this.a = s;
            return this;
        }

        @Override  // com.google.firebase.installations.p$a
        public com.google.firebase.installations.p.a c(long v) {
            this.c = v;
            return this;
        }

        @Override  // com.google.firebase.installations.p$a
        public com.google.firebase.installations.p.a d(long v) {
            this.b = v;
            return this;
        }
    }

    private final String a;
    private final long b;
    private final long c;

    private a(String s, long v, long v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    a(String s, long v, long v1, com.google.firebase.installations.a.a a$a0) {
        this(s, v, v1);
    }

    @Override  // com.google.firebase.installations.p
    @NonNull
    public String b() {
        return this.a;
    }

    @Override  // com.google.firebase.installations.p
    @NonNull
    public long c() {
        return this.c;
    }

    @Override  // com.google.firebase.installations.p
    @NonNull
    public long d() {
        return this.b;
    }

    @Override  // com.google.firebase.installations.p
    public com.google.firebase.installations.p.a e() {
        return new b(this, null);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof p) {
            String s = ((p)object0).b();
            if(this.a.equals(s)) {
                long v = ((p)object0).d();
                if(this.b == v) {
                    long v1 = ((p)object0).c();
                    return this.c == v1;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20));
    }

    @Override
    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }
}

