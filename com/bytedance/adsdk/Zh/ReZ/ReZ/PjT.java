package com.bytedance.adsdk.Zh.ReZ.ReZ;

import android.content.Context;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import com.bytedance.adsdk.Zh.PjT.PjT.JQp;
import com.bytedance.adsdk.Zh.PjT.Zh.Au;
import com.bytedance.adsdk.Zh.PjT.Zh.cr;
import com.bytedance.adsdk.Zh.PjT.Zh.xE;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.cz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PjT implements JQp, com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT {
    private final Matrix Au;
    private final Paint DWo;
    float JQp;
    private Paint KM;
    private PjT Lrd;
    private final String Owx;
    final Matrix PjT;
    private final Matrix Qf;
    private Au RD;
    final com.bytedance.adsdk.Zh.ReZ.ReZ.JQp ReZ;
    private final Matrix SM;
    private cr Sks;
    private final Path XX;
    private boolean Yo;
    private float ZX;
    final SM Zh;
    private List cRA;
    final xE cr;
    BlurMaskFilter cz;
    private final Paint fDm;
    private final RectF gK;
    private boolean iZZ;
    private final RectF ltE;
    private final Paint qj;
    private final RectF qla;
    private PjT tT;
    private final RectF ub;
    private final RectF xE;
    private final Paint xf;
    private final Paint xs;
    private final List yIW;

    PjT(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.JQp jQp0) {
        this.XX = new Path();
        this.Au = new Matrix();
        this.SM = new Matrix();
        this.DWo = new com.bytedance.adsdk.Zh.PjT.PjT(1);
        PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.DST_IN;
        this.qj = new com.bytedance.adsdk.Zh.PjT.PjT(1, porterDuff$Mode0);
        PorterDuff.Mode porterDuff$Mode1 = PorterDuff.Mode.DST_OUT;
        this.xf = new com.bytedance.adsdk.Zh.PjT.PjT(1, porterDuff$Mode1);
        com.bytedance.adsdk.Zh.PjT.PjT pjT0 = new com.bytedance.adsdk.Zh.PjT.PjT(1);
        this.xs = pjT0;
        this.fDm = new com.bytedance.adsdk.Zh.PjT.PjT(PorterDuff.Mode.CLEAR);
        this.qla = new RectF();
        this.xE = new RectF();
        this.ub = new RectF();
        this.gK = new RectF();
        this.ltE = new RectF();
        this.PjT = new Matrix();
        this.yIW = new ArrayList();
        this.iZZ = true;
        this.JQp = 0.0f;
        this.Qf = new Matrix();
        this.ZX = 1.0f;
        this.Zh = sM0;
        this.ReZ = jQp0;
        this.Owx = jQp0.cz() + "#draw";
        if(jQp0.xf() == Zh.ReZ) {
            pjT0.setXfermode(new PorterDuffXfermode(porterDuff$Mode1));
        }
        else {
            pjT0.setXfermode(new PorterDuffXfermode(porterDuff$Mode0));
        }
        xE xE0 = jQp0.qla().DWo();
        this.cr = xE0;
        xE0.PjT(this);
        if(jQp0.DWo() != null && !jQp0.DWo().isEmpty()) {
            Au au0 = new Au(jQp0.DWo());
            this.RD = au0;
            for(Object object0: au0.Zh()) {
                ((com.bytedance.adsdk.Zh.PjT.Zh.PjT)object0).PjT(this);
            }
            for(Object object1: this.RD.ReZ()) {
                this.PjT(((com.bytedance.adsdk.Zh.PjT.Zh.PjT)object1));
                ((com.bytedance.adsdk.Zh.PjT.Zh.PjT)object1).PjT(this);
            }
        }
        this.xf();
    }

    public boolean Au() {
        return this.iZZ;
    }

    public com.bytedance.adsdk.Zh.ReZ.Zh.PjT DWo() {
        return this.ReZ.tT();
    }

    private void JQp(Canvas canvas0, Matrix matrix0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1) {
        cz.PjT(canvas0, this.qla, this.qj);
        canvas0.drawRect(this.qla, this.DWo);
        int v = (int)(((float)(((int)(((Integer)pjT1.XX()))))) * 2.55f);
        this.xf.setAlpha(v);
        Path path0 = (Path)pjT0.XX();
        this.XX.set(path0);
        this.XX.transform(matrix0);
        canvas0.drawPath(this.XX, this.xf);
        canvas0.restore();
    }

    public String JQp() {
        return this.ReZ == null ? null : this.ReZ.XX();
    }

    static PjT PjT(com.bytedance.adsdk.Zh.ReZ.ReZ.Zh zh0, com.bytedance.adsdk.Zh.ReZ.ReZ.JQp jQp0, SM sM0, XX xX0, Context context0) {
        switch(jQp0.qj()) {
            case 1: {
                return new com.bytedance.adsdk.Zh.ReZ.ReZ.XX(sM0, jQp0, zh0, xX0);
            }
            case 2: {
                return new com.bytedance.adsdk.Zh.ReZ.ReZ.Zh(sM0, jQp0, xX0.Zh(jQp0.XX()), xX0, context0);
            }
            case 3: {
                return new com.bytedance.adsdk.Zh.ReZ.ReZ.Au(sM0, jQp0);
            }
            case 4: {
                if(PjT.PjT(sM0, jQp0, "text:")) {
                    return new ReZ(sM0, jQp0, context0);
                }
                return PjT.PjT(sM0, jQp0, "videoview:") ? new DWo(sM0, jQp0, context0) : new com.bytedance.adsdk.Zh.ReZ.ReZ.cr(sM0, jQp0);
            }
            case 5: {
                return new com.bytedance.adsdk.Zh.ReZ.ReZ.cz(sM0, jQp0);
            }
            case 6: {
                return new com.bytedance.adsdk.Zh.ReZ.ReZ.SM(sM0, jQp0);
            }
            default: {
                return null;
            }
        }
    }

    private void PjT(Canvas canvas0) {
        com.bytedance.adsdk.Zh.JQp.PjT("Layer#clearLayer");
        canvas0.drawRect(this.qla.left - 1.0f, this.qla.top - 1.0f, this.qla.right + 1.0f, this.qla.bottom + 1.0f, this.fDm);
        com.bytedance.adsdk.Zh.JQp.Zh("Layer#clearLayer");
    }

    private void PjT(Canvas canvas0, Matrix matrix0) {
        com.bytedance.adsdk.Zh.JQp.PjT("Layer#saveLayer");
        cz.PjT(canvas0, this.qla, this.qj, 19);
        if(Build.VERSION.SDK_INT < 28) {
            this.PjT(canvas0);
        }
        com.bytedance.adsdk.Zh.JQp.Zh("Layer#saveLayer");
        for(int v = 0; v < this.RD.PjT().size(); ++v) {
            com.bytedance.adsdk.Zh.ReZ.Zh.Au au0 = (com.bytedance.adsdk.Zh.ReZ.Zh.Au)this.RD.PjT().get(v);
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = (com.bytedance.adsdk.Zh.PjT.Zh.PjT)this.RD.Zh().get(v);
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = (com.bytedance.adsdk.Zh.PjT.Zh.PjT)this.RD.ReZ().get(v);
            switch(com.bytedance.adsdk.Zh.ReZ.ReZ.PjT.2.Zh[au0.PjT().ordinal()]) {
                case 1: {
                    if(this.fDm()) {
                        this.DWo.setAlpha(0xFF);
                        canvas0.drawRect(this.qla, this.DWo);
                    }
                    break;
                }
                case 2: {
                    if(v == 0) {
                        this.DWo.setColor(0xFF000000);
                        this.DWo.setAlpha(0xFF);
                        canvas0.drawRect(this.qla, this.DWo);
                    }
                    if(au0.cr()) {
                        this.ReZ(canvas0, matrix0, pjT0, pjT1);
                    }
                    else {
                        this.PjT(canvas0, matrix0, pjT0);
                    }
                    break;
                }
                case 3: {
                    if(au0.cr()) {
                        this.JQp(canvas0, matrix0, pjT0, pjT1);
                    }
                    else {
                        this.cr(canvas0, matrix0, pjT0, pjT1);
                    }
                    break;
                }
                case 4: {
                    if(au0.cr()) {
                        this.Zh(canvas0, matrix0, pjT0, pjT1);
                    }
                    else {
                        this.PjT(canvas0, matrix0, pjT0, pjT1);
                    }
                }
            }
        }
        com.bytedance.adsdk.Zh.JQp.PjT("Layer#restoreLayer");
        canvas0.restore();
        com.bytedance.adsdk.Zh.JQp.Zh("Layer#restoreLayer");
    }

    private void PjT(Canvas canvas0, Matrix matrix0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0) {
        Path path0 = (Path)pjT0.XX();
        this.XX.set(path0);
        this.XX.transform(matrix0);
        canvas0.drawPath(this.XX, this.xf);
    }

    private void PjT(Canvas canvas0, Matrix matrix0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1) {
        Path path0 = (Path)pjT0.XX();
        this.XX.set(path0);
        this.XX.transform(matrix0);
        int v = (int)(((float)(((int)(((Integer)pjT1.XX()))))) * 2.55f);
        this.DWo.setAlpha(v);
        canvas0.drawPath(this.XX, this.DWo);
    }

    private void PjT(RectF rectF0, Matrix matrix0) {
        this.ub.set(0.0f, 0.0f, 0.0f, 0.0f);
        if(!this.XX()) {
            return;
        }
        int v = this.RD.PjT().size();
        for(int v1 = 0; v1 < v; ++v1) {
            com.bytedance.adsdk.Zh.ReZ.Zh.Au au0 = (com.bytedance.adsdk.Zh.ReZ.Zh.Au)this.RD.PjT().get(v1);
            Path path0 = (Path)((com.bytedance.adsdk.Zh.PjT.Zh.PjT)this.RD.Zh().get(v1)).XX();
            if(path0 != null) {
                this.XX.set(path0);
                this.XX.transform(matrix0);
                switch(com.bytedance.adsdk.Zh.ReZ.ReZ.PjT.2.Zh[au0.PjT().ordinal()]) {
                    case 1: 
                    case 2: {
                        return;
                    }
                    case 3: 
                    case 4: {
                        if(au0.cr()) {
                            return;
                        }
                    }
                }
                this.XX.computeBounds(this.ltE, false);
                if(v1 == 0) {
                    this.ub.set(this.ltE);
                }
                else {
                    this.ub.set(Math.min(this.ub.left, this.ltE.left), Math.min(this.ub.top, this.ltE.top), Math.max(this.ub.right, this.ltE.right), Math.max(this.ub.bottom, this.ltE.bottom));
                }
            }
        }
        if(!rectF0.intersect(this.ub)) {
            rectF0.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private static boolean PjT(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.JQp jQp0, String s) {
        if(sM0 != null && jQp0 != null && s != null) {
            com.bytedance.adsdk.Zh.DWo dWo0 = sM0.cz(jQp0.XX());
            return dWo0 == null ? false : s.equals(dWo0.DWo());
        }
        return false;
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.xs();
    }

    void PjT(float f) {
        this.cr.PjT(f);
        if(this.RD != null) {
            for(int v1 = 0; v1 < this.RD.Zh().size(); ++v1) {
                ((com.bytedance.adsdk.Zh.PjT.Zh.PjT)this.RD.Zh().get(v1)).PjT(f);
            }
        }
        cr cr0 = this.Sks;
        if(cr0 != null) {
            cr0.PjT(f);
        }
        PjT pjT0 = this.tT;
        if(pjT0 != null) {
            pjT0.PjT(f);
        }
        for(int v = 0; v < this.yIW.size(); ++v) {
            ((com.bytedance.adsdk.Zh.PjT.Zh.PjT)this.yIW.get(v)).PjT(f);
        }
    }

    protected void PjT(int v) {
        this.ZX = ((float)(this.cr.PjT() == null ? 100 : ((int)(((Integer)this.cr.PjT().XX()))))) / 100.0f * (((float)v) / 255.0f);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(Canvas canvas0, Matrix matrix0, int v) {
        int v2;
        com.bytedance.adsdk.Zh.JQp.PjT(this.Owx);
        if(this.iZZ && !this.ReZ.Sks()) {
            this.qla();
            com.bytedance.adsdk.Zh.JQp.PjT("Layer#parentMatrix");
            this.Qf.set(matrix0);
            this.Au.reset();
            this.Au.set(matrix0);
            for(int v1 = this.cRA.size() - 1; v1 >= 0; --v1) {
                Matrix matrix1 = ((PjT)this.cRA.get(v1)).cr.cr();
                this.Au.preConcat(matrix1);
            }
            com.bytedance.adsdk.Zh.JQp.Zh("Layer#parentMatrix");
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.cr.PjT();
            if(pjT0 == null) {
                v2 = 100;
            }
            else {
                Integer integer0 = (Integer)pjT0.XX();
                v2 = integer0 == null ? 100 : ((int)integer0);
            }
            int v3 = (int)(((float)v) / 255.0f * ((float)v2) / 100.0f * 255.0f);
            if(!this.ReZ() && !this.XX()) {
                Matrix matrix2 = this.cr.cr();
                this.Au.preConcat(matrix2);
                com.bytedance.adsdk.Zh.JQp.PjT("Layer#drawLayer");
                this.Zh(canvas0, this.Au, v3);
                com.bytedance.adsdk.Zh.JQp.Zh("Layer#drawLayer");
                this.ReZ(com.bytedance.adsdk.Zh.JQp.Zh(this.Owx));
                return;
            }
            com.bytedance.adsdk.Zh.JQp.PjT("Layer#computeBounds");
            this.PjT(this.qla, this.Au, false);
            this.Zh(this.qla, matrix0);
            Matrix matrix3 = this.cr.cr();
            this.Au.preConcat(matrix3);
            this.PjT(this.qla, this.Au);
            float f = (float)canvas0.getWidth();
            float f1 = (float)canvas0.getHeight();
            this.xE.set(0.0f, 0.0f, f, f1);
            canvas0.getMatrix(this.SM);
            if(!this.SM.isIdentity()) {
                this.SM.invert(this.SM);
                this.SM.mapRect(this.xE);
            }
            if(!this.qla.intersect(this.xE)) {
                this.qla.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.Zh.JQp.Zh("Layer#computeBounds");
            if(this.qla.width() >= 1.0f && this.qla.height() >= 1.0f) {
                com.bytedance.adsdk.Zh.JQp.PjT("Layer#saveLayer");
                this.DWo.setAlpha(0xFF);
                cz.PjT(canvas0, this.qla, this.DWo);
                com.bytedance.adsdk.Zh.JQp.Zh("Layer#saveLayer");
                this.PjT(canvas0);
                com.bytedance.adsdk.Zh.JQp.PjT("Layer#drawLayer");
                this.Zh(canvas0, this.Au, v3);
                com.bytedance.adsdk.Zh.JQp.Zh("Layer#drawLayer");
                if(this.XX()) {
                    this.PjT(canvas0, this.Au);
                }
                if(this.ReZ()) {
                    com.bytedance.adsdk.Zh.JQp.PjT("Layer#drawMatte");
                    com.bytedance.adsdk.Zh.JQp.PjT("Layer#saveLayer");
                    cz.PjT(canvas0, this.qla, this.xs, 19);
                    com.bytedance.adsdk.Zh.JQp.Zh("Layer#saveLayer");
                    this.PjT(canvas0);
                    this.tT.PjT(canvas0, matrix0, v3);
                    com.bytedance.adsdk.Zh.JQp.PjT("Layer#restoreLayer");
                    canvas0.restore();
                    com.bytedance.adsdk.Zh.JQp.Zh("Layer#restoreLayer");
                    com.bytedance.adsdk.Zh.JQp.Zh("Layer#drawMatte");
                }
                com.bytedance.adsdk.Zh.JQp.PjT("Layer#restoreLayer");
                canvas0.restore();
                com.bytedance.adsdk.Zh.JQp.Zh("Layer#restoreLayer");
            }
            if(this.Yo) {
                Paint paint0 = this.KM;
                if(paint0 != null) {
                    paint0.setStyle(Paint.Style.STROKE);
                    this.KM.setColor(0xFFFC2803);
                    this.KM.setStrokeWidth(4.0f);
                    canvas0.drawRect(this.qla, this.KM);
                    this.KM.setStyle(Paint.Style.FILL);
                    this.KM.setColor(0x50EBEBEB);
                    canvas0.drawRect(this.qla, this.KM);
                }
            }
            this.ReZ(com.bytedance.adsdk.Zh.JQp.Zh(this.Owx));
            return;
        }
        com.bytedance.adsdk.Zh.JQp.Zh(this.Owx);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        this.qla.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.qla();
        this.PjT.set(matrix0);
        if(z) {
            List list0 = this.cRA;
            if(list0 == null) {
                PjT pjT0 = this.Lrd;
                if(pjT0 != null) {
                    Matrix matrix2 = pjT0.cr.cr();
                    this.PjT.preConcat(matrix2);
                }
            }
            else {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    Matrix matrix1 = ((PjT)this.cRA.get(v)).cr.cr();
                    this.PjT.preConcat(matrix1);
                }
            }
        }
        Matrix matrix3 = this.cr.cr();
        this.PjT.preConcat(matrix3);
    }

    public void PjT(com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0) {
        if(pjT0 == null) {
            return;
        }
        this.yIW.add(pjT0);
    }

    void PjT(PjT pjT0) {
        this.tT = pjT0;
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
    }

    void PjT(boolean z) {
        if(z && this.KM == null) {
            this.KM = new com.bytedance.adsdk.Zh.PjT.PjT();
        }
        this.Yo = z;
    }

    private void ReZ(float f) {
        this.Zh.yIW().ReZ().PjT(this.ReZ.cz(), f);
    }

    private void ReZ(Canvas canvas0, Matrix matrix0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1) {
        cz.PjT(canvas0, this.qla, this.xf);
        canvas0.drawRect(this.qla, this.DWo);
        int v = (int)(((float)(((int)(((Integer)pjT1.XX()))))) * 2.55f);
        this.xf.setAlpha(v);
        Path path0 = (Path)pjT0.XX();
        this.XX.set(path0);
        this.XX.transform(matrix0);
        canvas0.drawPath(this.XX, this.xf);
        canvas0.restore();
    }

    boolean ReZ() {
        return this.tT != null;
    }

    public String SM() {
        return this.ReZ.cz();
    }

    boolean XX() {
        return this.RD != null && !this.RD.Zh().isEmpty();
    }

    private void Zh(Canvas canvas0, Matrix matrix0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1) {
        cz.PjT(canvas0, this.qla, this.DWo);
        canvas0.drawRect(this.qla, this.DWo);
        Path path0 = (Path)pjT0.XX();
        this.XX.set(path0);
        this.XX.transform(matrix0);
        int v = (int)(((float)(((int)(((Integer)pjT1.XX()))))) * 2.55f);
        this.DWo.setAlpha(v);
        canvas0.drawPath(this.XX, this.xf);
        canvas0.restore();
    }

    private void Zh(RectF rectF0, Matrix matrix0) {
        if(!this.ReZ()) {
            return;
        }
        if(this.ReZ.xf() == Zh.ReZ) {
            return;
        }
        this.gK.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.tT.PjT(this.gK, matrix0, true);
        if(!rectF0.intersect(this.gK)) {
            rectF0.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void Zh(boolean z) {
        if(z != this.iZZ) {
            this.iZZ = z;
            this.xs();
        }
    }

    public BlurMaskFilter Zh(float f) {
        if(this.JQp == f) {
            return this.cz;
        }
        BlurMaskFilter blurMaskFilter0 = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.cz = blurMaskFilter0;
        this.JQp = f;
        return blurMaskFilter0;
    }

    com.bytedance.adsdk.Zh.ReZ.ReZ.JQp Zh() {
        return this.ReZ;
    }

    public void Zh(Canvas canvas0, Matrix matrix0, int v) {
        this.PjT(v);
    }

    void Zh(PjT pjT0) {
        this.Lrd = pjT0;
    }

    private void cr(Canvas canvas0, Matrix matrix0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0, com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1) {
        cz.PjT(canvas0, this.qla, this.qj);
        Path path0 = (Path)pjT0.XX();
        this.XX.set(path0);
        this.XX.transform(matrix0);
        int v = (int)(((float)(((int)(((Integer)pjT1.XX()))))) * 2.55f);
        this.DWo.setAlpha(v);
        canvas0.drawPath(this.XX, this.DWo);
        canvas0.restore();
    }

    public Matrix cr() {
        return this.Qf;
    }

    public float cz() {
        return this.ZX;
    }

    private boolean fDm() {
        if(this.RD.Zh().isEmpty()) {
            return false;
        }
        for(int v = 0; v < this.RD.PjT().size(); ++v) {
            if(((com.bytedance.adsdk.Zh.ReZ.Zh.Au)this.RD.PjT().get(v)).PjT() != com.bytedance.adsdk.Zh.ReZ.Zh.Au.PjT.cr) {
                return false;
            }
        }
        return true;
    }

    public com.bytedance.adsdk.Zh.JQp.DWo qj() {
        return this.ReZ.Lrd();
    }

    private void qla() {
        if(this.cRA != null) {
            return;
        }
        if(this.Lrd == null) {
            this.cRA = Collections.emptyList();
            return;
        }
        this.cRA = new ArrayList();
        for(PjT pjT0 = this.Lrd; pjT0 != null; pjT0 = pjT0.Lrd) {
            this.cRA.add(pjT0);
        }
    }

    private void xf() {
        boolean z = true;
        if(!this.ReZ.cr().isEmpty()) {
            cr cr0 = new cr(this.ReZ.cr());
            this.Sks = cr0;
            cr0.PjT();
            this.Sks.PjT(new com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT() {
                final PjT PjT;

                @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
                public void PjT() {
                    boolean z = PjT.this.Sks.SM() == 1.0f;
                    PjT.this.Zh(z);
                }
            });
            if(((float)(((Float)this.Sks.XX()))) != 1.0f) {
                z = false;
            }
            this.Zh(z);
            this.PjT(this.Sks);
            return;
        }
        this.Zh(true);
    }

    private void xs() {
        this.Zh.invalidateSelf();
    }
}

