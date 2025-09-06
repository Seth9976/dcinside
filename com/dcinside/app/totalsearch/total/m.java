package com.dcinside.app.totalsearch.total;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.util.vk;

class m extends ItemDecoration {
    private Drawable a;

    m(Context context0) {
        this.a = vk.e(context0, 0x7F040242);  // attr:divide_n
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void d(Rect rect0, View view0, RecyclerView recyclerView0, State recyclerView$State0) {
        super.d(rect0, view0, recyclerView0, recyclerView$State0);
        int v = recyclerView0.getChildAdapterPosition(view0);
        d d0 = (d)recyclerView0.getAdapter();
        switch(d0.getItemViewType(v)) {
            case 1: 
            case 4: 
            case 5: 
            case 6: {
                break;
            }
            default: {
                if(!d0.A(v) && !d0.B(v)) {
                    rect0.set(0, 0, 0, this.a.getIntrinsicHeight());
                    return;
                }
            }
        }
        rect0.set(0, 0, 0, 0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void f(Canvas canvas0, RecyclerView recyclerView0, State recyclerView$State0) {
        super.f(canvas0, recyclerView0, recyclerView$State0);
        this.l(canvas0, recyclerView0);
    }

    private void l(Canvas canvas0, RecyclerView recyclerView0) {
        int v = recyclerView0.getPaddingLeft();
        int v1 = recyclerView0.getWidth();
        int v2 = recyclerView0.getPaddingRight();
        d d0 = (d)recyclerView0.getAdapter();
        int v3 = recyclerView0.getChildCount();
        int v4 = this.a.getIntrinsicHeight();
        for(int v5 = 0; v5 < v3 - 1; ++v5) {
            View view0 = recyclerView0.getChildAt(v5);
            int v6 = recyclerView0.getChildAdapterPosition(view0);
            if(view0.getTag(0x7F0B0FCD) == null && !d0.A(v6) && !d0.B(v6)) {  // id:total_search_section_view
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                int v7 = view0.getBottom() + recyclerView$LayoutParams0.bottomMargin;
                this.a.setBounds(v, v7, v1 - v2, v7 + v4);
                this.a.draw(canvas0);
            }
        }
    }
}

