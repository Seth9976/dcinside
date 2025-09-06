package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.c;
import java.util.ArrayList;
import java.util.List;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public abstract class d extends c {
    @Override  // com.facebook.datasource.c
    public void f(com.facebook.datasource.d d0) {
        if(!d0.g()) {
            return;
        }
        List list0 = (List)d0.getResult();
        if(list0 == null) {
            this.g(null);
            return;
        }
        try {
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                com.facebook.common.references.a a0 = (com.facebook.common.references.a)object0;
                if(a0 != null && a0.n() instanceof com.facebook.imagepipeline.image.d) {
                    arrayList0.add(((com.facebook.imagepipeline.image.d)a0.n()).D3());
                }
                else {
                    arrayList0.add(null);
                }
            }
            this.g(arrayList0);
        }
        finally {
            for(Object object1: list0) {
                com.facebook.common.references.a.j(((com.facebook.common.references.a)object1));
            }
        }
    }

    protected abstract void g(@h List arg1);
}

