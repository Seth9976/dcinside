package com.facebook.datasource;

import k1.n.a;
import k1.n;

@n(a.a)
public abstract class c implements g {
    @Override  // com.facebook.datasource.g
    public void a(@o3.g d d0) {
    }

    @Override  // com.facebook.datasource.g
    public void b(@o3.g d d0) {
    }

    @Override  // com.facebook.datasource.g
    public void c(@o3.g d d0) {
        try {
            this.e(d0);
        }
        finally {
            d0.close();
        }
    }

    @Override  // com.facebook.datasource.g
    public void d(@o3.g d d0) {
        boolean z = d0.g();
        try {
            this.f(d0);
        }
        catch(Throwable throwable0) {
            if(z) {
                d0.close();
            }
            throw throwable0;
        }
        if(z) {
            d0.close();
        }
    }

    protected abstract void e(@o3.g d arg1);

    protected abstract void f(@o3.g d arg1);
}

