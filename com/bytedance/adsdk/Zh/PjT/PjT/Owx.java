package com.bytedance.adsdk.Zh.PjT.PjT;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.bytedance.adsdk.Zh.PjT.Zh.Zh;
import com.bytedance.adsdk.Zh.ReZ.Zh.gK;
import com.bytedance.adsdk.Zh.SM;

public class Owx extends PjT {
    private com.bytedance.adsdk.Zh.PjT.Zh.PjT Au;
    private final String JQp;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT XX;
    private final com.bytedance.adsdk.Zh.ReZ.ReZ.PjT cr;
    private final boolean cz;

    public Owx(SM sM0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, gK gK0) {
        super(sM0, pjT0, gK0.XX().PjT(), gK0.Au().PjT(), gK0.SM(), gK0.ReZ(), gK0.cr(), gK0.JQp(), gK0.cz());
        this.cr = pjT0;
        this.JQp = gK0.PjT();
        this.cz = gK0.DWo();
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = gK0.Zh().PjT();
        this.XX = pjT1;
        pjT1.PjT(this);
        pjT0.PjT(pjT1);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.PjT
    public void PjT(Canvas canvas0, Matrix matrix0, int v) {
        if(this.cz) {
            return;
        }
        int v1 = ((Zh)this.XX).SM();
        this.Zh.setColor(v1);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT0 = this.Au;
        if(pjT0 != null) {
            ColorFilter colorFilter0 = (ColorFilter)pjT0.XX();
            this.Zh.setColorFilter(colorFilter0);
        }
        super.PjT(canvas0, matrix0, v);
    }
}

