package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class e {
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final int Y0 = 1;
        public static final int Z0 = 2;
        public static final int a1 = 3;
        public static final int b1 = 4;

    }

    private final int a;
    private final String b;

    public e(int v, @RecentlyNonNull String s) {
        this.a = v;
        this.b = s;
    }

    public int a() {
        return this.a;
    }

    @RecentlyNonNull
    public String b() {
        return this.b;
    }
}

