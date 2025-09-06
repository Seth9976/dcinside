package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerfastscroll.R.attr;
import com.futuremind.recyclerfastscroll.R.styleable;
import com.futuremind.recyclerviewfastscroll.viewprovider.c;

public class FastScroller extends LinearLayout {
    private final a a;
    private RecyclerView b;
    private View c;
    private View d;
    private TextView e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private c m;
    private b n;
    private static final int o = -1;

    public FastScroller(Context context0) {
        this(context0, null);
    }

    public FastScroller(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public FastScroller(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new a(this);
        this.setClipChildren(false);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.fastscroll__fastScroller, attr.fastscroll__style, 0);
        try {
            this.h = typedArray0.getColor(styleable.fastscroll__fastScroller_fastscroll__bubbleColor, -1);
            this.g = typedArray0.getColor(styleable.fastscroll__fastScroller_fastscroll__handleColor, -1);
            this.i = typedArray0.getResourceId(styleable.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);
        }
        finally {
            typedArray0.recycle();
        }
        this.k = this.getVisibility();
    }

    public void g(com.futuremind.recyclerviewfastscroll.a.a a$a0) {
        this.a.a(a$a0);
    }

    c getViewProvider() {
        return this.m;
    }

    private void h() {
        int v = this.h;
        if(v != -1) {
            this.n(this.e, v);
        }
        int v1 = this.g;
        if(v1 != -1) {
            this.n(this.d, v1);
        }
        int v2 = this.i;
        if(v2 != -1) {
            TextViewCompat.D(this.e, v2);
        }
    }

    // 去混淆评级： 低(20)
    private float i(MotionEvent motionEvent0) {
        return this.m() ? (motionEvent0.getRawY() - com.futuremind.recyclerviewfastscroll.c.c(this.d)) / ((float)(this.getHeight() - this.d.getHeight())) : (motionEvent0.getRawX() - com.futuremind.recyclerviewfastscroll.c.b(this.d)) / ((float)(this.getWidth() - this.d.getWidth()));
    }

    private void j() {
        class com.futuremind.recyclerviewfastscroll.FastScroller.b implements View.OnTouchListener {
            final FastScroller a;

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                FastScroller.this.requestDisallowInterceptTouchEvent(true);
                switch(motionEvent0.getAction()) {
                    case 1: {
                        FastScroller.this.l = false;
                        if(FastScroller.this.n != null) {
                            FastScroller.this.m.g();
                        }
                        return true;
                    }
                    case 0: 
                    case 2: {
                        if(FastScroller.this.n != null && motionEvent0.getAction() == 0) {
                            FastScroller.this.m.f();
                        }
                        FastScroller.this.l = true;
                        float f = FastScroller.this.i(motionEvent0);
                        FastScroller.this.setScrollerPosition(f);
                        FastScroller.this.setRecyclerViewPosition(f);
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }
        }

        this.d.setOnTouchListener(new com.futuremind.recyclerviewfastscroll.FastScroller.b(this));
    }

    private void k() {
        if(this.b.getAdapter() != null && this.b.getAdapter().getItemCount() != 0 && this.b.getChildAt(0) != null && !this.l() && this.k == 0) {
            super.setVisibility(0);
            return;
        }
        super.setVisibility(4);
    }

    // 去混淆评级： 低(20)
    private boolean l() {
        return this.m() ? this.b.getChildAt(0).getHeight() * this.b.getAdapter().getItemCount() <= this.b.getHeight() : this.b.getChildAt(0).getWidth() * this.b.getAdapter().getItemCount() <= this.b.getWidth();
    }

    public boolean m() {
        return this.j == 1;
    }

    private void n(View view0, int v) {
        Drawable drawable0 = DrawableCompat.r(view0.getBackground());
        if(drawable0 == null) {
            return;
        }
        DrawableCompat.n(drawable0.mutate(), v);
        com.futuremind.recyclerviewfastscroll.c.d(view0, drawable0);
    }

    boolean o() {
        return this.d != null && !this.l && this.b.getChildCount() > 0;
    }

    @Override  // android.widget.LinearLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.j();
        this.f = this.m.b();
        this.h();
        this.a.c(this.b);
    }

    public void setBubbleColor(int v) {
        this.h = v;
        this.invalidate();
    }

    public void setBubbleTextAppearance(int v) {
        this.i = v;
        this.invalidate();
    }

    public void setHandleColor(int v) {
        this.g = v;
        this.invalidate();
    }

    @Override  // android.widget.LinearLayout
    public void setOrientation(int v) {
        this.j = v;
        super.setOrientation((v == 0 ? 1 : 0));
    }

    public void setRecyclerView(RecyclerView recyclerView0) {
        class com.futuremind.recyclerviewfastscroll.FastScroller.a implements ViewGroup.OnHierarchyChangeListener {
            final FastScroller a;

            @Override  // android.view.ViewGroup$OnHierarchyChangeListener
            public void onChildViewAdded(View view0, View view1) {
                FastScroller.this.k();
            }

            @Override  // android.view.ViewGroup$OnHierarchyChangeListener
            public void onChildViewRemoved(View view0, View view1) {
                FastScroller.this.k();
            }
        }

        this.b = recyclerView0;
        if(this.m == null) {
            this.setViewProvider(new com.futuremind.recyclerviewfastscroll.viewprovider.b());
        }
        if(recyclerView0.getAdapter() instanceof b) {
            this.n = (b)recyclerView0.getAdapter();
        }
        recyclerView0.addOnScrollListener(this.a);
        this.k();
        recyclerView0.setOnHierarchyChangeListener(new com.futuremind.recyclerviewfastscroll.FastScroller.a(this));
    }

    private void setRecyclerViewPosition(float f) {
        RecyclerView recyclerView0 = this.b;
        if(recyclerView0 == null) {
            return;
        }
        int v = recyclerView0.getAdapter().getItemCount();
        int v1 = (int)com.futuremind.recyclerviewfastscroll.c.a(0.0f, v - 1, ((int)(f * ((float)v))));
        this.b.scrollToPosition(v1);
        b b0 = this.n;
        if(b0 != null) {
            TextView textView0 = this.e;
            if(textView0 != null) {
                textView0.setText(b0.p(v1));
            }
        }
    }

    void setScrollerPosition(float f) {
        if(this.m()) {
            this.c.setY(com.futuremind.recyclerviewfastscroll.c.a(0.0f, this.getHeight() - this.c.getHeight(), ((float)(this.getHeight() - this.d.getHeight())) * f + ((float)this.f)));
            this.d.setY(com.futuremind.recyclerviewfastscroll.c.a(0.0f, this.getHeight() - this.d.getHeight(), f * ((float)(this.getHeight() - this.d.getHeight()))));
            return;
        }
        this.c.setX(com.futuremind.recyclerviewfastscroll.c.a(0.0f, this.getWidth() - this.c.getWidth(), ((float)(this.getWidth() - this.d.getWidth())) * f + ((float)this.f)));
        this.d.setX(com.futuremind.recyclerviewfastscroll.c.a(0.0f, this.getWidth() - this.d.getWidth(), f * ((float)(this.getWidth() - this.d.getWidth()))));
    }

    public void setViewProvider(c c0) {
        this.removeAllViews();
        this.m = c0;
        c0.o(this);
        this.c = c0.l(this);
        this.d = c0.n(this);
        this.e = c0.k();
        this.addView(this.c);
        this.addView(this.d);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        this.k = v;
        this.k();
    }
}

