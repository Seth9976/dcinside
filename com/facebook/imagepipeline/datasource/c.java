package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.d;
import com.facebook.imagepipeline.image.g;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public abstract class c extends com.facebook.datasource.c {
    @Override  // com.facebook.datasource.c
    public void f(d d0) {
        if(!d0.g()) {
            return;
        }
        com.facebook.common.references.a a0 = (com.facebook.common.references.a)d0.getResult();
        com.facebook.common.references.a a1 = a0 == null || !(a0.n() instanceof g) ? null : ((g)a0.n()).N();
        try {
            this.g(a1);
        }
        finally {
            com.facebook.common.references.a.j(a1);
            com.facebook.common.references.a.j(a0);
        }
    }

    protected abstract void g(@h com.facebook.common.references.a arg1);
}

