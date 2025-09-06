package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;

public class e {
    static class a {
    }

    public static class b {
        @StyleRes
        private int a;
        @StyleRes
        private int b;

        @NonNull
        public e c() {
            return new e(this, null);
        }

        @O1.a
        @NonNull
        public b d(@StyleRes int v) {
            this.b = v;
            return this;
        }

        @O1.a
        @NonNull
        public b e(@StyleRes int v) {
            this.a = v;
            return this;
        }
    }

    @StyleRes
    private final int a;
    @StyleRes
    private final int b;

    private e(b e$b0) {
        this.a = e$b0.a;
        this.b = e$b0.b;
    }

    e(b e$b0, a e$a0) {
        this(e$b0);
    }

    @StyleRes
    public int a() {
        return this.b;
    }

    @StyleRes
    public int b() {
        return this.a;
    }
}

