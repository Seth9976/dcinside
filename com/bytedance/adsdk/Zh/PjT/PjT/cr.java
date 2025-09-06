package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT;
import com.bytedance.adsdk.Zh.PjT.Zh.xE;
import com.bytedance.adsdk.Zh.ReZ.PjT.xf;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.cz;
import java.util.ArrayList;
import java.util.List;

public class cr implements JQp, xs, PjT {
    private final List Au;
    private List DWo;
    private final RectF JQp;
    private final Paint PjT;
    private final Matrix ReZ;
    private final SM SM;
    private final boolean XX;
    private final RectF Zh;
    private final Path cr;
    private final String cz;
    private xE qj;

    public cr(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, com.bytedance.adsdk.Zh.ReZ.Zh.xE xE0, XX xX0) {
        this(sM0, pjT0, xE0.PjT(), xE0.ReZ(), cr.PjT(sM0, xX0, pjT0, xE0.Zh()), cr.PjT(xE0.Zh()));
    }

    cr(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, String s, boolean z, List list0, xf xf0) {
        this.PjT = new com.bytedance.adsdk.Zh.PjT.PjT();
        this.Zh = new RectF();
        this.ReZ = new Matrix();
        this.cr = new Path();
        this.JQp = new RectF();
        this.cz = s;
        this.SM = sM0;
        this.XX = z;
        this.Au = list0;
        if(xf0 != null) {
            xE xE0 = xf0.DWo();
            this.qj = xE0;
            xE0.PjT(pjT0);
            this.qj.PjT(this);
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = list0.size() - 1; v >= 0; --v) {
            ReZ reZ0 = (ReZ)list0.get(v);
            if(reZ0 instanceof DWo) {
                arrayList0.add(((DWo)reZ0));
            }
        }
        for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
            ((DWo)arrayList0.get(v1)).PjT(list0.listIterator(list0.size()));
        }
    }

    private boolean JQp() {
        int v1 = 0;
        for(int v = 0; v < this.Au.size(); ++v) {
            if(this.Au.get(v) instanceof JQp) {
                ++v1;
                if(v1 >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    static xf PjT(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            com.bytedance.adsdk.Zh.ReZ.Zh.ReZ reZ0 = (com.bytedance.adsdk.Zh.ReZ.Zh.ReZ)list0.get(v);
            if(reZ0 instanceof xf) {
                return (xf)reZ0;
            }
        }
        return null;
    }

    private static List PjT(SM sM0, XX xX0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, List list0) {
        List list1 = new ArrayList(list0.size());
        for(int v = 0; v < list0.size(); ++v) {
            ReZ reZ0 = ((com.bytedance.adsdk.Zh.ReZ.Zh.ReZ)list0.get(v)).PjT(sM0, xX0, pjT0);
            if(reZ0 != null) {
                list1.add(reZ0);
            }
        }
        return list1;
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.SM.invalidateSelf();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(Canvas canvas0, Matrix matrix0, int v) {
        if(this.XX) {
            return;
        }
        this.ReZ.set(matrix0);
        xE xE0 = this.qj;
        if(xE0 != null) {
            Matrix matrix1 = xE0.cr();
            this.ReZ.preConcat(matrix1);
            v = (int)(((float)(this.qj.PjT() == null ? 100 : ((int)(((Integer)this.qj.PjT().XX()))))) / 100.0f * ((float)v) / 255.0f * 255.0f);
        }
        boolean z = this.SM.SM() && this.JQp() && v != 0xFF;
        if(z) {
            this.Zh.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.PjT(this.Zh, this.ReZ, true);
            this.PjT.setAlpha(v);
            cz.PjT(canvas0, this.Zh, this.PjT);
        }
        if(z) {
            v = 0xFF;
        }
        for(int v1 = this.Au.size() - 1; v1 >= 0; --v1) {
            Object object0 = this.Au.get(v1);
            if(object0 instanceof JQp) {
                ((JQp)object0).PjT(canvas0, this.ReZ, v);
            }
        }
        if(z) {
            canvas0.restore();
        }
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        this.ReZ.set(matrix0);
        xE xE0 = this.qj;
        if(xE0 != null) {
            Matrix matrix1 = xE0.cr();
            this.ReZ.preConcat(matrix1);
        }
        this.JQp.set(0.0f, 0.0f, 0.0f, 0.0f);
        for(int v = this.Au.size() - 1; v >= 0; --v) {
            ReZ reZ0 = (ReZ)this.Au.get(v);
            if(reZ0 instanceof JQp) {
                ((JQp)reZ0).PjT(this.JQp, this.ReZ, z);
                rectF0.union(this.JQp);
            }
        }
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
        ArrayList arrayList0 = new ArrayList(list0.size() + this.Au.size());
        arrayList0.addAll(list0);
        for(int v = this.Au.size() - 1; v >= 0; --v) {
            ReZ reZ0 = (ReZ)this.Au.get(v);
            reZ0.PjT(arrayList0, this.Au.subList(0, v));
            arrayList0.add(reZ0);
        }
    }

    Matrix ReZ() {
        xE xE0 = this.qj;
        if(xE0 != null) {
            return xE0.cr();
        }
        this.ReZ.reset();
        return this.ReZ;
    }

    List Zh() {
        if(this.DWo == null) {
            this.DWo = new ArrayList();
            for(int v = 0; v < this.Au.size(); ++v) {
                ReZ reZ0 = (ReZ)this.Au.get(v);
                if(reZ0 instanceof xs) {
                    this.DWo.add(((xs)reZ0));
                }
            }
        }
        return this.DWo;
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.xs
    public Path cr() {
        this.ReZ.reset();
        xE xE0 = this.qj;
        if(xE0 != null) {
            Matrix matrix0 = xE0.cr();
            this.ReZ.set(matrix0);
        }
        this.cr.reset();
        if(this.XX) {
            return this.cr;
        }
        for(int v = this.Au.size() - 1; v >= 0; --v) {
            ReZ reZ0 = (ReZ)this.Au.get(v);
            if(reZ0 instanceof xs) {
                Path path0 = ((xs)reZ0).cr();
                this.cr.addPath(path0, this.ReZ);
            }
        }
        return this.cr;
    }
}

