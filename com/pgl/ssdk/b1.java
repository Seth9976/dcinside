package com.pgl.ssdk;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class b1 {
    private int a;
    private BlockingQueue b;

    private b1(int v) {
        this.b = new LinkedBlockingQueue();
        this.a = v;
    }

    public static b1 a(int v) {
        return new b1(v);
    }

    public a1 a() {
        return (a1)this.b.poll();
    }
}

