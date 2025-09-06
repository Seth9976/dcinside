package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap.Config;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.m;

public final class d {
    public static class a {
        private final int a;
        private final int b;
        private Bitmap.Config c;
        private int d;

        public a(int v) {
            this(v, v);
        }

        public a(int v, int v1) {
            this.d = 1;
            if(v <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if(v1 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.a = v;
            this.b = v1;
        }

        d a() {
            return new d(this.a, this.b, this.c, this.d);
        }

        Bitmap.Config b() {
            return this.c;
        }

        public a c(@Nullable Bitmap.Config bitmap$Config0) {
            this.c = bitmap$Config0;
            return this;
        }

        public a d(int v) {
            if(v <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.d = v;
            return this;
        }
    }

    private final int a;
    private final int b;
    private final Bitmap.Config c;
    private final int d;
    @VisibleForTesting
    static final Bitmap.Config e;

    static {
        d.e = Bitmap.Config.RGB_565;
    }

    d(int v, int v1, Bitmap.Config bitmap$Config0, int v2) {
        this.c = (Bitmap.Config)m.f(bitmap$Config0, "Config must not be null");
        this.a = v;
        this.b = v1;
        this.d = v2;
    }

    Bitmap.Config a() {
        return this.c;
    }

    int b() {
        return this.b;
    }

    int c() {
        return this.d;
    }

    int d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof d && this.b == ((d)object0).b && this.a == ((d)object0).a && this.d == ((d)object0).d && this.c == ((d)object0).c;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c.hashCode()) * 0x1F + this.d;
    }

    @Override
    public String toString() {
        return "PreFillSize{width=" + this.a + ", height=" + this.b + ", config=" + this.c + ", weight=" + this.d + '}';
    }
}

