package com.bytedance.adsdk.ugeno.yoga;

public enum XX {
    FLEX_START(0, "flex_start"),
    CENTER(1, "center"),
    FLEX_END(2, "flex_end"),
    SPACE_BETWEEN(3, "space_between"),
    SPACE_AROUND(4, "space_around"),
    SPACE_EVENLY(5, "space_evenly");

    private final String Au;
    private final int XX;

    private XX(int v1, String s1) {
        this.XX = v1;
        this.Au = s1;
    }

    public static XX PjT(int v) {
        switch(v) {
            case 0: {
                return XX.PjT;
            }
            case 1: {
                return XX.Zh;
            }
            case 2: {
                return XX.ReZ;
            }
            case 3: {
                return XX.cr;
            }
            case 4: {
                return XX.JQp;
            }
            case 5: {
                return XX.cz;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + v);
            }
        }
    }

    public static XX PjT(String s) {
        s.hashCode();
        switch(s) {
            case "center": {
                return XX.Zh;
            }
            case "flex_end": {
                return XX.ReZ;
            }
            case "flex_start": {
                return XX.PjT;
            }
            case "space_around": {
                return XX.JQp;
            }
            case "space_between": {
                return XX.cr;
            }
            case "space_evenly": {
                return XX.cz;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + s);
            }
        }
    }

    public int PjT() {
        return this.XX;
    }
}

