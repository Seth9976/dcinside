package com.bytedance.adsdk.Zh.ReZ;

import android.graphics.PointF;

public class Zh {
    public static enum PjT {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER;

    }

    public int Au;
    public float DWo;
    public int JQp;
    public String PjT;
    public float ReZ;
    public int SM;
    public float XX;
    public String Zh;
    public PjT cr;
    public float cz;
    public boolean qj;
    public PointF xf;
    public PointF xs;

    public Zh() {
    }

    public Zh(String s, String s1, float f, PjT zh$PjT0, int v, float f1, float f2, int v1, int v2, float f3, boolean z, PointF pointF0, PointF pointF1) {
        this.PjT(s, s1, f, zh$PjT0, v, f1, f2, v1, v2, f3, z, pointF0, pointF1);
    }

    public void PjT(String s, String s1, float f, PjT zh$PjT0, int v, float f1, float f2, int v1, int v2, float f3, boolean z, PointF pointF0, PointF pointF1) {
        this.PjT = s;
        this.Zh = s1;
        this.ReZ = f;
        this.cr = zh$PjT0;
        this.JQp = v;
        this.cz = f1;
        this.XX = f2;
        this.Au = v1;
        this.SM = v2;
        this.DWo = f3;
        this.qj = z;
        this.xf = pointF0;
        this.xs = pointF1;
    }

    @Override
    public int hashCode() {
        long v = (long)Float.floatToRawIntBits(this.cz);
        return (((((int)(((float)((this.PjT.hashCode() * 0x1F + this.Zh.hashCode()) * 0x1F)) + this.ReZ)) * 0x1F + this.cr.ordinal()) * 0x1F + this.JQp) * 0x1F + ((int)(v ^ v >>> 0x20))) * 0x1F + this.Au;
    }
}

