package com.bytedance.adsdk.PjT.Zh.cr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum ReZ implements JQp {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final String gK;
    private final int ltE;
    private static final Set ub;
    private static final Map xE;

    static {
        ReZ.xE = new HashMap(0x80);
        ReZ.ub = new HashSet();
        ReZ[] arr_reZ = (ReZ[])ReZ.Owx.clone();
        for(int v = 0; v < arr_reZ.length; ++v) {
            ReZ reZ0 = arr_reZ[v];
            ReZ.xE.put(reZ0.PjT(), reZ0);
            ReZ.ub.add(reZ0);
        }
    }

    private ReZ(String s1, int v1) {
        this.gK = s1;
        this.ltE = v1;
    }

    public static ReZ PjT(String s) {
        return (ReZ)ReZ.xE.get(s);
    }

    public static boolean PjT(JQp jQp0) {
        return jQp0 instanceof ReZ;
    }

    public String PjT() {
        return this.gK;
    }

    public int Zh() {
        return this.ltE;
    }
}

