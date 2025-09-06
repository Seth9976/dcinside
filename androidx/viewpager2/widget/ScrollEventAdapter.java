package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

final class ScrollEventAdapter extends OnScrollListener {
    static final class ScrollEventValues {
        int a;
        float b;
        int c;

        void a() {
            this.a = -1;
            this.b = 0.0f;
            this.c = 0;
        }
    }

    private OnPageChangeCallback a;
    @NonNull
    private final ViewPager2 b;
    @NonNull
    private final RecyclerView c;
    @NonNull
    private final LinearLayoutManager d;
    private int e;
    private int f;
    private ScrollEventValues g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;
    private static final int r = 4;
    private static final int s = -1;

    ScrollEventAdapter(@NonNull ViewPager2 viewPager20) {
        this.b = viewPager20;
        this.c = viewPager20.j;
        this.d = (LinearLayoutManager)viewPager20.j.getLayoutManager();
        this.g = new ScrollEventValues();
        this.o();
    }

    private void a(int v, float f, int v1) {
        OnPageChangeCallback viewPager2$OnPageChangeCallback0 = this.a;
        if(viewPager2$OnPageChangeCallback0 != null) {
            viewPager2$OnPageChangeCallback0.b(v, f, v1);
        }
    }

    private void b(int v) {
        OnPageChangeCallback viewPager2$OnPageChangeCallback0 = this.a;
        if(viewPager2$OnPageChangeCallback0 != null) {
            viewPager2$OnPageChangeCallback0.c(v);
        }
    }

    private void c(int v) {
        if(this.e == 3 && this.f == 0) {
            return;
        }
        if(this.f == v) {
            return;
        }
        this.f = v;
        OnPageChangeCallback viewPager2$OnPageChangeCallback0 = this.a;
        if(viewPager2$OnPageChangeCallback0 != null) {
            viewPager2$OnPageChangeCallback0.a(v);
        }
    }

    private int d() {
        return this.d.s();
    }

    double e() {
        this.r();
        return ((double)this.g.a) + ((double)this.g.b);
    }

    int f() {
        return this.f;
    }

    boolean g() {
        return this.f == 1;
    }

    boolean h() {
        return this.m;
    }

    boolean i() {
        return this.f == 0;
    }

    private boolean j() {
        return this.e == 1 || this.e == 4;
    }

    void k() {
        this.e = 4;
        this.q(true);
    }

    void l() {
        this.l = true;
    }

    void m() {
        if(this.g() && !this.m) {
            return;
        }
        this.m = false;
        this.r();
        ScrollEventValues scrollEventAdapter$ScrollEventValues0 = this.g;
        if(scrollEventAdapter$ScrollEventValues0.c == 0) {
            int v = scrollEventAdapter$ScrollEventValues0.a;
            if(v != this.h) {
                this.b(v);
            }
            this.c(0);
            this.o();
            return;
        }
        this.c(2);
    }

    void n(int v, boolean z) {
        this.e = z ? 2 : 3;
        boolean z1 = false;
        this.m = false;
        if(this.i != v) {
            z1 = true;
        }
        this.i = v;
        this.c(2);
        if(z1) {
            this.b(v);
        }
    }

    private void o() {
        this.e = 0;
        this.f = 0;
        this.g.a();
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView0, int v) {
        if((this.e != 1 || this.f != 1) && v == 1) {
            this.q(false);
            return;
        }
        if(this.j() && v == 2) {
            if(this.k) {
                this.c(2);
                this.j = true;
            }
            return;
        }
        if(this.j() && v == 0) {
            this.r();
            if(this.k) {
                ScrollEventValues scrollEventAdapter$ScrollEventValues0 = this.g;
                if(scrollEventAdapter$ScrollEventValues0.c == 0) {
                    int v2 = scrollEventAdapter$ScrollEventValues0.a;
                    if(this.h != v2) {
                        this.b(v2);
                    }
                    this.c(0);
                    this.o();
                }
            }
            else {
                int v1 = this.g.a;
                if(v1 != -1) {
                    this.a(v1, 0.0f, 0);
                }
                this.c(0);
                this.o();
            }
        }
        if(this.e == 2 && v == 0 && this.l) {
            this.r();
            ScrollEventValues scrollEventAdapter$ScrollEventValues1 = this.g;
            if(scrollEventAdapter$ScrollEventValues1.c == 0) {
                int v3 = scrollEventAdapter$ScrollEventValues1.a;
                if(this.i != v3) {
                    if(v3 == -1) {
                        v3 = 0;
                    }
                    this.b(v3);
                }
                this.c(0);
                this.o();
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrolled(@NonNull RecyclerView recyclerView0, int v, int v1) {
        int v2;
        this.k = true;
        this.r();
        if(this.j) {
            this.j = false;
            if(v1 <= 0 && (v1 != 0 || v < 0 != this.b.k())) {
                v2 = this.g.a;
            }
            else {
                ScrollEventValues scrollEventAdapter$ScrollEventValues0 = this.g;
                v2 = scrollEventAdapter$ScrollEventValues0.c == 0 ? this.g.a : scrollEventAdapter$ScrollEventValues0.a + 1;
            }
            this.i = v2;
            if(this.h != v2) {
                this.b(v2);
            }
        }
        else if(this.e == 0) {
            this.b((this.g.a == -1 ? 0 : this.g.a));
        }
        this.a((this.g.a == -1 ? 0 : this.g.a), this.g.b, this.g.c);
        if((this.g.a == this.i || this.i == -1) && this.g.c == 0 && this.f != 1) {
            this.c(0);
            this.o();
        }
    }

    void p(OnPageChangeCallback viewPager2$OnPageChangeCallback0) {
        this.a = viewPager2$OnPageChangeCallback0;
    }

    private void q(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int v = this.i;
        if(v != -1) {
            this.h = v;
            this.i = -1;
        }
        else if(this.h == -1) {
            this.h = this.d();
        }
        this.c(1);
    }

    private void r() {
        int v7;
        ScrollEventValues scrollEventAdapter$ScrollEventValues0 = this.g;
        int v = this.d.s();
        scrollEventAdapter$ScrollEventValues0.a = v;
        if(v == -1) {
            scrollEventAdapter$ScrollEventValues0.a();
            return;
        }
        View view0 = this.d.c0(v);
        if(view0 == null) {
            scrollEventAdapter$ScrollEventValues0.a();
            return;
        }
        int v1 = this.d.B0(view0);
        int v2 = this.d.M0(view0);
        int v3 = this.d.P0(view0);
        int v4 = this.d.h0(view0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            v1 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin;
            v2 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin;
            v3 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin;
            v4 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin;
        }
        int v5 = view0.getHeight() + v3 + v4;
        int v6 = view0.getWidth();
        if(this.d.b3() == 0) {
            v7 = view0.getLeft() - v1 - this.c.getPaddingLeft();
            if(this.b.k()) {
                v7 = -v7;
            }
            v5 = v6 + v1 + v2;
        }
        else {
            v7 = view0.getTop() - v3 - this.c.getPaddingTop();
        }
        scrollEventAdapter$ScrollEventValues0.c = -v7;
        if(-v7 < 0) {
            throw new AnimateLayoutChangeDetector(this.d).d() ? new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.") : new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", scrollEventAdapter$ScrollEventValues0.c));
        }
        scrollEventAdapter$ScrollEventValues0.b = v5 == 0 ? 0.0f : ((float)(-v7)) / ((float)v5);
    }
}

