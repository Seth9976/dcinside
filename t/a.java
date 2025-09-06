package T;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;

public class a extends ItemDecoration {
    private Drawable a;
    private int b;
    private static final int[] c = null;
    public static final int d = 0;
    public static final int e = 1;

    static {
        a.c = new int[]{0x1010214};
    }

    public a(Context context0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(a.c);
        this.a = typedArray0.getDrawable(0);
        typedArray0.recycle();
        this.n(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void d(Rect rect0, View view0, RecyclerView recyclerView0, State recyclerView$State0) {
        if(this.b == 1) {
            rect0.set(0, 0, 0, this.a.getIntrinsicHeight());
            return;
        }
        rect0.set(0, 0, this.a.getIntrinsicWidth(), 0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void f(Canvas canvas0, RecyclerView recyclerView0, State recyclerView$State0) {
        if(this.b == 1) {
            this.m(canvas0, recyclerView0);
            return;
        }
        this.l(canvas0, recyclerView0);
    }

    public void l(Canvas canvas0, RecyclerView recyclerView0) {
        int v = recyclerView0.getPaddingTop();
        int v1 = recyclerView0.getHeight();
        int v2 = recyclerView0.getPaddingBottom();
        int v3 = recyclerView0.getChildCount();
        for(int v4 = 0; v4 < v3; ++v4) {
            View view0 = recyclerView0.getChildAt(v4);
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v5 = view0.getRight() + recyclerView$LayoutParams0.rightMargin;
            int v6 = this.a.getIntrinsicHeight();
            this.a.setBounds(v5, v, v6 + v5, v1 - v2);
            this.a.draw(canvas0);
        }
    }

    public void m(Canvas canvas0, RecyclerView recyclerView0) {
        int v = recyclerView0.getPaddingLeft();
        int v1 = recyclerView0.getWidth();
        int v2 = recyclerView0.getPaddingRight();
        int v3 = recyclerView0.getChildCount();
        for(int v4 = 0; v4 < v3; ++v4) {
            View view0 = recyclerView0.getChildAt(v4);
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v5 = view0.getBottom() + recyclerView$LayoutParams0.bottomMargin;
            int v6 = this.a.getIntrinsicHeight();
            this.a.setBounds(v, v5, v1 - v2, v6 + v5);
            this.a.draw(canvas0);
        }
    }

    public void n(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        this.b = v;
    }
}

