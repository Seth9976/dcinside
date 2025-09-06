package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;

class d implements i {
    private LayoutManager a;

    d(LayoutManager recyclerView$LayoutManager0) {
        this.a = recyclerView$LayoutManager0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public Rect a(@NonNull AnchorViewState anchorViewState0) {
        int v;
        Rect rect0 = anchorViewState0.a();
        if(rect0 != null) {
            v = rect0.left;
        }
        else if(((int)anchorViewState0.d()) == 0) {
            v = this.a.G0();
        }
        else {
            v = 0;
        }
        int v1 = rect0 == null ? this.a.J0() : rect0.top;
        if(rect0 == null) {
            return ((int)anchorViewState0.d()) == 0 ? new Rect(v, v1, this.a.H0(), 0) : new Rect(v, v1, 0, 0);
        }
        return new Rect(v, v1, rect0.right, 0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public Rect b(@NonNull AnchorViewState anchorViewState0) {
        Rect rect0 = anchorViewState0.a();
        int v = rect0 == null ? 0 : rect0.left;
        int v1 = rect0 == null ? 0 : rect0.right;
        return rect0 == null ? new Rect(v, 0, v1, 0) : new Rect(v, 0, v1, rect0.top);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public a c() {
        return A.d0();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.i
    public a d() {
        return u.d0();
    }
}

