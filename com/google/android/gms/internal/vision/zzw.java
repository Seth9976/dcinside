package com.google.android.gms.internal.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

public final class zzw {
    public static Bitmap zza(Bitmap bitmap0, zzs zzs0) {
        int v2;
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        if(zzs0.zze != 0) {
            Matrix matrix0 = new Matrix();
            switch(zzs0.zze) {
                case 0: {
                    v2 = 0;
                    break;
                }
                case 1: {
                    v2 = 90;
                    break;
                }
                case 2: {
                    v2 = 180;
                    break;
                }
                case 3: {
                    v2 = 270;
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unsupported rotation degree.");
                }
            }
            matrix0.postRotate(((float)v2));
            bitmap0 = Bitmap.createBitmap(bitmap0, 0, 0, v, v1, matrix0, false);
        }
        if(zzs0.zze == 1 || zzs0.zze == 3) {
            zzs0.zza = v1;
            zzs0.zzb = v;
        }
        return bitmap0;
    }

    public static ByteBuffer zza(Bitmap bitmap0, boolean z) {
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        int v2 = v * v1;
        ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(((v + 1) / 2 * ((v1 + 1) / 2) << 1) + v2);
        int v4 = v2;
        for(int v3 = 0; v3 < v2; ++v3) {
            int v5 = v3 % v;
            int v6 = v3 / v;
            int v7 = bitmap0.getPixel(v5, v6);
            float f = (float)Color.red(v7);
            float f1 = (float)Color.green(v7);
            float f2 = (float)Color.blue(v7);
            byteBuffer0.put(v3, ((byte)(((int)(0.299f * f + 0.587f * f1 + 0.114f * f2)))));
            if(v6 % 2 == 0 && v5 % 2 == 0) {
                int v8 = v4 + 1;
                byteBuffer0.put(v4, ((byte)(((int)(-0.169f * f + -0.331f * f1 + f2 * 0.5f + 128.0f)))));
                v4 += 2;
                byteBuffer0.put(v8, ((byte)(((int)(f * 0.5f + f1 * -0.419f + f2 * -0.081f + 128.0f)))));
            }
        }
        return byteBuffer0;
    }
}

