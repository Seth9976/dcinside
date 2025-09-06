package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.Zh.PjT.Zh.ReZ;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.PjT.cr;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.cz.cz;
import java.util.ArrayList;
import java.util.List;

public abstract class PjT implements JQp, qj, com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT {
    static final class com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT {
        private final List PjT;
        private final RD Zh;

        private com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT(RD rD0) {
            this.PjT = new ArrayList();
            this.Zh = rD0;
        }

        com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT(RD rD0, com.bytedance.adsdk.Zh.PjT.PjT.PjT.1 pjT$10) {
            this(rD0);
        }
    }

    private final SM Au;
    private final float[] DWo;
    private final Path JQp;
    protected final com.bytedance.adsdk.Zh.ReZ.ReZ.PjT PjT;
    float ReZ;
    private final List SM;
    private final RectF XX;
    final Paint Zh;
    private final PathMeasure cr;
    private final Path cz;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT fDm;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT qj;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT qla;
    private ReZ ub;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT xE;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT xf;
    private final List xs;

    PjT(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, Paint.Cap paint$Cap0, Paint.Join paint$Join0, float f, cr cr0, Zh zh0, List list0, Zh zh1) {
        this.cr = new PathMeasure();
        this.JQp = new Path();
        this.cz = new Path();
        this.XX = new RectF();
        this.SM = new ArrayList();
        com.bytedance.adsdk.Zh.PjT.PjT pjT1 = new com.bytedance.adsdk.Zh.PjT.PjT(1);
        this.Zh = pjT1;
        this.ReZ = 0.0f;
        this.Au = sM0;
        this.PjT = pjT0;
        pjT1.setStyle(Paint.Style.STROKE);
        pjT1.setStrokeCap(paint$Cap0);
        pjT1.setStrokeJoin(paint$Join0);
        pjT1.setStrokeMiter(f);
        this.xf = cr0.PjT();
        this.qj = zh0.PjT();
        this.fDm = zh1 == null ? null : zh1.PjT();
        this.xs = new ArrayList(list0.size());
        this.DWo = new float[list0.size()];
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = ((Zh)list0.get(v1)).PjT();
            this.xs.add(pjT2);
        }
        pjT0.PjT(this.xf);
        pjT0.PjT(this.qj);
        for(int v2 = 0; v2 < this.xs.size(); ++v2) {
            pjT0.PjT(((com.bytedance.adsdk.Zh.PjT.Zh.PjT)this.xs.get(v2)));
        }
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT3 = this.fDm;
        if(pjT3 != null) {
            pjT0.PjT(pjT3);
        }
        this.xf.PjT(this);
        this.qj.PjT(this);
        for(int v = 0; v < list0.size(); ++v) {
            ((com.bytedance.adsdk.Zh.PjT.Zh.PjT)this.xs.get(v)).PjT(this);
        }
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT4 = this.fDm;
        if(pjT4 != null) {
            pjT4.PjT(this);
        }
        if(pjT0.DWo() != null) {
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT5 = pjT0.DWo().PjT().PjT();
            this.xE = pjT5;
            pjT5.PjT(this);
            pjT0.PjT(this.xE);
        }
        if(pjT0.qj() != null) {
            this.ub = new ReZ(this, pjT0, pjT0.qj());
        }
    }

    private void PjT(Canvas canvas0, com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT pjT$PjT0, Matrix matrix0) {
        com.bytedance.adsdk.Zh.JQp.PjT("StrokeContent#applyTrimPath");
        if(pjT$PjT0.Zh == null) {
            com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#applyTrimPath");
            return;
        }
        this.JQp.reset();
        for(int v = pjT$PjT0.PjT.size() - 1; v >= 0; --v) {
            Path path0 = ((xs)pjT$PjT0.PjT.get(v)).cr();
            this.JQp.addPath(path0, matrix0);
        }
        float f = (float)(((Float)pjT$PjT0.Zh.ReZ().XX()));
        float f1 = (float)(((Float)pjT$PjT0.Zh.cr().XX()));
        float f2 = (float)(((Float)pjT$PjT0.Zh.JQp().XX()));
        if(f / 100.0f < 0.01f && f1 / 100.0f > 0.99f) {
            canvas0.drawPath(this.JQp, this.Zh);
            com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#applyTrimPath");
            return;
        }
        this.cr.setPath(this.JQp, false);
        float f3;
        for(f3 = this.cr.getLength(); this.cr.nextContour(); f3 += this.cr.getLength()) {
        }
        float f4 = f2 / 360.0f * f3;
        float f5 = f / 100.0f * f3 + f4;
        float f6 = Math.min(f1 / 100.0f * f3 + f4, f5 + f3 - 1.0f);
        int v1 = pjT$PjT0.PjT.size() - 1;
        float f7 = 0.0f;
        while(v1 >= 0) {
            Path path1 = ((xs)pjT$PjT0.PjT.get(v1)).cr();
            this.cz.set(path1);
            this.cz.transform(matrix0);
            this.cr.setPath(this.cz, false);
            float f8 = this.cr.getLength();
            if(f6 > f3) {
                float f9 = f6 - f3;
                if(f9 < f7 + f8 && f7 < f9) {
                    cz.PjT(this.cz, (f5 > f3 ? (f5 - f3) / f8 : 0.0f), Math.min(f9 / f8, 1.0f), 0.0f);
                    canvas0.drawPath(this.cz, this.Zh);
                }
            }
            else {
                float f10 = f7 + f8;
                if(f10 >= f5 && f7 <= f6) {
                    if(f10 > f6 || f5 >= f7) {
                        cz.PjT(this.cz, (f5 < f7 ? 0.0f : (f5 - f7) / f8), (f6 > f10 ? 1.0f : (f6 - f7) / f8), 0.0f);
                    }
                    canvas0.drawPath(this.cz, this.Zh);
                }
            }
            f7 += f8;
            --v1;
        }
        com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#applyTrimPath");
    }

    private void PjT(Matrix matrix0) {
        com.bytedance.adsdk.Zh.JQp.PjT("StrokeContent#applyDashPattern");
        if(this.xs.isEmpty()) {
            com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#applyDashPattern");
            return;
        }
        float f = cz.PjT(matrix0);
        for(int v = 0; v < this.xs.size(); ++v) {
            this.DWo[v] = (float)(((Float)((com.bytedance.adsdk.Zh.PjT.Zh.PjT)this.xs.get(v)).XX()));
            if(v % 2 == 0) {
                float[] arr_f = this.DWo;
                if(arr_f[v] < 1.0f) {
                    arr_f[v] = 1.0f;
                }
            }
            else {
                float[] arr_f1 = this.DWo;
                if(arr_f1[v] < 0.1f) {
                    arr_f1[v] = 0.1f;
                }
            }
            this.DWo[v] *= f;
        }
        float f1 = this.fDm == null ? 0.0f : f * ((float)(((Float)this.fDm.XX())));
        DashPathEffect dashPathEffect0 = new DashPathEffect(this.DWo, f1);
        this.Zh.setPathEffect(dashPathEffect0);
        com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#applyDashPattern");
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.Au.invalidateSelf();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(Canvas canvas0, Matrix matrix0, int v) {
        com.bytedance.adsdk.Zh.JQp.PjT("StrokeContent#draw");
        if(cz.Zh(matrix0)) {
            com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#draw");
            return;
        }
        int v2 = com.bytedance.adsdk.Zh.cz.JQp.PjT(((int)(((float)v) / 255.0f * ((float)((com.bytedance.adsdk.Zh.PjT.Zh.cz)this.xf).SM()) / 100.0f * 255.0f)), 0, 0xFF);
        this.Zh.setAlpha(v2);
        float f = ((com.bytedance.adsdk.Zh.PjT.Zh.cr)this.qj).SM();
        float f1 = cz.PjT(matrix0);
        this.Zh.setStrokeWidth(f * f1);
        if(this.Zh.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#draw");
            return;
        }
        this.PjT(matrix0);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.qla;
        if(pjT0 != null) {
            ColorFilter colorFilter0 = (ColorFilter)pjT0.XX();
            this.Zh.setColorFilter(colorFilter0);
        }
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = this.xE;
        if(pjT1 != null) {
            float f2 = (float)(((Float)pjT1.XX()));
            if(f2 == 0.0f) {
                this.Zh.setMaskFilter(null);
            }
            else if(f2 != this.ReZ) {
                BlurMaskFilter blurMaskFilter0 = this.PjT.Zh(f2);
                this.Zh.setMaskFilter(blurMaskFilter0);
            }
            this.ReZ = f2;
        }
        ReZ reZ0 = this.ub;
        if(reZ0 != null) {
            reZ0.PjT(this.Zh);
        }
        for(int v1 = 0; v1 < this.SM.size(); ++v1) {
            com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT pjT$PjT0 = (com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT)this.SM.get(v1);
            if(pjT$PjT0.Zh == null) {
                com.bytedance.adsdk.Zh.JQp.PjT("StrokeContent#buildPath");
                this.JQp.reset();
                for(int v3 = pjT$PjT0.PjT.size() - 1; v3 >= 0; --v3) {
                    Path path0 = ((xs)pjT$PjT0.PjT.get(v3)).cr();
                    this.JQp.addPath(path0, matrix0);
                }
                com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#buildPath");
                com.bytedance.adsdk.Zh.JQp.PjT("StrokeContent#drawPath");
                canvas0.drawPath(this.JQp, this.Zh);
                com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#drawPath");
            }
            else {
                this.PjT(canvas0, pjT$PjT0, matrix0);
            }
        }
        com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#draw");
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        com.bytedance.adsdk.Zh.JQp.PjT("StrokeContent#getBounds");
        this.JQp.reset();
        for(int v = 0; v < this.SM.size(); ++v) {
            com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT pjT$PjT0 = (com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT)this.SM.get(v);
            for(int v1 = 0; v1 < pjT$PjT0.PjT.size(); ++v1) {
                Path path0 = ((xs)pjT$PjT0.PjT.get(v1)).cr();
                this.JQp.addPath(path0, matrix0);
            }
        }
        this.JQp.computeBounds(this.XX, false);
        float f = ((com.bytedance.adsdk.Zh.PjT.Zh.cr)this.qj).SM();
        this.XX.set(this.XX.left - f / 2.0f, this.XX.top - f / 2.0f, this.XX.right + f / 2.0f, this.XX.bottom + f / 2.0f);
        rectF0.set(this.XX);
        rectF0.set(rectF0.left - 1.0f, rectF0.top - 1.0f, rectF0.right + 1.0f, rectF0.bottom + 1.0f);
        com.bytedance.adsdk.Zh.JQp.Zh("StrokeContent#getBounds");
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
        int v = list0.size() - 1;
        RD rD0 = null;
        while(v >= 0) {
            com.bytedance.adsdk.Zh.PjT.PjT.ReZ reZ0 = (com.bytedance.adsdk.Zh.PjT.PjT.ReZ)list0.get(v);
            if(reZ0 instanceof RD && ((RD)reZ0).Zh() == com.bytedance.adsdk.Zh.ReZ.Zh.ltE.PjT.Zh) {
                rD0 = (RD)reZ0;
            }
            --v;
        }
        if(rD0 != null) {
            rD0.PjT(this);
        }
        int v1 = list1.size() - 1;
        com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT pjT$PjT0 = null;
        while(v1 >= 0) {
            com.bytedance.adsdk.Zh.PjT.PjT.ReZ reZ1 = (com.bytedance.adsdk.Zh.PjT.PjT.ReZ)list1.get(v1);
            if(reZ1 instanceof RD && ((RD)reZ1).Zh() == com.bytedance.adsdk.Zh.ReZ.Zh.ltE.PjT.Zh) {
                if(pjT$PjT0 != null) {
                    this.SM.add(pjT$PjT0);
                }
                pjT$PjT0 = new com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT(((RD)reZ1), null);
                ((RD)reZ1).PjT(this);
            }
            else if(reZ1 instanceof xs) {
                if(pjT$PjT0 == null) {
                    pjT$PjT0 = new com.bytedance.adsdk.Zh.PjT.PjT.PjT.PjT(rD0, null);
                }
                pjT$PjT0.PjT.add(((xs)reZ1));
            }
            --v1;
        }
        if(pjT$PjT0 != null) {
            this.SM.add(pjT$PjT0);
        }
    }

    class com.bytedance.adsdk.Zh.PjT.PjT.PjT.1 {
    }

}

