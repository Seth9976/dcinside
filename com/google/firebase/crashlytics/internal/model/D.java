package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

final class d extends a {
    static class com.google.firebase.crashlytics.internal.model.d.a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.a.a.a {
        private String a;
        private String b;
        private String c;

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$a$a
        public a a() {
            String s = this.a;
            if(s != null) {
                String s1 = this.b;
                if(s1 != null) {
                    String s2 = this.c;
                    if(s2 != null) {
                        return new d(s, s1, s2, null);
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" arch");
            }
            if(this.b == null) {
                stringBuilder0.append(" libraryName");
            }
            if(this.c == null) {
                stringBuilder0.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$a$a
        public com.google.firebase.crashlytics.internal.model.F.a.a.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null arch");
            }
            this.a = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$a$a
        public com.google.firebase.crashlytics.internal.model.F.a.a.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null buildId");
            }
            this.c = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$a$a$a
        public com.google.firebase.crashlytics.internal.model.F.a.a.a d(String s) {
            if(s == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.b = s;
            return this;
        }
    }

    private final String a;
    private final String b;
    private final String c;

    private d(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    d(String s, String s1, String s2, com.google.firebase.crashlytics.internal.model.d.a d$a0) {
        this(s, s1, s2);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a$a
    @NonNull
    public String b() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a$a
    @NonNull
    public String c() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$a$a
    @NonNull
    public String d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            String s = ((a)object0).b();
            if(this.a.equals(s)) {
                String s1 = ((a)object0).d();
                if(this.b.equals(s1)) {
                    String s2 = ((a)object0).c();
                    return this.c.equals(s2);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.a + ", libraryName=" + this.b + ", buildId=" + this.c + "}";
    }
}

