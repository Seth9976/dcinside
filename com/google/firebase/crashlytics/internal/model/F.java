package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

final class f extends e {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.e.a {
        private List a;
        private String b;

        b() {
        }

        private b(e f$e0) {
            this.a = f$e0.b();
            this.b = f$e0.c();
        }

        b(e f$e0, a f$a0) {
            this(f$e0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$e$a
        public e a() {
            List list0 = this.a;
            if(list0 == null) {
                throw new IllegalStateException("Missing required properties: files");
            }
            return new f(list0, this.b, null);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$e$a
        public com.google.firebase.crashlytics.internal.model.F.e.a b(List list0) {
            if(list0 == null) {
                throw new NullPointerException("Null files");
            }
            this.a = list0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$e$a
        public com.google.firebase.crashlytics.internal.model.F.e.a c(String s) {
            this.b = s;
            return this;
        }
    }

    private final List a;
    private final String b;

    private f(List list0, @Nullable String s) {
        this.a = list0;
        this.b = s;
    }

    f(List list0, String s, a f$a0) {
        this(list0, s);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$e
    @NonNull
    public List b() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$e
    @Nullable
    public String c() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$e
    com.google.firebase.crashlytics.internal.model.F.e.a d() {
        return new b(this, null);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof e) {
            List list0 = ((e)object0).b();
            if(this.a.equals(list0)) {
                return this.b == null ? ((e)object0).c() == null : this.b.equals(((e)object0).c());
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? (v ^ 1000003) * 1000003 : (v ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }
}

