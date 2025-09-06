package com.bytedance.sdk.component.Au;

public abstract class Au implements Comparable, Runnable {
    private int PjT;
    private String Zh;

    public Au(String s) {
        this.PjT = 5;
        this.Zh = s;
    }

    public Au(String s, int v) {
        this.PjT = 0;
        if(v == 0) {
            v = 5;
        }
        this.PjT = v;
        this.Zh = s;
    }

    public int compareTo(Au au0) {
        if(this.getPriority() < au0.getPriority()) {
            return 1;
        }
        return this.getPriority() < au0.getPriority() ? 0 : -1;
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((Au)object0));
    }

    public String getName() {
        return this.Zh;
    }

    public int getPriority() {
        return this.PjT;
    }

    public void setPriority(int v) {
        this.PjT = v;
    }
}

