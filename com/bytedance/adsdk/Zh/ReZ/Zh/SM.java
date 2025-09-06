package com.bytedance.adsdk.Zh.ReZ.Zh;

import com.bytedance.adsdk.Zh.PjT.PjT.xf;
import com.bytedance.adsdk.Zh.XX;

public class SM implements ReZ {
    public static enum PjT {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static PjT PjT(int v) {
            switch(v) {
                case 1: {
                    return PjT.PjT;
                }
                case 2: {
                    return PjT.Zh;
                }
                case 3: {
                    return PjT.ReZ;
                }
                case 4: {
                    return PjT.cr;
                }
                case 5: {
                    return PjT.JQp;
                }
                default: {
                    return PjT.PjT;
                }
            }
        }
    }

    private final String PjT;
    private final boolean ReZ;
    private final PjT Zh;

    public SM(String s, PjT sM$PjT0, boolean z) {
        this.PjT = s;
        this.Zh = sM$PjT0;
        this.ReZ = z;
    }

    @Override  // com.bytedance.adsdk.Zh.ReZ.Zh.ReZ
    public com.bytedance.adsdk.Zh.PjT.PjT.ReZ PjT(com.bytedance.adsdk.Zh.SM sM0, XX xX0, com.bytedance.adsdk.Zh.ReZ.ReZ.PjT pjT0) {
        return new xf(this);
    }

    public String PjT() {
        return this.PjT;
    }

    public boolean ReZ() {
        return this.ReZ;
    }

    public PjT Zh() {
        return this.Zh;
    }

    @Override
    public String toString() {
        return "MergePaths{mode=" + this.Zh + '}';
    }
}

