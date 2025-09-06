package com.bytedance.adsdk.Zh.PjT.Zh;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.Zh.ReZ.PjT.xf;
import com.bytedance.adsdk.Zh.XX.ReZ;

public class xE {
    private PjT Au;
    private PjT DWo;
    private final float[] JQp;
    private final Matrix PjT;
    private final Matrix ReZ;
    private PjT SM;
    private PjT XX;
    private final Matrix Zh;
    private final Matrix cr;
    private PjT cz;
    private PjT fDm;
    private cr qj;
    private cr xf;
    private PjT xs;

    public xE(xf xf0) {
        this.PjT = new Matrix();
        this.cz = xf0.PjT() == null ? null : xf0.PjT().PjT();
        this.XX = xf0.Zh() == null ? null : xf0.Zh().PjT();
        this.Au = xf0.ReZ() == null ? null : xf0.ReZ().PjT();
        this.SM = xf0.cr() == null ? null : xf0.cr().PjT();
        cr cr0 = xf0.Au() == null ? null : ((cr)xf0.Au().PjT());
        this.qj = cr0;
        if(cr0 == null) {
            this.Zh = null;
            this.ReZ = null;
            this.cr = null;
            this.JQp = null;
        }
        else {
            this.Zh = new Matrix();
            this.ReZ = new Matrix();
            this.cr = new Matrix();
            this.JQp = new float[9];
        }
        this.xf = xf0.SM() == null ? null : ((cr)xf0.SM().PjT());
        if(xf0.JQp() != null) {
            this.DWo = xf0.JQp().PjT();
        }
        this.xs = xf0.cz() == null ? null : xf0.cz().PjT();
        if(xf0.XX() != null) {
            this.fDm = xf0.XX().PjT();
            return;
        }
        this.fDm = null;
    }

    private void JQp() {
        for(int v = 0; v < 9; ++v) {
            this.JQp[v] = 0.0f;
        }
    }

    public PjT PjT() {
        return this.DWo;
    }

    public void PjT(float f) {
        PjT pjT0 = this.DWo;
        if(pjT0 != null) {
            pjT0.PjT(f);
        }
        PjT pjT1 = this.xs;
        if(pjT1 != null) {
            pjT1.PjT(f);
        }
        PjT pjT2 = this.fDm;
        if(pjT2 != null) {
            pjT2.PjT(f);
        }
        PjT pjT3 = this.cz;
        if(pjT3 != null) {
            pjT3.PjT(f);
        }
        PjT pjT4 = this.XX;
        if(pjT4 != null) {
            pjT4.PjT(f);
        }
        PjT pjT5 = this.Au;
        if(pjT5 != null) {
            pjT5.PjT(f);
        }
        PjT pjT6 = this.SM;
        if(pjT6 != null) {
            pjT6.PjT(f);
        }
        cr cr0 = this.qj;
        if(cr0 != null) {
            cr0.PjT(f);
        }
        cr cr1 = this.xf;
        if(cr1 != null) {
            cr1.PjT(f);
        }
    }

    public void PjT(com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT pjT$PjT0) {
        PjT pjT0 = this.DWo;
        if(pjT0 != null) {
            pjT0.PjT(pjT$PjT0);
        }
        PjT pjT1 = this.xs;
        if(pjT1 != null) {
            pjT1.PjT(pjT$PjT0);
        }
        PjT pjT2 = this.fDm;
        if(pjT2 != null) {
            pjT2.PjT(pjT$PjT0);
        }
        PjT pjT3 = this.cz;
        if(pjT3 != null) {
            pjT3.PjT(pjT$PjT0);
        }
        PjT pjT4 = this.XX;
        if(pjT4 != null) {
            pjT4.PjT(pjT$PjT0);
        }
        PjT pjT5 = this.Au;
        if(pjT5 != null) {
            pjT5.PjT(pjT$PjT0);
        }
        PjT pjT6 = this.SM;
        if(pjT6 != null) {
            pjT6.PjT(pjT$PjT0);
        }
        cr cr0 = this.qj;
        if(cr0 != null) {
            cr0.PjT(pjT$PjT0);
        }
        cr cr1 = this.xf;
        if(cr1 != null) {
            cr1.PjT(pjT$PjT0);
        }
    }

