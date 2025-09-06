package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.PointF;
import com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.fDm;
import com.bytedance.adsdk.Zh.ReZ.Zh.xs;
import com.bytedance.adsdk.Zh.SM;
import java.util.ArrayList;
import java.util.List;

public class ub implements ltE, PjT {
    private final SM PjT;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT ReZ;
    private final String Zh;
    private fDm cr;

    public ub(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, xs xs0) {
        this.PjT = sM0;
        this.Zh = xs0.PjT();
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = xs0.Zh().PjT();
        this.ReZ = pjT1;
        pjT0.PjT(pjT1);
        pjT1.PjT(this);
    }

    private static int PjT(int v, int v1) {
        return v - ub.Zh(v, v1) * v1;
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ltE
    public fDm PjT(fDm fDm0) {
        List list0 = fDm0.ReZ();
        if(list0.size() <= 2) {
            return fDm0;
        }
        float f = (float)(((Float)this.ReZ.XX()));
        if(f == 0.0f) {
            return fDm0;
        }
        fDm fDm1 = this.Zh(fDm0);
        fDm1.PjT(fDm0.PjT().x, fDm0.PjT().y);
        List list1 = fDm1.ReZ();
        boolean z = fDm0.Zh();
        int v1 = 0;
        for(int v = 0; v < list0.size(); ++v) {
            com.bytedance.adsdk.Zh.ReZ.PjT pjT0 = (com.bytedance.adsdk.Zh.ReZ.PjT)list0.get(v);
            com.bytedance.adsdk.Zh.ReZ.PjT pjT1 = (com.bytedance.adsdk.Zh.ReZ.PjT)list0.get(ub.PjT(v - 1, list0.size()));
            com.bytedance.adsdk.Zh.ReZ.PjT pjT2 = (com.bytedance.adsdk.Zh.ReZ.PjT)list0.get(ub.PjT(v - 2, list0.size()));
            PointF pointF0 = v != 0 || z ? pjT1.ReZ() : fDm0.PjT();
            PointF pointF1 = v != 0 || z ? pjT1.Zh() : pointF0;
            boolean z1 = true;
            PointF pointF2 = pjT0.PjT();
            PointF pointF3 = pjT2.ReZ();
            PointF pointF4 = pjT0.ReZ();
            if(fDm0.Zh() || v != 0 || 0 != list0.size() - 1) {
                z1 = false;
            }
            if(!pointF1.equals(pointF0) || !pointF2.equals(pointF0) || z1) {
                com.bytedance.adsdk.Zh.ReZ.PjT pjT6 = (com.bytedance.adsdk.Zh.ReZ.PjT)list1.get(ub.PjT(v1 - 1, list1.size()));
                com.bytedance.adsdk.Zh.ReZ.PjT pjT7 = (com.bytedance.adsdk.Zh.ReZ.PjT)list1.get(v1);
                pjT6.Zh(pjT1.Zh().x, pjT1.Zh().y);
                pjT6.ReZ(pjT1.ReZ().x, pjT1.ReZ().y);
                pjT7.PjT(pjT0.PjT().x, pjT0.PjT().y);
                ++v1;
            }
            else {
                float f1 = (float)Math.hypot(pointF4.x - pointF0.x, pointF4.y - pointF0.y);
                float f2 = Math.min(f / ((float)Math.hypot(pointF0.x - pointF3.x, pointF0.y - pointF3.y)), 0.5f);
                float f3 = Math.min(f / f1, 0.5f);
                float f4 = (pointF3.x - pointF0.x) * f2 + pointF0.x;
                float f5 = (pointF3.y - pointF0.y) * f2 + pointF0.y;
                float f6 = (pointF4.x - pointF0.x) * f3 + pointF0.x;
                float f7 = (pointF4.y - pointF0.y) * f3 + pointF0.y;
                float f8 = f4 - (f4 - pointF0.x) * 0.5519f;
                float f9 = f5 - (f5 - pointF0.y) * 0.5519f;
                float f10 = f6 - (f6 - pointF0.x) * 0.5519f;
                float f11 = f7 - (f7 - pointF0.y) * 0.5519f;
                com.bytedance.adsdk.Zh.ReZ.PjT pjT3 = (com.bytedance.adsdk.Zh.ReZ.PjT)list1.get(ub.PjT(v1 - 1, list1.size()));
                com.bytedance.adsdk.Zh.ReZ.PjT pjT4 = (com.bytedance.adsdk.Zh.ReZ.PjT)list1.get(v1);
                pjT3.Zh(f4, f5);
                pjT3.ReZ(f4, f5);
                if(v == 0) {
                    fDm1.PjT(f4, f5);
                }
                pjT4.PjT(f8, f9);
                com.bytedance.adsdk.Zh.ReZ.PjT pjT5 = (com.bytedance.adsdk.Zh.ReZ.PjT)list1.get(v1 + 1);
                pjT4.Zh(f10, f11);
                pjT4.ReZ(f6, f7);
                pjT5.PjT(f6, f7);
                v1 += 2;
            }
        }
        return fDm1;
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.PjT.invalidateSelf();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
    }

    private static int Zh(int v, int v1) {
        int v2 = v / v1;
        return (v ^ v1) >= 0 || v1 * v2 == v ? v2 : v2 - 1;
    }

    private fDm Zh(fDm fDm0) {
        List list0 = fDm0.ReZ();
        boolean z = fDm0.Zh();
        int v = list0.size() - 1;
        int v1 = 0;
        while(v >= 0) {
            com.bytedance.adsdk.Zh.ReZ.PjT pjT0 = (com.bytedance.adsdk.Zh.ReZ.PjT)list0.get(v);
            com.bytedance.adsdk.Zh.ReZ.PjT pjT1 = (com.bytedance.adsdk.Zh.ReZ.PjT)list0.get(ub.PjT(v - 1, list0.size()));
            PointF pointF0 = v != 0 || z ? pjT1.ReZ() : fDm0.PjT();
            v1 = !(v != 0 || z ? pjT1.Zh() : pointF0).equals(pointF0) || !pjT0.PjT().equals(pointF0) || !fDm0.Zh() && v == 0 && 0 == list0.size() - 1 ? v1 + 1 : v1 + 2;
            --v;
        }
        if(this.cr == null || this.cr.ReZ().size() != v1) {
            ArrayList arrayList0 = new ArrayList(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                arrayList0.add(new com.bytedance.adsdk.Zh.ReZ.PjT());
            }
            this.cr = new fDm(new PointF(0.0f, 0.0f), false, arrayList0);
        }
        this.cr.PjT(z);
        return this.cr;
    }

    public com.bytedance.adsdk.Zh.PjT.Zh.PjT Zh() {
        return this.ReZ;
    }
}

