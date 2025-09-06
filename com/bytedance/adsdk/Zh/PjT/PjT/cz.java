package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT;
import com.bytedance.adsdk.Zh.SM;
import java.util.List;

public class cz implements qj, xs, PjT {
    private boolean Au;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT JQp;
    private final Path PjT;
    private final SM ReZ;
    private final Zh XX;
    private final String Zh;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT cr;
    private final com.bytedance.adsdk.Zh.ReZ.Zh.Zh cz;

    public cz(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, com.bytedance.adsdk.Zh.ReZ.Zh.Zh zh0) {
        this.PjT = new Path();
        this.XX = new Zh();
        this.Zh = zh0.PjT();
        this.ReZ = sM0;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = zh0.ReZ().PjT();
        this.cr = pjT1;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = zh0.Zh().PjT();
        this.JQp = pjT2;
        this.cz = zh0;
        pjT0.PjT(pjT1);
        pjT0.PjT(pjT2);
        pjT1.PjT(this);
        pjT2.PjT(this);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.Zh();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
        for(int v = 0; v < list0.size(); ++v) {
            ReZ reZ0 = (ReZ)list0.get(v);
            if(reZ0 instanceof RD && ((RD)reZ0).Zh() == com.bytedance.adsdk.Zh.ReZ.Zh.ltE.PjT.PjT) {
                this.XX.PjT(((RD)reZ0));
                ((RD)reZ0).PjT(this);
            }
        }
    }

    private void Zh() {
        this.Au = false;
        this.ReZ.invalidateSelf();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.xs
    public Path cr() {
        if(this.Au) {
            return this.PjT;
        }
        this.PjT.reset();
        if(this.cz.JQp()) {
            this.Au = true;
            return this.PjT;
        }
        PointF pointF0 = (PointF)this.cr.XX();
        float f = pointF0.x / 2.0f;
        float f1 = pointF0.y / 2.0f;
        this.PjT.reset();
        if(this.cz.cr()) {
            this.PjT.moveTo(0.0f, -f1);
            float f2 = 0.0f - f * 0.55228f;
            float f3 = 0.0f - 0.55228f * f1;
            this.PjT.cubicTo(f2, -f1, -f, f3, -f, 0.0f);
            float f4 = 0.55228f * f1 + 0.0f;
            this.PjT.cubicTo(-f, f4, f2, f1, 0.0f, f1);
            float f5 = f * 0.55228f + 0.0f;
            this.PjT.cubicTo(f5, f1, f, f4, f, 0.0f);
            this.PjT.cubicTo(f, f3, f5, -f1, 0.0f, -f1);
        }
        else {
            this.PjT.moveTo(0.0f, -f1);
            float f6 = f * 0.55228f + 0.0f;
            float f7 = 0.0f - 0.55228f * f1;
            this.PjT.cubicTo(f6, -f1, f, f7, f, 0.0f);
            float f8 = 0.55228f * f1 + 0.0f;
            this.PjT.cubicTo(f, f8, f6, f1, 0.0f, f1);
            float f9 = 0.0f - f * 0.55228f;
            this.PjT.cubicTo(f9, f1, -f, f8, -f, 0.0f);
            this.PjT.cubicTo(-f, f7, f9, -f1, 0.0f, -f1);
        }
        PointF pointF1 = (PointF)this.JQp.XX();
        this.PjT.offset(pointF1.x, pointF1.y);
        this.PjT.close();
        this.XX.PjT(this.PjT);
        this.Au = true;
        return this.PjT;
    }
}

