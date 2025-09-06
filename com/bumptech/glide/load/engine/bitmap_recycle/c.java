package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.o;

class c implements l {
    @VisibleForTesting
    static class a implements m {
        private final b a;
        private int b;
        private int c;
        private Bitmap.Config d;

        public a(b c$b0) {
            this.a = c$b0;
        }

        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.a.c(this);
        }

        public void b(int v, int v1, Bitmap.Config bitmap$Config0) {
            this.b = v;
            this.c = v1;
            this.d = bitmap$Config0;
        }

        @Override
        public boolean equals(Object object0) {
            return object0 instanceof a && this.b == ((a)object0).b && this.c == ((a)object0).c && this.d == ((a)object0).d;
        }

        @Override
        public int hashCode() {
            int v = (this.b * 0x1F + this.c) * 0x1F;
            return this.d == null ? v : v + this.d.hashCode();
        }

        @Override
        public String toString() {
            return "[" + this.b + "x" + this.c + "], " + this.d;
        }
    }

    @VisibleForTesting
    static class b extends d {
        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.d
        protected m a() {
            return this.d();
        }

        protected a d() {
            return new a(this);
        }

        a e(int v, int v1, Bitmap.Config bitmap$Config0) {
            a c$a0 = (a)this.b();
            c$a0.b(v, v1, bitmap$Config0);
            return c$a0;
        }
    }

    private final b a;
    private final h b;

    c() {
        this.a = new b();
        this.b = new h();
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int v, int v1, Bitmap.Config bitmap$Config0) {
        return "[" + v + "x" + v1 + "], " + bitmap$Config0;
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap0) {
        return o.i(bitmap0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap0) {
        return c.g(bitmap0);
    }

    static String d(int v, int v1, Bitmap.Config bitmap$Config0) [...] // Inlined contents

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void e(Bitmap bitmap0) {
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        Bitmap.Config bitmap$Config0 = bitmap0.getConfig();
        a c$a0 = this.a.e(v, v1, bitmap$Config0);
        this.b.d(c$a0, bitmap0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap f(int v, int v1, Bitmap.Config bitmap$Config0) {
        a c$a0 = this.a.e(v, v1, bitmap$Config0);
        return (Bitmap)this.b.a(c$a0);
    }

    private static String g(Bitmap bitmap0) {
        return c.d(bitmap0.getWidth(), bitmap0.getHeight(), bitmap0.getConfig());
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public Bitmap removeLast() {
        return (Bitmap)this.b.f();
    }

    @Override
    public String toString() {
        return "AttributeStrategy:\n  " + this.b;
    }
}

