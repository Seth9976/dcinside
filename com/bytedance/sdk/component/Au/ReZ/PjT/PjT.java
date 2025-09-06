package com.bytedance.sdk.component.Au.ReZ.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.component.Au.ReZ.Zh;

public class PjT {
    private long JQp;
    private String PjT;
    private long ReZ;
    private int Zh;
    private long cr;
    private long cz;

    public PjT() {
        this.Zh = 0;
    }

    public long JQp() {
        return this.JQp;
    }

    public String PjT() {
        return this.PjT;
    }

    public void PjT(Zh zh0) {
        __monitor_enter(this);
        try {
            if(TextUtils.isEmpty(this.PjT)) {
                this.PjT = zh0.Zh();
            }
            this.ReZ += zh0.cz();
            this.cr += zh0.XX();
            this.JQp = Math.max(this.JQp, zh0.cz());
            this.cz = Math.max(this.cz, zh0.XX());
            ++this.Zh;
            __monitor_exit(this);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(this);
        throw throwable0;
    }

    public long ReZ() {
        return this.ReZ;
    }

    public int Zh() {
        return this.Zh;
    }

    public long cr() {
        return this.cr;
    }

    public long cz() {
        return this.cz;
    }

    @Override
    public String toString() {
        return this.PjT + " times=" + this.Zh + ",waitMaxTime=" + this.JQp + ",runMaxTime=" + this.cz + ",runTotalTime=" + this.cr + ",waitTotalTime=" + this.ReZ;
    }
}

