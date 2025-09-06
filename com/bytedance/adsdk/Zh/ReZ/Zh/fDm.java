package com.bytedance.adsdk.Zh.ReZ.Zh;

import android.graphics.PointF;
import com.bytedance.adsdk.Zh.ReZ.PjT;
import java.util.ArrayList;
import java.util.List;

public class fDm {
    private final List PjT;
    private boolean ReZ;
    private PointF Zh;

    public fDm() {
        this.PjT = new ArrayList();
    }

    public fDm(PointF pointF0, boolean z, List list0) {
        this.Zh = pointF0;
        this.ReZ = z;
        this.PjT = new ArrayList(list0);
    }

    public PointF PjT() {
        return this.Zh;
    }

    public void PjT(float f, float f1) {
        if(this.Zh == null) {
            this.Zh = new PointF();
        }
        this.Zh.set(f, f1);
    }

    public void PjT(fDm fDm0, fDm fDm1, float f) {
        if(this.Zh == null) {
            this.Zh = new PointF();
        }
        this.ReZ = fDm0.Zh() || fDm1.Zh();
        if(fDm0.ReZ().size() != fDm1.ReZ().size()) {
            fDm0.ReZ().size();
            fDm1.ReZ().size();
        }
        int v = Math.min(fDm0.ReZ().size(), fDm1.ReZ().size());
        if(this.PjT.size() < v) {
            for(int v1 = this.PjT.size(); v1 < v; ++v1) {
                PjT pjT0 = new PjT();
                this.PjT.add(pjT0);
            }
        }
        else if(this.PjT.size() > v) {
            for(int v2 = this.PjT.size() - 1; v2 >= v; --v2) {
                this.PjT.remove(this.PjT.size() - 1);
            }
        }
        PointF pointF0 = fDm0.PjT();
        PointF pointF1 = fDm1.PjT();
        this.PjT(pointF0.x + f * (pointF1.x - pointF0.x), pointF0.y + f * (pointF1.y - pointF0.y));
        for(int v3 = this.PjT.size() - 1; v3 >= 0; --v3) {
            PjT pjT1 = (PjT)fDm0.ReZ().get(v3);
            PjT pjT2 = (PjT)fDm1.ReZ().get(v3);
            PointF pointF2 = pjT1.PjT();
            PointF pointF3 = pjT1.Zh();
            PointF pointF4 = pjT1.ReZ();
            PointF pointF5 = pjT2.PjT();
            PointF pointF6 = pjT2.Zh();
            PointF pointF7 = pjT2.ReZ();
            ((PjT)this.PjT.get(v3)).PjT(pointF2.x + f * (pointF5.x - pointF2.x), pointF2.y + f * (pointF5.y - pointF2.y));
            ((PjT)this.PjT.get(v3)).Zh(pointF3.x + f * (pointF6.x - pointF3.x), pointF3.y + f * (pointF6.y - pointF3.y));
            ((PjT)this.PjT.get(v3)).ReZ(pointF4.x + f * (pointF7.x - pointF4.x), pointF4.y + f * (pointF7.y - pointF4.y));
        }
    }

    public void PjT(boolean z) {
        this.ReZ = z;
    }

    public List ReZ() {
        return this.PjT;
    }

    public boolean Zh() {
        return this.ReZ;
    }

    @Override
    public String toString() {
        return "ShapeData{numCurves=" + this.PjT.size() + "closed=" + this.ReZ + '}';
    }
}

