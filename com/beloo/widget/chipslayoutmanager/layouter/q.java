package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;

class q implements i {
    private LayoutManager a;

    q(LayoutManager recyclerView$LayoutManager0) {
        this.a = recyclerView$LayoutManager0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public Rect a(AnchorViewState anchorViewState0) {
        int v1;
        Rect rect0 = anchorViewState0.a();
        int v = rect0 == null ? this.a.G0() : rect0.left;
        if(rect0 != null) {
            v1 = rect0.top;
        }
        else if(((int)anchorViewState0.d()) == 0) {
            v1 = this.a.J0();
        }
        else {
            v1 = 0;
        }
        if(rect0 == null) {
            return ((int)anchorViewState0.d()) == 0 ? new Rect(v, v1, 0, this.a.E0()) : new Rect(v, v1, 0, 0);
        }
        return new Rect(v, v1, 0, rect0.bottom);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public Rect b(AnchorViewState anchorViewState0) {
        Rect rect0 = anchorViewState0.a();
        int v = rect0 == null ? 0 : rect0.top;
        int v1 = rect0 == null ? 0 : rect0.left;
        return rect0 == null ? new Rect(0, v, v1, 0) : new Rect(0, v, v1, rect0.bottom);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public a c() {
        return p.d0();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public a d() {
        return s.d0();
    }
}

