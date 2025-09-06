package com.bytedance.adsdk.PjT.Zh.Zh.PjT;

import com.bytedance.adsdk.PjT.Zh.Zh.PjT;
import com.bytedance.adsdk.PjT.Zh.Zh.Zh;
import com.bytedance.adsdk.PjT.Zh.cr.JQp;
import com.bytedance.adsdk.PjT.Zh.cr.cz;
import java.util.Map;

public class ltE implements Zh {
    private PjT PjT;
    private PjT ReZ;
    private PjT Zh;

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public JQp PjT() {
        return cz.PjT;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public Object PjT(Map map0) {
        Object object0 = this.PjT.PjT(map0);
        if(object0 == null) {
            return null;
        }
        return ((Boolean)object0).booleanValue() ? this.Zh.PjT(map0) : this.ReZ.PjT(map0);
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.Zh
    public void PjT(PjT pjT0) {
        this.PjT = pjT0;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.Zh
    public void ReZ(PjT pjT0) {
        this.ReZ = pjT0;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public String Zh() {
        return this.PjT.Zh() + "?" + this.Zh.Zh() + ":" + this.ReZ.Zh();
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.Zh
    public void Zh(PjT pjT0) {
        this.Zh = pjT0;
    }

    @Override
    public String toString() {
        return this.Zh();
    }
}

