package com.bytedance.adsdk.Zh.ReZ;

import android.annotation.SuppressLint;
import android.graphics.PointF;

public class PjT {
    private final PointF PjT;
    private final PointF ReZ;
    private final PointF Zh;

    public PjT() {
        this.PjT = new PointF();
        this.Zh = new PointF();
        this.ReZ = new PointF();
    }

    public PjT(PointF pointF0, PointF pointF1, PointF pointF2) {
        this.PjT = pointF0;
        this.Zh = pointF1;
        this.ReZ = pointF2;
    }

    public PointF PjT() {
        return this.PjT;
    }

    public void PjT(float f, float f1) {
        this.PjT.set(f, f1);
    }

    public PointF ReZ() {
        return this.ReZ;
    }

    public void ReZ(float f, float f1) {
        this.ReZ.set(f, f1);
    }

    public PointF Zh() {
        return this.Zh;
    }

    public void Zh(float f, float f1) {
        this.Zh.set(f, f1);
    }

    @Override
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", this.ReZ.x, this.ReZ.y, this.PjT.x, this.PjT.y, this.Zh.x, this.Zh.y);
    }
}

