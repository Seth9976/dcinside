package com.bytedance.sdk.component.Au;

public class JQp {
    private static DWo PjT;

    static {
        JQp.PjT = new DWo() {
            @Override  // com.bytedance.sdk.component.Au.DWo
            public SM createThreadFactory(int v, String s) {
                return new SM(v, s);
            }
        };
    }

    public static DWo PjT() {
        return JQp.PjT;
    }

    public static void PjT(DWo dWo0) {
        JQp.PjT = dWo0;
    }
}

