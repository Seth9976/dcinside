package com.bytedance.adsdk.Zh.ReZ.Zh;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import com.bytedance.adsdk.Zh.PjT.PjT.Owx;
import com.bytedance.adsdk.Zh.ReZ.PjT.cr;
import com.bytedance.adsdk.Zh.SM;
import com.bytedance.adsdk.Zh.XX;
import java.util.List;

public class gK implements ReZ {
    public static enum PjT {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap PjT() {
            switch(this) {
                case 1: {
                    return Paint.Cap.BUTT;
                }
                case 2: {
                    return Paint.Cap.ROUND;
                }
                default: {
                    return Paint.Cap.SQUARE;
                }
            }
        }
    }

    public static enum Zh {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join PjT() {
            switch(com.bytedance.adsdk.Zh.ReZ.Zh.gK.1.Zh[this.ordinal()]) {
                case 1: {
                    return Paint.Join.BEVEL;
                }
                case 2: {
                    return Paint.Join.MITER;
                }
                case 3: {
                    return Paint.Join.ROUND;
                }
                default: {
                    return null;
                }
            }
        }
    }

    private final Zh Au;
    private final boolean DWo;
    private final cr JQp;
    private final String PjT;
    private final List ReZ;
    private final float SM;
    private final PjT XX;
    private final com.bytedance.adsdk.Zh.ReZ.PjT.Zh Zh;
    private final com.bytedance.adsdk.Zh.ReZ.PjT.PjT cr;
    private final com.bytedance.adsdk.Zh.ReZ.PjT.Zh cz;

    public gK(String s, com.bytedance.adsdk.Zh.ReZ.PjT.Zh zh0, List list0, com.bytedance.adsdk.Zh.ReZ.PjT.PjT pjT0, cr cr0, com.bytedance.adsdk.Zh.ReZ.PjT.Zh zh1, PjT gK$PjT0, Zh gK$Zh0, float f, boolean z) {
        this.PjT = s;
        this.Zh = zh0;
        this.ReZ = list0;
        this.cr = pjT0;
        this.JQp = cr0;
        this.cz = zh1;
        this.XX = gK$PjT0;
        this.Au = gK$Zh0;
        this.SM = f;
        this.DWo = z;
    }

    public Zh Au() {
        return this.Au;
    }

    public boolean DWo() {
        return this.DWo;
    }

    public List JQp() {
        return this.ReZ;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.Zh.ReZ
    public com.bytedance.adsdk.Zh.PjT.PjT.ReZ PjT(SM sM0, XX xX0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0) {
        return new Owx(sM0, pjT0, this);
    }

    public String PjT() {
        return this.PjT;
    }

    public cr ReZ() {
        return this.JQp;
    }

    public float SM() {
        return this.SM;
    }

    public PjT XX() {
        return this.XX;
    }

    public com.bytedance.adsdk.Zh.ReZ.PjT.PjT Zh() {
        return this.cr;
    }

    public com.bytedance.adsdk.Zh.ReZ.PjT.Zh cr() {
        return this.cz;
    }

    public com.bytedance.adsdk.Zh.ReZ.PjT.Zh cz() {
        return this.Zh;
    }
}

