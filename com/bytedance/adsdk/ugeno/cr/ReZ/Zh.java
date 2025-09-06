package com.bytedance.adsdk.ugeno.cr.ReZ;

import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.cr.Zh.PjT;

public class Zh extends PjT {
    public Zh(ReZ reZ0, String s, com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0) {
        super(reZ0, s, cz$PjT0);
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.Zh.PjT
    public void PjT() {
        if(this.ReZ == null) {
            return;
        }
        int v = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(((String)this.cz.get("position")), 0);
        ReZ reZ0 = this.ReZ.Zh(this.ReZ);
        if(reZ0 == null) {
            return;
        }
        ReZ reZ1 = reZ0.cr("SwiperView");
        if(reZ1 instanceof com.bytedance.adsdk.ugeno.Zh) {
            ((com.bytedance.adsdk.ugeno.Zh)reZ1).PjT(v);
        }
    }
}

