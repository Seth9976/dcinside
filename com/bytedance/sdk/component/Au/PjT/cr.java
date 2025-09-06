package com.bytedance.sdk.component.Au.PjT;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class cr {
    private int PjT;
    private BlockingQueue Zh;

    private cr(int v) {
        this.Zh = new LinkedBlockingQueue();
        this.PjT = v;
    }

    public static cr PjT(int v) {
        return new cr(v);
    }

    public ReZ PjT() {
        return (ReZ)this.Zh.poll();
    }

    public boolean PjT(ReZ reZ0) {
        if(reZ0 == null) {
            return false;
        }
        reZ0.PjT();
        return this.Zh.size() < this.PjT ? this.Zh.offer(reZ0) : false;
    }
}

