package com.bytedance.adsdk.Zh.PjT.Zh;

import com.bytedance.adsdk.Zh.ReZ.Zh.cr;
import com.bytedance.adsdk.Zh.XX.PjT;
import java.util.List;

public class JQp extends XX {
    private final cr cr;

    public JQp(List list0) {
        super(list0);
        int v = 0;
        cr cr0 = (cr)((PjT)list0.get(0)).PjT;
        if(cr0 != null) {
            v = cr0.ReZ();
        }
        this.cr = new cr(new float[v], new int[v]);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT
    Object PjT(PjT pjT0, float f) {
        return this.Zh(pjT0, f);
    }

    cr Zh(PjT pjT0, float f) {
        this.cr.PjT(((cr)pjT0.PjT), ((cr)pjT0.Zh), f);
        return this.cr;
    }
}

