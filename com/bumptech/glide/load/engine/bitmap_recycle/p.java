package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.o;
import java.util.NavigableMap;

@RequiresApi(19)
final class p implements l {
    @VisibleForTesting
    static final class a implements m {
        private final b a;
        int b;

        a(b p$b0) {
            this.a = p$b0;
        }

        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.a.c(this);
        }

        public void b(int v) {
            this.b = v;
        }

        @Override
        public boolean equals(Object object0) {
            return object0 instanceof a && this.b == ((a)object0).b;
        }

        @Override
        public int hashCode() {
            return this.b;
        }

        @Override
        public String toString() {
            return "[" + this.b + "]";
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

        public a e(int v) {
            a p$a0 = (a)super.b();
            p$a0.b(v);
            return p$a0;
        }
    }

    private final b a;
    private final h b;
    private final NavigableMap c;
    private static final int d = 8;

    p() {
        this.a = new b();
        this.b = new h();
        this.c = new n();
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int v, int v1, Bitmap.Config bitmap$Config0) {
        return p.g(o.h(v, v1, bitmap$Config0));
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap0) {
        return o.i(bitmap0);
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap0) {
        return p.h(bitmap0);
    }

    private void d(Integer integer0) {
        Integer integer1 = (Integer)this.c.get(integer0);
        if(((int)integer1) == 1) {
            this.c.remove(integer0);
            return;
        }
        this.c.put(integer0, ((int)(((int)integer1) - 1)));
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void e(Bitmap bitmap0) {
        int v = o.i(bitmap0);
        a p$a0 = this.a.e(v);
        this.b.d(p$a0, bitmap0);
        Integer integer0 = (Integer)this.c.get(p$a0.b);
        this.c.put(p$a0.b, ((int)(integer0 == null ? 1 : ((int)integer0) + 1)));
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    @Nullable
    public Bitmap f(int v, int v1, Bitmap.Config bitmap$Config0) {
        int v2 = o.h(v, v1, bitmap$Config0);
        a p$a0 = this.a.e(v2);
        Integer integer0 = (Integer)this.c.ceilingKey(v2);
        if(integer0 != null && ((int)integer0) != v2 && ((int)integer0) <= v2 * 8) {
            this.a.c(p$a0);
            p$a0 = this.a.e(((int)integer0));
        }
        Bitmap bitmap0 = (Bitmap)this.b.a(p$a0);
        if(bitmap0 != null) {
            bitmap0.reconfigure(v, v1, bitmap$Config0);
            this.d(integer0);
        }
        return bitmap0;
    }

    static String g(int v) [...] // Inlined contents

    private static String h(Bitmap bitmap0) {
        return p.g(o.i(bitmap0));
    }

    @Override  // com.bumptech.glide.load.engine.bitmap_recycle.l
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmap0 = (Bitmap)this.b.f();
        if(bitmap0 != null) {
            this.d(o.i(bitmap0));
        }
        return bitmap0;
    }

    @Override
    public String toString() {
        return "SizeStrategy:\n  " + this.b + "\n  SortedSizes" + this.c;
    }
}

