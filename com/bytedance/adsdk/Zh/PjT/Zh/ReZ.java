package com.bytedance.adsdk.Zh.PjT.Zh;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.Zh.JQp.DWo;

public class ReZ implements PjT {
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT JQp;
    private final PjT PjT;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT ReZ;
    private boolean XX;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT Zh;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT cr;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT cz;

    public ReZ(PjT pjT$PjT0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, DWo dWo0) {
        this.XX = true;
        this.PjT = pjT$PjT0;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = dWo0.PjT().PjT();
        this.Zh = pjT1;
        pjT1.PjT(this);
        pjT0.PjT(pjT1);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = dWo0.Zh().PjT();
        this.ReZ = pjT2;
        pjT2.PjT(this);
        pjT0.PjT(pjT2);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT3 = dWo0.ReZ().PjT();
        this.cr = pjT3;
        pjT3.PjT(this);
        pjT0.PjT(pjT3);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT4 = dWo0.cr().PjT();
        this.JQp = pjT4;
        pjT4.PjT(this);
        pjT0.PjT(pjT4);
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT5 = dWo0.JQp().PjT();
        this.cz = pjT5;
        pjT5.PjT(this);
        pjT0.PjT(pjT5);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        this.XX = true;
        this.PjT.PjT();
    }

    public void PjT(Paint paint0) {
        if(!this.XX) {
            return;
        }
        this.XX = false;
        double f = ((double)(((float)(((Float)this.cr.XX()))))) * 0.017453;
        float f1 = (float)(((Float)this.JQp.XX()));
        int v = (int)(((Integer)this.Zh.XX()));
        int v1 = Color.argb(Math.round(((float)(((Float)this.ReZ.XX())))), Color.red(v), Color.green(v), Color.blue(v));
        paint0.setShadowLayer(((float)(((Float)this.cz.XX()))), ((float)Math.sin(f)) * f1, ((float)Math.cos(f + 3.141593)) * f1, v1);
    }
}

