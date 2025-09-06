package com.dcinside.app.gallery.status;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.dcinside.app.Application;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class b extends FragmentPagerAdapter {
    @l
    private final int[] n;
    @l
    private final Class[] o;

    public b(@l FragmentManager fragmentManager0) {
        L.p(fragmentManager0, "fm");
        super(fragmentManager0);
        this.n = new int[]{0x7F150608, 0x7F150519};  // string:managed_gallery "운영 중 갤러리"
        this.o = new Class[]{n.class, t.class};
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public int e() {
        return this.o.length;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    @m
    public CharSequence g(int v) {
        return Application.e.c().getString(this.n[v]);
    }

    @Override  // androidx.fragment.app.FragmentPagerAdapter
    @l
    public Fragment v(int v) {
        Fragment fragment0 = Fragment.instantiate(Application.e.c(), this.o[v].getName(), null);
        L.o(fragment0, "instantiate(...)");
        return fragment0;
    }
}

