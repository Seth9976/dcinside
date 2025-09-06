package com.bytedance.adsdk.ugeno.yoga;

public enum DWo {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int cr;

    private DWo(int v1) {
        this.cr = v1;
    }

    public static DWo PjT(int v) {
        switch(v) {
            case 0: {
                return DWo.PjT;
            }
            case 1: {
                return DWo.Zh;
            }
            case 2: {
                return DWo.ReZ;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + v);
            }
        }
    }
}

