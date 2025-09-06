package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class p {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract p a();

        @NonNull
        public abstract a b(@NonNull String arg1);

        @NonNull
        public abstract a c(long arg1);

        @NonNull
        public abstract a d(long arg1);
    }

    @NonNull
    public static a a() {
        return new b();
    }

    @NonNull
    public abstract String b();

    @NonNull
    public abstract long c();

    @NonNull
    public abstract long d();

    @NonNull
    public abstract a e();
}

