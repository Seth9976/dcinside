package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.Co;

public class iZZ {
    private long Au;
    private long DWo;
    private long JQp;
    public boolean PjT;
    private Co ReZ;
    private long SM;
    private long XX;
    public long Zh;
    private Co cr;
    private long cz;
    private int qj;

    public iZZ() {
        this.ReZ = Co.ReZ();
        this.cr = Co.ReZ();
    }

    public int Au() {
        return this.qj;
    }

    public long JQp() {
        return this.Au;
    }

    public Co PjT() {
        return this.ReZ;
    }

    public void PjT(int v) {
        this.qj = v;
    }

    public void PjT(long v) {
        this.DWo = v;
    }

    public void PjT(Co co0) {
        this.ReZ = co0;
    }

    public void PjT(Co co0, Co co1, int v, Co co2) {
        this.JQp = co0.PjT(this.ReZ);
        this.cz = co1.PjT(co0);
        this.XX = (long)v;
        this.Au = co2.PjT(co1);
    }

    public long ReZ() {
        return this.cz;
    }

    public long XX() {
        return this.DWo;
    }

    public long Zh() {
        return this.JQp;
    }

    public void Zh(Co co0) {
        this.cr = co0;
        this.SM = co0.PjT(this.ReZ);
    }

    public long cr() {
        return this.XX;
    }

    public long cz() {
        return this.SM;
    }
}

