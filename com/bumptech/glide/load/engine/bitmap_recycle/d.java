package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.util.o;
import java.util.Queue;

abstract class d {
    private final Queue a;
    private static final int b = 20;

    d() {
        this.a = o.g(20);
    }

    abstract m a();

    m b() {
        m m0 = (m)this.a.poll();
        return m0 == null ? this.a() : m0;
    }

    public void c(m m0) {
        if(this.a.size() < 20) {
            this.a.offer(m0);
        }
    }
}

