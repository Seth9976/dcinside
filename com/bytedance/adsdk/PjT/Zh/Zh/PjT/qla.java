package com.bytedance.adsdk.PjT.Zh.Zh.PjT;

import com.bytedance.adsdk.PjT.Zh.Zh.PjT;
import com.bytedance.adsdk.PjT.Zh.cr.JQp;
import com.bytedance.adsdk.PjT.Zh.cr.cz;
import java.util.Map;

public class qla implements PjT {
    private Number PjT;

    public qla(String s) {
        if(s.indexOf(46) < 0) {
            this.PjT = Integer.valueOf(s);
            return;
        }
        Float float0 = Float.valueOf(s);
        this.PjT = float0;
        if(Float.isInfinite(((float)float0))) {
            this.PjT = Double.valueOf(s);
        }
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public JQp PjT() {
        return cz.XX;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public Object PjT(Map map0) {
        return this.PjT;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public String Zh() {
        return this.PjT.toString();
    }

    @Override
    public String toString() {
        return this.Zh();
    }
}

