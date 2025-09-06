package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

public class c implements a {
    private final AtomicLong a;

    public c(long v) {
        this.a = new AtomicLong(v);
    }

    @Override  // com.google.android.datatransport.runtime.time.a
    public long J() {
        return this.a.get();
    }

    public void a(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("cannot advance time backwards.");
        }
        this.a.addAndGet(v);
    }

    public void b() {
        this.a(1L);
    }
}

