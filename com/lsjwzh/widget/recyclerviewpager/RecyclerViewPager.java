package com.lsjwzh.widget.recyclerviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.R.styleable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewPager extends RecyclerView {
    public interface c {
        void a(int arg1, int arg2);
    }

    boolean a;
    int b;
    int c;
    View d;
    int e;
    int f;
    int g;
    int h;
    private d i;
    private float j;
    private float k;
    private float l;
    private List m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private boolean r;
    private boolean s;

    public RecyclerViewPager(Context context0) {
        this(context0, null);
    }

    public RecyclerViewPager(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public RecyclerViewPager(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.e = 0x80000000;
        this.f = 0x7FFFFFFF;
        this.g = 0x80000000;
        this.h = 0x7FFFFFFF;
        this.j = 0.25f;
        this.k = 0.15f;
        this.n = -1;
        this.o = -1;
        this.q = -1;
        this.r = true;
        this.s = false;
        this.a0(context0, attributeSet0, v);
        this.setNestedScrollingEnabled(false);
    }

    public void U(c recyclerViewPager$c0) {
        if(this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(recyclerViewPager$c0);
    }

    protected void V(int v) {
        if(this.s) {
            v = -v;
        }
        if(this.getChildCount() > 0) {
            int v1 = e.b(this);
            int v2 = this.Z(v, this.getWidth() - this.getPaddingLeft() - this.getPaddingRight());
            int v3 = v1 + v2;
            if(this.p) {
                int v4 = Math.max(-1, Math.min(1, v2));
                v3 = v4 == 0 ? v1 : this.q + v4;
            }
            int v5 = Math.min(Math.max(v3, 0), this.i.getItemCount() - 1);
            if(v5 == v1 && (!this.p || this.q == v1)) {
                View view0 = e.a(this);
                if(view0 != null) {
                    if(this.l <= ((float)view0.getWidth()) * this.j * this.j || v5 == 0) {
                        if(this.l < ((float)view0.getWidth()) * -this.j && v5 != this.i.getItemCount() - 1) {
                            v5 = this.s ? v5 - 1 : v5 + 1;
                        }
                    }
                    else if(this.s) {
                        ++v5;
                    }
                    else {
                        --v5;
                    }
                }
            }
            this.smoothScrollToPosition(this.d0(v5, this.i.getItemCount()));
        }
    }

    protected void W(int v) {
        if(this.s) {
            v = -v;
        }
        if(this.getChildCount() > 0) {
            int v1 = e.d(this);
            int v2 = this.Z(v, this.getHeight() - this.getPaddingTop() - this.getPaddingBottom());
            int v3 = v1 + v2;
            if(this.p) {
                int v4 = Math.max(-1, Math.min(1, v2));
                v3 = v4 == 0 ? v1 : this.q + v4;
            }
            int v5 = Math.min(Math.max(v3, 0), this.i.getItemCount() - 1);
            if(v5 == v1 && (!this.p || this.q == v1)) {
                View view0 = e.c(this);
                if(view0 != null) {
                    if(this.l <= ((float)view0.getHeight()) * this.j || v5 == 0) {
                        if(this.l < ((float)view0.getHeight()) * -this.j && v5 != this.i.getItemCount() - 1) {
                            v5 = this.s ? v5 - 1 : v5 + 1;
                        }
                    }
                    else if(this.s) {
                        ++v5;
                    }
                    else {
                        --v5;
                    }
                }
            }
            this.smoothScrollToPosition(this.d0(v5, this.i.getItemCount()));
        }
    }

    public void X() {
        List list0 = this.m;
        if(list0 != null) {
            list0.clear();
        }
    }

    @Nullable
    protected d Y(Adapter recyclerView$Adapter0) {
        if(recyclerView$Adapter0 == null) {
            return null;
        }
        return recyclerView$Adapter0 instanceof d ? ((d)recyclerView$Adapter0) : new d(this, recyclerView$Adapter0);
    }

    private int Z(int v, int v1) {
        if(v == 0) {
            return 0;
        }
        return v <= 0 ? ((int)(-1.0 * Math.ceil(((float)(-v)) * this.k / ((float)v1) - this.j))) : ((int)(1.0 * Math.ceil(((float)v) * this.k / ((float)v1) - this.j)));
    }

    private void a0(Context context0, AttributeSet attributeSet0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RecyclerViewPager, v, 0);
        this.k = typedArray0.getFloat(0, 0.15f);
        this.j = typedArray0.getFloat(2, 0.25f);
        this.p = typedArray0.getBoolean(1, this.p);
        typedArray0.recycle();
    }

    public boolean b0() {
        return this.p;
    }

    public void c0(c recyclerViewPager$c0) {
        List list0 = this.m;
        if(list0 != null) {
            list0.remove(recyclerViewPager$c0);
        }
    }

    private int d0(int v, int v1) {
        if(v < 0) {
            return 0;
        }
        return v < v1 ? v : v1 - 1;
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0 && this.getLayoutManager() != null) {
            this.q = this.getLayoutManager().G() ? e.b(this) : e.d(this);
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int v, int v1) {
        boolean z = super.fling(((int)(((float)v) * this.k)), ((int)(((float)v1) * this.k)));
        if(z) {
            if(this.getLayoutManager().G()) {
                this.V(v);
                return true;
            }
            this.W(v1);
        }
        return z;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public Adapter getAdapter() {
        return this.i == null ? null : this.i.b;
    }

    public int getCurrentPosition() {
        if(this.getLayoutManager() == null) {
            return -1;
        }
        int v = this.getLayoutManager().G() ? e.b(this) : e.d(this);
        return v >= 0 ? v : this.n;
    }

    public float getFlingFactor() {
        return this.k;
    }

    public float getTriggerOffset() {
        return this.j;
    }

    public d getWrapperAdapter() {
        return this.i;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        try {
            Field field0 = parcelable0.getClass().getDeclaredField("mLayoutState");
            field0.setAccessible(true);
            Object object0 = field0.get(parcelable0);
            Field field1 = object0.getClass().getDeclaredField("mAnchorOffset");
            Field field2 = object0.getClass().getDeclaredField("mAnchorPosition");
            field2.setAccessible(true);
            field1.setAccessible(true);
            if(field1.getInt(object0) > 0) {
                field2.set(object0, ((int)(field2.getInt(object0) - 1)));
            }
            else if(field1.getInt(object0) < 0) {
                field2.set(object0, ((int)(field2.getInt(object0) + 1)));
            }
            field1.setInt(object0, 0);
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int v) {
        super.onScrollStateChanged(v);
        int v1 = 0;
        if(v == 1) {
            this.a = true;
            View view0 = this.getLayoutManager().G() ? e.a(this) : e.c(this);
            this.d = view0;
            if(view0 == null) {
                this.o = -1;
            }
            else {
                if(this.r) {
                    this.o = this.getChildLayoutPosition(view0);
                    this.r = false;
                }
                this.b = this.d.getLeft();
                this.c = this.d.getTop();
            }
            this.l = 0.0f;
            return;
        }
        switch(v) {
            case 0: {
                if(this.a) {
                    int v2 = this.getLayoutManager().G() ? e.b(this) : e.d(this);
                    View view1 = this.d;
                    if(view1 != null) {
                        v2 = this.getChildAdapterPosition(view1);
                        if(this.getLayoutManager().G()) {
                            float f = (float)(this.d.getLeft() - this.b);
                            if(f <= ((float)this.d.getWidth()) * this.j || this.d.getLeft() < this.e) {
                                if(f < ((float)this.d.getWidth()) * -this.j && this.d.getLeft() <= this.f) {
                                    if(this.s) {
                                        --v2;
                                    }
                                    else {
                                        ++v2;
                                    }
                                }
                            }
                            else if(this.s) {
                                ++v2;
                            }
                            else {
                                --v2;
                            }
                        }
                        else {
                            float f1 = (float)(this.d.getTop() - this.c);
                            if(f1 <= ((float)this.d.getHeight()) * this.j || this.d.getTop() < this.g) {
                                if(f1 < ((float)this.d.getHeight()) * -this.j && this.d.getTop() <= this.h) {
                                    v2 = this.s ? v2 - 1 : v2 + 1;
                                }
                            }
                            else if(this.s) {
                                ++v2;
                            }
                            else {
                                --v2;
                            }
                        }
                    }
                    d d0 = this.i;
                    if(d0 != null) {
                        try {
                            v1 = d0.getItemCount();
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                    this.smoothScrollToPosition(this.d0(v2, v1));
                    this.d = null;
                }
                else if(this.n != this.o) {
                    List list0 = this.m;
                    if(list0 != null) {
                        for(Object object0: list0) {
                            c recyclerViewPager$c0 = (c)object0;
                            if(recyclerViewPager$c0 != null) {
                                recyclerViewPager$c0.a(this.o, this.n);
                            }
                        }
                    }
                    this.r = true;
                    this.o = this.n;
                }
                this.e = 0x80000000;
                this.f = 0x7FFFFFFF;
                this.g = 0x80000000;
                this.h = 0x7FFFFFFF;
                return;
            }
            case 2: {
                this.a = false;
                if(this.d == null) {
                    this.l = 0.0f;
                }
                else if(this.getLayoutManager().G()) {
                    this.l = (float)(this.d.getLeft() - this.b);
                }
                else {
                    this.l = (float)(this.d.getTop() - this.c);
                }
                this.d = null;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 2) {
            View view0 = this.d;
            if(view0 != null) {
                this.e = Math.max(view0.getLeft(), this.e);
                this.g = Math.max(this.d.getTop(), this.g);
                this.f = Math.min(this.d.getLeft(), this.f);
                this.h = Math.min(this.d.getTop(), this.h);
            }
        }
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int v) {
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            final RecyclerViewPager a;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                RecyclerViewPager.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if(RecyclerViewPager.this.n >= 0 && RecyclerViewPager.this.n < RecyclerViewPager.this.i.getItemCount() && RecyclerViewPager.this.m != null) {
                    for(Object object0: RecyclerViewPager.this.m) {
                        c recyclerViewPager$c0 = (c)object0;
                        if(recyclerViewPager$c0 != null) {
                            recyclerViewPager$c0.a(RecyclerViewPager.this.o, RecyclerViewPager.this.getCurrentPosition());
                        }
                    }
                }
            }
        }

        this.o = this.getCurrentPosition();
        this.n = v;
        super.scrollToPosition(v);
        this.getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(Adapter recyclerView$Adapter0) {
        d d0 = this.Y(recyclerView$Adapter0);
        this.i = d0;
        super.setAdapter(d0);
    }

    public void setFlingFactor(float f) {
        this.k = f;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(LayoutManager recyclerView$LayoutManager0) {
        super.setLayoutManager(recyclerView$LayoutManager0);
        if(recyclerView$LayoutManager0 instanceof LinearLayoutManager) {
            this.s = ((LinearLayoutManager)recyclerView$LayoutManager0).d3();
        }
    }

    public void setSinglePageFling(boolean z) {
        this.p = z;
    }

    public void setTriggerOffset(float f) {
        this.j = f;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int v) {
        class a extends LinearSmoothScroller {
            a(Context context0) {
                super(context0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
            public PointF a(int v) {
                return this.e() == null ? null : ((LinearLayoutManager)this.e()).g(v);
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected void p(View view0, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
                if(this.e() == null) {
                    return;
                }
                int v = this.u(view0, this.A());
                int v1 = this.v(view0, this.C());
                int v2 = v <= 0 ? v + this.e().M0(view0) : v - this.e().B0(view0);
                int v3 = v1 <= 0 ? v1 + this.e().h0(view0) : v1 - this.e().P0(view0);
                int v4 = this.x(((int)Math.sqrt(v2 * v2 + v3 * v3)));
                if(v4 > 0) {
                    recyclerView$SmoothScroller$Action0.l(-v2, -v3, v4, this.j);
                }
            }
        }

        this.n = v;
        if(this.getLayoutManager() != null && this.getLayoutManager() instanceof LinearLayoutManager) {
            a recyclerViewPager$a0 = new a(this, this.getContext());
            recyclerViewPager$a0.q(v);
            if(v == -1) {
                return;
            }
            this.getLayoutManager().z2(recyclerViewPager$a0);
            return;
        }
        super.smoothScrollToPosition(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public void swapAdapter(Adapter recyclerView$Adapter0, boolean z) {
        d d0 = this.Y(recyclerView$Adapter0);
        this.i = d0;
        super.swapAdapter(d0, z);
    }
}

