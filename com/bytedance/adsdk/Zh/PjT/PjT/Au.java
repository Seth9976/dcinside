package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.BlurMaskFilter.Blur;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.LongSparseArray;
import com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT;
import com.bytedance.adsdk.Zh.PjT.Zh.ReZ;
import com.bytedance.adsdk.Zh.PjT.Zh.ub;
import com.bytedance.adsdk.Zh.ReZ.Zh.XX;
import com.bytedance.adsdk.Zh.ReZ.Zh.cr;
import com.bytedance.adsdk.Zh.SM;
import java.util.ArrayList;
import java.util.List;

public class Au implements JQp, qj, PjT {
    private final Paint Au;
    private final List DWo;
    private final LongSparseArray JQp;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT Owx;
    float PjT;
    private ReZ RD;
    private final boolean ReZ;
    private final RectF SM;
    private final Path XX;
    private final String Zh;
    private final com.bytedance.adsdk.Zh.ReZ.ReZ.PjT cr;
    private final LongSparseArray cz;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT fDm;
    private final SM gK;
    private final int ltE;
    private final XX qj;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT qla;
    private ub ub;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT xE;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT xf;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT xs;

    public Au(SM sM0, com.bytedance.adsdk.Zh.XX xX0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, com.bytedance.adsdk.Zh.ReZ.Zh.JQp jQp0) {
        this.JQp = new LongSparseArray();
        this.cz = new LongSparseArray();
        Path path0 = new Path();
        this.XX = path0;
        this.Au = new com.bytedance.adsdk.Zh.PjT.PjT(1);
        this.SM = new RectF();
        this.DWo = new ArrayList();
        this.PjT = 0.0f;
        this.cr = pjT0;
        this.Zh = jQp0.PjT();
        this.ReZ = jQp0.Au();
        this.gK = sM0;
        this.qj = jQp0.Zh();
        path0.setFillType(jQp0.ReZ());
        this.ltE = (int)(xX0.JQp() / 32.0f);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = jQp0.cr().PjT();
        this.xf = pjT1;
        pjT1.PjT(this);
        pjT0.PjT(pjT1);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = jQp0.JQp().PjT();
        this.xs = pjT2;
        pjT2.PjT(this);
        pjT0.PjT(pjT2);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT3 = jQp0.cz().PjT();
        this.fDm = pjT3;
        pjT3.PjT(this);
        pjT0.PjT(pjT3);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT4 = jQp0.XX().PjT();
        this.qla = pjT4;
        pjT4.PjT(this);
        pjT0.PjT(pjT4);
        if(pjT0.DWo() != null) {
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT5 = pjT0.DWo().PjT().PjT();
            this.Owx = pjT5;
            pjT5.PjT(this);
            pjT0.PjT(this.Owx);
        }
        if(pjT0.qj() != null) {
            this.RD = new ReZ(this, pjT0, pjT0.qj());
        }
    }

