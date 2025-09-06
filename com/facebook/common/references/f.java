package com.facebook.common.references;

import java.lang.ref.SoftReference;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class f {
    @h
    SoftReference a;
    @h
    SoftReference b;
    @h
    SoftReference c;

    public f() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public void a() {
        SoftReference softReference0 = this.a;
        if(softReference0 != null) {
            softReference0.clear();
            this.a = null;
        }
        SoftReference softReference1 = this.b;
        if(softReference1 != null) {
            softReference1.clear();
            this.b = null;
        }
        SoftReference softReference2 = this.c;
        if(softReference2 != null) {
            softReference2.clear();
            this.c = null;
        }
    }

    @h
    public Object b() {
        return this.a == null ? null : this.a.get();
    }

    public void c(Object object0) {
        this.a = new SoftReference(object0);
        this.b = new SoftReference(object0);
        this.c = new SoftReference(object0);
    }
}

