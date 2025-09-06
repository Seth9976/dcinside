package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class g {
    @AutoValue.Builder
    public static abstract class a {
        public abstract g a();

        public abstract a b(Iterable arg1);

        public abstract a c(@Nullable byte[] arg1);
    }

    public static a a() {
        return new b();
    }

    public static g b(Iterable iterable0) {
        return g.a().b(iterable0).a();
    }

    public abstract Iterable c();

    @Nullable
    public abstract byte[] d();
}

