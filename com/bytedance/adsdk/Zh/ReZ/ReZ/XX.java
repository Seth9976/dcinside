package com.bytedance.adsdk.Zh.ReZ.ReZ;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.Zh.JQp.DWo;
import com.bytedance.adsdk.Zh.PjT.PjT.cr;
import com.bytedance.adsdk.Zh.ReZ.Zh.xE;
import com.bytedance.adsdk.Zh.SM;
import java.util.Collections;

public class XX extends PjT {
    private final Zh Au;
    private final cr XX;

    XX(SM sM0, JQp jQp0, Zh zh0, com.bytedance.adsdk.Zh.XX xX0) {
        super(sM0, jQp0);
        this.Au = zh0;
        cr cr0 = new cr(sM0, this, new xE("__container", jQp0.fDm(), false), xX0);
        this.XX = cr0;
        cr0.PjT(Collections.emptyList(), Collections.emptyList());
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public com.bytedance.adsdk.Zh.ReZ.Zh.PjT DWo() {
        com.bytedance.adsdk.Zh.ReZ.Zh.PjT pjT0 = super.DWo();
        return pjT0 == null ? this.Au.DWo() : pjT0;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void PjT(RectF rectF0, Matrix matrix0, boolean z) {
        super.PjT(rectF0, matrix0, z);
        this.XX.PjT(rectF0, this.PjT, z);
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public void Zh(Canvas canvas0, Matrix matrix0, int v) {
        super.Zh(canvas0, matrix0, v);
        this.XX.PjT(canvas0, matrix0, v);
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.ReZ.PjT
    public DWo qj() {
        DWo dWo0 = super.qj();
        return dWo0 == null ? this.Au.qj() : dWo0;
    }
}

