package com.bytedance.adsdk.Zh.ReZ.Zh;

import com.bytedance.adsdk.Zh.PjT.PjT.fDm;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.PjT.xs;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.XX;

public class DWo implements ReZ {
    public static enum PjT {
        STAR(1),
        POLYGON(2);

        private final int ReZ;

        private PjT(int v1) {
            this.ReZ = v1;
        }

        public static PjT PjT(int v) {
            PjT[] arr_dWo$PjT = PjT.values();
            for(int v1 = 0; v1 < arr_dWo$PjT.length; ++v1) {
                PjT dWo$PjT0 = arr_dWo$PjT[v1];
                if(dWo$PjT0.ReZ == v) {
                    return dWo$PjT0;
                }
            }
            return null;
        }
    }

    private final Zh Au;
    private final boolean DWo;
    private final Zh JQp;
    private final String PjT;
    private final Zh ReZ;
    private final Zh SM;
    private final Zh XX;
    private final PjT Zh;
    private final xs cr;
    private final Zh cz;
    private final boolean qj;

    public DWo(String s, PjT dWo$PjT0, Zh zh0, xs xs0, Zh zh1, Zh zh2, Zh zh3, Zh zh4, Zh zh5, boolean z, boolean z1) {
        this.PjT = s;
        this.Zh = dWo$PjT0;
        this.ReZ = zh0;
        this.cr = xs0;
        this.JQp = zh1;
        this.cz = zh2;
        this.XX = zh3;
        this.Au = zh4;
        this.SM = zh5;
        this.DWo = z;
        this.qj = z1;
    }

    public Zh Au() {
        return this.Au;
    }

    public boolean DWo() {
        return this.DWo;
    }

    public Zh JQp() {
        return this.JQp;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.Zh.ReZ
    public com.bytedance.adsdk.Zh.PjT.PjT.ReZ PjT(SM sM0, XX xX0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0) {
        return new fDm(sM0, pjT0, this);
    }

    public String PjT() {
        return this.PjT;
    }

    public Zh ReZ() {
        return this.ReZ;
    }

    public Zh SM() {
        return this.SM;
    }

    public Zh XX() {
        return this.XX;
    }

    public PjT Zh() {
        return this.Zh;
    }

    public xs cr() {
        return this.cr;
    }

    public Zh cz() {
        return this.cz;
    }

    public boolean qj() {
        return this.qj;
    }
}

