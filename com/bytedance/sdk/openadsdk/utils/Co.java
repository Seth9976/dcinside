package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

public class Co {
    public long PjT;
    private long Zh;

    private Co(boolean z) {
        if(z) {
            this.JQp();
        }
    }

    public void JQp() {
        this.PjT = System.currentTimeMillis();
        this.Zh = SystemClock.elapsedRealtime();
    }

    public long PjT() {
        return this.Zh;
    }

    public long PjT(Co co0) {
        return Math.abs(co0.Zh - this.Zh);
    }

    public static Co ReZ() {
        return new Co(false);
    }

    public static Co Zh() {
        return new Co(true);
    }

    public long cr() {
        return SystemClock.elapsedRealtime() - this.Zh;
    }

    public boolean cz() {
        return this.Zh > 0L;
    }

    @Override
    public String toString() {
        return String.valueOf(this.PjT);
    }
}

