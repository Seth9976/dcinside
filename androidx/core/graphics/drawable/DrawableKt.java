package androidx.core.graphics.drawable;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,118:1\n37#2,31:119\n*S KotlinDebug\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n*L\n66#1:119,31\n*E\n"})
public final class DrawableKt {
    @l
    public static final Bitmap a(@l Drawable drawable0, @Px int v, @Px int v1, @m Bitmap.Config bitmap$Config0) {
        if(drawable0 instanceof BitmapDrawable) {
            if(((BitmapDrawable)drawable0).getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if(bitmap$Config0 == null || ((BitmapDrawable)drawable0).getBitmap().getConfig() == bitmap$Config0) {
                return v != ((BitmapDrawable)drawable0).getBitmap().getWidth() || v1 != ((BitmapDrawable)drawable0).getBitmap().getHeight() ? Bitmap.createScaledBitmap(((BitmapDrawable)drawable0).getBitmap(), v, v1, true) : ((BitmapDrawable)drawable0).getBitmap();
            }
        }
        Rect rect0 = drawable0.getBounds();
        int v2 = rect0.left;
        int v3 = rect0.top;
        int v4 = rect0.right;
        int v5 = rect0.bottom;
        if(bitmap$Config0 == null) {
            bitmap$Config0 = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmap0 = Bitmap.createBitmap(v, v1, bitmap$Config0);
        drawable0.setBounds(0, 0, v, v1);
        drawable0.draw(new Canvas(bitmap0));
        drawable0.setBounds(v2, v3, v4, v5);
        return bitmap0;
    }

    public static Bitmap b(Drawable drawable0, int v, int v1, Bitmap.Config bitmap$Config0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = drawable0.getIntrinsicWidth();
        }
        if((v2 & 2) != 0) {
            v1 = drawable0.getIntrinsicHeight();
        }
        if((v2 & 4) != 0) {
            bitmap$Config0 = null;
        }
        return DrawableKt.a(drawable0, v, v1, bitmap$Config0);
    }

    @m
    public static final Bitmap c(@l Drawable drawable0, @Px int v, @Px int v1, @m Bitmap.Config bitmap$Config0) {
        return !(drawable0 instanceof BitmapDrawable) || ((BitmapDrawable)drawable0).getBitmap() != null ? DrawableKt.a(drawable0, v, v1, bitmap$Config0) : null;
    }

    public static Bitmap d(Drawable drawable0, int v, int v1, Bitmap.Config bitmap$Config0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = drawable0.getIntrinsicWidth();
        }
        if((v2 & 2) != 0) {
            v1 = drawable0.getIntrinsicHeight();
        }
        if((v2 & 4) != 0) {
            bitmap$Config0 = null;
        }
        return DrawableKt.c(drawable0, v, v1, bitmap$Config0);
    }

    public static final void e(@l Drawable drawable0, @Px int v, @Px int v1, @Px int v2, @Px int v3) {
        drawable0.setBounds(v, v1, v2, v3);
    }

    public static void f(Drawable drawable0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = drawable0.getBounds().left;
        }
        if((v4 & 2) != 0) {
            v1 = drawable0.getBounds().top;
        }
        if((v4 & 4) != 0) {
            v2 = drawable0.getBounds().right;
        }
        if((v4 & 8) != 0) {
            v3 = drawable0.getBounds().bottom;
        }
        DrawableKt.e(drawable0, v, v1, v2, v3);
    }
}

