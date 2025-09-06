package com.bytedance.sdk.openadsdk.core.model;

public class ltE {
    private String JQp;
    private long PjT;
    private long ReZ;
    private long Zh;
    private long cr;

    public ltE() {
        this.PjT = 10000L;
        this.Zh = 10000L;
        this.ReZ = 10L;
        this.cr = 20L;
        this.JQp = "";
    }

    public String JQp() [...] // 潜在的解密器

    public long PjT() {
        return this.PjT;
    }

    public void PjT(long v) {
        if(v <= 0L) {
            this.PjT = 10L;
            return;
        }
        this.PjT = v;
    }

    public void PjT(String s) {
        this.JQp = s;
    }

    public long ReZ() {
        return this.ReZ;
    }

    public void ReZ(long v) {
        if(v <= 0L) {
            this.ReZ = 10L;
            return;
        }
        this.ReZ = v;
    }

    public long Zh() {
        return this.Zh;
    }

    public void Zh(long v) {
        if(v < 0L) {
            this.Zh = 20L;
            return;
        }
        this.Zh = v;
    }

    public long cr() {
        return this.cr;
    }

    public void cr(long v) {
        if(v < 0L) {
            this.cr = 20L;
            return;
        }
        this.cr = v;
    }
}

