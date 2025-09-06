package com.dcinside.app.browser.helpers;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

public class a {
    public static Bitmap a(@NonNull Context context0, @DrawableRes int v, @ColorInt int v1) {
        return a.b(BitmapFactory.decodeResource(context0.getResources(), v), v1);
    }

    public static Bitmap b(@NonNull Bitmap bitmap0, @ColorInt int v) {
        int v1 = Color.alpha(v);
        int v2 = Color.red(v);
        int v3 = Color.green(v);
        int v4 = Color.blue(v);
        int v5 = bitmap0.getWidth() * bitmap0.getHeight();
        int[] arr_v = new int[v5];
        bitmap0.getPixels(arr_v, 0, bitmap0.getWidth(), 0, 0, bitmap0.getWidth(), bitmap0.getHeight());
        for(int v6 = 0; v6 < v5; ++v6) {
            int v7 = Color.alpha(arr_v[v6]);
            if(v7 != 0) {
                arr_v[v6] = Color.argb(((int)(((float)(v7 * v1)) / 256.0f)), v2, v3, v4);
            }
        }
        Bitmap bitmap1 = bitmap0.copy(Bitmap.Config.ARGB_8888, true);
        bitmap1.setPixels(arr_v, 0, bitmap0.getWidth(), 0, 0, bitmap0.getWidth(), bitmap0.getHeight());
        return bitmap1;
    }

    public static Bitmap c(int v, int v1, @ColorInt int v2) {
        Bitmap bitmap0 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
        int v3 = Color.alpha(v2);
        int v4 = Color.red(v2);
        int v5 = Color.green(v2);
        int v6 = Color.blue(v2);
        int[] arr_v = new int[v * v1];
        bitmap0.getPixels(arr_v, 0, v, 0, 0, v, v1);
        for(int v7 = 0; v7 < v1; ++v7) {
            float f = (float)(v1 - v7);
            int v8 = (int)(((float)v3) * f * f / ((float)v1) / ((float)v1));
            for(int v9 = 0; v9 < v; ++v9) {
                arr_v[v7 * v + v9] = Color.argb(v8, v4, v5, v6);
            }
        }
        bitmap0.setPixels(arr_v, 0, bitmap0.getWidth(), 0, 0, bitmap0.getWidth(), bitmap0.getHeight());
        return bitmap0;
    }
}

