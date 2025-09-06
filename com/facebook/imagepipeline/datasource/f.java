package com.facebook.imagepipeline.datasource;

import com.facebook.datasource.d;
import com.facebook.datasource.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class f extends com.facebook.datasource.a {
    class com.facebook.imagepipeline.datasource.f.a implements g {
        @p3.a("InternalDataSubscriber.this")
        boolean a;
        final f b;

        private com.facebook.imagepipeline.datasource.f.a() {
            this.a = false;
        }

        com.facebook.imagepipeline.datasource.f.a(com.facebook.imagepipeline.datasource.g g0) {
        }

        @Override  // com.facebook.datasource.g
        public void a(d d0) {
            f.this.E();
        }

        @Override  // com.facebook.datasource.g
        public void b(d d0) {
            f.this.H();
        }

        @Override  // com.facebook.datasource.g
        public void c(d d0) {
            f.this.F(d0);
        }

        @Override  // com.facebook.datasource.g
        public void d(d d0) {
            if(d0.g() && this.e()) {
                f.this.G();
            }
        }

        private boolean e() {
            synchronized(this) {
                if(this.a) {
                    return false;
                }
                this.a = true;
            }
            return true;
        }
    }

    private final d[] i;
    @p3.a("this")
    private int j;

    protected f(d[] arr_d) {
        this.i = arr_d;
        this.j = 0;
    }

    public static f B(d[] arr_d) {
        com.facebook.common.internal.n.i(arr_d);
        com.facebook.common.internal.n.o(arr_d.length > 0);
        f f0 = new f(arr_d);
        for(int v = 0; v < arr_d.length; ++v) {
            d d0 = arr_d[v];
            if(d0 != null) {
                d0.d(new com.facebook.imagepipeline.datasource.f.a(f0, null), com.facebook.common.executors.a.a());
            }
        }
        return f0;
    }

    @h
    public List C() {
        synchronized(this) {
            if(!this.a()) {
                return null;
            }
            List list0 = new ArrayList(this.i.length);
            d[] arr_d = this.i;
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                list0.add(((com.facebook.common.references.a)arr_d[v1].getResult()));
            }
            return list0;
        }
    }

    private boolean D() {
        boolean z;
        synchronized(this) {
            z = true;
            int v = this.j + 1;
            this.j = v;
            if(v != this.i.length) {
                z = false;
            }
        }
        return z;
    }

    private void E() {
        this.o(new CancellationException());
    }

    private void F(d d0) {
        Throwable throwable0 = d0.c();
        if(throwable0 == null) {
            throwable0 = new Throwable("Unknown failure cause");
        }
        this.o(throwable0);
    }

    private void G() {
        if(this.D()) {
            this.u(null, true, null);
        }
    }

    private void H() {
        d[] arr_d = this.i;
        float f = 0.0f;
        for(int v = 0; v < arr_d.length; ++v) {
            f += arr_d[v].getProgress();
        }
        this.r(f / ((float)this.i.length));
    }

    @Override  // com.facebook.datasource.a
    public boolean a() {
        synchronized(this) {
            return !this.isClosed() && this.j == this.i.length;
        }
    }

    @Override  // com.facebook.datasource.a
    public boolean close() {
        if(!super.close()) {
            return false;
        }
        d[] arr_d = this.i;
        for(int v = 0; v < arr_d.length; ++v) {
            arr_d[v].close();
        }
        return true;
    }

    @Override  // com.facebook.datasource.a
    @h
    public Object getResult() {
        return this.C();
    }
}

