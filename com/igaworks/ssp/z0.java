package com.igaworks.ssp;

import java.io.Serializable;

public class z0 implements Serializable {
    private float a;
    private String b;
    private boolean c;

    public z0(float f, String s) {
        this.a = f;
        this.b = s;
        this.c = false;
    }

    public float a() {
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

