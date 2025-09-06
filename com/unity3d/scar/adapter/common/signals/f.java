package com.unity3d.scar.adapter.common.signals;

import java.util.HashMap;
import java.util.Map;

public class f {
    private Map a;
    private String b;

    public f() {
        this.a = new HashMap();
        this.b = null;
    }

    public void a(String s, String s1) {
        this.a.put(s, s1);
    }

    public String b() {
        return this.b;
    }

    public Map c() {
        return this.a;
    }

    public void d(String s) {
        this.b = s;
    }
}

