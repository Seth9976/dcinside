package com.bytedance.adsdk.ugeno.cr.Zh;

import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zh extends PjT {
    private List Au;

    public Zh(ReZ reZ0, String s, com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0) {
        super(reZ0, s, cz$PjT0);
        this.Au = new CopyOnWriteArrayList();
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.Zh.PjT
    public void PjT() {
        if(this.cz != null && this.cz.size() > 0) {
            String s = (String)this.cz.get("name");
            com.bytedance.adsdk.ugeno.cr.PjT.PjT pjT0 = this.ReZ.rds();
            if(pjT0 != null) {
                com.bytedance.adsdk.ugeno.cr.PjT.ReZ reZ0 = pjT0.PjT(s);
                if(reZ0 != null) {
                    reZ0.PjT(s);
                }
            }
        }
    }
}

