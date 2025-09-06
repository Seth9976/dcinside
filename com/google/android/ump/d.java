package com.google.android.ump;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

public class d {
    public static final class a {
        private boolean a;
        @Nullable
        private String b;
        @Nullable
        private com.google.android.ump.a c;

        @RecentlyNonNull
        public d a() {
            return new d(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public a b(@Nullable String s) {
            this.b = s;
            return this;
        }

        @RecentlyNonNull
        public a c(@Nullable com.google.android.ump.a a0) {
            this.c = a0;
            return this;
        }

        @RecentlyNonNull
        public a d(boolean z) {
            this.a = z;
            return this;
        }
    }

    private final boolean a;
    @Nullable
    private final String b;
    @Nullable
    private final com.google.android.ump.a c;

    d(a d$a0, h h0) {
        this.a = d$a0.a;
        this.b = d$a0.b;
        this.c = d$a0.c;
    }

    @RecentlyNullable
    public com.google.android.ump.a a() {
        return this.c;
    }

    public boolean b() {
        return this.a;
    }

    @RecentlyNullable
    public final String c() {
        return this.b;
    }
}

