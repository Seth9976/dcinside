package com.bytedance.sdk.openadsdk.cr.PjT;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class fDm {
    public static class PjT {
        private final int PjT;
        private final int Zh;

        public PjT(int v, int v1) {
            if(v < 0 || v > 5) {
                v = 3;
            }
            this.PjT = v;
            if(v1 < 10) {
                v1 = 30;
            }
            this.Zh = v1;
        }

        public int PjT() {
            return this.PjT;
        }

        public int Zh() {
            return this.Zh;
        }
    }

    public static fDm PjT;
    private final Map ReZ;
    private PjT Zh;
    private volatile boolean cr;

    static {
        fDm.PjT = new fDm();
    }

    public fDm() {
        this.ReZ = new HashMap();
    }

    public int PjT(String s) {
        if(!this.PjT()) {
            return 4;
        }
        PjT fDm$PjT0 = (PjT)this.ReZ.get(s);
        return fDm$PjT0 == null ? this.Zh() : fDm$PjT0.PjT();
    }

    public void PjT(PjT fDm$PjT0) {
        this.Zh = fDm$PjT0;
    }

    public void PjT(String s, PjT fDm$PjT0) {
        if(!TextUtils.isEmpty(s) && fDm$PjT0 != null) {
            this.ReZ.put(s, fDm$PjT0);
        }
    }

    public void PjT(boolean z) {
        this.cr = z;
    }

    public boolean PjT() {
        return this.cr;
    }

    private int ReZ() {
        return this.Zh == null ? 30 : this.Zh.Zh();
    }

    private int Zh() {
        return this.Zh == null ? 3 : this.Zh.PjT();
    }

    public int Zh(String s) {
        PjT fDm$PjT0 = (PjT)this.ReZ.get(s);
        return fDm$PjT0 == null ? this.ReZ() : fDm$PjT0.Zh();
    }
}

