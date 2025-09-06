package com.bytedance.adsdk.PjT.Zh.Zh.PjT;

import com.bytedance.adsdk.PjT.Zh.Zh.PjT;
import com.bytedance.adsdk.PjT.Zh.cr.JQp;
import com.bytedance.adsdk.PjT.Zh.cr.ReZ;
import com.bytedance.adsdk.PjT.Zh.cr.cz;

public abstract class ub implements PjT {
    protected PjT PjT;
    protected ReZ ReZ;
    protected PjT Zh;

    protected ub(ReZ reZ0) {
        this.ReZ = reZ0;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public JQp PjT() {
        return cz.PjT;
    }

    public void PjT(PjT pjT0) {
        this.PjT = pjT0;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public String Zh() {
        return this.PjT.Zh() + this.ReZ.PjT() + this.Zh.Zh();
    }

    public void Zh(PjT pjT0) {
        this.Zh = pjT0;
    }

    @Override
    public String toString() {
        return this.Zh();
    }
}

