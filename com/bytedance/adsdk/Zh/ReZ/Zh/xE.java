package com.bytedance.adsdk.Zh.ReZ.Zh;

import com.bytedance.adsdk.Zh.PjT.PjT.cr;
import com.bytedance.adsdk.Zh.ReZ.ReZ.PjT;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.XX;
import java.util.Arrays;
import java.util.List;

public class xE implements ReZ {
    private final String PjT;
    private final boolean ReZ;
    private final List Zh;

    public xE(String s, List list0, boolean z) {
        this.PjT = s;
        this.Zh = list0;
        this.ReZ = z;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.Zh.ReZ
    public com.bytedance.adsdk.Zh.PjT.PjT.ReZ PjT(SM sM0, XX xX0, PjT pjT0) {
        return new cr(sM0, pjT0, this, xX0);
    }

    public String PjT() {
        return this.PjT;
    }

    public boolean ReZ() {
        return this.ReZ;
    }

    public List Zh() {
        return this.Zh;
    }

    @Override
    public String toString() {
        return "ShapeGroup{name=\'" + this.PjT + "\' Shapes: " + Arrays.toString(this.Zh.toArray()) + '}';
    }
}

