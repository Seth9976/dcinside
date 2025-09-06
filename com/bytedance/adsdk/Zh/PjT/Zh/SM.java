package com.bytedance.adsdk.Zh.PjT.Zh;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.Zh.XX.PjT;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.cz;

public class SM extends PjT {
    private Path DWo;
    private final PjT qj;

    public SM(XX xX0, PjT pjT0) {
        super(xX0, pjT0.PjT, pjT0.Zh, pjT0.ReZ, pjT0.cr, pjT0.JQp, pjT0.cz, pjT0.XX);
        this.qj = pjT0;
        this.PjT();
    }

    public void PjT() {
        boolean z = this.Zh != null && (this.PjT != null && ((PointF)this.PjT).equals(((PointF)this.Zh).x, ((PointF)this.Zh).y));
        Object object0 = this.PjT;
        if(object0 != null) {
            Object object1 = this.Zh;
            if(object1 != null && !z) {
                this.DWo = cz.PjT(((PointF)object0), ((PointF)object1), this.qj.Au, this.qj.SM);
            }
        }
    }

    Path Zh() {
        return this.DWo;
    }
}

