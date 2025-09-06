package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class f {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract f a();

        @NonNull
        public abstract a b(@NonNull b arg1);

        @NonNull
        public abstract a c(@NonNull String arg1);

        @NonNull
        public abstract a d(long arg1);
    }

    public static enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR;

        private static b[] a() [...] // Inlined contents
    }

    @NonNull
    public static a a() {
        return new com.google.firebase.installations.remote.b.b().d(0L);
    }

    @Nullable
    public abstract b b();

    @Nullable
    public abstract String c();

    @NonNull
    public abstract long d();

    @NonNull
    public abstract a e();
}

