package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class b extends f {
    static class a {
    }

    static final class com.google.firebase.installations.remote.b.b extends com.google.firebase.installations.remote.f.a {
        private String a;
        private Long b;
        private com.google.firebase.installations.remote.f.b c;

        com.google.firebase.installations.remote.b.b() {
        }

        private com.google.firebase.installations.remote.b.b(f f0) {
            this.a = f0.c();
            this.b = f0.d();
            this.c = f0.b();
        }

        com.google.firebase.installations.remote.b.b(f f0, a b$a0) {
            this(f0);
        }

        @Override  // com.google.firebase.installations.remote.f$a
        public f a() {
            String s = this.b == null ? " tokenExpirationTimestamp" : "";
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new b(this.a, ((long)this.b), this.c, null);
        }

        @Override  // com.google.firebase.installations.remote.f$a
        public com.google.firebase.installations.remote.f.a b(com.google.firebase.installations.remote.f.b f$b0) {
            this.c = f$b0;
            return this;
        }

        @Override  // com.google.firebase.installations.remote.f$a
        public com.google.firebase.installations.remote.f.a c(String s) {
            this.a = s;
            return this;
        }

        @Override  // com.google.firebase.installations.remote.f$a
        public com.google.firebase.installations.remote.f.a d(long v) {
            this.b = v;
            return this;
        }
    }

    private final String a;
    private final long b;
    private final com.google.firebase.installations.remote.f.b c;

    private b(@Nullable String s, long v, @Nullable com.google.firebase.installations.remote.f.b f$b0) {
        this.a = s;
        this.b = v;
        this.c = f$b0;
    }

    b(String s, long v, com.google.firebase.installations.remote.f.b f$b0, a b$a0) {
        this(s, v, f$b0);
    }

    @Override  // com.google.firebase.installations.remote.f
    @Nullable
    public com.google.firebase.installations.remote.f.b b() {
        return this.c;
    }

    @Override  // com.google.firebase.installations.remote.f
    @Nullable
    public String c() {
        return this.a;
    }

    @Override  // com.google.firebase.installations.remote.f
    @NonNull
    public long d() {
        return this.b;
    }

    @Override  // com.google.firebase.installations.remote.f
    public com.google.firebase.installations.remote.f.a e() {
        return new com.google.firebase.installations.remote.b.b(this, null);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof f) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((f)object0).c())) {
                label_8:
                    long v = ((f)object0).d();
                    if(this.b == v) {
                        return this.c == null ? ((f)object0).b() == null : this.c.equals(((f)object0).b());
                    }
                }
            }
            else if(((f)object0).c() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = (((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003;
        com.google.firebase.installations.remote.f.b f$b0 = this.c;
        if(f$b0 != null) {
            v = f$b0.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}

