package com.bytedance.adsdk.Zh.ReZ.Zh;

import com.bytedance.adsdk.Zh.cz.JQp;
import com.bytedance.adsdk.Zh.cz.Zh;
import java.util.Arrays;

public class cr {
    private final float[] PjT;
    private final int[] Zh;

    public cr(float[] arr_f, int[] arr_v) {
        this.PjT = arr_f;
        this.Zh = arr_v;
    }

    private int PjT(float f) {
        int v = Arrays.binarySearch(this.PjT, f);
        if(v >= 0) {
            return this.Zh[v];
        }
        if(-(v + 1) == 0) {
            return this.Zh[0];
        }
        int[] arr_v = this.Zh;
        if(-(v + 1) == arr_v.length - 1) {
            return arr_v[arr_v.length - 1];
        }
        int v1 = -(v + 1) - 1;
        float f1 = this.PjT[v1];
        return Zh.PjT((f - f1) / (this.PjT[-(v + 1)] - f1), arr_v[v1], arr_v[-(v + 1)]);
    }

    public cr PjT(float[] arr_f) {
        int[] arr_v = new int[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_v[v] = this.PjT(arr_f[v]);
        }
        return new cr(arr_f, arr_v);
    }

    public void PjT(cr cr0, cr cr1, float f) {
        if(cr0.Zh.length != cr1.Zh.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + cr0.Zh.length + " vs " + cr1.Zh.length + ")");
        }
        for(int v = 0; v < cr0.Zh.length; ++v) {
            this.PjT[v] = JQp.PjT(cr0.PjT[v], cr1.PjT[v], f);
            this.Zh[v] = Zh.PjT(f, cr0.Zh[v], cr1.Zh[v]);
        }
    }

    public float[] PjT() {
        return this.PjT;
    }

    public int ReZ() {
        return this.Zh.length;
    }

    public int[] Zh() {
        return this.Zh;
    }
}

