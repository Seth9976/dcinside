package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

final class j extends b {
    static class a {
    }

    static final class com.google.firebase.crashlytics.internal.model.j.b extends com.google.firebase.crashlytics.internal.model.F.f.a.b.a {
        private String a;

        com.google.firebase.crashlytics.internal.model.j.b() {
        }

        private com.google.firebase.crashlytics.internal.model.j.b(b f$f$a$b0) {
            this.a = f$f$a$b0.b();
        }

        com.google.firebase.crashlytics.internal.model.j.b(b f$f$a$b0, a j$a0) {
            this(f$f$a$b0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$b$a
        public b a() {
            String s = this.a;
            if(s == null) {
                throw new IllegalStateException("Missing required properties: clsId");
            }
            return new j(s, null);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$b$a
        public com.google.firebase.crashlytics.internal.model.F.f.a.b.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null clsId");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;

    private j(String s) {
        this.a = s;
    }

    j(String s, a j$a0) {
        this(s);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$b
    @NonNull
    public String b() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$a$b
    protected com.google.firebase.crashlytics.internal.model.F.f.a.b.a c() {
        return new com.google.firebase.crashlytics.internal.model.j.b(this, null);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof b) {
            String s = ((b)object0).b();
            return this.a.equals(s);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public String toString() {
        return "Organization{clsId=" + this.a + "}";
    }
}

