package com.bytedance.adsdk.ugeno.yoga;

public enum xE {
    NO_WRAP(0, "nowrap"),
    WRAP(1, "wrap"),
    WRAP_REVERSE(2, "wrap_reverse");

    private final String JQp;
    private final int cr;

    private xE(int v1, String s1) {
        this.cr = v1;
        this.JQp = s1;
    }

    public static xE PjT(int v) {
        switch(v) {
            case 0: {
                return xE.PjT;
            }
            case 1: {
                return xE.Zh;
            }
            case 2: {
                return xE.ReZ;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + v);
            }
        }
    }

    public static xE PjT(String s) {
        s.hashCode();
        switch(s) {
            case "nowrap": {
                return xE.PjT;
            }
            case "wrap": {
                return xE.Zh;
            }
            case "wrap_reverse": {
                return xE.ReZ;
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

