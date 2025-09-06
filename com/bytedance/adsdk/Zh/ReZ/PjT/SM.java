package com.bytedance.adsdk.Zh.ReZ.PjT;

import com.bytedance.adsdk.Zh.PjT.Zh.PjT;
import com.bytedance.adsdk.Zh.PjT.Zh.fDm;
import java.util.List;

public class SM implements xs {
    private final Zh PjT;
    private final Zh Zh;

    public SM(Zh zh0, Zh zh1) {
        this.PjT = zh0;
        this.Zh = zh1;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.xs
    public PjT PjT() {
        return new fDm(this.PjT.PjT(), this.Zh.PjT());
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.xs
    public List ReZ() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    // 去混淆评级： 低(20)
    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.xs
    public boolean Zh() {
        return this.PjT.Zh() && this.Zh.Zh();
    }
}

