package com.bytedance.adsdk.Zh.ReZ;

import java.util.List;

public class cr {
    private final String JQp;
    private final List PjT;
    private final double ReZ;
    private final char Zh;
    private final double cr;
    private final String cz;

    public cr(List list0, char c, double f, double f1, String s, String s1) {
        this.PjT = list0;
        this.Zh = c;
        this.ReZ = f;
        this.cr = f1;
        this.JQp = s;
        this.cz = s1;
    }

    public static int PjT(char c, String s, String s1) {
        return (c * 0x1F + s.hashCode()) * 0x1F + s1.hashCode();
    }

    public List PjT() {
        return this.PjT;
    }

    public double Zh() {
        return this.cr;
    }

    @Override
    public int hashCode() {
        return cr.PjT(this.Zh, this.cz, this.JQp);
    }
}

