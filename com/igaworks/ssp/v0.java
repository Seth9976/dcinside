package com.igaworks.ssp;

import java.io.Serializable;

public class v0 implements Serializable {
    private long a;
    private String b;
    private boolean c;

    public v0(long v, String s) {
        this.a = v;
        this.b = s;
        this.c = false;
    }

    public long a() {
        return this.a;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public String b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}

