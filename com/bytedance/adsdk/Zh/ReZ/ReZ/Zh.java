package com.bytedance.adsdk.Zh.ReZ.ReZ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.cz;
import java.util.ArrayList;
import java.util.List;

public class Zh extends PjT {
    private final List Au;
    private final RectF DWo;
    private final RectF SM;
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT XX;
    private final Paint qj;
    private boolean xf;

    public Zh(SM sM0, JQp jQp0, List list0, XX xX0, Context context0) {
        super(sM0, jQp0);
        this.Au = new ArrayList();
        this.SM = new RectF();
        this.DWo = new RectF();
        this.qj = new Paint();
        this.xf = true;
        com.bytedance.adsdk.Zh.ReZ.PjT.Zh zh0 = jQp0.RD();
        if(zh0 == null) {
            this.XX = null;
        }
        else {
            com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = zh0.PjT();
            this.XX = pjT0;
            this.PjT(pjT0);
            this.XX.PjT(this);
        }
        LongSparseArray longSparseArray0 = new LongSparseArray(xX0.xs().size());
        int v = list0.size() - 1;
        PjT pjT1 = null;
        while(v >= 0) {
            JQp jQp1 = (JQp)list0.get(v);
            PjT pjT2 = PjT.PjT(this, jQp1, sM0, xX0, context0);
            if(pjT2 != null) {
                longSparseArray0.put(pjT2.Zh().JQp(), pjT2);
                if(pjT1 == null) {
                    this.Au.add(0, pjT2);
                    if(jQp1 != null) {
                        com.bytedance.adsdk.Zh.ReZ.ReZ.JQp.Zh jQp$Zh0 = jQp1.xf();
                        if(jQp$Zh0 != null) {
                            switch(jQp$Zh0) {
                                case 1: 
                                case 2: {
                                    pjT1 = pjT2;
                                }
                            }
                        }
                    }
                }
                else {
                    pjT1.PjT(pjT2);
                    pjT1 = null;
                }
            }
            --v;
        }
        for(int v1 = 0; v1 < longSparseArray0.size(); ++v1) {
            PjT pjT3 = (PjT)longSparseArray0.get(longSparseArray0.keyAt(v1));
            if(pjT3 != null) {
                PjT pjT4 = (PjT)longSparseArray0.get(pjT3.Zh().xs());
                if(pjT4 != null) {
                    pjT3.Zh(pjT4);
                }
            }
        }
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void PjT(float f) {
        super.PjT(f);
        if(this.XX != null) {
            f = (((float)(((Float)this.XX.XX()))) * this.ReZ.PjT().xf() - this.ReZ.PjT().cz()) / (this.Zh.yIW().ub() + 0.01f);
        }
        if(this.XX == null) {
            f -= this.ReZ.ReZ();
        }
        if(this.ReZ.Zh() != 0.0f && !"__container".equals(this.ReZ.cz())) {
            f /= this.ReZ.Zh();
        }
        for(int v = this.Au.size() - 1; v >= 0; --v) {
            ((PjT)this.Au.get(v)).PjT(f);
        }
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        super.PjT(rectF0, matrix0, z);
        for(int v = this.Au.size() - 1; v >= 0; --v) {
            this.SM.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((PjT)this.Au.get(v)).PjT(this.SM, this.PjT, true);
            rectF0.union(this.SM);
        }
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void PjT(boolean z) {
        super.PjT(z);
        for(Object object0: this.Au) {
            ((PjT)object0).PjT(z);
        }
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void Zh(Canvas canvas0, Matrix matrix0, int v) {
        super.Zh(canvas0, matrix0, v);
        com.bytedance.adsdk.Zh.JQp.PjT("CompositionLayer#draw");
        this.DWo.set(0.0f, 0.0f, this.ReZ.Au(), this.ReZ.SM());
        matrix0.mapRect(this.DWo);
        boolean z = this.Zh.SM() && this.Au.size() > 1 && v != 0xFF;
        if(z) {
            this.qj.setAlpha(v);
            cz.PjT(canvas0, this.DWo, this.qj);
        }
        else {
            canvas0.save();
        }
        if(z) {
            v = 0xFF;
        }
        for(int v1 = this.Au.size() - 1; v1 >= 0; --v1) {
            if((!this.xf && "__container".equals(this.ReZ.cz()) || this.DWo.isEmpty() ? true : canvas0.clipRect(this.DWo))) {
                ((PjT)this.Au.get(v1)).PjT(canvas0, matrix0, v);
            }
        }
        canvas0.restore();
        com.bytedance.adsdk.Zh.JQp.Zh("CompositionLayer#draw");
    }

    public void Zh(boolean z) {
        this.xf = z;
    }

    public List xf() {
        return this.Au;
    }
}

