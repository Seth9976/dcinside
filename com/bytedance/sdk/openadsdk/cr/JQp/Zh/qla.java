package com.bytedance.sdk.openadsdk.cr.JQp.Zh;

import com.bytedance.sdk.openadsdk.core.model.Owx;
import v.a;
import v.b;

public class qla {
    public static class PjT {
        private int Au;
        private boolean DWo;
        private int JQp;
        private long PjT;
        private long ReZ;
        private int SM;
        private int XX;
        private long Zh;
        private boolean cr;
        private int cz;
        private a qj;

        public PjT() {
            this.PjT = 0L;
            this.Zh = 0L;
            this.ReZ = 0L;
            this.cr = false;
            this.DWo = false;
        }

        public int Au() {
            return this.Au;
        }

        public boolean DWo() {
            return this.DWo;
        }

        public int JQp() {
            return this.cz;
        }

        public long PjT() {
            return this.PjT;
        }

        public void PjT(int v) {
            this.JQp = v;
        }

        public void PjT(long v) {
            this.PjT = v;
            this.xs();
        }

        public void PjT(a a0) {
            this.qj = a0;
        }

        public void PjT(boolean z) {
            this.cr = z;
        }

        public long ReZ() {
            return this.ReZ;
        }

        public void ReZ(int v) {
            this.XX = v;
        }

        public void ReZ(long v) {
            this.ReZ = v;
            this.xs();
        }

        public int SM() {
            return this.SM;
        }

        public int XX() {
            return this.XX;
        }

        public long Zh() {
            return this.Zh;
        }

        public void Zh(int v) {
            this.cz = v;
        }

        public void Zh(long v) {
            this.Zh = v;
        }

        public int cr() {
            return this.JQp;
        }

        public void cr(int v) {
            this.SM = v;
        }

        public int cz() {
            return this.ReZ > 0L ? Math.min(((int)(this.PjT * 100L / this.ReZ)), 100) : 0;
        }

        public boolean qj() {
            return this.cr;
        }

        public a xf() {
            return this.qj;
        }

        private void xs() {
            long v = this.ReZ;
            if(v > 0L) {
                long v1 = this.PjT;
                if(v1 > v) {
                    long v2 = v1 % v;
                    this.PjT = v2;
                    if(v2 == 0L) {
                        this.PjT = v;
                    }
                }
            }
        }
    }

    private Owx JQp;
    private long PjT;
    private int ReZ;
    private String Zh;
    private b cr;

    public qla(long v, String s, int v1, b b0, Owx owx0) {
        this.PjT = v;
        this.Zh = s;
        this.ReZ = v1;
        this.cr = b0;
        this.JQp = owx0;
    }

    public Owx JQp() {
        return this.JQp;
    }

    public long PjT() {
        return this.PjT;
    }

    public int ReZ() {
        return this.ReZ;
    }

    public String Zh() {
        return this.Zh;
    }

    public b cr() {
        return this.cr;
    }
}

