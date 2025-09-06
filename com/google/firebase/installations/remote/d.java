package com.google.firebase.installations.remote;

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
        public abstract a b(@NonNull f arg1);

        @NonNull
        public abstract a c(@NonNull String arg1);

        @NonNull
        public abstract a d(@NonNull String arg1);

        @NonNull
        public abstract a e(@NonNull b arg1);

        @NonNull
        public abstract a f(@NonNull String arg1);
    }

    public static enum b {
        OK,
        BAD_CONFIG;

        private static b[] a() [...] // Inlined contents
    }

    @NonNull
    public static a a() {
        return new com.google.firebase.installations.remote.a.b();
    }

    @Nullable
    public abstract f b();

    @Nullable
    public abstract String c();

    @Nullable
    public abstract String d();

    @Nullable
    public abstract b e();

    @Nullable
    public abstract String f();

    @NonNull
    public abstract a g();
}

