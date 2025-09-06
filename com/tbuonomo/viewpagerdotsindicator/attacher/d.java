package com.tbuonomo.viewpagerdotsindicator.attacher;

import A3.a;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import androidx.viewpager2.widget.ViewPager2;
import com.tbuonomo.viewpagerdotsindicator.f;
import com.tbuonomo.viewpagerdotsindicator.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

public final class d extends b {
    @Override  // com.tbuonomo.viewpagerdotsindicator.attacher.b
    public com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b a(Object object0, Object object1) {
        return this.e(((ViewPager2)object0), ((Adapter)object1));
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.attacher.b
    public Object b(Object object0) {
        return this.f(((ViewPager2)object0));
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.attacher.b
    public void c(Object object0, Object object1, a a0) {
        this.g(((ViewPager2)object0), ((Adapter)object1), a0);
    }

    @l
    public com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b e(@l ViewPager2 viewPager20, @l Adapter recyclerView$Adapter0) {
        @s0({"SMAP\nViewPager2Attacher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewPager2Attacher.kt\ncom/tbuonomo/viewpagerdotsindicator/attacher/ViewPager2Attacher$buildPager$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
        public static final class com.tbuonomo.viewpagerdotsindicator.attacher.d.a implements com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b {
            @m
            private OnPageChangeCallback a;
            final ViewPager2 b;

            com.tbuonomo.viewpagerdotsindicator.attacher.d.a(ViewPager2 viewPager20) {
                this.b = viewPager20;
                super();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public void a(int v, boolean z) {
                this.b.s(v, z);
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public int b() {
                return this.b.getCurrentItem();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public void c(@l g g0) {
                public static final class com.tbuonomo.viewpagerdotsindicator.attacher.d.a.a extends OnPageChangeCallback {
                    final g a;

                    com.tbuonomo.viewpagerdotsindicator.attacher.d.a.a(g g0) {
                        this.a = g0;
                        super();
                    }

                    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
                    public void b(int v, float f, int v1) {
                        super.b(v, f, v1);
                        this.a.b(v, f);
                    }
                }

                L.p(g0, "onPageChangeListenerHelper");
                com.tbuonomo.viewpagerdotsindicator.attacher.d.a.a d$a$a0 = new com.tbuonomo.viewpagerdotsindicator.attacher.d.a.a(g0);
                this.a = d$a$a0;
                L.m(d$a$a0);
                this.b.n(d$a$a0);
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public void d() {
                OnPageChangeCallback viewPager2$OnPageChangeCallback0 = this.a;
                if(viewPager2$OnPageChangeCallback0 != null) {
                    this.b.x(viewPager2$OnPageChangeCallback0);
                }
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public boolean e() {
                return f.g(this.b);
            }

            @m
            public final OnPageChangeCallback f() {
                return this.a;
            }

            public final void g(@m OnPageChangeCallback viewPager2$OnPageChangeCallback0) {
                this.a = viewPager2$OnPageChangeCallback0;
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public int getCount() {
                Adapter recyclerView$Adapter0 = this.b.getAdapter();
                return recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public boolean isEmpty() {
                return f.d(this.b);
            }
        }

        L.p(viewPager20, "attachable");
        L.p(recyclerView$Adapter0, "adapter");
        return new com.tbuonomo.viewpagerdotsindicator.attacher.d.a(viewPager20);
    }

    @m
    public Adapter f(@l ViewPager2 viewPager20) {
        L.p(viewPager20, "attachable");
        return viewPager20.getAdapter();
    }

    public void g(@l ViewPager2 viewPager20, @l Adapter recyclerView$Adapter0, @l a a0) {
        public static final class com.tbuonomo.viewpagerdotsindicator.attacher.d.b extends AdapterDataObserver {
            final a a;

            com.tbuonomo.viewpagerdotsindicator.attacher.d.b(a a0) {
                this.a = a0;
                super();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void f() {
                super.f();
                this.a.invoke();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void g(int v, int v1) {
                super.g(v, v1);
                this.a.invoke();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void h(int v, int v1, @m Object object0) {
                super.h(v, v1, object0);
                this.a.invoke();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void i(int v, int v1) {
                super.i(v, v1);
                this.a.invoke();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void k(int v, int v1, int v2) {
                super.k(v, v1, v2);
                this.a.invoke();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
            public void l(int v, int v1) {
                super.l(v, v1);
                this.a.invoke();
            }
        }

        L.p(viewPager20, "attachable");
        L.p(recyclerView$Adapter0, "adapter");
        L.p(a0, "onChanged");
        recyclerView$Adapter0.registerAdapterDataObserver(new com.tbuonomo.viewpagerdotsindicator.attacher.d.b(a0));
    }
}

