package com.dcinside.app.view.tool;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class NonPredictiveLayoutManager extends LinearLayoutManager {
    static final class a extends LinearSmoothScroller {
        public a(@l Context context0) {
            L.p(context0, "context");
            super(context0);
        }

        @Override  // androidx.recyclerview.widget.LinearSmoothScroller
        public int t(int v, int v1, int v2, int v3, int v4) {
            return v2 + (v3 - v2) / 2 - (v + (v1 - v) / 2);
        }
    }

    private boolean O;
    private boolean P;

    public NonPredictiveLayoutManager() {
        super(null);
        this.O = true;
    }

    public NonPredictiveLayoutManager(int v, boolean z) {
        super(null, v, z);
        this.O = true;
    }

    public NonPredictiveLayoutManager(@m Context context0, int v, boolean z) {
        super(context0, v, z);
        this.O = true;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public boolean C2() {
        return false;
    }

    public final boolean F3() {
        return this.O;
    }

    public final boolean G3() {
        return this.P;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public boolean H() {
        return super.H() && this.O;
    }

    public final void H3(boolean z) {
        this.O = z;
    }

    public final void I3(boolean z) {
        this.P = z;
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void y2(@l RecyclerView recyclerView0, @m State recyclerView$State0, int v) {
        L.p(recyclerView0, "recyclerView");
        if(this.P) {
            Context context0 = recyclerView0.getContext();
            L.o(context0, "getContext(...)");
            a nonPredictiveLayoutManager$a0 = new a(context0);
            nonPredictiveLayoutManager$a0.q(v);
            this.z2(nonPredictiveLayoutManager$a0);
            return;
        }
        super.y2(recyclerView0, recyclerView$State0, v);
    }
}

