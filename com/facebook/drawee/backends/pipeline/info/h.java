package com.facebook.drawee.backends.pipeline.info;

import C0.b;
import S0.f;
import S0.g;
import S0.j;
import S0.l;
import S0.m;
import S0.v;
import android.graphics.Rect;
import com.facebook.common.time.d;
import com.facebook.drawee.backends.pipeline.e;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.n.a;
import k1.n;

@n(a.a)
public class h implements j {
    private final e a;
    private final d b;
    private final l c;
    @o3.h
    private C0.a d;
    @o3.h
    private b e;
    @o3.h
    private f1.d f;
    @o3.h
    private List g;
    private boolean h;

    public h(d d0, e e0) {
        this.b = d0;
        this.a = e0;
        this.c = new l(m.c);
    }

    @Override  // S0.j
    public void a(l l0, S0.e e0) {
        l0.a0(e0);
        if(this.h && (this.g != null && !this.g.isEmpty())) {
            if(e0 == S0.e.g) {
                this.d();
            }
            f f0 = l0.l0();
            for(Object object0: this.g) {
                ((g)object0).b(f0, e0);
            }
        }
    }

    @Override  // S0.j
    public void b(l l0, v v0) {
        if(this.h && (this.g != null && !this.g.isEmpty())) {
            f f0 = l0.l0();
            for(Object object0: this.g) {
                ((g)object0).a(f0, v0);
            }
        }
    }

    public void c(@o3.h g g0) {
        if(g0 == null) {
            return;
        }
        if(this.g == null) {
            this.g = new CopyOnWriteArrayList();
        }
        this.g.add(g0);
    }

    public void d() {
        E0.b b0 = this.a.e();
        if(b0 != null && b0.b() != null) {
            Rect rect0 = b0.b().getBounds();
            int v = rect0.width();
            this.c.g0(v);
            int v1 = rect0.height();
            this.c.f0(v1);
        }
    }

    public void e() {
        List list0 = this.g;
        if(list0 != null) {
            list0.clear();
        }
    }

    public void f(g g0) {
        List list0 = this.g;
        if(list0 == null) {
            return;
        }
        list0.remove(g0);
    }

    public void g() {
        this.e();
        this.h(false);
        this.c.O();
    }

    public void h(boolean z) {
        this.h = z;
        if(z) {
            this.i();
            b b0 = this.e;
            if(b0 != null) {
                this.a.o(b0);
            }
            f1.d d0 = this.f;
            if(d0 != null) {
                this.a.o0(d0);
            }
        }
        else {
            b b1 = this.e;
            if(b1 != null) {
                this.a.X(b1);
            }
            f1.d d1 = this.f;
            if(d1 != null) {
                this.a.I0(d1);
            }
        }
    }

    private void i() {
        if(this.e == null) {
            this.e = new b(this.b, this.c, this);
        }
        if(this.d == null) {
            this.d = new C0.a(this.b, this.c);
        }
        if(this.f == null) {
            this.f = new f1.d(new f1.f[]{this.d});
        }
    }
}

