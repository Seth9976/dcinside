package com.bumptech.glide.load.engine;

import com.bumptech.glide.e;
import com.bumptech.glide.k.c;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.model.o.a;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.k;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class g {
    private final List a;
    private final List b;
    private e c;
    private Object d;
    private int e;
    private int f;
    private Class g;
    private com.bumptech.glide.load.engine.h.e h;
    private j i;
    private Map j;
    private Class k;
    private boolean l;
    private boolean m;
    private com.bumptech.glide.load.g n;
    private com.bumptech.glide.j o;
    private com.bumptech.glide.load.engine.j p;
    private boolean q;
    private boolean r;

    g() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    b b() {
        return this.c.b();
    }

    List c() {
        if(!this.m) {
            this.m = true;
            this.b.clear();
            List list0 = this.g();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                a o$a0 = (a)list0.get(v1);
                if(!this.b.contains(o$a0.a)) {
                    this.b.add(o$a0.a);
                }
                for(int v2 = 0; v2 < o$a0.b.size(); ++v2) {
                    Object object0 = o$a0.b.get(v2);
                    if(!this.b.contains(object0)) {
                        Object object1 = o$a0.b.get(v2);
                        this.b.add(object1);
                    }
                }
            }
        }
        return this.b;
    }

    com.bumptech.glide.load.engine.cache.a d() {
        return this.h.a();
    }

    com.bumptech.glide.load.engine.j e() {
        return this.p;
    }

    int f() {
        return this.f;
    }

    List g() {
        if(!this.l) {
            this.l = true;
            this.a.clear();
            List list0 = this.c.i().i(this.d);
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                a o$a0 = ((o)list0.get(v1)).a(this.d, this.e, this.f, this.i);
                if(o$a0 != null) {
                    this.a.add(o$a0);
                }
            }
        }
        return this.a;
    }

    t h(Class class0) {
        return this.c.i().h(class0, this.g, this.k);
    }

    Class i() {
        return this.d.getClass();
    }

    List j(File file0) throws c {
        return this.c.i().i(file0);
    }

    j k() {
        return this.i;
    }

    com.bumptech.glide.j l() {
        return this.o;
    }

    List m() {
        return this.c.i().j(this.d.getClass(), this.g, this.k);
    }

    m n(v v0) {
        return this.c.i().k(v0);
    }

    com.bumptech.glide.load.data.e o(Object object0) {
        return this.c.i().l(object0);
    }

    com.bumptech.glide.load.g p() {
        return this.n;
    }

    d q(Object object0) throws com.bumptech.glide.k.e {
        return this.c.i().m(object0);
    }

    Class r() {
        return this.k;
    }

    n s(Class class0) {
        n n0 = (n)this.j.get(class0);
        if(n0 == null) {
            for(Object object0: this.j.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((Class)map$Entry0.getKey()).isAssignableFrom(class0)) {
                    n0 = (n)map$Entry0.getValue();
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        if(n0 == null) {
            if(this.j.isEmpty() && this.q) {
                throw new IllegalArgumentException("Missing transformation for " + class0 + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return k.c();
        }
        return n0;
    }

    int t() {
        return this.e;
    }

    boolean u(Class class0) {
        return this.h(class0) != null;
    }

    void v(e e0, Object object0, com.bumptech.glide.load.g g0, int v, int v1, com.bumptech.glide.load.engine.j j0, Class class0, Class class1, com.bumptech.glide.j j1, j j2, Map map0, boolean z, boolean z1, com.bumptech.glide.load.engine.h.e h$e0) {
        this.c = e0;
        this.d = object0;
        this.n = g0;
        this.e = v;
        this.f = v1;
        this.p = j0;
        this.g = class0;
        this.h = h$e0;
        this.k = class1;
        this.o = j1;
        this.i = j2;
        this.j = map0;
        this.q = z;
        this.r = z1;
    }

    boolean w(v v0) {
        return this.c.i().n(v0);
    }

    boolean x() {
        return this.r;
    }

    boolean y(com.bumptech.glide.load.g g0) {
        List list0 = this.g();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((a)list0.get(v1)).a.equals(g0)) {
                return true;
            }
        }
        return false;
    }
}

