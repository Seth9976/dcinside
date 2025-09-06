package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.bitmap_recycle.f;
import com.bumptech.glide.load.engine.v;
import java.util.concurrent.locks.Lock;

final class y {
    class a extends f {
        a() {
            super();
        }

        @Override  // com.bumptech.glide.load.engine.bitmap_recycle.f
        public void e(Bitmap bitmap0) {
        }
    }

    private static final String a = "DrawableToBitmap";
    private static final e b;

    static {
        y.b = new a();
    }

    @Nullable
    static v a(e e0, Drawable drawable0, int v, int v1) {
        Bitmap bitmap0;
        Drawable drawable1 = drawable0.getCurrent();
        boolean z = false;
        if(drawable1 instanceof BitmapDrawable) {
            bitmap0 = ((BitmapDrawable)drawable1).getBitmap();
        }
        else if(drawable1 instanceof Animatable) {
            bitmap0 = null;
        }
        else {
            bitmap0 = y.b(e0, drawable1, v, v1);
            z = true;
        }
        if(!z) {
            e0 = y.b;
        }
        return h.c(bitmap0, e0);
    }

    @Nullable
    private static Bitmap b(e e0, Drawable drawable0, int v, int v1) {
        if(v == 0x80000000 && drawable0.getIntrinsicWidth() <= 0) {
            if(Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable0 + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if(v1 == 0x80000000 && drawable0.getIntrinsicHeight() <= 0) {
            if(Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable0 + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if(drawable0.getIntrinsicWidth() > 0) {
            v = drawable0.getIntrinsicWidth();
        }
        if(drawable0.getIntrinsicHeight() > 0) {
            v1 = drawable0.getIntrinsicHeight();
        }
        Lock lock0 = N.i();
        lock0.lock();
        Bitmap bitmap0 = e0.f(v, v1, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas0 = new Canvas(bitmap0);
            drawable0.setBounds(0, 0, v, v1);
            drawable0.draw(canvas0);
            canvas0.setBitmap(null);
            return bitmap0;
        }
        finally {
            lock0.unlock();
        }
    }
}

