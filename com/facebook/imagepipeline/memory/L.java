package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.imageutils.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.m;

public class l extends B {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @y4.l
    public static final a c = null;
    @y4.l
    private static final String d = "BitmapPoolBackend";

    static {
        l.c = new a(null);
    }

    @Override  // com.facebook.imagepipeline.memory.K
    public int a(Object object0) {
        return this.e(((Bitmap)object0));
    }

    @m
    public Bitmap d(int v) {
        Bitmap bitmap0 = (Bitmap)super.get(v);
        if(bitmap0 != null && this.f(bitmap0)) {
            bitmap0.eraseColor(0);
            return bitmap0;
        }
        return null;
    }

    public int e(@y4.l Bitmap bitmap0) {
        L.p(bitmap0, "bitmap");
        return c.l(bitmap0);
    }

    protected final boolean f(@m Bitmap bitmap0) {
        if(bitmap0 == null) {
            return false;
        }
        if(bitmap0.isRecycled()) {
            x0.a.y0("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", new Object[]{bitmap0});
            return false;
        }
        if(!bitmap0.isMutable()) {
            x0.a.y0("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", new Object[]{bitmap0});
            return false;
        }
        return true;
    }

    public void g(@y4.l Bitmap bitmap0) {
        L.p(bitmap0, "bitmap");
        if(this.f(bitmap0)) {
            super.put(bitmap0);
        }
    }

    @Override  // com.facebook.imagepipeline.memory.B
    public Object get(int v) {
        return this.d(v);
    }

    @Override  // com.facebook.imagepipeline.memory.B
    public void put(Object object0) {
        this.g(((Bitmap)object0));
    }
}

