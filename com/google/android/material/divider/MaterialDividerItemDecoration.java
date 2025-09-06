package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;
import com.google.android.material.resources.d;

public class MaterialDividerItemDecoration extends ItemDecoration {
    @NonNull
    private Drawable a;
    private int b;
    @ColorInt
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private final Rect h;
    public static final int i = 0;
    public static final int j = 1;
    private static final int k;

    static {
        MaterialDividerItemDecoration.k = style.Widget_MaterialComponents_MaterialDivider;
    }

    public MaterialDividerItemDecoration(@NonNull Context context0, int v) {
        this(context0, null, v);
    }

    public MaterialDividerItemDecoration(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, attr.materialDividerStyle, v);
    }

    public MaterialDividerItemDecoration(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        this.h = new Rect();
        TypedArray typedArray0 = D.k(context0, attributeSet0, styleable.MaterialDivider, v, MaterialDividerItemDecoration.k, new int[0]);
        this.c = d.a(context0, typedArray0, styleable.MaterialDivider_dividerColor).getDefaultColor();
        int v2 = context0.getResources().getDimensionPixelSize(dimen.material_divider_thickness);
        this.b = typedArray0.getDimensionPixelSize(styleable.MaterialDivider_dividerThickness, v2);
        this.e = typedArray0.getDimensionPixelOffset(styleable.MaterialDivider_dividerInsetStart, 0);
        this.f = typedArray0.getDimensionPixelOffset(styleable.MaterialDivider_dividerInsetEnd, 0);
        this.g = typedArray0.getBoolean(styleable.MaterialDivider_lastItemDecorated, true);
        typedArray0.recycle();
        this.a = new ShapeDrawable();
        this.t(this.c);
        this.C(v1);
    }

    public void A(@NonNull Context context0, @DimenRes int v) {
        this.z(context0.getResources().getDimensionPixelSize(v));
    }

    public void B(boolean z) {
        this.g = z;
    }

    public void C(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("Invalid orientation: " + v + ". It should be either HORIZONTAL or VERTICAL");
        }
        this.d = v;
    }

    protected boolean D(int v, @Nullable Adapter recyclerView$Adapter0) [...] // Inlined contents

    private boolean E(@NonNull RecyclerView recyclerView0, @NonNull View view0) {
        int v = recyclerView0.getChildAdapterPosition(view0);
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        return v != -1 && (recyclerView$Adapter0 == null || v != recyclerView$Adapter0.getItemCount() - 1 || this.g);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void d(@NonNull Rect rect0, @NonNull View view0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
        rect0.set(0, 0, 0, 0);
        if(this.E(recyclerView0, view0)) {
            if(this.d == 1) {
                rect0.bottom = this.b;
                return;
            }
            if(M.s(recyclerView0)) {
                rect0.left = this.b;
                return;
            }
            rect0.right = this.b;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void f(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
        if(recyclerView0.getLayoutManager() == null) {
            return;
        }
        if(this.d == 1) {
            this.m(canvas0, recyclerView0);
            return;
        }
        this.l(canvas0, recyclerView0);
    }

    private void l(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0) {
        int v8;
        int v7;
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
        int v3 = v1 + this.e;
        int v4 = v2 - this.f;
        boolean z = M.s(recyclerView0);
        int v5 = recyclerView0.getChildCount();
        for(int v = 0; v < v5; ++v) {
            View view0 = recyclerView0.getChildAt(v);
            if(this.E(recyclerView0, view0)) {
                recyclerView0.getLayoutManager().q0(view0, this.h);
                int v6 = Math.round(view0.getTranslationX());
                if(z) {
                    v7 = this.h.left + v6;
                    v8 = this.b + v7;
                }
                else {
                    v8 = v6 + this.h.right;
                    v7 = v8 - this.b;
                }
                this.a.setBounds(v7, v3, v8, v4);
                int v9 = Math.round(view0.getAlpha() * 255.0f);
                this.a.setAlpha(v9);
                this.a.draw(canvas0);
            }
        }
        canvas0.restore();
    }

    private void m(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0) {
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
        boolean z = M.s(recyclerView0);
        int v3 = z ? this.f : this.e;
        int v4 = z ? this.e : this.f;
        int v5 = recyclerView0.getChildCount();
        for(int v = 0; v < v5; ++v) {
            View view0 = recyclerView0.getChildAt(v);
            if(this.E(recyclerView0, view0)) {
                recyclerView0.getLayoutManager().q0(view0, this.h);
                int v6 = this.h.bottom;
                int v7 = Math.round(view0.getTranslationY());
                this.a.setBounds(v1 + v3, v6 + v7 - this.b, v2 - v4, v6 + v7);
                int v8 = Math.round(view0.getAlpha() * 255.0f);
                this.a.setAlpha(v8);
                this.a.draw(canvas0);
            }
        }
        canvas0.restore();
    }

    @ColorInt
    public int n() {
        return this.c;
    }

    @Px
    public int o() {
        return this.f;
    }

    @Px
    public int p() {
        return this.e;
    }

    @Px
    public int q() {
        return this.b;
    }

    public int r() {
        return this.d;
    }

    public boolean s() {
        return this.g;
    }

    public void t(@ColorInt int v) {
        this.c = v;
        Drawable drawable0 = DrawableCompat.r(this.a);
        this.a = drawable0;
        DrawableCompat.n(drawable0, v);
    }

    public void u(@NonNull Context context0, @ColorRes int v) {
        this.t(ContextCompat.getColor(context0, v));
    }

    public void v(@Px int v) {
        this.f = v;
    }

    public void w(@NonNull Context context0, @DimenRes int v) {
        this.v(context0.getResources().getDimensionPixelOffset(v));
    }

    public void x(@Px int v) {
        this.e = v;
    }

    public void y(@NonNull Context context0, @DimenRes int v) {
        this.x(context0.getResources().getDimensionPixelOffset(v));
    }

    public void z(@Px int v) {
        this.b = v;
    }
}

