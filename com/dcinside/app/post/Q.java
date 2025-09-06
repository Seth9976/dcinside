package com.dcinside.app.post;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

public final class q extends OnScrollListener {
    public interface a {
        void E();

        boolean W();
    }

    private WeakReference a;

    public q(a q$a0) {
        this.a = new WeakReference(q$a0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrolled(@NonNull RecyclerView recyclerView0, int v, int v1) {
        if(v1 != 0) {
            a q$a0 = (a)this.a.get();
            if(q$a0 != null && q$a0.W()) {
                q$a0.E();
            }
        }
    }
}

