package com.tbuonomo.viewpagerdotsindicator.attacher;

import A3.a;
import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager;
import com.tbuonomo.viewpagerdotsindicator.f;
import com.tbuonomo.viewpagerdotsindicator.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

public final class e extends b {
    @Override  // com.tbuonomo.viewpagerdotsindicator.attacher.b
    public com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b a(Object object0, Object object1) {
        return this.e(((ViewPager)object0), ((PagerAdapter)object1));
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.attacher.b
    public Object b(Object object0) {
        return this.f(((ViewPager)object0));
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.attacher.b
    public void c(Object object0, Object object1, a a0) {
        this.g(((ViewPager)object0), ((PagerAdapter)object1), a0);
    }

    @l
    public com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b e(@l ViewPager viewPager0, @l PagerAdapter pagerAdapter0) {
        @s0({"SMAP\nViewPagerAttacher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewPagerAttacher.kt\ncom/tbuonomo/viewpagerdotsindicator/attacher/ViewPagerAttacher$buildPager$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
        public static final class com.tbuonomo.viewpagerdotsindicator.attacher.e.a implements com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b {
            @m
            private OnPageChangeListener a;
            final ViewPager b;

            com.tbuonomo.viewpagerdotsindicator.attacher.e.a(ViewPager viewPager0) {
                this.b = viewPager0;
                super();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public void a(int v, boolean z) {
                this.b.S(v, z);
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public int b() {
                return this.b.getCurrentItem();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public void c(@l g g0) {
                public static final class com.tbuonomo.viewpagerdotsindicator.attacher.e.a.a implements OnPageChangeListener {
                    final g a;

                    com.tbuonomo.viewpagerdotsindicator.attacher.e.a.a(g g0) {
                        this.a = g0;
                        super();
                    }

                    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
                    public void a(int v, float f, int v1) {
                        this.a.b(v, f);
                    }

                    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
                    public void b(int v) {
                    }

                    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
                    public void d(int v) {
                    }
                }

                L.p(g0, "onPageChangeListenerHelper");
                com.tbuonomo.viewpagerdotsindicator.attacher.e.a.a e$a$a0 = new com.tbuonomo.viewpagerdotsindicator.attacher.e.a.a(g0);
                this.a = e$a$a0;
                L.m(e$a$a0);
                this.b.c(e$a$a0);
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public void d() {
                OnPageChangeListener viewPager$OnPageChangeListener0 = this.a;
                if(viewPager$OnPageChangeListener0 != null) {
                    this.b.O(viewPager$OnPageChangeListener0);
                }
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public boolean e() {
                return f.f(this.b);
            }

            @m
            public final OnPageChangeListener f() {
                return this.a;
            }

            public final void g(@m OnPageChangeListener viewPager$OnPageChangeListener0) {
                this.a = viewPager$OnPageChangeListener0;
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public int getCount() {
                PagerAdapter pagerAdapter0 = this.b.getAdapter();
                return pagerAdapter0 == null ? 0 : pagerAdapter0.e();
            }

            @Override  // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$b
            public boolean isEmpty() {
                return f.c(this.b);
            }
        }

        L.p(viewPager0, "attachable");
        L.p(pagerAdapter0, "adapter");
        return new com.tbuonomo.viewpagerdotsindicator.attacher.e.a(viewPager0);
    }

    @m
    public PagerAdapter f(@l ViewPager viewPager0) {
        L.p(viewPager0, "attachable");
        return viewPager0.getAdapter();
    }

    public void g(@l ViewPager viewPager0, @l PagerAdapter pagerAdapter0, @l a a0) {
        public static final class com.tbuonomo.viewpagerdotsindicator.attacher.e.b extends DataSetObserver {
            final a a;

            com.tbuonomo.viewpagerdotsindicator.attacher.e.b(a a0) {
                this.a = a0;
                super();
            }

            @Override  // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                this.a.invoke();
            }
        }

        L.p(viewPager0, "attachable");
        L.p(pagerAdapter0, "adapter");
        L.p(a0, "onChanged");
        pagerAdapter0.m(new com.tbuonomo.viewpagerdotsindicator.attacher.e.b(a0));
    }
}

