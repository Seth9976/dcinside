package com.bytedance.sdk.component.JQp.cr.ReZ.Zh;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.widget.ImageView.ScaleType;

public class PjT {
    private final ImageView.ScaleType Au;
    private final int DWo;
    private int JQp;
    public static final ImageView.ScaleType PjT;
    private final Bitmap.Config ReZ;
    private final int SM;
    private final int XX;
    public static final Bitmap.Config Zh;
    private int cr;
    private final int cz;

    static {
        PjT.PjT = ImageView.ScaleType.CENTER_INSIDE;
        PjT.Zh = Bitmap.Config.ARGB_4444;
    }

    public PjT(int v, int v1, ImageView.ScaleType imageView$ScaleType0, Bitmap.Config bitmap$Config0, int v2, int v3) {
        this.SM = 0x500;
        this.DWo = 0x5000000;
        this.ReZ = bitmap$Config0;
        this.cr = v;
        this.JQp = v1;
        this.Au = imageView$ScaleType0;
        this.cz = v2;
        this.XX = v3;
        this.PjT(v, v1);
    }

    private static int PjT(int v, int v1, int v2, int v3) {
        if(v == 0 && v1 == 0) {
            return v2;
        }
        if(v == 0) {
            return (int)(((double)v2) * (((double)v1) / ((double)v3)));
        }
        if(v1 == 0) {
            return v;
        }
        double f = ((double)v3) / ((double)v2);
        return ((double)v) * f > ((double)v1) ? ((int)(((double)v1) / f)) : v;
    }

    static int PjT(int v, int v1, int v2, int v3, int v4, int v5) {
        double f = Math.min(((double)v) / ((double)v2), ((double)v1) / ((double)v3));
        if(v4 > 0 && v5 > 0) {
            f = Math.max(f, Math.min(((double)Math.max(v, v1)) / ((double)Math.max(v4, v5)), ((double)Math.min(v, v1)) / ((double)Math.min(v4, v5))));
        }
        return Integer.highestOneBit(((int)f));
    }

    private void PjT(int v, int v1) {
        if(v > 0x500 && v1 > 0x500) {
            if(v > v1) {
                this.cr = 0x500;
                this.JQp = v1 * 0x500 / v;
                return;
            }
            this.cr = v * 0x500 / v1;
            this.JQp = 0x500;
            return;
        }
        if(v > 0x500) {
            this.cr = 0x500;
            this.JQp = v1 * 0x500 / v;
            return;
        }
        if(v1 > 0x500) {
            this.cr = v * 0x500 / v1;
            this.JQp = 0x500;
        }
    }

    public Bitmap PjT(byte[] arr_b) {
        Bitmap bitmap0;
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        if(this.cr != 0 || this.JQp != 0) {
            bitmapFactory$Options0.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
            int v = PjT.PjT(this.cr, this.JQp, bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight);
            int v1 = PjT.PjT(this.JQp, this.cr, bitmapFactory$Options0.outHeight, bitmapFactory$Options0.outWidth);
            bitmapFactory$Options0.inJustDecodeBounds = false;
            bitmapFactory$Options0.inSampleSize = PjT.PjT(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight, v, v1, this.cz, this.XX);
            bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
            if(bitmap0 != null && (bitmap0.getWidth() > v || bitmap0.getHeight() > v1)) {
                Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, v, v1, true);
                if(bitmap1 != bitmap0) {
                    bitmap0.recycle();
                }
                bitmap0 = bitmap1;
            }
        }
        else {
            bitmapFactory$Options0.inPreferredConfig = this.ReZ;
            bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
        }
        if(bitmap0 != null && bitmap0.getByteCount() > 0x5000000) {
            int v2 = bitmap0.getWidth();
            int v3 = bitmap0.getHeight();
            if(v2 / 2 > 0 && v3 / 2 > 0) {
                Bitmap bitmap2 = Bitmap.createScaledBitmap(bitmap0, v2 / 2, v3 / 2, true);
                if(bitmap2 != bitmap0) {
                    bitmap0.recycle();
                }
                return bitmap2;
            }
        }
        return bitmap0;
    }
}

