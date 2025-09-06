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
import kotlin.jvm.internal.w;
import y4.l;

public final class d extends a {
    public static final class n0.d.a {
        private n0.d.a() {
        }

        public n0.d.a(w w0) {
        }

        public final void a(@l View view0, boolean z) {
            L.p(view0, "view");
            if(z) {
                view0.setTag(0x7F0B1048, Boolean.TRUE);  // id:vertical_divider_item_decorator_skip
                return;
            }
            view0.setTag(0x7F0B1048, null);  // id:vertical_divider_item_decorator_skip
        }
    }

    @l
    public static final n0.d.a b = null;
    private static final boolean c = true;

    static {
        d.b = new n0.d.a(null);
    }

    public d(@l Context context0) {
        L.p(context0, "context");
        super(context0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void d(@l Rect rect0, @l View view0, @l RecyclerView recyclerView0, @l State recyclerView$State0) {
        L.p(rect0, "outRect");
        L.p(view0, "view");
        L.p(recyclerView0, "parent");
        L.p(recyclerView$State0, "state");
        rect0.set(0, 0, 0, this.l().getIntrinsicHeight());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void f(@l Canvas canvas0, @l RecyclerView recyclerView0, @l State recyclerView$State0) {
        L.p(canvas0, "c");
        L.p(recyclerView0, "parent");
        L.p(recyclerView$State0, "state");
        int v = recyclerView0.getPaddingLeft();
        int v1 = recyclerView0.getWidth();
        int v2 = recyclerView0.getPaddingRight();
        int v3 = recyclerView0.getChildCount();
        int v4 = this.l().getIntrinsicHeight();
        for(int v5 = 0; v5 < v3 - 1; ++v5) {
            View view0 = recyclerView0.getChildAt(v5);
            if(!L.g(view0.getTag(0x7F0B1048), Boolean.TRUE)) {  // id:vertical_divider_item_decorator_skip
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int v6 = view0.getBottom() + ((LayoutParams)viewGroup$LayoutParams0).bottomMargin;
                this.l().setBounds(v, v6, v1 - v2, v6 + v4);
                this.l().draw(canvas0);
            }
        }
    }
}

