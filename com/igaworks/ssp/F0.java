package com.igaworks.ssp;

import java.util.HashMap;

public class f0 {
    public interface a {
        void a();

        void b();
    }

    private HashMap a;
    private static f0 b;

    public f0() {
        this.a = new HashMap();
    }

    public static f0 a() {
        if(f0.b == null) {
            f0.b = new f0();
        }
        return f0.b;
    }

    public a a(String s) {
        return this.a == null || !this.a.containsKey(s) ? null : ((a)this.a.get(s));
    }

    public void a(String s, a f0$a0) {
        if(this.a == null) {
            this.a = new HashMap();
        }
        if(!this.a.containsKey(s)) {
            this.a.put(s, f0$a0);
        }
    }
}

