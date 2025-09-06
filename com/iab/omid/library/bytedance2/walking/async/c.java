package com.iab.omid.library.bytedance2.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c implements a {
    private final BlockingQueue a;
    private final ThreadPoolExecutor b;
    private final ArrayDeque c;
    private b d;

    public c() {
        this.c = new ArrayDeque();
        this.d = null;
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue0;
        this.b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue0);
    }

    private void a() {
        b b0 = (b)this.c.poll();
        this.d = b0;
        if(b0 != null) {
            b0.a(this.b);
        }
    }

    @Override  // com.iab.omid.library.bytedance2.walking.async.b$a
    public void a(b b0) {
        this.d = null;
        this.a();
    }

    public void b(b b0) {
        b0.a(this);
        this.c.add(b0);
        if(this.d == null) {
            this.a();
        }
    }
}

