package com.bytedance.adsdk.ugeno.yoga;

public enum Zh {
    AUTO(0, "auto"),
    FLEX_START(1, "flex_start"),
    CENTER(2, "center"),
    FLEX_END(3, "flex_end"),
    STRETCH(4, "stretch"),
    BASELINE(5, "baseline"),
    SPACE_BETWEEN(6, "space_between"),
    SPACE_AROUND(7, "space_around");

    private final String DWo;
    private final int SM;

    private Zh(int v1, String s1) {
        this.SM = v1;
        this.DWo = s1;
    }

    public static Zh PjT(int v) {
        switch(v) {
            case 0: {
                return Zh.PjT;
            }
            case 1: {
                return Zh.Zh;
            }
            case 2: {
                return Zh.ReZ;
            }
            case 3: {
                return Zh.cr;
            }
            case 4: {
                return Zh.JQp;
            }
            case 5: {
                return Zh.cz;
            }
            case 6: {
                return Zh.XX;
            }
            case 7: {
                return Zh.Au;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + v);
            }
        }
    }

    public static Zh PjT(String s) {
        s.hashCode();
        switch(s) {
            case "auto": {
                return Zh.PjT;
            }
            case "baseline": {
                return Zh.cz;
            }
            case "center": {
                return Zh.ReZ;
            }
            case "flex_end": {
                return Zh.cr;
            }
            case "flex_start": {
                return Zh.Zh;
            }
            case "space_around": {
                return Zh.Au;
            }
            case "space_between": {
                return Zh.XX;
            }
            case "stretch": {
                return Zh.JQp;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + s);
            }
        }
    }

    public int PjT() {
        return this.SM;
    }
}

