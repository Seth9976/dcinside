package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

final class v extends d {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.d.a {
        private String a;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$d$a
        public d a() {
            String s = this.a;
            if(s == null) {
                throw new IllegalStateException("Missing required properties: content");
            }
            return new v(s, null);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$d$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.d.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null content");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;

    private v(String s) {
        this.a = s;
    }

    v(String s, a v$a0) {
        this(s);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$d
    @NonNull
    public String b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            String s = ((d)object0).b();
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
        return "Log{content=" + this.a + "}";
    }
}

