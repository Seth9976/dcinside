package com.bytedance.sdk.component.cz.PjT.cr.Zh;

public class PjT {
    private int PjT;
    private int Zh;

    PjT(int v, int v1, long v2) {
        if(v1 < v) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.PjT = v;
        this.Zh = v1;
    }

    public static PjT JQp() {
        return new PjT(3, 100, 172800000L);
    }

    public int PjT() {
        return this.PjT;
    }

    public static PjT ReZ() {
        return new PjT(1, 100, 172800000L);
    }

    public int Zh() {
        return this.Zh;
    }

    public static PjT cr() {
        return new PjT(1, 100, -1L);
    }
}

