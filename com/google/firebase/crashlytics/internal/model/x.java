package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

final class x extends b {
    static class a {
    }

    static final class com.google.firebase.crashlytics.internal.model.x.b extends com.google.firebase.crashlytics.internal.model.F.f.d.e.b.a {
        private String a;
        private String b;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e$b$a
        public b a() {
            String s = this.a;
            if(s != null) {
                String s1 = this.b;
                if(s1 != null) {
                    return new x(s, s1, null);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" rolloutId");
            }
            if(this.b == null) {
                stringBuilder0.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e$b$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.e.b.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.a = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e$b$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.e.b.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null variantId");
            }
            this.b = s;
            return this;
        }
    }

    private final String a;
    private final String b;

    private x(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    x(String s, String s1, a x$a0) {
        this(s, s1);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e$b
    @NonNull
    public String b() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$e$b
    @NonNull
    public String c() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof b) {
            String s = ((b)object0).b();
            if(this.a.equals(s)) {
                String s1 = ((b)object0).c();
                return this.b.equals(s1);
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public String toString() {
        return "RolloutVariant{rolloutId=" + this.a + ", variantId=" + this.b + "}";
    }
}

