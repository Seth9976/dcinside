package com.bytedance.adsdk.ugeno.cr.PjT;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zh implements ReZ {
    private List PjT;

    public Zh() {
        this.PjT = new CopyOnWriteArrayList();
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.PjT.ReZ
    public void PjT(cr cr0) {
        this.PjT.add(cr0);
    }

    @Override  // com.bytedance.adsdk.ugeno.cr.PjT.ReZ
    public void PjT(String s) {
        if(this.PjT.isEmpty()) {
            return;
        }
        for(Object object0: this.PjT) {
            ((cr)object0).PjT(s);
        }
    }
}

