package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class q {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract q a();

        @NonNull
        public abstract a b(@Nullable byte[] arg1);

        @NonNull
        public abstract a c(@Nullable byte[] arg1);
    }

    @NonNull
    public static a a() {
        return new b();
    }

    @Nullable
    public abstract byte[] b();

    @Nullable
    public abstract byte[] c();
}

