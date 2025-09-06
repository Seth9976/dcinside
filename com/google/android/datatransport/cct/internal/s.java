package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class s {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract s a();

        @NonNull
        public abstract a b(@Nullable r arg1);
    }

    @NonNull
    public static a a() {
        return new b();
    }

    @Nullable
    public abstract r b();
}

