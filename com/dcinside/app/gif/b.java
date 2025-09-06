package com.dcinside.app.gif;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public final class b implements View.OnClickListener {
    public final c a;
    public final ViewHolder b;

    public b(c c0, ViewHolder recyclerView$ViewHolder0) {
        this.a = c0;
        this.b = recyclerView$ViewHolder0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        c.A(this.a, this.b, view0);
    }
}

