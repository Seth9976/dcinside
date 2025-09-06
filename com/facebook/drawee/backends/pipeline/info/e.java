package com.facebook.drawee.backends.pipeline.info;

import f1.b;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class e extends b {
    private String a;
    @h
    private final d b;

    public e(String s, @h d d0) {
        this.b = d0;
        this.l(s);
    }

    @Override  // f1.b
    public void i(String s, String s1, boolean z) {
        d d0 = this.b;
        if(d0 != null) {
            d0.a(this.a, f.a(s1), z, s1);
        }
    }

    public void l(String s) {
        this.a = s;
    }
}

