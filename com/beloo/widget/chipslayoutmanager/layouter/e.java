package com.beloo.widget.chipslayoutmanager.layouter;

import android.view.View;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.gravity.i;
import com.beloo.widget.chipslayoutmanager.gravity.j;
import com.beloo.widget.chipslayoutmanager.gravity.r;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.a;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.b;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.o;
import com.beloo.widget.chipslayoutmanager.layouter.placer.f;

public class e implements m {
    private ChipsLayoutManager a;
    private r b;

    public e(ChipsLayoutManager chipsLayoutManager0) {
        this.a = chipsLayoutManager0;
        this.b = new j();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int a() {
        return this.a.K0(this.a.b3().x());
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int b(View view0) {
        return this.a.u0(view0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int c() {
        return this.j(this.a.b3().a());
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int d() {
        return this.a.R0() - this.a.H0();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int e() {
        return this.b(this.a.b3().e());
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public com.beloo.widget.chipslayoutmanager.j f() {
        return this.a.g3();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int g() {
        return this.a.S0();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int getEnd() {
        return this.a.R0();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int getStart() {
        return 0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public g h() {
        return new c(this.a);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public a i() {
        return com.beloo.widget.chipslayoutmanager.util.c.a(this) ? new com.beloo.widget.chipslayoutmanager.layouter.criteria.r() : new b();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int j(View view0) {
        return this.a.r0(view0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int k(AnchorViewState anchorViewState0) {
        return anchorViewState0.a().right;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public t l(o o0, f f0) {
        return this.r(o0, f0, this.a.f3());
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public com.beloo.widget.chipslayoutmanager.anchor.c m() {
        return new com.beloo.widget.chipslayoutmanager.anchor.b(this.a, this.a.b3());
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int n(AnchorViewState anchorViewState0) {
        return anchorViewState0.a().left;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int o() {
        return this.a.R0() - this.a.G0() - this.a.H0();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int p() {
        return this.a.K0(this.a.b3().w());
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.m
    public int q() {
        return this.a.G0();
    }

    private t r(o o0, f f0, com.beloo.widget.chipslayoutmanager.cache.a a0) {
        return new t(this.a, new d(this.a), new com.beloo.widget.chipslayoutmanager.layouter.breaker.d(a0, this.a.u(), this.a.k(), new com.beloo.widget.chipslayoutmanager.layouter.breaker.c()), o0, f0, new i(), this.b.a(this.a.t()));
    }
}

