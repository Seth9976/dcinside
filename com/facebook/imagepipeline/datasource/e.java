package com.facebook.imagepipeline.datasource;

import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.q0;
import com.facebook.imagepipeline.systrace.b;
import k1.n.a;
import k1.n;
import o3.h;
import p3.d;

@n(a.a)
@d
public class e extends com.facebook.imagepipeline.datasource.a {
    private e(h0 h00, q0 q00, f1.e e0) {
        super(h00, q00, e0);
    }

    @Override  // com.facebook.imagepipeline.datasource.a
    protected void G(Object object0, int v, j0 j00) {
        this.K(((com.facebook.common.references.a)object0), v, j00);
    }

    protected void H(com.facebook.common.references.a a0) {
        com.facebook.common.references.a.j(a0);
    }

    public static com.facebook.datasource.d I(h0 h00, q0 q00, f1.e e0) {
        if(b.e()) {
            b.a("CloseableProducerToDataSourceAdapter#create");
        }
        com.facebook.datasource.d d0 = new e(h00, q00, e0);
        if(b.e()) {
            b.c();
        }
        return d0;
    }

    @h
    public com.facebook.common.references.a J() {
        return com.facebook.common.references.a.e(((com.facebook.common.references.a)super.getResult()));
    }

    protected void K(com.facebook.common.references.a a0, int v, j0 j00) {
        super.G(com.facebook.common.references.a.e(a0), v, j00);
    }

    @Override  // com.facebook.datasource.a
    @h
    public Object getResult() {
        return this.J();
    }

    @Override  // com.facebook.datasource.a
    protected void h(Object object0) {
        this.H(((com.facebook.common.references.a)object0));
    }
}