    private int[] PjT(int[] arr_v) {
        if(this.ub != null) {
            throw null;
        }
        return arr_v;
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.gK.invalidateSelf();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(Canvas canvas0, Matrix matrix0, int v) {
        if(this.ReZ) {
            return;
        }
        com.bytedance.adsdk.Zh.JQp.PjT("GradientFillContent#draw");
        this.XX.reset();
        for(int v1 = 0; v1 < this.DWo.size(); ++v1) {
            Path path0 = ((xs)this.DWo.get(v1)).cr();
            this.XX.addPath(path0, matrix0);
        }
        this.XX.computeBounds(this.SM, false);
        LinearGradient linearGradient0 = this.qj == XX.PjT ? this.Zh() : this.ReZ();
        linearGradient0.setLocalMatrix(matrix0);
        this.Au.setShader(linearGradient0);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.xE;
        if(pjT0 != null) {
            ColorFilter colorFilter0 = (ColorFilter)pjT0.XX();
            this.Au.setColorFilter(colorFilter0);
        }
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = this.Owx;
        if(pjT1 != null) {
            float f = (float)(((Float)pjT1.XX()));
            if(f == 0.0f) {
                this.Au.setMaskFilter(null);
            }
            else if(f != this.PjT) {
                BlurMaskFilter blurMaskFilter0 = new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL);
                this.Au.setMaskFilter(blurMaskFilter0);
            }
            this.PjT = f;
        }
        ReZ reZ0 = this.RD;
        if(reZ0 != null) {
            reZ0.PjT(this.Au);
        }
        int v2 = com.bytedance.adsdk.Zh.cz.JQp.PjT(((int)(((float)v) / 255.0f * ((float)(((int)(((Integer)this.xs.XX()))))) / 100.0f * 255.0f)), 0, 0xFF);
        this.Au.setAlpha(v2);
        canvas0.drawPath(this.XX, this.Au);
        com.bytedance.adsdk.Zh.JQp.Zh("GradientFillContent#draw");
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        this.XX.reset();
        for(int v = 0; v < this.DWo.size(); ++v) {
            Path path0 = ((xs)this.DWo.get(v)).cr();
            this.XX.addPath(path0, matrix0);
        }
        this.XX.computeBounds(rectF0, false);
        rectF0.set(rectF0.left - 1.0f, rectF0.top - 1.0f, rectF0.right + 1.0f, rectF0.bottom + 1.0f);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
        for(int v = 0; v < list1.size(); ++v) {
            com.bytedance.adsdk.Zh.PjT.PjT.ReZ reZ0 = (com.bytedance.adsdk.Zh.PjT.PjT.ReZ)list1.get(v);
            if(reZ0 instanceof xs) {
                this.DWo.add(((xs)reZ0));
            }
        }
    }

    private RadialGradient ReZ() {
        long v = (long)this.cr();
        RadialGradient radialGradient0 = (RadialGradient)this.cz.get(v);
        if(radialGradient0 != null) {
            return radialGradient0;
        }
        PointF pointF0 = (PointF)this.fDm.XX();
        PointF pointF1 = (PointF)this.qla.XX();
        cr cr0 = (cr)this.xf.XX();
        int[] arr_v = this.PjT(cr0.Zh());
        float f = (float)Math.hypot(pointF1.x - pointF0.x, pointF1.y - pointF0.y);
        RadialGradient radialGradient1 = new RadialGradient(pointF0.x, pointF0.y, (f <= 0.0f ? 0.001f : f), arr_v, cr0.PjT(), Shader.TileMode.CLAMP);
        this.cz.put(v, radialGradient1);
        return radialGradient1;
    }

    private LinearGradient Zh() {
        long v = (long)this.cr();
        LinearGradient linearGradient0 = (LinearGradient)this.JQp.get(v);
        if(linearGradient0 != null) {
            return linearGradient0;
        }
        PointF pointF0 = (PointF)this.fDm.XX();
        PointF pointF1 = (PointF)this.qla.XX();
        cr cr0 = (cr)this.xf.XX();
        int[] arr_v = this.PjT(cr0.Zh());
        LinearGradient linearGradient1 = new LinearGradient(pointF0.x, pointF0.y, pointF1.x, pointF1.y, arr_v, cr0.PjT(), Shader.TileMode.CLAMP);
        this.JQp.put(v, linearGradient1);
        return linearGradient1;
    }

    private int cr() {
        int v = Math.round(this.fDm.Au() * ((float)this.ltE));
        int v1 = Math.round(this.qla.Au() * ((float)this.ltE));
        int v2 = Math.round(this.xf.Au() * ((float)this.ltE));
        int v3 = v == 0 ? 17 : v * 0x20F;
        if(v1 != 0) {
            v3 = v3 * 0x1F * v1;
        }
        return v2 == 0 ? v3 : v3 * 0x1F * v2;
    }
}

