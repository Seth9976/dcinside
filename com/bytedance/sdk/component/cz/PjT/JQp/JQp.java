package com.bytedance.sdk.component.cz.PjT.JQp;

public abstract class JQp implements Comparable, Runnable {
    private int PjT;
    private String ReZ;
    private String Zh;

    public JQp(String s) {
        this.PjT = 5;
        this.Zh = "9901ba2d-62f7-431a-a895-d0237eef9b95-4007277308800";
        this.ReZ = s;
    }

    public int PjT() {
        return this.PjT;
    }

    public int PjT(JQp jQp0) {
        if(this.PjT() < jQp0.PjT()) {
            return 1;
        }
        return this.PjT() < jQp0.PjT() ? 0 : -1;
    }

    public void PjT(int v) {
        this.PjT = v;
    }

    @Override
    public int compareTo(Object object0) {
        return this.PjT(((JQp)object0));
    }
}

