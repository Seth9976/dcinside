package com.facebook.drawee.backends.pipeline.info;

import S0.e;
import S0.f;
import S0.g;
import S0.v;
import java.util.Collection;
import k1.n.a;
import k1.n;

@n(a.a)
public class b implements g {
    private final Collection a;

    public b(Collection collection0) {
        this.a = collection0;
    }

    @Override  // S0.g
    public void a(f f0, v v0) {
        for(Object object0: this.a) {
            ((g)object0).a(f0, v0);
        }
    }

    @Override  // S0.g
    public void b(f f0, e e0) {
        for(Object object0: this.a) {
            ((g)object0).b(f0, e0);
        }
    }
}

