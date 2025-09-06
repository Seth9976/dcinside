package com.bytedance.adsdk.Zh.ReZ;

public class cz {
    public final float PjT;
    private final String ReZ;
    public final float Zh;

    public cz(String s, float f, float f1) {
        this.ReZ = s;
        this.Zh = f1;
        this.PjT = f;
    }

    // 去混淆评级： 低(40)
    public boolean PjT(String s) {
        return this.ReZ.equalsIgnoreCase(s) ? true : this.ReZ.endsWith("\r") && this.ReZ.substring(0, this.ReZ.length() - 1).equalsIgnoreCase(s);
    }
}

