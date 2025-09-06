package com.bytedance.adsdk.Zh.PjT.Zh;

import android.graphics.Path;
import com.bytedance.adsdk.Zh.PjT.PjT.ltE;
import com.bytedance.adsdk.Zh.ReZ.Zh.fDm;
import com.bytedance.adsdk.Zh.cz.JQp;
import java.util.List;

public class xs extends PjT {
    private final Path JQp;
    private final fDm cr;
    private List cz;

    public xs(List list0) {
        super(list0);
        this.cr = new fDm();
        this.JQp = new Path();
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT
    public Object PjT(com.bytedance.adsdk.Zh.XX.PjT pjT0, float f) {
        return this.Zh(pjT0, f);
    }

    public void PjT(List list0) {
        this.cz = list0;
    }

    public Path Zh(com.bytedance.adsdk.Zh.XX.PjT pjT0, float f) {
        this.cr.PjT(((fDm)pjT0.PjT), ((fDm)pjT0.Zh), f);
        fDm fDm0 = this.cr;
        List list0 = this.cz;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                fDm0 = ((ltE)this.cz.get(v)).PjT(fDm0);
            }
        }
        JQp.PjT(fDm0, this.JQp);
        return this.JQp;
    }
}

