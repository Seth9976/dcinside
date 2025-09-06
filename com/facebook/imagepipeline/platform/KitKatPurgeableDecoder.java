package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import com.facebook.common.internal.f;
import com.facebook.common.memory.i;
import com.facebook.imagepipeline.memory.y;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import k1.n.a;
import k1.n;
import p3.d;

@TargetApi(19)
@f
@n(a.a)
@d
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    private final y c;

    @f
    public KitKatPurgeableDecoder(y y0) {
        this.c = y0;
    }

    @Override  // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap e(com.facebook.common.references.a a0, BitmapFactory.Options bitmapFactory$Options0) {
        i i0 = (i)a0.n();
        int v = i0.size();
        com.facebook.common.references.a a1 = this.c.a(v);
        try {
            byte[] arr_b = (byte[])a1.n();
            i0.m(0, arr_b, 0, v);
            return (Bitmap)com.facebook.common.internal.n.j(BitmapFactory.decodeByteArray(arr_b, 0, v, bitmapFactory$Options0), "BitmapFactory returned null");
        }
        finally {
            com.facebook.common.references.a.j(a1);
        }
    }

    @Override  // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap f(com.facebook.common.references.a a0, int v, BitmapFactory.Options bitmapFactory$Options0) {
        byte[] arr_b = DalvikPurgeableDecoder.g(a0, v) ? null : DalvikPurgeableDecoder.b;
        i i0 = (i)a0.n();
        com.facebook.common.internal.n.d(Boolean.valueOf(v <= i0.size()));
        com.facebook.common.references.a a1 = this.c.a(v + 2);
        try {
            byte[] arr_b1 = (byte[])a1.n();
            i0.m(0, arr_b1, 0, v);
            if(arr_b != null) {
                KitKatPurgeableDecoder.j(arr_b1, v);
                v += 2;
            }
            return (Bitmap)com.facebook.common.internal.n.j(BitmapFactory.decodeByteArray(arr_b1, 0, v, bitmapFactory$Options0), "BitmapFactory returned null");
        }
        finally {
            com.facebook.common.references.a.j(a1);
        }
    }

    private static void j(byte[] arr_b, int v) {
        arr_b[v] = -1;
        arr_b[v + 1] = -39;
    }
}

