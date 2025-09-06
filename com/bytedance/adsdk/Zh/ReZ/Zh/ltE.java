package com.bytedance.adsdk.Zh.ReZ.Zh;

import com.bytedance.adsdk.Zh.PjT.PjT.RD;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.XX;

public class ltE implements ReZ {
    public static enum PjT {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static PjT PjT(int v) {
            switch(v) {
                case 1: {
                    return PjT.PjT;
                }
                case 2: {
                    return PjT.Zh;
                }
                default: {
                    throw new IllegalArgumentException("Unknown trim path type " + v);
                }
            }
        }
    }

    private final Zh JQp;
    private final String PjT;
    private final Zh ReZ;
    private final PjT Zh;
    private final Zh cr;
    private final boolean cz;

    public ltE(String s, PjT ltE$PjT0, Zh zh0, Zh zh1, Zh zh2, boolean z) {
        this.PjT = s;
        this.Zh = ltE$PjT0;
        this.ReZ = zh0;
        this.cr = zh1;
        this.JQp = zh2;
        this.cz = z;
    }

    public Zh JQp() {
        return this.JQp;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.Zh.ReZ
    public com.bytedance.adsdk.Zh.PjT.PjT.ReZ PjT(SM sM0, XX xX0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0) {
        return new RD(pjT0, this);
    }

    public String PjT() {
        return this.PjT;
    }

    public Zh ReZ() {
        return this.cr;
    }

    public PjT Zh() {
        return this.Zh;
    }

    public Zh cr() {
        return this.ReZ;
    }

    public boolean cz() {
        return this.cz;
    }

    @Override
    public String toString() {
        return "Trim Path: {start: " + this.ReZ + ", end: " + this.cr + ", offset: " + this.JQp + "}";
    }
}

