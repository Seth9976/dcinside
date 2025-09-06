package com.bytedance.sdk.component.Au.ReZ;

public abstract class Zh implements Comparable, Runnable {
    private long JQp;
    private int PjT;
    private Runnable ReZ;
    private String Zh;
    private long cr;
    private long cz;

    public Zh(int v, String s) {
        this.PjT = v;
        this.Zh = s;
    }

    public Zh(String s) {
        this.PjT = 5;
        this.Zh = s;
    }

    public Zh(String s, Runnable runnable0) {
        this.PjT = 5;
        this.Zh = s;
        this.ReZ = runnable0;
    }

    public Runnable Au() {
        return this.ReZ;
    }

    public long JQp() {
        return this.cz;
    }

    public int PjT() {
        return this.PjT;
    }

    public int PjT(Zh zh0) {
        if(this.PjT() < zh0.PjT()) {
            return 1;
        }
        return this.PjT() < zh0.PjT() ? 0 : -1;
    }

    public void PjT(int v) {
        this.PjT = v;
    }

    public void PjT(long v) {
        this.cr = v;
    }

    public long ReZ() {
        return this.cr;
    }

    public void ReZ(long v) {
        this.cz = v;
    }

    public long XX() {
        return this.cz - this.JQp;
    }

    public String Zh() {
        return this.Zh;
    }

    public void Zh(long v) {
        this.JQp = v;
    }

    @Override
    public int compareTo(Object object0) {
        return this.PjT(((Zh)object0));
    }

    public long cr() {
        return this.JQp;
    }

    public long cz() {
        return this.JQp - this.cr;
    }
}

