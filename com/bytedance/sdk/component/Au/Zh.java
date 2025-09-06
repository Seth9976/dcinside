package com.bytedance.sdk.component.Au;

import android.os.SystemClock;

class Zh implements Comparable, Runnable {
    private Au PjT;
    private long ReZ;
    private PjT Zh;
    private Thread cr;

    public Zh(Au au0, PjT pjT0) {
        this.cr = null;
        this.PjT = au0;
        this.Zh = pjT0;
        this.ReZ = SystemClock.uptimeMillis();
    }

    private void PjT(String s, String s1, long v) {
    }

    public Au PjT() {
        return this.PjT;
    }

    // 去混淆评级： 低(20)
    @Override
    public int compareTo(Object object0) {
        return object0 instanceof Zh ? this.PjT.compareTo(((Zh)object0).PjT()) : 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Zh && (this.PjT != null && this.PjT.equals(((Zh)object0).PjT()));
    }

    @Override
    public int hashCode() {
        return this.PjT.hashCode();
    }

    @Override
    public void run() {
        long v = SystemClock.uptimeMillis();
        this.cr = Thread.currentThread();
        Au au0 = this.PjT;
        if(au0 != null) {
            au0.run();
        }
        long v1 = SystemClock.uptimeMillis() - v;
        if(this.Zh != null) {
            cr.PjT();
        }
    }
}

