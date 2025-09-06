package com.bytedance.adsdk.ugeno.yoga;

public enum cr {
    INHERIT(0),
    LTR(1),
    RTL(2);

    private final int cr;

    private cr(int v1) {
        this.cr = v1;
    }

    public int PjT() {
        return this.cr;
    }
}

