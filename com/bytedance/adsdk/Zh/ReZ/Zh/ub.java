package com.bytedance.adsdk.Zh.ReZ.Zh;

import com.bytedance.adsdk.Zh.PjT.PjT.gK;
import com.bytedance.adsdk.Zh.ReZ.PjT.Au;
import com.bytedance.adsdk.Zh.ReZ.ReZ.PjT;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.XX;

public class ub implements ReZ {
    private final String PjT;
    private final Au ReZ;
    private final int Zh;
    private final boolean cr;

    public ub(String s, int v, Au au0, boolean z) {
        this.PjT = s;
        this.Zh = v;
        this.ReZ = au0;
        this.cr = z;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.Zh.ReZ
    public com.bytedance.adsdk.Zh.PjT.PjT.ReZ PjT(SM sM0, XX xX0, PjT pjT0) {
        return new gK(sM0, pjT0, this);
    }

    public String PjT() {
        return this.PjT;
    }

    public boolean ReZ() {
        return this.cr;
    }

    public Au Zh() {
        return this.ReZ;
    }

    @Override
    public String toString() {
        return "ShapePath{name=" + this.PjT + ", index=" + this.Zh + '}';
    }
}

