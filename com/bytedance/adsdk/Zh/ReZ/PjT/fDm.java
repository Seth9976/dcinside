package com.bytedance.adsdk.Zh.ReZ.PjT;

import com.bytedance.adsdk.Zh.XX.PjT;
import java.util.Arrays;
import java.util.List;

abstract class fDm implements xs {
    final List PjT;

    fDm(List list0) {
        this.PjT = list0;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.xs
    public List ReZ() {
        return this.PjT;
    }

    // 去混淆评级： 低(30)
    @Override  // com.bytedance.adsdk.Zh.ReZ.PjT.xs
    public boolean Zh() {
        return this.PjT.isEmpty() || this.PjT.size() == 1 && ((PjT)this.PjT.get(0)).JQp();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(!this.PjT.isEmpty()) {
            stringBuilder0.append("values=");
            stringBuilder0.append(Arrays.toString(this.PjT.toArray()));
        }
        return stringBuilder0.toString();
    }
}

