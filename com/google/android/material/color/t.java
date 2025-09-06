package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.R.attr;

public class t {
    static class a {
    }

    public static class b {
        @ColorRes
        @NonNull
        private int[] a;
        @Nullable
        private r b;
        @AttrRes
        private int c;

        public b() {
            this.a = new int[0];
            this.c = attr.colorPrimary;
        }

        @NonNull
        public t d() {
            return new t(this, null);
        }

        @O1.a
        @NonNull
        public b e(@AttrRes int v) {
            this.c = v;
            return this;
        }

        @O1.a
        @NonNull
        public b f(@Nullable r r0) {
            this.b = r0;
            return this;
        }

        @O1.a
        @NonNull
        public b g(@ColorRes @NonNull int[] arr_v) {
            this.a = arr_v;
            return this;
        }
    }

    @ColorRes
    @NonNull
    private final int[] a;
    @Nullable
    private final r b;
    @AttrRes
    private final int c;

    private t(b t$b0) {
        this.a = t$b0.a;
        this.b = t$b0.b;
        this.c = t$b0.c;
    }

    t(b t$b0, a t$a0) {
        this(t$b0);
    }

    @NonNull
    public static t a() {
        return new b().f(r.c()).d();
    }

    @AttrRes
    public int b() {
        return this.c;
    }

    @Nullable
    public r c() {
        return this.b;
    }

    @ColorRes
    @NonNull
    public int[] d() {
        return this.a;
    }

    @StyleRes
    int e(@StyleRes int v) {
        return this.b == null || this.b.e() == 0 ? v : this.b.e();
    }
}

