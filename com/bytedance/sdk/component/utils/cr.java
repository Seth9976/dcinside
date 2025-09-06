package com.bytedance.sdk.component.utils;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

public class cr {
    public static Bitmap PjT(Bitmap bitmap0, int v, int v1) {
        if(bitmap0 == null) {
            return null;
        }
        if(v > 0 && v1 > 0) {
            try {
                int v2 = bitmap0.getWidth();
                int v3 = bitmap0.getHeight();
                if(v < v2 && v1 < v3) {
                    Matrix matrix0 = new Matrix();
                    matrix0.postScale(((float)v) / ((float)v2), ((float)v1) / ((float)v3));
                    return Bitmap.createBitmap(bitmap0, 0, 0, v2, v3, matrix0, true);
                }
                return bitmap0;
            }
            catch(Throwable throwable0) {
                throwable0.getMessage();
                return null;
            }
        }
        return bitmap0;
    }

    public static Bitmap PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            byte[] arr_b = Base64.decode(s, 0);
            return BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static byte[] PjT(Bitmap bitmap0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(bitmap0.getByteCount());
        bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }
}

