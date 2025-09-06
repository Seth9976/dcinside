package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.LongSparseArray;
import com.bytedance.adsdk.Zh.PjT.Zh.ub;
import com.bytedance.adsdk.Zh.ReZ.Zh.XX;
import com.bytedance.adsdk.Zh.ReZ.Zh.cr;
import com.bytedance.adsdk.Zh.ReZ.Zh.cz;

public class SM extends PjT {
    private final RectF Au;
    private final int DWo;
    private final boolean JQp;
    private final XX SM;
    private final LongSparseArray XX;
    private final String cr;
    private final LongSparseArray cz;
    private ub fDm;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT qj;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT xf;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT xs;

    public SM(com.bytedance.adsdk.Zh.SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, cz cz0) {
        super(sM0, pjT0, cz0.Au().PjT(), cz0.SM().PjT(), cz0.xf(), cz0.cr(), cz0.XX(), cz0.DWo(), cz0.qj());
        this.cz = new LongSparseArray();
        this.XX = new LongSparseArray();
        this.Au = new RectF();
        this.cr = cz0.PjT();
        this.SM = cz0.Zh();
        this.JQp = cz0.xs();
        this.DWo = (int)(sM0.yIW().JQp() / 32.0f);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = cz0.ReZ().PjT();
        this.qj = pjT1;
        pjT1.PjT(this);
        pjT0.PjT(pjT1);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = cz0.JQp().PjT();
        this.xf = pjT2;
        pjT2.PjT(this);
        pjT0.PjT(pjT2);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT3 = cz0.cz().PjT();
        this.xs = pjT3;
        pjT3.PjT(this);
        pjT0.PjT(pjT3);
    }

    private int[] PjT(int[] arr_v) {
        if(this.fDm != null) {
            throw null;
        }
        return arr_v;
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.PjT
    public void PjT(Canvas canvas0, Matrix matrix0, int v) {
        if(this.JQp) {
            return;
        }
        this.PjT(this.Au, matrix0, false);
        LinearGradient linearGradient0 = this.SM == XX.PjT ? this.Zh() : this.ReZ();
        linearGradient0.setLocalMatrix(matrix0);
        this.Zh.setShader(linearGradient0);
        super.PjT(canvas0, matrix0, v);
    }

    private RadialGradient ReZ() {
        long v = (long)this.cr();
        RadialGradient radialGradient0 = (RadialGradient)this.XX.get(v);
        if(radialGradient0 != null) {
            return radialGradient0;
        }
        PointF pointF0 = (PointF)this.xf.XX();
        PointF pointF1 = (PointF)this.xs.XX();
        cr cr0 = (cr)this.qj.XX();
        int[] arr_v = this.PjT(cr0.Zh());
        RadialGradient radialGradient1 = new RadialGradient(pointF0.x, pointF0.y, ((float)Math.hypot(pointF1.x - pointF0.x, pointF1.y - pointF0.y)), arr_v, cr0.PjT(), Shader.TileMode.CLAMP);
        this.XX.put(v, radialGradient1);
        return radialGradient1;
    }

    private LinearGradient Zh() {
        long v = (long)this.cr();
        LinearGradient linearGradient0 = (LinearGradient)this.cz.get(v);
        if(linearGradient0 != null) {
            return linearGradient0;
        }
        PointF pointF0 = (PointF)this.xf.XX();
        PointF pointF1 = (PointF)this.xs.XX();
        cr cr0 = (cr)this.qj.XX();
        int[] arr_v = this.PjT(cr0.Zh());
        LinearGradient linearGradient1 = new LinearGradient(pointF0.x, pointF0.y, pointF1.x, pointF1.y, arr_v, cr0.PjT(), Shader.TileMode.CLAMP);
        this.cz.put(v, linearGradient1);
        return linearGradient1;
    }

    private int cr() {
        int v = Math.round(this.xf.Au() * ((float)this.DWo));
        int v1 = Math.round(this.xs.Au() * ((float)this.DWo));
        int v2 = Math.round(this.qj.Au() * ((float)this.DWo));
        int v3 = v == 0 ? 17 : v * 0x20F;
        if(v1 != 0) {
            v3 = v3 * 0x1F * v1;
        }
        return v2 == 0 ? v3 : v3 * 0x1F * v2;
    }
}

