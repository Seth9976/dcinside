package com.beloo.widget.chipslayoutmanager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.State;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.layouter.g;

abstract class m implements j {
    interface a {
        void d(j arg1, Recycler arg2, State arg3);
    }

    private ChipsLayoutManager a;
    private a b;
    private com.beloo.widget.chipslayoutmanager.layouter.m c;
    g d;

    m(ChipsLayoutManager chipsLayoutManager0, com.beloo.widget.chipslayoutmanager.layouter.m m0, a m$a0) {
        this.a = chipsLayoutManager0;
        this.b = m$a0;
        this.c = m0;
        this.d = chipsLayoutManager0.b3();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.j
    public final boolean b(Recycler recyclerView$Recycler0, State recyclerView$State0) {
        int v = this.o();
        if(v > 0) {
            this.t(-v);
            return true;
        }
        int v1 = this.n();
        if(v1 > 0) {
            this.w(-v1, recyclerView$Recycler0, recyclerView$State0);
            return true;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.j
    public final int c(State recyclerView$State0) {
        return this.i() ? this.q(recyclerView$State0) : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.j
    public final int d(State recyclerView$State0) {
        return this.i() ? this.r(recyclerView$State0) : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.j
    public final int e(State recyclerView$State0) {
        return this.k() ? this.q(recyclerView$State0) : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.j
    public final int f(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.i() ? this.w(v, recyclerView$Recycler0, recyclerView$State0) : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.j
    public final int g(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        return this.k() ? this.w(v, recyclerView$Recycler0, recyclerView$State0) : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.j
    public final int h(State recyclerView$State0) {
        return this.i() ? this.p(recyclerView$State0) : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.j
    public final int j(State recyclerView$State0) {
        return this.k() ? this.p(recyclerView$State0) : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.j
    public final int l(State recyclerView$State0) {
        return this.k() ? this.r(recyclerView$State0) : 0;
    }

    final int m(int v) {
        if(this.a.j0() == 0) {
            return 0;
        }
        if(v < 0) {
            return this.u(v);
        }
        return v <= 0 ? 0 : this.v(v);
    }

    final int n() {
        if(this.a.j0() == 0) {
            return 0;
        }
        if(this.a.e3() == this.a.getItemCount()) {
            return 0;
        }
        int v = this.c.e();
        int v1 = this.c.d() - v;
        return v1 >= 0 ? v1 : 0;
    }

    final int o() {
        if(this.a.j0() == 0) {
            return 0;
        }
        int v = this.c.c() - this.c.q();
        return v >= 0 ? v : 0;
    }

    private int p(State recyclerView$State0) {
        if(this.a.j0() != 0 && recyclerView$State0.d() != 0) {
            int v = this.a.s();
            int v1 = this.a.i();
            return this.a.h() ? Math.min(this.c.o(), this.s()) : Math.abs(v1 - v) + 1;
        }
        return 0;
    }

    private int q(State recyclerView$State0) {
        if(this.a.j0() != 0 && recyclerView$State0.d() != 0) {
            int v = this.a.s();
            int v1 = this.a.i();
            int v2 = Math.max(0, v);
            return this.a.h() ? Math.round(((float)v2) * (((float)this.s()) / ((float)(Math.abs(v - v1) + 1))) + ((float)(this.c.q() - this.c.c()))) : v2;
        }
        return 0;
    }

    private int r(State recyclerView$State0) {
        if(this.a.j0() != 0 && recyclerView$State0.d() != 0) {
            if(!this.a.h()) {
                return recyclerView$State0.d();
            }
            int v = Math.abs(this.a.s() - this.a.i());
            return (int)(((float)this.s()) / ((float)(v + 1)) * ((float)recyclerView$State0.d()));
        }
        return 0;
    }

    private int s() {
        return this.c.e() - this.c.c();
    }

    abstract void t(int arg1);

    final int u(int v) {
        AnchorViewState anchorViewState0 = this.a.a3();
        if(anchorViewState0.a() == null) {
            return 0;
        }
        if(((int)anchorViewState0.d()) == 0) {
            int v1 = this.c.q();
            int v2 = this.c.n(anchorViewState0) - v1;
            return v2 < 0 ? Math.max(v2, v) : v2;
        }
        return v;
    }

    final int v(int v) {
        int v1 = this.a.j0();
        int v2 = this.a.getItemCount();
        View view0 = this.a.i0(v1 - 1);
        return this.a.K0(view0) < v2 - 1 ? v : Math.min(this.c.e() - this.c.d(), v);
    }

    private int w(int v, Recycler recyclerView$Recycler0, State recyclerView$State0) {
        int v1 = this.m(v);
        this.t(-v1);
        this.b.d(this, recyclerView$Recycler0, recyclerView$State0);
        return v1;
    }
}

