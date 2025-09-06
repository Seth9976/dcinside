package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import com.facebook.common.references.h;
import k1.n.a;
import k1.n;

@n(a.a)
public class g implements h {
    private static g a;

    @Override  // com.facebook.common.references.h
    public void a(Object object0) {
        this.c(((Bitmap)object0));
    }

    public static g b() {
        if(g.a == null) {
            g.a = new g();
        }
        return g.a;
    }

    public void c(Bitmap bitmap0) {
        bitmap0.recycle();
    }
}

