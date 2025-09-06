package com.fsn.cauly.blackdragoncore.utils;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.fsn.cauly.blackdragoncore.b;

public class f {
    public static int a(Context context0, int v) {
        return d.c(context0) <= d.a(context0) ? d.c(context0) * v / 720 : d.a(context0) * v / 720;
    }

    public static Bitmap a(Bitmap bitmap0, int v) {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0.getWidth(), bitmap0.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap1);
        Paint paint0 = new Paint();
        Rect rect0 = new Rect(0, 0, bitmap0.getWidth(), bitmap0.getHeight());
        RectF rectF0 = new RectF(rect0);
        paint0.setAntiAlias(true);
        canvas0.drawARGB(0, 0, 0, 0);
        paint0.setColor(0xFF424242);
        canvas0.drawRoundRect(rectF0, ((float)v), ((float)v), paint0);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas0.drawBitmap(bitmap0, rect0, rect0, paint0);
        return bitmap1;
    }

    // 去混淆评级： 低(20)
    public static Bitmap a(Bitmap bitmap0, int v, int v1, boolean z) {
        return f.a(v, v1, 2) ? Bitmap.createScaledBitmap(bitmap0, v, v1, z) : bitmap0;
    }

    public static Bitmap a(String s) {
        if(b.d) {
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(s, bitmapFactory$Options0);
            return f.a(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight, 2) ? BitmapFactory.decodeFile(s) : null;
        }
        return BitmapFactory.decodeFile(s);
    }

    public static Bitmap a(byte[] arr_b) {
        if(b.d) {
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
            return f.a(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight, 2) ? BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length) : null;
        }
        return BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
    }

    public static boolean a(long v, long v1, int v2) {
        return !b.d || v * v1 * ((long)v2) / 2L + 0x400000L < ((long)(((int)(Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory() + Runtime.getRuntime().freeMemory()))));
    }

    public static boolean a(View view0, Bitmap bitmap0) {
        if(view0.getWidth() * view0.getHeight() == 0) {
            return false;
        }
        view0.draw(new Canvas(bitmap0));
        return true;
    }
}

