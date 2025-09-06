package com.dcinside.app.write;

import androidx.recyclerview.widget.RecyclerView;

public final class u2 implements Runnable {
    public final RecyclerView a;
    public final y2 b;
    public final int c;

    public u2(RecyclerView recyclerView0, y2 y20, int v) {
        this.a = recyclerView0;
        this.b = y20;
        this.c = v;
    }

    @Override
    public final void run() {
        y2.P(this.a, this.b, this.c);
    }
}

