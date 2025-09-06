package com.github.mikephil.charting.data;

import android.util.Log;
import com.github.mikephil.charting.highlight.d;
import java.util.ArrayList;
import java.util.List;
import t1.b;
import t1.e;

public class l extends c {
    private n j;
    private a k;
    private v l;
    private i m;
    private g n;

    @Override  // com.github.mikephil.charting.data.k
    public void E() {
        n n0 = this.j;
        if(n0 != null) {
            n0.E();
        }
        a a0 = this.k;
        if(a0 != null) {
            a0.E();
        }
        i i0 = this.m;
        if(i0 != null) {
            i0.E();
        }
        v v0 = this.l;
        if(v0 != null) {
            v0.E();
        }
        g g0 = this.n;
        if(g0 != null) {
            g0.E();
        }
        this.d();
    }

    @Override  // com.github.mikephil.charting.data.k
    @Deprecated
    public boolean F(int v) {
        Log.e("MPAndroidChart", "removeDataSet(int index) not supported for CombinedData");
        return false;
    }

    @Override  // com.github.mikephil.charting.data.k
    public boolean G(e e0) {
        return this.Z(((b)e0));
    }

    @Override  // com.github.mikephil.charting.data.k
    @Deprecated
    public boolean H(float f, int v) {
        Log.e("MPAndroidChart", "removeEntry(...) not supported for CombinedData");
        return false;
    }

    @Override  // com.github.mikephil.charting.data.k
    @Deprecated
    public boolean I(Entry entry0, int v) {
        Log.e("MPAndroidChart", "removeEntry(...) not supported for CombinedData");
        return false;
    }

    public List Q() {
        List list0 = new ArrayList();
        n n0 = this.j;
        if(n0 != null) {
            list0.add(n0);
        }
        a a0 = this.k;
        if(a0 != null) {
            list0.add(a0);
        }
        v v0 = this.l;
        if(v0 != null) {
            list0.add(v0);
        }
        i i0 = this.m;
        if(i0 != null) {
            list0.add(i0);
        }
        g g0 = this.n;
        if(g0 != null) {
            list0.add(g0);
        }
        return list0;
    }

    public a R() {
        return this.k;
    }

    public g S() {
        return this.n;
    }

    public i T() {
        return this.m;
    }

    public c U(int v) {
        return (c)this.Q().get(v);
    }

    public int V(k k0) {
        return this.Q().indexOf(k0);
    }

    public b W(d d0) {
        if(d0.c() >= this.Q().size()) {
            return null;
        }
        c c0 = this.U(d0.c());
        return d0.d() < c0.m() ? ((b)c0.q().get(d0.d())) : null;
    }

    public n X() {
        return this.j;
    }

    public v Y() {
        return this.l;
    }

    public boolean Z(b b0) {
        boolean z = false;
        for(Object object0: this.Q()) {
            z = ((k)object0).G(b0);
            if(z) {
                break;
            }
        }
        return z;
    }

    public void a0(a a0) {
        this.k = a0;
        this.E();
    }

    public void b0(g g0) {
        this.n = g0;
        this.E();
    }

    public void c0(i i0) {
        this.m = i0;
        this.E();
    }

    @Override  // com.github.mikephil.charting.data.k
    public void d() {
        if(this.i == null) {
            this.i = new ArrayList();
        }
        this.i.clear();
        this.a = -3.402823E+38f;
        this.b = 3.402823E+38f;
        this.c = -3.402823E+38f;
        this.d = 3.402823E+38f;
        this.e = -3.402823E+38f;
        this.f = 3.402823E+38f;
        this.g = -3.402823E+38f;
        this.h = 3.402823E+38f;
        for(Object object0: this.Q()) {
            k k0 = (k)object0;
            k0.d();
            this.i.addAll(k0.q());
            if(k0.z() > this.a) {
                this.a = k0.z();
            }
            if(k0.B() < this.b) {
                this.b = k0.B();
            }
            if(k0.x() > this.c) {
                this.c = k0.x();
            }
            if(k0.y() < this.d) {
                this.d = k0.y();
            }
            float f = k0.e;
            if(f > this.e) {
                this.e = f;
            }
            float f1 = k0.f;
            if(f1 < this.f) {
                this.f = f1;
            }
            float f2 = k0.g;
            if(f2 > this.g) {
                this.g = f2;
            }
            float f3 = k0.h;
            if(f3 < this.h) {
                this.h = f3;
            }
        }
    }

    public void d0(n n0) {
        this.j = n0;
        this.E();
    }

    public void e0(v v0) {
        this.l = v0;
        this.E();
    }

    @Override  // com.github.mikephil.charting.data.k
    public Entry s(d d0) {
        if(d0.c() >= this.Q().size()) {
            return null;
        }
        c c0 = this.U(d0.c());
        if(d0.d() >= c0.m()) {
            return null;
        }
        for(Object object0: c0.k(d0.d()).v(d0.h())) {
            Entry entry0 = (Entry)object0;
            if(entry0.d() == d0.j() || Float.isNaN(d0.j())) {
                return entry0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }
}

