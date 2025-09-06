package com.bytedance.adsdk.Zh.cz;

public class cr {
    private float PjT;
    private int Zh;

    public void PjT(float f) {
        float f1 = this.PjT + f;
        this.PjT = f1;
        int v = this.Zh + 1;
        this.Zh = v;
        if(v == 0x7FFFFFFF) {
            this.PjT = f1 / 2.0f;
            this.Zh = 0x3FFFFFFF;
        }
    }
}

