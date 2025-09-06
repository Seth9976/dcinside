package com.bytedance.adsdk.PjT.Zh.Zh.PjT;

import com.bytedance.adsdk.PjT.Zh.Zh.PjT;
import com.bytedance.adsdk.PjT.Zh.cr.JQp;
import com.bytedance.adsdk.PjT.Zh.cr.cz;
import java.util.Map;

public class Owx implements PjT {
    private final String PjT;

    public Owx(String s) {
        this.PjT = s;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public JQp PjT() {
        return cz.cz;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public Object PjT(Map map0) {
        return this.PjT;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public String Zh() {
        return "\'" + this.PjT + "\'";
    }

    @Override
    public String toString() {
        return this.Zh();
    }
}

