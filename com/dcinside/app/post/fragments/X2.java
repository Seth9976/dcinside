package com.dcinside.app.post.fragments;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;

public final class x2 implements OnRefreshListener {
    public final N3 a;

    public x2(N3 n30) {
        this.a = n30;
    }

    @Override  // androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OnRefreshListener
    public final void a() {
        N3.j6(this.a);
    }
}

