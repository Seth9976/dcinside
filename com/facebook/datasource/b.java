package com.facebook.datasource;

import k1.n.a;
import k1.n;

@n(a.a)
public abstract class b implements g {
    @Override  // com.facebook.datasource.g
    public void a(d d0) {
    }

    @Override  // com.facebook.datasource.g
    public void b(d d0) {
    }

    @Override  // com.facebook.datasource.g
    public void c(d d0) {
        try {
            this.e(d0);
        }
        finally {
            d0.close();
        }
    }

    @Override  // com.facebook.datasource.g
    public void d(d d0) {
        try {
            this.f(((Boolean)d0.getResult()).booleanValue());
        }
        finally {
            d0.close();
        }
    }

    protected abstract void e(d arg1);

    protected abstract void f(boolean arg1);
}

