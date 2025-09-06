package com.beloo.widget.chipslayoutmanager.anchor;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.beloo.widget.chipslayoutmanager.layouter.g;

public class b extends a {
    private com.beloo.widget.chipslayoutmanager.b c;

    public b(LayoutManager recyclerView$LayoutManager0, g g0) {
        super(recyclerView$LayoutManager0, g0);
        this.c = new com.beloo.widget.chipslayoutmanager.b(recyclerView$LayoutManager0);
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
        int v2 = 0x80000000;
        for(Object object0: this.c) {
            AnchorViewState anchorViewState1 = this.d(((View)object0));
            int v3 = this.a.K0(((View)object0));
            int v4 = this.a.r0(((View)object0));
            int v5 = this.a.u0(((View)object0));
            if(this.e().s(new Rect(anchorViewState1.a())) && !anchorViewState1.f()) {
                if(v1 > v3) {
                    anchorViewState0 = anchorViewState1;
                    v1 = v3;
                }
                if(v > v4) {
                    v2 = v5;
                    v = v4;
                }
                else if(v == v4) {
                    v2 = Math.max(v2, v5);
                }
            }
        }
        if(!anchorViewState0.e()) {
            anchorViewState0.a().left = v;
            anchorViewState0.a().right = v2;
            anchorViewState0.h(v1);
        }
        return anchorViewState0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.anchor.c
    public void c(AnchorViewState anchorViewState0) {
        if(!anchorViewState0.e()) {
            Rect rect0 = anchorViewState0.a();
            rect0.top = this.e().m();
            rect0.bottom = this.e().A();
        }
    }
}

