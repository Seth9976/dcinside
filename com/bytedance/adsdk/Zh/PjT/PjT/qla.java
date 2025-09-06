package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT;
import com.bytedance.adsdk.Zh.PjT.Zh.cr;
import com.bytedance.adsdk.Zh.SM;
import java.util.List;

public class qla implements qj, xs, PjT {
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT Au;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT DWo;
    private final SM JQp;
    private final Path PjT;
    private final String ReZ;
    private final Zh SM;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT XX;
    private final RectF Zh;
    private final boolean cr;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT cz;
    private boolean qj;

    public qla(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, com.bytedance.adsdk.Zh.ReZ.Zh.qj qj0) {
        this.PjT = new Path();
        this.Zh = new RectF();
        this.SM = new Zh();
        this.DWo = null;
        this.ReZ = qj0.PjT();
        this.cr = qj0.JQp();
        this.JQp = sM0;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = qj0.cr().PjT();
        this.cz = pjT1;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = qj0.ReZ().PjT();
        this.XX = pjT2;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT3 = qj0.Zh().PjT();
        this.Au = pjT3;
        pjT0.PjT(pjT1);
        pjT0.PjT(pjT2);
        pjT0.PjT(pjT3);
        pjT1.PjT(this);
        pjT2.PjT(this);
        pjT3.PjT(this);
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
                this.SM.PjT(((RD)reZ0));
                ((RD)reZ0).PjT(this);
            }
            else if(reZ0 instanceof ub) {
                this.DWo = ((ub)reZ0).Zh();
            }
        }
    }

    private void Zh() {
        this.qj = false;
        this.JQp.invalidateSelf();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.xs
    public Path cr() {
        if(this.qj) {
            return this.PjT;
        }
        this.PjT.reset();
        if(this.cr) {
            this.qj = true;
            return this.PjT;
        }
        PointF pointF0 = (PointF)this.XX.XX();
        float f = pointF0.x / 2.0f;
        float f1 = pointF0.y / 2.0f;
        float f2 = this.Au == null ? 0.0f : ((cr)this.Au).SM();
        if(f2 == 0.0f) {
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.DWo;
            if(pjT0 != null) {
                f2 = Math.min(((float)(((Float)pjT0.XX()))), Math.min(f, f1));
            }
        }
        float f3 = Math.min(f, f1);
        if(f2 > f3) {
            f2 = f3;
        }
        PointF pointF1 = (PointF)this.cz.XX();
        this.PjT.moveTo(pointF1.x + f, pointF1.y - f1 + f2);
        this.PjT.lineTo(pointF1.x + f, pointF1.y + f1 - f2);
        int v = Float.compare(f2, 0.0f);
        if(v > 0) {
            this.Zh.set(pointF1.x + f - f2 * 2.0f, pointF1.y + f1 - f2 * 2.0f, pointF1.x + f, pointF1.y + f1);
            this.PjT.arcTo(this.Zh, 0.0f, 90.0f, false);
        }
        this.PjT.lineTo(pointF1.x - f + f2, pointF1.y + f1);
        if(v > 0) {
            this.Zh.set(pointF1.x - f, pointF1.y + f1 - f2 * 2.0f, pointF1.x - f + f2 * 2.0f, pointF1.y + f1);
            this.PjT.arcTo(this.Zh, 90.0f, 90.0f, false);
        }
        this.PjT.lineTo(pointF1.x - f, pointF1.y - f1 + f2);
        if(v > 0) {
            this.Zh.set(pointF1.x - f, pointF1.y - f1, pointF1.x - f + f2 * 2.0f, pointF1.y - f1 + f2 * 2.0f);
            this.PjT.arcTo(this.Zh, 180.0f, 90.0f, false);
        }
        this.PjT.lineTo(pointF1.x + f - f2, pointF1.y - f1);
        if(v > 0) {
            this.Zh.set(pointF1.x + f - f2 * 2.0f, pointF1.y - f1, pointF1.x + f, pointF1.y - f1 + f2 * 2.0f);
            this.PjT.arcTo(this.Zh, 270.0f, 90.0f, false);
        }
        this.PjT.close();
        this.SM.PjT(this.PjT);
        this.qj = true;
        return this.PjT;
    }
}

