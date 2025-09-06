package com.bytedance.adsdk.ugeno.XX;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.TypedValue;

public class Au {
    public static Handler PjT;
    private static TypedValue ReZ;
    private static final Object Zh;

    static {
        Au.Zh = new Object();
        Au.PjT = new Handler(Looper.getMainLooper());
    }

    public static float PjT(Context context0, float f) {
        return f * context0.getResources().getDisplayMetrics().density + 0.5f;
    }

    public static float PjT(Context context0, String s) {
        float f1;
        float f = context0.getResources().getDisplayMetrics().density;
        try {
            f1 = 0.0f;
            f1 = Float.parseFloat(s);
        }
        catch(NumberFormatException unused_ex) {
        }
        return f1 * f + 0.5f;
    }

    public static Bitmap PjT(Context context0, Bitmap bitmap0, int v) {
        try {
            if(Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, Math.round(((float)bitmap0.getWidth()) * 0.2f), Math.round(((float)bitmap0.getHeight()) * 0.2f), false);
            Bitmap bitmap2 = Bitmap.createBitmap(bitmap1);
            RenderScript renderScript0 = RenderScript.create(context0);
            if(renderScript0 == null) {
                return null;
            }
            ScriptIntrinsicBlur scriptIntrinsicBlur0 = ScriptIntrinsicBlur.create(renderScript0, Element.U8_4(renderScript0));
            Allocation allocation0 = Allocation.createFromBitmap(renderScript0, bitmap1);
            Allocation allocation1 = Allocation.createFromBitmap(renderScript0, bitmap2);
            scriptIntrinsicBlur0.setRadius(((float)v));
            scriptIntrinsicBlur0.setInput(allocation0);
            scriptIntrinsicBlur0.forEach(allocation1);
            allocation1.copyTo(bitmap2);
            return bitmap2;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static Drawable PjT(Context context0, int v) {
        return context0.getDrawable(v);
    }

    public static void PjT(Runnable runnable0) {
        if(Au.PjT()) {
            runnable0.run();
            return;
        }
        Au.PjT.post(runnable0);
    }

    public static boolean PjT() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static int Zh(Context context0, float f) {
        float f1 = context0.getResources().getDisplayMetrics().density;
        if(f1 <= 0.0f) {
            f1 = 1.0f;
        }
        return (int)(f / f1 + 0.5f);
    }
}

