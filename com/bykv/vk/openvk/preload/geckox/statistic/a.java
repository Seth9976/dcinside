package com.bykv.vk.openvk.preload.geckox.statistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class a {
    private static final Map a;
    private final Map b;

    static {
        a.a = new HashMap();
    }

    a() {
        this.b = new HashMap();
    }

    static a a(long v) {
        Map map0 = a.a;
        __monitor_enter(map0);
        try {
            a a0 = (a)map0.get(v);
            if(a0 == null) {
                a0 = new a();
                map0.put(v, a0);
            }
            __monitor_exit(map0);
            return a0;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map0);
        throw throwable0;
    }

    final com.bykv.vk.openvk.preload.geckox.statistic.model.a a(String s) {
        Map map0 = this.b;
        __monitor_enter(map0);
        try {
            com.bykv.vk.openvk.preload.geckox.statistic.model.a a0 = (com.bykv.vk.openvk.preload.geckox.statistic.model.a)this.b.get(s);
            if(a0 == null) {
                a0 = new com.bykv.vk.openvk.preload.geckox.statistic.model.a();
                this.b.put(s, a0);
            }
            __monitor_exit(map0);
            return a0;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map0);
        throw throwable0;
    }

    final List a() {
        synchronized(this.b) {
            return new ArrayList(this.b.values());
        }
    }
}

