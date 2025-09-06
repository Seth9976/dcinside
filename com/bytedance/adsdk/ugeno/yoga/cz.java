package com.bytedance.adsdk.ugeno.yoga;

public enum cz {
    COLUMN(0, "column"),
    COLUMN_REVERSE(1, "column_reverse"),
    ROW(2, "row"),
    ROW_REVERSE(3, "row_reverse");

    private final int JQp;
    private final String cz;

    private cz(int v1, String s1) {
        this.JQp = v1;
        this.cz = s1;
    }

    public static cz PjT(int v) {
        switch(v) {
            case 0: {
                return cz.PjT;
            }
            case 1: {
                return cz.Zh;
            }
            case 2: {
                return cz.ReZ;
            }
            case 3: {
                return cz.cr;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + v);
            }
        }
    }

    public static cz PjT(String s) {
        s.hashCode();
        switch(s) {
            case "column": {
                return cz.PjT;
            }
            case "column_reverse": {
                return cz.Zh;
            }
            case "row": {
                return cz.ReZ;
            }
            case "row_reverse": {
                return cz.cr;
            }
            default: {
                throw new IllegalArgumentException("Unknown enum value: " + s);
            }
        }
    }

    public int PjT() {
        return this.JQp;
    }
}

