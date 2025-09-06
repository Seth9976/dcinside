package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class v extends AdapterDataObserver implements k {
    private LayoutManager a;
    private boolean b;
    private int c;
    private int d;
    private boolean e;
    private Integer f;
    private int g;
    private Integer h;
    private int i;

    public v(LayoutManager recyclerView$LayoutManager0) {
        this.f = null;
        this.g = 0;
        this.h = null;
        this.i = 0;
        this.a = recyclerView$LayoutManager0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.k
    public void a() {
        this.g = this.a.R0();
        this.i = this.a.x0();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.k
    public void b(RecyclerView recyclerView0) {
        class a implements Runnable {
            final RecyclerView a;
            final v b;

            a(RecyclerView recyclerView0) {
                this.a = recyclerView0;
                super();
            }

            // 检测为 Lambda 实现
            private void b() [...]

            @Override
            public void run() {
                class com.beloo.widget.chipslayoutmanager.layouter.v.a.a implements ItemAnimatorFinishedListener {
                    final a a;

                    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener
                    public void a() {
                        a.this.b();
                    }
                }

                if(this.a.getItemAnimator() != null) {
                    com.beloo.widget.chipslayoutmanager.layouter.v.a.a v$a$a0 = () -> {
                        v.this.b = false;
                        v.this.a.g2();
                    };
                    this.a.getItemAnimator().r(v$a$a0);
                    return;
                }
                this.b();
            }
        }

        this.a.U1(new a(this, recyclerView0));
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.k
    public void c(boolean z) {
        this.e = z;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.k
    public boolean d() {
        return this.e;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.k
    public int getMeasuredHeight() {
        return this.d;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.k
    public int getMeasuredWidth() {
        return this.c;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    @CallSuper
    public void l(int v, int v1) {
        super.l(v, v1);
        this.b = true;
        this.f = this.g;
        this.h = this.i;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.k
    @CallSuper
    public void measure(int v, int v1) {
        if(this.p()) {
            this.r(Math.max(v, ((int)this.f)));
            this.q(Math.max(v1, ((int)this.h)));
            return;
        }
        this.r(v);
        this.q(v1);
    }

    boolean p() {
        return this.b;
    }

    private void q(int v) {
        this.d = v;
    }

    private void r(int v) {
        this.c = v;
    }
}

