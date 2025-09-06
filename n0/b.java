package n0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.L;
import y4.l;

public final class b extends a {
    public b(@l Context context0) {
        L.p(context0, "context");
        super(context0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void d(@l Rect rect0, @l View view0, @l RecyclerView recyclerView0, @l State recyclerView$State0) {
        L.p(rect0, "outRect");
        L.p(view0, "view");
        L.p(recyclerView0, "parent");
        L.p(recyclerView$State0, "state");
        rect0.set(0, 0, this.l().getIntrinsicWidth(), 0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void f(@l Canvas canvas0, @l RecyclerView recyclerView0, @l State recyclerView$State0) {
        L.p(canvas0, "c");
        L.p(recyclerView0, "parent");
        L.p(recyclerView$State0, "state");
        int v = recyclerView0.getPaddingTop();
        int v1 = recyclerView0.getHeight();
        int v2 = recyclerView0.getPaddingBottom();
        int v3 = recyclerView0.getChildCount();
        int v4 = this.l().getIntrinsicWidth();
        for(int v5 = 0; v5 < v3 - 1; ++v5) {
            View view0 = recyclerView0.getChildAt(v5);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int v6 = view0.getRight() + ((LayoutParams)viewGroup$LayoutParams0).rightMargin;
            this.l().setBounds(v6, v, v6 + v4, v1 - v2);
            this.l().draw(canvas0);
        }
    }
}

