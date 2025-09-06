package com.dcinside.app.archive.main;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.dcinside.app.Application;
import com.dcinside.app.archive.page.f;
import com.dcinside.app.archive.page.k;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.r0;
import y4.l;
import y4.m;

public final class h extends FragmentPagerAdapter {
    private final boolean n;
    @l
    private final int[] o;
    @l
    private final Class[] p;

    public h(@l FragmentManager fragmentManager0, boolean z) {
        L.p(fragmentManager0, "fm");
        super(fragmentManager0);
        this.n = z;
        this.o = new int[]{0x7F1500F8, 0x7F1500F9};  // string:archive_tab_title_post "게시물"
        this.p = new Class[]{f.class, k.class};
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public int e() {
        return this.p.length;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    @m
    public CharSequence g(int v) {
        return Application.e.c().getString(this.o[v]);
    }

    @Override  // androidx.fragment.app.FragmentPagerAdapter
    @l
    public Fragment v(int v) {
        Fragment fragment0 = Fragment.instantiate(Application.e.c(), this.p[v].getName());
        L.o(fragment0, "instantiate(...)");
        fragment0.setArguments(BundleKt.b(new V[]{r0.a("search_mode", Boolean.valueOf(this.n))}));
        return fragment0;
    }
}

