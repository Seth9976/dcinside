package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

public final class d {
    class a extends AdapterDataObserver {
        final d a;

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void f() {
            d.this.d();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void g(int v, int v1) {
            d.this.d();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void h(int v, int v1, @Nullable Object object0) {
            d.this.d();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void i(int v, int v1) {
            d.this.d();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void k(int v, int v1, int v2) {
            d.this.d();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
        public void l(int v, int v1) {
            d.this.d();
        }
    }

    public interface b {
        void a(@NonNull i arg1, int arg2);
    }

    static class c extends OnPageChangeCallback {
        @NonNull
        private final WeakReference a;
        private int b;
        private int c;

        c(TabLayout tabLayout0) {
            this.a = new WeakReference(tabLayout0);
            this.d();
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
        public void a(int v) {
            this.b = this.c;
            this.c = v;
            TabLayout tabLayout0 = (TabLayout)this.a.get();
            if(tabLayout0 != null) {
                tabLayout0.d0(this.c);
            }
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
        public void b(int v, float f, int v1) {
            Object object0 = this.a.get();
            if(((TabLayout)object0) != null) {
                ((TabLayout)object0).W(v, f, this.c != 2 || this.b == 1, this.c != 2 || this.b != 0, false);
            }
        }

        @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
        public void c(int v) {
            TabLayout tabLayout0 = (TabLayout)this.a.get();
            if(tabLayout0 != null && tabLayout0.getSelectedTabPosition() != v && v < tabLayout0.getTabCount()) {
                boolean z = this.c == 0 || this.c == 2 && this.b == 0;
                tabLayout0.S(tabLayout0.D(v), z);
            }
        }

        void d() {
            this.c = 0;
            this.b = 0;
        }
    }

    static class com.google.android.material.tabs.d.d implements f {
        private final ViewPager2 a;
        private final boolean b;

        com.google.android.material.tabs.d.d(ViewPager2 viewPager20, boolean z) {
            this.a = viewPager20;
            this.b = z;
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void N(i tabLayout$i0) {
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void R(i tabLayout$i0) {
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void j(@NonNull i tabLayout$i0) {
            this.a.s(tabLayout$i0.k(), this.b);
        }
    }

    @NonNull
    private final TabLayout a;
    @NonNull
    private final ViewPager2 b;
    private final boolean c;
    private final boolean d;
    private final b e;
    @Nullable
    private Adapter f;
    private boolean g;
    @Nullable
    private c h;
    @Nullable
    private f i;
    @Nullable
    private AdapterDataObserver j;

    public d(@NonNull TabLayout tabLayout0, @NonNull ViewPager2 viewPager20, @NonNull b d$b0) {
        this(tabLayout0, viewPager20, true, d$b0);
    }

    public d(@NonNull TabLayout tabLayout0, @NonNull ViewPager2 viewPager20, boolean z, @NonNull b d$b0) {
        this(tabLayout0, viewPager20, z, true, d$b0);
    }

    public d(@NonNull TabLayout tabLayout0, @NonNull ViewPager2 viewPager20, boolean z, boolean z1, @NonNull b d$b0) {
        this.a = tabLayout0;
        this.b = viewPager20;
        this.c = z;
        this.d = z1;
        this.e = d$b0;
    }

    public void a() {
        if(this.g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        Adapter recyclerView$Adapter0 = this.b.getAdapter();
        this.f = recyclerView$Adapter0;
        if(recyclerView$Adapter0 == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.g = true;
        c d$c0 = new c(this.a);
        this.h = d$c0;
        this.b.n(d$c0);
        com.google.android.material.tabs.d.d d$d0 = new com.google.android.material.tabs.d.d(this.b, this.d);
        this.i = d$d0;
        this.a.h(d$d0);
        if(this.c) {
            a d$a0 = new a(this);
            this.j = d$a0;
            this.f.registerAdapterDataObserver(d$a0);
        }
        this.d();
        this.a.U(this.b.getCurrentItem(), 0.0f, true);
    }

    public void b() {
        if(this.c) {
            Adapter recyclerView$Adapter0 = this.f;
            if(recyclerView$Adapter0 != null) {
                recyclerView$Adapter0.unregisterAdapterDataObserver(this.j);
                this.j = null;
            }
        }
        this.a.N(this.i);
        this.b.x(this.h);
        this.i = null;
        this.h = null;
        this.f = null;
        this.g = false;
    }

    public boolean c() {
        return this.g;
    }

    void d() {
        this.a.L();
        Adapter recyclerView$Adapter0 = this.f;
        if(recyclerView$Adapter0 != null) {
            int v = recyclerView$Adapter0.getItemCount();
            for(int v1 = 0; v1 < v; ++v1) {
                i tabLayout$i0 = this.a.I();
                this.e.a(tabLayout$i0, v1);
                this.a.l(tabLayout$i0, false);
            }
            if(v > 0) {
                int v2 = this.a.getTabCount();
                int v3 = Math.min(this.b.getCurrentItem(), v2 - 1);
                if(v3 != this.a.getSelectedTabPosition()) {
                    i tabLayout$i1 = this.a.D(v3);
                    this.a.R(tabLayout$i1);
                }
            }
        }
    }
}

