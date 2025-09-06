package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class t {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract t a();

        @NonNull
        public abstract a b(@Nullable p arg1);

        @NonNull
        public abstract a c(@Nullable Integer arg1);

        @NonNull
        public abstract a d(long arg1);

        @NonNull
        public abstract a e(long arg1);

        @NonNull
        public abstract a f(@Nullable q arg1);

        @NonNull
        public abstract a g(@Nullable w arg1);

        @NonNull
        abstract a h(@Nullable byte[] arg1);

        @NonNull
        abstract a i(@Nullable String arg1);

        @NonNull
        public abstract a j(long arg1);
    }

    private static a a() {
        return new b();
    }

    @Nullable
    public abstract p b();

    @Nullable
    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    @Nullable
    public abstract q f();

    @Nullable
    public abstract w g();

    @Nullable
    public abstract byte[] h();

    @Nullable
    public abstract String i();

    public abstract long j();

    @NonNull
    public static a k(@NonNull String s) {
        return t.a().i(s);
    }

    @NonNull
    public static a l(@NonNull byte[] arr_b) {
        return t.a().h(arr_b);
    }
}

