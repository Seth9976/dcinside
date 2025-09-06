package com.bytedance.adsdk.Zh.ReZ.PjT;

import com.bytedance.adsdk.Zh.PjT.Zh.JQp;
import com.bytedance.adsdk.Zh.ReZ.Zh.cr;
import com.bytedance.adsdk.Zh.XX.PjT;
import java.util.Arrays;
import java.util.List;

public class ReZ extends fDm {
    public ReZ(List list0) {
        super(ReZ.PjT(list0));
    }

    private static PjT PjT(PjT pjT0) {
        cr cr0 = (cr)pjT0.PjT;
        cr cr1 = (cr)pjT0.Zh;
        if(cr0 != null && cr1 != null && cr0.PjT().length != cr1.PjT().length) {
            float[] arr_f = ReZ.PjT(cr0.PjT(), cr1.PjT());
            return pjT0.PjT(cr0.PjT(arr_f), cr1.PjT(arr_f));
        }
        return pjT0;
    }

    private static List PjT(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            list0.set(v, ReZ.PjT(((PjT)list0.get(v))));
        }
        return list0;
    }

    static float[] PjT(float[] arr_f, float[] arr_f1) {
        int v = arr_f.length + arr_f1.length;
        float[] arr_f2 = new float[v];
        System.arraycopy(arr_f, 0, arr_f2, 0, arr_f.length);
        System.arraycopy(arr_f1, 0, arr_f2, arr_f.length, arr_f1.length);
        Arrays.sort(arr_f2);
        float f = NaNf;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            float f1 = arr_f2[v1];
            if(f1 != f) {
                arr_f2[v2] = f1;
                ++v2;
                f = arr_f2[v1];
            }
        }
        return Arrays.copyOfRange(arr_f2, 0, v2);
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.xs
    public com.bytedance.adsdk.Zh.PjT.Zh.PjT PjT() {
        return new JQp(this.PjT);
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.fDm
    public List ReZ() {
        return super.ReZ();
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.fDm
    public boolean Zh() {
        return super.Zh();
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.fDm
    public String toString() {
        return super.toString();
    }
}

