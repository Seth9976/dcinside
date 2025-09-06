package com.dcinside.app.view;

import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager.c;

public final class q implements c {
    public final MenuPageIndicator a;

    public q(MenuPageIndicator menuPageIndicator0) {
        this.a = menuPageIndicator0;
    }

    @Override  // com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager$c
    public final void a(int v, int v1) {
        MenuPageIndicator.W(this.a, v, v1);
    }
}

