package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;

class x implements i {
    private LayoutManager a;

    x(LayoutManager recyclerView$LayoutManager0) {
        this.a = recyclerView$LayoutManager0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public Rect a(AnchorViewState anchorViewState0) {
        int v;
        Rect rect0 = anchorViewState0.a();
        if(rect0 != null) {
            v = rect0.top;
        }
        else if(((int)anchorViewState0.d()) == 0) {
            v = this.a.J0();
        }
        else {
            v = 0;
        }
        int v1 = rect0 == null ? this.a.H0() : rect0.right;
        if(rect0 == null) {
            return ((int)anchorViewState0.d()) == 0 ? new Rect(0, v, v1, this.a.E0()) : new Rect(0, v, v1, 0);
        }
        return new Rect(0, v, v1, rect0.bottom);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public Rect b(AnchorViewState anchorViewState0) {
        Rect rect0 = anchorViewState0.a();
        int v = rect0 == null ? 0 : rect0.right;
        int v1 = rect0 == null ? 0 : rect0.top;
        return rect0 == null ? new Rect(v, v1, 0, 0) : new Rect(v, v1, 0, rect0.bottom);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public a c() {
        return w.d0();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public a d() {
        return z.d0();
    }
}

