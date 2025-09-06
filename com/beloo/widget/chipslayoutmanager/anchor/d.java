package com.beloo.widget.chipslayoutmanager.anchor;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.beloo.widget.chipslayoutmanager.b;
import com.beloo.widget.chipslayoutmanager.layouter.g;

public class d extends a {
    private b c;

    public d(LayoutManager recyclerView$LayoutManager0, g g0) {
        super(recyclerView$LayoutManager0, g0);
        this.c = new b(recyclerView$LayoutManager0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.anchor.a
    public AnchorViewState a() {
        return super.a();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.anchor.c
    public AnchorViewState b() {
        AnchorViewState anchorViewState0 = AnchorViewState.c();
        int v = 0x7FFFFFFF;
        int v1 = 0x7FFFFFFF;
        for(Object object0: this.c) {
            AnchorViewState anchorViewState1 = this.d(((View)object0));
            int v2 = this.a.K0(((View)object0));
            int v3 = this.a.v0(((View)object0));
            if(this.e().s(new Rect(anchorViewState1.a())) && !anchorViewState1.f()) {
                if(v1 > v2) {
                    anchorViewState0 = anchorViewState1;
                    v1 = v2;
                }
                if(v > v3) {
                    v = v3;
                }
            }
        }
        if(!anchorViewState0.e()) {
            anchorViewState0.a().top = v;
            anchorViewState0.h(v1);
        }
        return anchorViewState0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.anchor.c
    public void c(AnchorViewState anchorViewState0) {
        if(!anchorViewState0.e()) {
            Rect rect0 = anchorViewState0.a();
            rect0.left = this.e().d();
            rect0.right = this.e().o();
        }
    }
}

