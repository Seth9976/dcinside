package com.dcinside.app.push;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;

public final class f0 implements OnRefreshListener {
    public final z0 a;

    public f0(z0 z00) {
        this.a = z00;
    }

    @Override  // androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OnRefreshListener
    public final void a() {
        z0.k1(this.a);
    }
}

