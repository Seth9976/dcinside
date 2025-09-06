package com.bytedance.adsdk.Zh.PjT.Zh;

import com.bytedance.adsdk.Zh.XX.PjT;
import com.bytedance.adsdk.Zh.XX.ReZ;
import com.bytedance.adsdk.Zh.cz.JQp;
import java.util.List;

public class xf extends XX {
    private final ReZ cr;

    public xf(List list0) {
        super(list0);
        this.cr = new ReZ();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT
    public Object PjT(PjT pjT0, float f) {
        return this.Zh(pjT0, f);
    }

    public ReZ Zh(PjT pjT0, float f) {
        Object object0 = pjT0.PjT;
        if(object0 != null) {
            Object object1 = pjT0.Zh;
            if(object1 != null) {
                if(this.ReZ == null) {
                    this.cr.PjT(JQp.PjT(((ReZ)object0).PjT(), ((ReZ)object1).PjT(), f), JQp.PjT(((ReZ)object0).Zh(), ((ReZ)object1).Zh(), f));
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

