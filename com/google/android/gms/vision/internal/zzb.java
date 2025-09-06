package com.google.android.gms.vision.internal;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image.Plane;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.internal.vision.zzfe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class zzb {
    public static Bitmap zza(Bitmap bitmap0, int v, int v1, int v2) {
        if(v == 0) {
            return bitmap0;
        }
        Matrix matrix0 = new Matrix();
        matrix0.postRotate(((float)v));
        return Bitmap.createBitmap(bitmap0, 0, 0, v1, v2, matrix0, true);
    }

    public static Bitmap zza(ByteBuffer byteBuffer0, int v, int v1, int v2) throws IOException {
        byte[] arr_b;
        if(!byteBuffer0.hasArray() || byteBuffer0.arrayOffset() != 0) {
            byteBuffer0.rewind();
            int v3 = byteBuffer0.limit();
            byte[] arr_b1 = new byte[v3];
            byteBuffer0.get(arr_b1, 0, v3);
            arr_b = arr_b1;
        }
        else {
            arr_b = byteBuffer0.array();
        }
        byte[] arr_b2 = zzb.zza(arr_b, v, v1);
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b2, 0, arr_b2.length);
        return zzb.zza(bitmap0, v2, bitmap0.getWidth(), bitmap0.getHeight());
    }

    @RequiresApi(19)
    public static ByteBuffer zza(Image.Plane[] arr_image$Plane, int v, int v1) {
        int v2 = v * v1;
        byte[] arr_b = new byte[v2 / 4 * 2 + v2];
        ByteBuffer byteBuffer0 = arr_image$Plane[1].getBuffer();
        ByteBuffer byteBuffer1 = arr_image$Plane[2].getBuffer();
        int v3 = byteBuffer1.position();
        int v4 = byteBuffer0.limit();
        byteBuffer1.position(v3 + 1);
        byteBuffer0.limit(v4 - 1);
        int v5 = v2 * 2 / 4;
        boolean z = byteBuffer1.remaining() == v5 - 2 && byteBuffer1.compareTo(byteBuffer0) == 0;
        byteBuffer1.position(v3);
        byteBuffer0.limit(v4);
        if(z) {
            arr_image$Plane[0].getBuffer().get(arr_b, 0, v2);
            ByteBuffer byteBuffer2 = arr_image$Plane[1].getBuffer();
            arr_image$Plane[2].getBuffer().get(arr_b, v2, 1);
            byteBuffer2.get(arr_b, v2 + 1, v5 - 1);
            return ByteBuffer.wrap(arr_b);
        }
        zzb.zza(arr_image$Plane[0], v, v1, arr_b, 0, 1);
        zzb.zza(arr_image$Plane[1], v, v1, arr_b, v2 + 1, 2);
        zzb.zza(arr_image$Plane[2], v, v1, arr_b, v2, 2);
        return ByteBuffer.wrap(arr_b);
    }

    @TargetApi(19)
    private static void zza(Image.Plane image$Plane0, int v, int v1, byte[] arr_b, int v2, int v3) {
        ByteBuffer byteBuffer0 = image$Plane0.getBuffer();
        byteBuffer0.rewind();
        int v4 = (byteBuffer0.limit() + image$Plane0.getRowStride() - 1) / image$Plane0.getRowStride();
        if(v4 == 0) {
            return;
        }
        int v6 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            int v7 = v6;
            for(int v8 = 0; v8 < v / (v1 / v4); ++v8) {
                arr_b[v2] = byteBuffer0.get(v7);
                v2 += v3;
                v7 += image$Plane0.getPixelStride();
            }
            v6 += image$Plane0.getRowStride();
        }
    }

    private static byte[] zza(@NonNull byte[] arr_b, int v, int v1) throws IOException {
        byte[] arr_b1;
        YuvImage yuvImage0 = new YuvImage(arr_b, 17, v, v1, null);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            yuvImage0.compressToJpeg(new Rect(0, 0, v, v1), 100, byteArrayOutputStream0);
            arr_b1 = byteArrayOutputStream0.toByteArray();
        }
        catch(Throwable throwable0) {
            try {
                byteArrayOutputStream0.close();
            }
            catch(Throwable throwable1) {
                zzfe.zza(throwable0, throwable1);
            }
            throw throwable0;
        }
        byteArrayOutputStream0.close();
        return arr_b1;
    }
}

