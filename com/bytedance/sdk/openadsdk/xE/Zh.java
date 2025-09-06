package com.bytedance.sdk.openadsdk.xE;

import java.util.ArrayList;
import java.util.List;

public class Zh {
    private long Au;
    private long DWo;
    public static int JQp = 3;
    public static int PjT = -1;
    public static int ReZ = 1;
    private final List SM;
    private long XX;
    public static int Zh = 0;
    public static int cr = 2;
    private int cz;

    static {
    }

    public Zh() {
        this.cz = Zh.PjT;
        this.XX = 0L;
        this.Au = 0L;
        this.SM = new ArrayList();
        this.DWo = 0L;
    }

    public int PjT() {
        return this.cz;
    }

    public long PjT(long v, long v1) {
        long v4;
        long v3;
        if(this.Au != 0L && v > this.Au) {
            return 0L;
        }
        int v2 = 0;
        for(Object object0: this.SM) {
            ReZ reZ0 = (ReZ)object0;
            if(reZ0.Zh() > v) {
                if(v < reZ0.PjT()) {
                    v3 = (long)v2;
                    v4 = reZ0.Zh() - reZ0.PjT();
                }
                else {
                    v3 = (long)v2;
                    v4 = reZ0.Zh() - v;
                }
                v2 = (int)(v3 + v4);
            }
        }
        long v5 = this.XX;
        if(v5 < v) {
            long v6 = this.DWo;
            if(v6 != 0L) {
                return v6 <= v ? 0L : v6 - v - ((long)v2);
            }
            return this.Au == 0L ? v1 - v - ((long)v2) : this.Au - v - ((long)v2);
        }
        long v7 = this.DWo;
        if(v7 != 0L) {
            return v7 <= v5 ? 0L : v7 - v5 - ((long)v2);
        }
        return this.Au == 0L ? v1 - v5 - ((long)v2) : this.Au - v5 - ((long)v2);
    }

    public void PjT(long v) {
        this.cz = Zh.Zh;
        this.XX = v;
    }

    public void ReZ(long v) {
        int v1 = this.cz;
        if(v1 != Zh.PjT) {
            int v2 = Zh.cr;
            if(v1 != v2 && v1 != Zh.JQp) {
                this.cz = v2;
                this.DWo = v;
            }
        }
    }

    public void Zh(long v) {
        int v1 = this.cz;
        if(v1 != Zh.PjT) {
            int v2 = Zh.JQp;
            if(v1 != v2) {
                this.cz = v2;
                this.Au = v;
            }
        }
    }

    public void cr(long v) {
        if(this.cz != Zh.PjT && this.cz == Zh.cr) {
            this.cz = Zh.ReZ;
            ReZ reZ0 = new ReZ(this.DWo, v);
            this.SM.add(reZ0);
            this.DWo = 0L;
        }
    }
}

