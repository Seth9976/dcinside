package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.xf;
import com.bytedance.adsdk.Zh.SM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class xE implements DWo, JQp, qj, xs, PjT {
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT Au;
    private cr DWo;
    private final String JQp;
    private final Matrix PjT;
    private final SM ReZ;
    private final com.bytedance.adsdk.Zh.PjT.Zh.xE SM;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT XX;
    private final Path Zh;
    private final com.bytedance.adsdk.Zh.ReZ.ReZ.PjT cr;
    private final boolean cz;

    public xE(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, xf xf0) {
        this.PjT = new Matrix();
        this.Zh = new Path();
        this.ReZ = sM0;
        this.cr = pjT0;
        this.JQp = xf0.PjT();
        this.cz = xf0.JQp();
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = xf0.Zh().PjT();
        this.XX = pjT1;
        pjT0.PjT(pjT1);
        pjT1.PjT(this);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = xf0.ReZ().PjT();
        this.Au = pjT2;
        pjT0.PjT(pjT2);
        pjT2.PjT(this);
        com.bytedance.adsdk.Zh.PjT.Zh.xE xE0 = xf0.cr().DWo();
        this.SM = xE0;
        xE0.PjT(pjT0);
        xE0.PjT(this);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.ReZ.invalidateSelf();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(Canvas canvas0, Matrix matrix0, int v) {
        float f = (float)(((Float)this.XX.XX()));
        float f1 = (float)(((Float)this.Au.XX()));
        float f2 = (float)(((Float)this.SM.Zh().XX()));
        float f3 = (float)(((Float)this.SM.ReZ().XX()));
        for(int v1 = ((int)f) - 1; v1 >= 0; --v1) {
            this.PjT.set(matrix0);
            Matrix matrix1 = this.SM.Zh(((float)v1) + f1);
            this.PjT.preConcat(matrix1);
            this.DWo.PjT(canvas0, this.PjT, ((int)(((float)v) * com.bytedance.adsdk.Zh.cz.JQp.PjT(f2 / 100.0f, f3 / 100.0f, ((float)v1) / f))));
        }
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.JQp
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        this.DWo.PjT(rectF0, matrix0, z);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
        this.DWo.PjT(list0, list1);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.DWo
    public void PjT(ListIterator listIterator0) {
        if(this.DWo != null) {
            return;
        }
        while(listIterator0.hasPrevious() && listIterator0.previous() != this) {
        }
        ArrayList arrayList0 = new ArrayList();
        while(listIterator0.hasPrevious()) {
            arrayList0.add(listIterator0.previous());
            listIterator0.remove();
        }
        Collections.reverse(arrayList0);
        this.DWo = new cr(this.ReZ, this.cr, "Repeater", this.cz, arrayList0, null);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.xs
    public Path cr() {
        Path path0 = this.DWo.cr();
        this.Zh.reset();
        float f = (float)(((Float)this.XX.XX()));
        float f1 = (float)(((Float)this.Au.XX()));
        for(int v = ((int)f) - 1; v >= 0; --v) {
            Matrix matrix0 = this.SM.Zh(((float)v) + f1);
            this.PjT.set(matrix0);
            this.Zh.addPath(path0, this.PjT);
        }
        return this.Zh;
    }
}

