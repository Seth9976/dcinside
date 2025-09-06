package com.igaworks.ssp;

import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;

public class p0 {
    private HashMap a;
    private ConcurrentHashMap b;

    public String a(String s) {
        synchronized(this) {
            return this.b != null && this.b.containsKey(s) ? ((String)this.b.get(s)) : null;
        }
    }

    public HashMap a() {
        return this.a;
    }

    public void a(String s, String s1) {
        synchronized(this) {
            if(this.b == null) {
                this.b = new ConcurrentHashMap();
            }
            this.b.put(s, s1);
        }
    }

    public void a(HashMap hashMap0) {
        this.a = hashMap0;
    }
}

