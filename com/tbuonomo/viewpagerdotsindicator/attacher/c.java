package com.tbuonomo.viewpagerdotsindicator.attacher;

import A3.a;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.tbuonomo.viewpagerdotsindicator.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

final class c extends b {
    @l
    private final PagerSnapHelper a;

    public c(@l PagerSnapHelper pagerSnapHelper0) {
        L.p(pagerSnapHelper0, "snapHelper");
        super();
        this.a = pagerSnapHelper0;
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.attacher.b
    public com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b a(Object object0, Object object1) {
        return this.e(((RecyclerView)object0), ((Adapter)object1));
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.attacher.b
    public Object b(Object object0) {
        return this.f(((RecyclerView)object0));
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.attacher.b
    public void c(Object object0, Object object1, a a0) {
        this.h(((RecyclerView)object0), ((Adapter)object1), a0);
    }

    @l
    public com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b e(@l RecyclerView recyclerView0, @l Adapter recyclerView$Adapter0) {
        @s0({"SMAP\nRecyclerAttacher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecyclerAttacher.kt\ncom/tbuonomo/viewpagerdotsindicator/attacher/RecyclerAttacher$buildPager$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
        public static final class com.tbuonomo.viewpagerdotsindicator.attacher.c.a implements com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b {
            @m
            private OnScrollListener a;
            final Adapter b;
            final c c;
            final RecyclerView d;

            com.tbuonomo.viewpagerdotsindicator.attacher.c.a(Adapter recyclerView$Adapter0, c c0, RecyclerView recyclerView0) {
                this.b = recyclerView$Adapter0;
                this.c = c0;
                this.d = recyclerView0;
                super();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public void a(int v, boolean z) {
                if(z) {
                    this.d.smoothScrollToPosition(v);
                    return;
                }
                this.d.scrollToPosition(v);
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public int b() {
                View view0 = this.c.g().h(this.d.getLayoutManager());
                if(view0 != null) {
                    LayoutManager recyclerView$LayoutManager0 = this.d.getLayoutManager();
                    L.n(recyclerView$LayoutManager0, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    return ((LinearLayoutManager)recyclerView$LayoutManager0).K0(view0);
                }
                return 0;
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public void c(@l g g0) {
                @s0({"SMAP\nRecyclerAttacher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecyclerAttacher.kt\ncom/tbuonomo/viewpagerdotsindicator/attacher/RecyclerAttacher$buildPager$1$addOnPageChangeListener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
                public static final class com.tbuonomo.viewpagerdotsindicator.attacher.c.a.a extends OnScrollListener {
                    final c a;
                    final g b;

                    com.tbuonomo.viewpagerdotsindicator.attacher.c.a.a(c c0, g g0) {
                        this.a = c0;
                        this.b = g0;
                        super();
                    }

                    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
                    public void onScrolled(@l RecyclerView recyclerView0, int v, int v1) {
                        L.p(recyclerView0, "attachable");
                        View view0 = this.a.g().h(recyclerView0.getLayoutManager());
                        if(view0 != null) {
                            LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                            Integer integer0 = recyclerView$LayoutManager0 == null ? null : recyclerView$LayoutManager0.K0(view0);
                            if(integer0 != null) {
                                this.b.b(integer0.intValue(), ((float)v));
                            }
                        }
                    }
                }

                L.p(g0, "onPageChangeListenerHelper");
                com.tbuonomo.viewpagerdotsindicator.attacher.c.a.a c$a$a0 = new com.tbuonomo.viewpagerdotsindicator.attacher.c.a.a(this.c, g0);
                this.a = c$a$a0;
                L.m(c$a$a0);
                this.d.addOnScrollListener(c$a$a0);
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public void d() {
                OnScrollListener recyclerView$OnScrollListener0 = this.a;
                if(recyclerView$OnScrollListener0 != null) {
                    this.d.removeOnScrollListener(recyclerView$OnScrollListener0);
                }
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public boolean e() {
                return this.b.getItemCount() > 0;
            }

            @m
            public final OnScrollListener f() {
                return this.a;
            }

            public final void g(@m OnScrollListener recyclerView$OnScrollListener0) {
                this.a = recyclerView$OnScrollListener0;
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public int getCount() {
                return this.b.getItemCount();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public boolean isEmpty() {
                return this.b.getItemCount() == 0;
            }
        }

        L.p(recyclerView0, "attachable");
        L.p(recyclerView$Adapter0, "adapter");
        return new com.tbuonomo.viewpagerdotsindicator.attacher.c.a(recyclerView$Adapter0, this, recyclerView0);
    }

    @m
    public Adapter f(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "attachable");
        return recyclerView0.getAdapter();
    }

    @l
    public final PagerSnapHelper g() {
        return this.a;
    }

    public void h(@l RecyclerView recyclerView0, @l Adapter recyclerView$Adapter0, @l a a0) {
        public static final class com.tbuonomo.viewpagerdotsindicator.attacher.c.b extends AdapterDataObserver {
            final a a;

            com.tbuonomo.viewpagerdotsindicator.attacher.c.b(a a0) {
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

        L.p(recyclerView0, "attachable");
        L.p(recyclerView$Adapter0, "adapter");
        L.p(a0, "onChanged");
        recyclerView$Adapter0.registerAdapterDataObserver(new com.tbuonomo.viewpagerdotsindicator.attacher.c.b(a0));
    }
}

