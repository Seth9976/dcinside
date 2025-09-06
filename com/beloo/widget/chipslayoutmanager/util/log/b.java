package com.beloo.widget.chipslayoutmanager.util.log;

import android.util.SparseArray;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import java.util.Locale;

class b implements c {
    private SparseArray a;
    private int b;
    private int c;
    private int d;
    private int e;

    b(SparseArray sparseArray0) {
        this.a = sparseArray0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.c
    public void a(int v) {
        d.b("fillWithLayouter", " recycle position =" + this.a.keyAt(v), 3);
        ++this.e;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.c
    public void b() {
        this.e = this.a.size();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.c
    public void c() {
        d.b("fillWithLayouter", "recycled count = " + this.e, 3);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.c
    public void d(AnchorViewState anchorViewState0) {
        if(anchorViewState0.a() != null) {
            d.b("fill", "anchorPos " + anchorViewState0.d(), 3);
            d.b("fill", "anchorTop " + anchorViewState0.a().top, 3);
        }
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.c
    public void e(int v) {
        this.b = 0;
        this.c = 0;
        this.d = this.a.size();
        d.b("fillWithLayouter", "start position = " + v, 3);
        d.b("fillWithLayouter", "cached items = " + this.d, 3);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.c
    public void f() {
        ++this.c;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.c
    public void g() {
        d.b("fillWithLayouter", String.format(Locale.getDefault(), "reattached items = %d : requested items = %d recycledItems = %d", ((int)(this.d - this.a.size())), this.b, this.c), 3);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.c
    public void h() {
        ++this.b;
    }
}

