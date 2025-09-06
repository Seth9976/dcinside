package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DividerItemDecoration extends ItemDecoration {
    private Drawable a;
    private int b;
    private final Rect c;
    public static final int d = 0;
    public static final int e = 1;
    private static final String f = "DividerItem";
    private static final int[] g;

    static {
        DividerItemDecoration.g = new int[]{0x1010214};
    }

    @SuppressLint({"UnknownNullness"})
    public DividerItemDecoration(Context context0, int v) {
        this.c = new Rect();
        TypedArray typedArray0 = context0.obtainStyledAttributes(DividerItemDecoration.g);
        Drawable drawable0 = typedArray0.getDrawable(0);
        this.a = drawable0;
        if(drawable0 == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArray0.recycle();
        this.p(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void d(Rect rect0, View view0, RecyclerView recyclerView0, State recyclerView$State0) {
        Drawable drawable0 = this.a;
        if(drawable0 == null) {
            rect0.set(0, 0, 0, 0);
            return;
        }
        if(this.b == 1) {
            rect0.set(0, 0, 0, drawable0.getIntrinsicHeight());
            return;
        }
        rect0.set(0, 0, drawable0.getIntrinsicWidth(), 0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void f(Canvas canvas0, RecyclerView recyclerView0, State recyclerView$State0) {
        if(recyclerView0.getLayoutManager() != null && this.a != null) {
            if(this.b == 1) {
                this.m(canvas0, recyclerView0);
                return;
            }
            this.l(canvas0, recyclerView0);
        }
    }

    private void l(Canvas canvas0, RecyclerView recyclerView0) {
        int v2;
        int v1;
        canvas0.save();
        if(recyclerView0.getClipToPadding()) {
            v1 = recyclerView0.getPaddingTop();
            v2 = recyclerView0.getHeight() - recyclerView0.getPaddingBottom();
            canvas0.clipRect(recyclerView0.getPaddingLeft(), v1, recyclerView0.getWidth() - recyclerView0.getPaddingRight(), v2);
        }
        else {
            v2 = recyclerView0.getHeight();
            v1 = 0;
        }
        int v3 = recyclerView0.getChildCount();
        for(int v = 0; v < v3; ++v) {
            View view0 = recyclerView0.getChildAt(v);
            recyclerView0.getLayoutManager().q0(view0, this.c);
            int v4 = this.c.right;
            int v5 = Math.round(view0.getTranslationX());
            int v6 = this.a.getIntrinsicWidth();
            this.a.setBounds(v4 + v5 - v6, v1, v4 + v5, v2);
            this.a.draw(canvas0);
        }
        canvas0.restore();
    }

    private void m(Canvas canvas0, RecyclerView recyclerView0) {
        int v2;
        int v1;
        canvas0.save();
        if(recyclerView0.getClipToPadding()) {
            v1 = recyclerView0.getPaddingLeft();
            v2 = recyclerView0.getWidth() - recyclerView0.getPaddingRight();
            canvas0.clipRect(v1, recyclerView0.getPaddingTop(), v2, recyclerView0.getHeight() - recyclerView0.getPaddingBottom());
        }
        else {
            v2 = recyclerView0.getWidth();
            v1 = 0;
        }
        int v3 = recyclerView0.getChildCount();
        for(int v = 0; v < v3; ++v) {
            View view0 = recyclerView0.getChildAt(v);
            recyclerView0.getDecoratedBoundsWithMargins(view0, this.c);
            int v4 = this.c.bottom;
            int v5 = Math.round(view0.getTranslationY());
            int v6 = this.a.getIntrinsicHeight();
            this.a.setBounds(v1, v4 + v5 - v6, v2, v4 + v5);
            this.a.draw(canvas0);
        }
        canvas0.restore();
    }

    @Nullable
    public Drawable n() {
        return this.a;
    }

    public void o(@NonNull Drawable drawable0) {
        if(drawable0 == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.a = drawable0;
    }

    public void p(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.b = v;
    }
}