    public void PjT(com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0) {
        pjT0.PjT(this.DWo);
        pjT0.PjT(this.xs);
        pjT0.PjT(this.fDm);
        pjT0.PjT(this.cz);
        pjT0.PjT(this.XX);
        pjT0.PjT(this.Au);
        pjT0.PjT(this.SM);
        pjT0.PjT(this.qj);
        pjT0.PjT(this.xf);
    }

    public PjT ReZ() {
        return this.fDm;
    }

    public Matrix Zh(float f) {
        PointF pointF0 = null;
        PointF pointF1 = this.XX == null ? null : ((PointF)this.XX.XX());
        ReZ reZ0 = this.Au == null ? null : ((ReZ)this.Au.XX());
        this.PjT.reset();
        if(pointF1 != null) {
            this.PjT.preTranslate(pointF1.x * f, pointF1.y * f);
        }
        if(reZ0 != null) {
            this.PjT.preScale(((float)Math.pow(reZ0.PjT(), f)), ((float)Math.pow(reZ0.Zh(), f)));
        }
        PjT pjT0 = this.SM;
        if(pjT0 != null) {
            float f1 = (float)(((Float)pjT0.XX()));
            PjT pjT1 = this.cz;
            if(pjT1 != null) {
                pointF0 = (PointF)pjT1.XX();
            }
            Matrix matrix0 = this.PjT;
            float f2 = 0.0f;
            float f3 = pointF0 == null ? 0.0f : pointF0.x;
            if(pointF0 != null) {
                f2 = pointF0.y;
            }
            matrix0.preRotate(f1 * f, f3, f2);
        }
        return this.PjT;
    }

    public PjT Zh() {
        return this.xs;
    }

    public Matrix cr() {
        this.PjT.reset();
        PjT pjT0 = this.XX;
        if(pjT0 != null) {
            PointF pointF0 = (PointF)pjT0.XX();
            if(pointF0 != null) {
                float f = pointF0.x;
                if(f != 0.0f || pointF0.y != 0.0f) {
                    this.PjT.preTranslate(f, pointF0.y);
                }
            }
        }
        PjT pjT1 = this.SM;
        if(pjT1 != null) {
            float f1 = pjT1 instanceof ub ? ((float)(((Float)pjT1.XX()))) : ((cr)pjT1).SM();
            if(f1 != 0.0f) {
                this.PjT.preRotate(f1);
            }
        }
        cr cr0 = this.qj;
        if(cr0 != null) {
            float f2 = this.xf == null ? 0.0f : ((float)Math.cos(Math.toRadians(90.0f - this.xf.SM())));
            float f3 = this.xf == null ? 1.0f : ((float)Math.sin(Math.toRadians(90.0f - this.xf.SM())));
            double f4 = Math.toRadians(cr0.SM());
            this.JQp();
            this.JQp[0] = f2;
            this.JQp[1] = f3;
            this.JQp[3] = -f3;
            this.JQp[4] = f2;
            this.JQp[8] = 1.0f;
            this.Zh.setValues(this.JQp);
            this.JQp();
            this.JQp[0] = 1.0f;
            this.JQp[3] = (float)Math.tan(f4);
            this.JQp[4] = 1.0f;
            this.JQp[8] = 1.0f;
            this.ReZ.setValues(this.JQp);
            this.JQp();
            this.JQp[0] = f2;
            this.JQp[1] = -f3;
            this.JQp[3] = f3;
            this.JQp[4] = f2;
            this.JQp[8] = 1.0f;
            this.cr.setValues(this.JQp);
            this.ReZ.preConcat(this.Zh);
            this.cr.preConcat(this.ReZ);
            this.PjT.preConcat(this.cr);
        }
        PjT pjT2 = this.Au;
        if(pjT2 != null) {
            ReZ reZ0 = (ReZ)pjT2.XX();
            if(reZ0.PjT() != 1.0f || reZ0.Zh() != 1.0f) {
                this.PjT.preScale(reZ0.PjT(), reZ0.Zh());
            }
        }
        PjT pjT3 = this.cz;
        if(pjT3 != null) {
            PointF pointF1 = (PointF)pjT3.XX();
            if(pointF1 != null && pointF1.x != 0.0f || pointF1.y != 0.0f) {
                this.PjT.preTranslate(-pointF1.x, -pointF1.y);
            }
        }
        return this.PjT;
    }
}

