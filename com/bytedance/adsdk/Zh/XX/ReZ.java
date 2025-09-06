package com.bytedance.adsdk.Zh.XX;

public class ReZ {
    private float PjT;
    private float Zh;

    public ReZ() {
        this(1.0f, 1.0f);
    }

    public ReZ(float f, float f1) {
        this.PjT = f;
        this.Zh = f1;
    }

    public float PjT() {
        return this.PjT;
    }

    public void PjT(float f, float f1) {
        this.PjT = f;
        this.Zh = f1;
    }

    public float Zh() {
        return this.Zh;
    }

    public boolean Zh(float f, float f1) {
        return this.PjT == f && this.Zh == f1;
    }

    @Override
    public String toString() {
        return this.PjT() + "x" + this.Zh();
    }
}

