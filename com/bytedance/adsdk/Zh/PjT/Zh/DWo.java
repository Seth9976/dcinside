package com.bytedance.adsdk.Zh.PjT.Zh;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.bytedance.adsdk.Zh.XX.PjT;
import java.util.List;

public class DWo extends XX {
    private final float[] JQp;
    private SM XX;
    private final PointF cr;
    private final PathMeasure cz;

    public DWo(List list0) {
        super(list0);
        this.cr = new PointF();
        this.JQp = new float[2];
        this.cz = new PathMeasure();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT
    public Object PjT(PjT pjT0, float f) {
        return this.Zh(pjT0, f);
    }

    public PointF Zh(PjT pjT0, float f) {
        Path path0 = ((SM)pjT0).Zh();
        if(path0 == null) {
            return (PointF)pjT0.PjT;
        }
        if(this.ReZ == null) {
            if(this.XX != ((SM)pjT0)) {
                this.cz.setPath(path0, false);
                this.XX = (SM)pjT0;
            }
            float f1 = this.cz.getLength();
            this.cz.getPosTan(f * f1, this.JQp, null);
            this.cr.set(this.JQp[0], this.JQp[1]);
            return this.cr;
        }
        ((SM)pjT0).XX.floatValue();
        this.cr();
        throw null;
    }
}

