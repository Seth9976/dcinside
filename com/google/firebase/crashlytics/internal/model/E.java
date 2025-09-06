package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

final class e extends d {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.d.a {
        private String a;
        private String b;

        @Override  // com.google.firebase.crashlytics.internal.model.F$d$a
        public d a() {
            String s = this.a;
            if(s != null) {
                String s1 = this.b;
                if(s1 != null) {
                    return new e(s, s1, null);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" key");
            }
            if(this.b == null) {
                stringBuilder0.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$d$a
        public com.google.firebase.crashlytics.internal.model.F.d.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null key");
            }
            this.a = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$d$a
        public com.google.firebase.crashlytics.internal.model.F.d.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null value");
            }
            this.b = s;
            return this;
        }
    }

    private final String a;
    private final String b;

    private e(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    e(String s, String s1, a e$a0) {
        this(s, s1);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$d
    @NonNull
    public String b() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$d
    @NonNull
    public String c() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof d) {
            String s = ((d)object0).b();
            if(this.a.equals(s)) {
                String s1 = ((d)object0).c();
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
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }
}

