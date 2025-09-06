package com.bytedance.adsdk.Zh.PjT.PjT;

import com.bytedance.adsdk.Zh.PjT.Zh.PjT.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.ltE;
import java.util.ArrayList;
import java.util.List;

public class RD implements ReZ, PjT {
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT JQp;
    private final String PjT;
    private final List ReZ;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT XX;
    private final boolean Zh;
    private final com.bytedance.adsdk.Zh.ReZ.Zh.ltE.PjT cr;
    private final com.bytedance.adsdk.Zh.PjT.Zh.PjT cz;

    public RD(com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0, ltE ltE0) {
        this.ReZ = new ArrayList();
        this.PjT = ltE0.PjT();
        this.Zh = ltE0.cz();
        this.cr = ltE0.Zh();
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT1 = ltE0.cr().PjT();
        this.JQp = pjT1;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT2 = ltE0.ReZ().PjT();
        this.cz = pjT2;
        com.bytedance.adsdk.Zh.PjT.Zh.PjT pjT3 = ltE0.JQp().PjT();
        this.XX = pjT3;
        pjT0.PjT(pjT1);
        pjT0.PjT(pjT2);
        pjT0.PjT(pjT3);
        pjT1.PjT(this);
        pjT2.PjT(this);
        pjT3.PjT(this);
    }

    public com.bytedance.adsdk.Zh.PjT.Zh.PjT JQp() {
        return this.XX;
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.Zh.PjT$PjT
    public void PjT() {
        for(int v = 0; v < this.ReZ.size(); ++v) {
            ((PjT)this.ReZ.get(v)).PjT();
        }
    }

    void PjT(PjT pjT$PjT0) {
        this.ReZ.add(pjT$PjT0);
    }

    @Override  // com.bytedance.adsdk.Zh.PjT.PjT.ReZ
    public void PjT(List list0, List list1) {
    }

    public com.bytedance.adsdk.Zh.PjT.Zh.PjT ReZ() {
        return this.JQp;
    }

    com.bytedance.adsdk.Zh.ReZ.Zh.ltE.PjT Zh() {
        return this.cr;
    }

    public com.bytedance.adsdk.Zh.PjT.Zh.PjT cr() {
        return this.cz;
    }

    public boolean cz() {
        return this.Zh;
    }
}

