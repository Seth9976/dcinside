package com.bytedance.adsdk.Zh.ReZ.ReZ;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.Zh.SM;

public class Au extends PjT {
    private final Paint Au;
    private final Path DWo;
    private final float[] SM;
    private final RectF XX;
    private final JQp qj;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT xf;

    Au(SM sM0, JQp jQp0) {
        super(sM0, jQp0);
        this.XX = new RectF();
        com.bytedance.adsdk.Zh.PjT.PjT pjT0 = new com.bytedance.adsdk.Zh.PjT.PjT();
        this.Au = pjT0;
        this.SM = new float[8];
        this.DWo = new Path();
        this.qj = jQp0;
        pjT0.setAlpha(0);
        pjT0.setStyle(Paint.Style.FILL);
        pjT0.setColor(jQp0.xE());
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        super.PjT(rectF0, matrix0, z);
        this.XX.set(0.0f, 0.0f, ((float)this.qj.gK()), ((float)this.qj.ub()));
        this.PjT.mapRect(this.XX);
        rectF0.set(this.XX);
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void Zh(Canvas canvas0, Matrix matrix0, int v) {
        super.Zh(canvas0, matrix0, v);
        int v1 = Color.alpha(this.qj.xE());
        if(v1 == 0) {
            return;
        }
        int v2 = (int)(((float)v) / 255.0f * (((float)v1) / 255.0f * ((float)(this.cr.PjT() == null ? 100 : ((int)(((Integer)this.cr.PjT().XX()))))) / 100.0f) * 255.0f);
        this.Au.setAlpha(v2);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.xf;
        if(pjT0 != null) {
            ColorFilter colorFilter0 = (ColorFilter)pjT0.XX();
            this.Au.setColorFilter(colorFilter0);
        }
        if(v2 > 0) {
            this.SM[0] = 0.0f;
            this.SM[1] = 0.0f;
            this.SM[2] = (float)this.qj.gK();
            this.SM[3] = 0.0f;
            this.SM[4] = (float)this.qj.gK();
            this.SM[5] = (float)this.qj.ub();
            this.SM[6] = 0.0f;
            this.SM[7] = (float)this.qj.ub();
            matrix0.mapPoints(this.SM);
            this.DWo.reset();
            this.DWo.moveTo(this.SM[0], this.SM[1]);
            this.DWo.lineTo(this.SM[2], this.SM[3]);
            this.DWo.lineTo(this.SM[4], this.SM[5]);
            this.DWo.lineTo(this.SM[6], this.SM[7]);
            this.DWo.lineTo(this.SM[0], this.SM[1]);
            this.DWo.close();
            canvas0.drawPath(this.DWo, this.Au);
        }
    }
}

