package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class g {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract g a();

        @NonNull
        public abstract a b(byte[] arg1);

        @NonNull
        public abstract a c(byte[] arg1);

        @NonNull
        public abstract a d(String arg1);
    }

    public static a a() {
        return new b();
    }

    @Nullable
    public abstract byte[] b();

    @Nullable
    public abstract byte[] c();

    @Nullable
    public abstract String d();
}

