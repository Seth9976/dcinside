package com.bytedance.adsdk.Zh.PjT.Zh;

import java.util.ArrayList;
import java.util.List;

public class Au {
    private final List PjT;
    private final List ReZ;
    private final List Zh;

    public Au(List list0) {
        this.ReZ = list0;
        this.PjT = new ArrayList(list0.size());
        this.Zh = new ArrayList(list0.size());
        for(int v = 0; v < list0.size(); ++v) {
            xs xs0 = ((com.bytedance.adsdk.Zh.ReZ.Zh.Au)list0.get(v)).Zh().cr();
            this.PjT.add(xs0);
            PjT pjT0 = ((com.bytedance.adsdk.Zh.ReZ.Zh.Au)list0.get(v)).ReZ().PjT();
            this.Zh.add(pjT0);
        }
    }

    public List PjT() {
        return this.ReZ;
    }

    public List ReZ() {
        return this.Zh;
    }

    public List Zh() {
        return this.PjT;
    }
}

