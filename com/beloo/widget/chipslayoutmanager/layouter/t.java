package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.cache.a;
import com.beloo.widget.chipslayoutmanager.gravity.F;
import com.beloo.widget.chipslayoutmanager.gravity.p;
import com.beloo.widget.chipslayoutmanager.gravity.q;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.g;
import com.beloo.widget.chipslayoutmanager.layouter.criteria.o;
import com.beloo.widget.chipslayoutmanager.layouter.placer.f;
import java.util.ArrayList;
import java.util.List;

public class t {
    private ChipsLayoutManager a;
    private a b;
    private List c;
    private g d;
    private o e;
    private f f;
    private p g;
    private q h;
    private i i;

    t(ChipsLayoutManager chipsLayoutManager0, i i0, g g0, o o0, f f0, p p0, q q0) {
        this.c = new ArrayList();
        this.i = i0;
        this.b = chipsLayoutManager0.f3();
        this.a = chipsLayoutManager0;
        this.d = g0;
        this.e = o0;
        this.f = f0;
        this.g = p0;
        this.h = q0;
    }

    public void a(@Nullable j j0) {
        if(j0 != null) {
            this.c.add(j0);
        }
    }

    @NonNull
    public final h b(@NonNull h h0) {
        ((com.beloo.widget.chipslayoutmanager.layouter.a)h0).b0(this.e.b());
        ((com.beloo.widget.chipslayoutmanager.layouter.a)h0).c0(this.f.b());
        return (com.beloo.widget.chipslayoutmanager.layouter.a)h0;
    }

    @NonNull
    public final h c(@NonNull h h0) {
        ((com.beloo.widget.chipslayoutmanager.layouter.a)h0).b0(this.e.a());
        ((com.beloo.widget.chipslayoutmanager.layouter.a)h0).c0(this.f.a());
        return (com.beloo.widget.chipslayoutmanager.layouter.a)h0;
    }

    private com.beloo.widget.chipslayoutmanager.layouter.a.a d() {
        return this.i.d();
    }

    private com.beloo.widget.chipslayoutmanager.layouter.g e() {
        return this.a.b3();
    }

    private com.beloo.widget.chipslayoutmanager.layouter.a.a f() {
        return this.i.c();
    }

    private Rect g(@NonNull AnchorViewState anchorViewState0) {
        return this.i.b(anchorViewState0);
    }

    private Rect h(AnchorViewState anchorViewState0) {
        return this.i.a(anchorViewState0);
    }

    @NonNull
    private com.beloo.widget.chipslayoutmanager.layouter.a.a i(com.beloo.widget.chipslayoutmanager.layouter.a.a a$a0) {
        return a$a0.w(this.a).r(this.e()).s(this.a.c3()).q(this.b).v(this.g).n(this.c);
    }

    @Nullable
    public final h j(@NonNull AnchorViewState anchorViewState0) {
        return this.i(this.d()).x(this.g(anchorViewState0)).o(this.d.a()).u(this.e.b()).A(this.h).y(this.f.b()).z(new com.beloo.widget.chipslayoutmanager.layouter.f(this.a.getItemCount())).p();
    }

    @NonNull
    public final h k(@NonNull AnchorViewState anchorViewState0) {
        return this.i(this.f()).x(this.h(anchorViewState0)).o(this.d.b()).u(this.e.a()).A(new F(this.h, !this.a.h3())).y(this.f.a()).z(new n(this.a.getItemCount())).p();
    }
}

