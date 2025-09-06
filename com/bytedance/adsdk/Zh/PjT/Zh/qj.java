package com.bytedance.adsdk.Zh.PjT.Zh;

import android.graphics.PointF;
import com.bytedance.adsdk.Zh.XX.PjT;
import java.util.List;

public class qj extends XX {
    private final PointF cr;

    public qj(List list0) {
        super(list0);
        this.cr = new PointF();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT
    public Object PjT(PjT pjT0, float f) {
        return this.Zh(pjT0, f);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT
    protected Object PjT(PjT pjT0, float f, float f1, float f2) {
        return this.Zh(pjT0, f, f1, f2);
    }

    public PointF Zh(PjT pjT0, float f) {
        return this.Zh(pjT0, f, f, f);
    }

    protected PointF Zh(PjT pjT0, float f, float f1, float f2) {
        Object object0 = pjT0.PjT;
        if(object0 != null) {
            Object object1 = pjT0.Zh;
            if(object1 != null) {
                if(this.ReZ == null) {
                    float f3 = ((PointF)object0).x;
                    float f4 = f3 + f1 * (((PointF)object1).x - f3);
                    float f5 = ((PointF)object0).y;
                    this.cr.set(f4, f5 + f2 * (((PointF)object1).y - f5));
                    return this.cr;
                }
                pjT0.XX.floatValue();
                this.cr();
                throw null;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

