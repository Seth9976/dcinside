package com.bytedance.adsdk.ugeno.yoga;

public enum qla {
    STATIC(0, "static"),
    RELATIVE(1, "relative"),
    ABSOLUTE(2, "absolute");

    private final String JQp;
    private final int cr;

    private qla(int v1, String s1) {
        this.cr = v1;
        this.JQp = s1;
    }

    public static qla PjT(int v) {
        switch(v) {
            case 0: {
                return qla.PjT;
            }
            case 1: {
                return qla.Zh;
            }
            case 2: {
                return qla.ReZ;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + v);
            }
        }
    }

    public static qla PjT(String s) {
        s.hashCode();
        switch(s) {
            case "absolute": {
                return qla.ReZ;
            }
            case "relative": {
                return qla.Zh;
            }
            case "static": {
                return qla.PjT;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + s);
            }
        }
    }

    public int PjT() {
        return this.cr;
    }
}

