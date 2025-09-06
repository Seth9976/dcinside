package com.bytedance.adsdk.Zh.ReZ.PjT;

import com.bytedance.adsdk.Zh.PjT.Zh.DWo;
import com.bytedance.adsdk.Zh.PjT.Zh.PjT;
import com.bytedance.adsdk.Zh.PjT.Zh.qj;
import java.util.List;

public class JQp implements xs {
    private final List PjT;

    public JQp(List list0) {
        this.PjT = list0;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.xs
    public PjT PjT() {
        return ((com.bytedance.adsdk.Zh.XX.PjT)this.PjT.get(0)).JQp() ? new qj(this.PjT) : new DWo(this.PjT);
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.xs
    public List ReZ() {
        return this.PjT;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.xs
    public boolean Zh() {
        return this.PjT.size() == 1 && ((com.bytedance.adsdk.Zh.XX.PjT)this.PjT.get(0)).JQp();
    }
}

