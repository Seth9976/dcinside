package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class u {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract u a();

        @NonNull
        public abstract a b(@Nullable o arg1);

        @NonNull
        public abstract a c(@Nullable List arg1);

        @NonNull
        abstract a d(@Nullable Integer arg1);

        @NonNull
        abstract a e(@Nullable String arg1);

        @NonNull
        public abstract a f(@Nullable x arg1);

        @NonNull
        public abstract a g(long arg1);

        @NonNull
        public abstract a h(long arg1);

        @NonNull
        public a i(int v) {
            return this.d(v);
        }

        @NonNull
        public a j(@NonNull String s) {
            return this.e(s);
        }
    }

    @NonNull
    public static a a() {
        return new b();
    }

    @Nullable
    public abstract o b();

    @Nullable
    @c2.a.a(name = "logEvent")
    public abstract List c();

    @Nullable
    public abstract Integer d();

    @Nullable
    public abstract String e();

    @Nullable
    public abstract x f();

    public abstract long g();

    public abstract long h();
}

