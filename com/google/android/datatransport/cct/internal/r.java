package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class r {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract r a();

        @NonNull
        public abstract a b(@Nullable Integer arg1);
    }

    @NonNull
    public static a a() {
        return new b();
    }

    @Nullable
    public abstract Integer b();
}

