package com.bytedance.adsdk.PjT.Zh.cr;

import java.util.HashMap;
import java.util.Map;

public enum cr implements JQp {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private final String XX;
    private static final Map cz;

    static {
        HashMap hashMap0 = new HashMap(0x80);
        cr.cz = hashMap0;
        for(Object object0: hashMap0.values()) {
            cr.cz.put(((cr)object0).PjT(), ((cr)object0));
        }
    }

    private cr(String s1) {
        this.XX = s1;
    }

    public static boolean PjT(JQp jQp0) {
        return jQp0 instanceof cr;
    }

    public String PjT() {
        return this.XX;
    }
}

