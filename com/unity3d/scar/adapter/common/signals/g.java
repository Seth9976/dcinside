package com.unity3d.scar.adapter.common.signals;

import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class g {
    private final Map a;

    public g() {
        this.a = new ConcurrentHashMap();
    }

    public Object a(String s) {
        return this.a.get(s);
    }

    public void b(String s, Object object0) {
        this.a.put(s, object0);
    }
}

