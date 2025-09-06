package com.bytedance.adsdk.Zh.ReZ.ReZ;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.adsdk.Zh.DWo;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.cz.cz;

public class cr extends PjT {
    private final Paint Au;
    private final Rect DWo;
    private final Rect SM;
    protected final DWo XX;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT qj;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT xf;

    cr(SM sM0, JQp jQp0) {
        super(sM0, jQp0);
        this.Au = new com.bytedance.adsdk.Zh.PjT.PjT(3);
        this.SM = new Rect();
        this.DWo = new Rect();
        this.XX = sM0.cz(jQp0.XX());
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        super.PjT(rectF0, matrix0, z);
        if(this.XX != null) {
            float f = cz.PjT();
            rectF0.set(0.0f, 0.0f, ((float)this.XX.PjT()) * f, ((float)this.XX.Zh()) * f);
            this.PjT.mapRect(rectF0);
        }
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void Zh(Canvas canvas0, Matrix matrix0, int v) {
        super.Zh(canvas0, matrix0, v);
        Bitmap bitmap0 = this.xf();
        if(bitmap0 != null && !bitmap0.isRecycled() && this.XX != null) {
            float f = cz.PjT();
            this.Au.setAlpha(v);
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.qj;
            if(pjT0 != null) {
                ColorFilter colorFilter0 = (ColorFilter)pjT0.XX();
                this.Au.setColorFilter(colorFilter0);
            }
            canvas0.save();
            canvas0.concat(matrix0);
            int v1 = bitmap0.getWidth();
            int v2 = bitmap0.getHeight();
            this.SM.set(0, 0, v1, v2);
            if(this.Zh.JQp()) {
                this.DWo.set(0, 0, ((int)(((float)this.XX.PjT()) * f)), ((int)(((float)this.XX.Zh()) * f)));
            }
            else {
                int v3 = (int)(((float)bitmap0.getWidth()) * f);
                int v4 = (int)(((float)bitmap0.getHeight()) * f);
                this.DWo.set(0, 0, v3, v4);
            }
            canvas0.drawBitmap(bitmap0, this.SM, this.DWo, this.Au);
            canvas0.restore();
        }
    }

    private Bitmap xf() {
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.xf;
        if(pjT0 != null) {
            Bitmap bitmap0 = (Bitmap)pjT0.XX();
            if(bitmap0 != null) {
                return bitmap0;
            }
        }
        Bitmap bitmap1 = this.Zh.JQp(this.ReZ.XX());
        if(bitmap1 != null) {
            return bitmap1;
        }
        return this.XX == null ? null : this.XX.qj();
    }
}

