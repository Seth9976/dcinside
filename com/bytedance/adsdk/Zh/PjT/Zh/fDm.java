package com.bytedance.adsdk.Zh.PjT.Zh;

import android.graphics.PointF;
import com.bytedance.adsdk.Zh.XX.Zh;
import java.util.Collections;

public class fDm extends PjT {
    private final PjT Au;
    protected Zh JQp;
    private final PjT SM;
    private final PointF XX;
    protected Zh cr;
    private final PointF cz;

    public fDm(PjT pjT0, PjT pjT1) {
        super(Collections.emptyList());
        this.cz = new PointF();
        this.XX = new PointF();
        this.Au = pjT0;
        this.SM = pjT1;
        this.PjT(this.Au());
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT
    Object PjT(com.bytedance.adsdk.Zh.XX.PjT pjT0, float f) {
        return this.Zh(pjT0, f);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT
    public void PjT(float f) {
        this.Au.PjT(f);
        this.SM.PjT(f);
        float f1 = (float)(((Float)this.Au.XX()));
        float f2 = (float)(((Float)this.SM.XX()));
        this.cz.set(f1, f2);
        for(int v = 0; v < this.PjT.size(); ++v) {
            ((com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT)this.PjT.get(v)).PjT();
        }
    }

    public PointF SM() {
        return this.Zh(null, 0.0f);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT
    public Object XX() {
        return this.SM();
    }

    PointF Zh(com.bytedance.adsdk.Zh.XX.PjT pjT0, float f) {
        if(this.cr != null && this.Au.ReZ() != null) {
            this.Au.JQp();
            throw null;
        }
        if(this.JQp != null && this.SM.ReZ() != null) {
            this.SM.JQp();
            throw null;
        }
        this.XX.set(this.cz.x, 0.0f);
        this.XX.set(this.XX.x, this.cz.y);
        return this.XX;
    }
}

