package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class p {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract p a();

        @NonNull
        public abstract a b(@Nullable s arg1);

        @NonNull
        public abstract a c(@Nullable b arg1);
    }

    public static enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private final int a;
        private static final SparseArray d;

        static {
            SparseArray sparseArray0 = new SparseArray();
            b.d = sparseArray0;
            sparseArray0.put(0, b.b);
            sparseArray0.put(5, b.c);
        }

        private b(int v1) {
            this.a = v1;
        }

        @Nullable
        public static b a(int v) {
            return (b)b.d.get(v);
        }

        public int b() {
            return this.a;
        }
    }

    @NonNull
    public static a a() {
        return new com.google.android.datatransport.cct.internal.f.b();
    }

    @Nullable
    public abstract s b();

    @Nullable
    public abstract b c();
}

