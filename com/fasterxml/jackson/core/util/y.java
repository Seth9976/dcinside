package com.fasterxml.jackson.core.util;

import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;

class y {
    static final class a {
        static final y a;

        static {
            a.a = new y();
        }
    }

    private final Object a;
    private final Map b;
    private final ReferenceQueue c;

    y() {
        this.a = new Object();
        this.b = new ConcurrentHashMap();
        this.c = new ReferenceQueue();
    }

    public static y a() {
        return a.a;
    }

    public int b() {
        synchronized(this.a) {
            this.c();
            int v1 = 0;
            for(Object object1: this.b.keySet()) {
                ((SoftReference)object1).clear();
                ++v1;
            }
            this.b.clear();
            return v1;
        }
    }

    private void c() {
        SoftReference softReference0;
        while((softReference0 = (SoftReference)this.c.poll()) != null) {
            this.b.remove(softReference0);
        }
    }

    public SoftReference d(com.fasterxml.jackson.core.util.a a0) {
        SoftReference softReference0 = new SoftReference(a0, this.c);
        this.b.put(softReference0, Boolean.TRUE);
        this.c();
        return softReference0;
    }
}

