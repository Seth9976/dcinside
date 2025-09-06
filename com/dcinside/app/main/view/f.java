package com.dcinside.app.main.view;

import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager.c;

public final class f implements c {
    public final CrowdView a;

    public f(CrowdView crowdView0) {
        this.a = crowdView0;
    }

    @Override  // com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager$c
    public final void a(int v, int v1) {
        CrowdView.C(this.a, v, v1);
    }
}

