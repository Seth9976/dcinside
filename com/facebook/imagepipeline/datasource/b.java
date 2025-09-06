package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import com.facebook.datasource.c;
import com.facebook.datasource.d;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public abstract class b extends c {
    @Override  // com.facebook.datasource.c
    public void f(d d0) {
        if(!d0.g()) {
            return;
        }
        com.facebook.common.references.a a0 = (com.facebook.common.references.a)d0.getResult();
        Bitmap bitmap0 = a0 == null || !(a0.n() instanceof com.facebook.imagepipeline.image.d) ? null : ((com.facebook.imagepipeline.image.d)a0.n()).D3();
        try {
            this.g(bitmap0);
        }
        finally {
            com.facebook.common.references.a.j(a0);
        }
    }

    protected abstract void g(@h Bitmap arg1);
}

