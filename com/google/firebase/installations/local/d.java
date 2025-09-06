package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class d {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract d a();

        @NonNull
        public abstract a b(@Nullable String arg1);

        @NonNull
        public abstract a c(long arg1);

        @NonNull
        public abstract a d(@NonNull String arg1);

        @NonNull
        public abstract a e(@Nullable String arg1);

        @NonNull
        public abstract a f(@Nullable String arg1);

        @NonNull
        public abstract a g(@NonNull com.google.firebase.installations.local.c.a arg1);

        @NonNull
        public abstract a h(long arg1);
    }

    @NonNull
    public static d a;

    static {
        d.a = d.a().a();
    }

    @NonNull
    public static a a() {
        return new b().h(0L).g(com.google.firebase.installations.local.c.a.a).c(0L);
    }

    @Nullable
    public abstract String b();

    public abstract long c();

    @Nullable
    public abstract String d();

    @Nullable
    public abstract String e();

    @Nullable
    public abstract String f();

    @NonNull
    public abstract com.google.firebase.installations.local.c.a g();

    public abstract long h();

    public boolean i() {
        return this.g() == com.google.firebase.installations.local.c.a.e;
    }

    public boolean j() {
        return this.g() == com.google.firebase.installations.local.c.a.b || this.g() == com.google.firebase.installations.local.c.a.a;
    }

    public boolean k() {
        return this.g() == com.google.firebase.installations.local.c.a.d;
    }

    public boolean l() {
        return this.g() == com.google.firebase.installations.local.c.a.c;
    }

    public boolean m() {
        return this.g() == com.google.firebase.installations.local.c.a.a;
    }

    @NonNull
    public abstract a n();

    @NonNull
    public d o(@NonNull String s, long v, long v1) {
        return this.n().b(s).c(v).h(v1).a();
    }

    @NonNull
    public d p() {
        return this.n().b(null).a();
    }

    @NonNull
    public d q(@NonNull String s) {
        return this.n().e(s).g(com.google.firebase.installations.local.c.a.e).a();
    }

    @NonNull
    public d r() {
        return this.n().g(com.google.firebase.installations.local.c.a.b).a();
    }

    @NonNull
    public d s(@NonNull String s, @NonNull String s1, long v, @Nullable String s2, long v1) {
        return this.n().d(s).g(com.google.firebase.installations.local.c.a.d).b(s2).f(s1).c(v1).h(v).a();
    }

    @NonNull
    public d t(@NonNull String s) {
        return this.n().d(s).g(com.google.firebase.installations.local.c.a.c).a();
    }
}

