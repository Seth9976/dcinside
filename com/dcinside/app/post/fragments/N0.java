package com.dcinside.app.post.fragments;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;

public final class n0 implements OnRefreshListener {
    public final S0 a;

    public n0(S0 s00) {
        this.a = s00;
    }

    @Override  // androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OnRefreshListener
    public final void a() {
        S0.p4(this.a);
    }
}

