package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class o {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract o a();

        @NonNull
        public abstract a b(@Nullable com.google.android.datatransport.cct.internal.a arg1);

        @NonNull
        public abstract a c(@Nullable b arg1);
    }

    public static enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int a;

        private b(int v1) {
            this.a = v1;
        }
    }

    @NonNull
    public static a a() {
        return new com.google.android.datatransport.cct.internal.e.b();
    }

    @Nullable
    public abstract com.google.android.datatransport.cct.internal.a b();

    @Nullable
    public abstract b c();
}

