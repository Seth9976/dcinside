package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT;
import com.bytedance.adsdk.Zh.PjT.Zh.ReZ;
import com.bytedance.adsdk.Zh.PjT.Zh.Zh;
import com.bytedance.adsdk.Zh.ReZ.Zh.qla;
import com.bytedance.adsdk.Zh.SM;
import java.util.ArrayList;
import java.util.List;

public class XX implements JQp, qj, PjT {
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT Au;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT DWo;
    private final String JQp;
    float PjT;
    private final Paint ReZ;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT SM;
    private final List XX;
    private final Path Zh;
    private final com.bytedance.adsdk.Zh.ReZ.ReZ.PjT cr;
    private final boolean cz;
    private final SM qj;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT xf;
    private ReZ xs;

    public XX(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, qla qla0) {
        Path path0 = new Path();
        this.Zh = path0;
        this.ReZ = new com.bytedance.adsdk.Zh.PjT.PjT(1);
        this.XX = new ArrayList();
        this.cr = pjT0;
        this.JQp = qla0.PjT();
        this.cz = qla0.JQp();
        this.qj = sM0;
        if(pjT0.DWo() != null) {
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = pjT0.DWo().PjT().PjT();
            this.xf = pjT1;
            pjT1.PjT(this);
            pjT0.PjT(this.xf);
        }
        if(pjT0.qj() != null) {
            this.xs = new ReZ(this, pjT0, pjT0.qj());
        }
        if(qla0.Zh() != null && qla0.ReZ() != null) {
            path0.setFillType(qla0.cr());
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = qla0.Zh().PjT();
            this.Au = pjT2;
            pjT2.PjT(this);
            pjT0.PjT(pjT2);
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT3 = qla0.ReZ().PjT();
            this.SM = pjT3;
            pjT3.PjT(this);
            pjT0.PjT(pjT3);
            return;
        }
        this.Au = null;
        this.SM = null;
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.qj.invalidateSelf();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(Canvas canvas0, Matrix matrix0, int v) {
        if(this.cz) {
            return;
        }
        com.bytedance.adsdk.Zh.JQp.PjT("FillContent#draw");
        int v1 = ((Zh)this.Au).SM();
        int v3 = com.bytedance.adsdk.Zh.cz.JQp.PjT(((int)(((float)v) / 255.0f * ((float)(((int)(((Integer)this.SM.XX()))))) / 100.0f * 255.0f)), 0, 0xFF);
        this.ReZ.setColor(v3 << 24 | v1 & 0xFFFFFF);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.DWo;
        if(pjT0 != null) {
            ColorFilter colorFilter0 = (ColorFilter)pjT0.XX();
            this.ReZ.setColorFilter(colorFilter0);
        }
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = this.xf;
        if(pjT1 != null) {
            float f = (float)(((Float)pjT1.XX()));
            if(f == 0.0f) {
                this.ReZ.setMaskFilter(null);
            }
            else if(f != this.PjT) {
                BlurMaskFilter blurMaskFilter0 = this.cr.Zh(f);
                this.ReZ.setMaskFilter(blurMaskFilter0);
            }
            this.PjT = f;
        }
        ReZ reZ0 = this.xs;
        if(reZ0 != null) {
            reZ0.PjT(this.ReZ);
        }
        this.Zh.reset();
        for(int v2 = 0; v2 < this.XX.size(); ++v2) {
            Path path0 = ((xs)this.XX.get(v2)).cr();
            this.Zh.addPath(path0, matrix0);
        }
        canvas0.drawPath(this.Zh, this.ReZ);
        com.bytedance.adsdk.Zh.JQp.Zh("FillContent#draw");
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        this.Zh.reset();
        for(int v = 0; v < this.XX.size(); ++v) {
            Path path0 = ((xs)this.XX.get(v)).cr();
            this.Zh.addPath(path0, matrix0);
        }
        this.Zh.computeBounds(rectF0, false);
        rectF0.set(rectF0.left - 1.0f, rectF0.top - 1.0f, rectF0.right + 1.0f, rectF0.bottom + 1.0f);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
        for(int v = 0; v < list1.size(); ++v) {
            com.bytedance.adsdk.Zh.PjT.PjT.ReZ reZ0 = (com.bytedance.adsdk.Zh.PjT.PjT.ReZ)list1.get(v);
            if(reZ0 instanceof xs) {
                this.XX.add(((xs)reZ0));
            }
        }
    }
}

