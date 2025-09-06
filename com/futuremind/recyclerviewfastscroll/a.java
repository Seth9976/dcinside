package com.futuremind.recyclerviewfastscroll;

import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class a extends OnScrollListener {
    public interface com.futuremind.recyclerviewfastscroll.a.a {
        void a(float arg1);
    }

    private final FastScroller a;
    List b;
    int c;

    public a(FastScroller fastScroller0) {
        this.b = new ArrayList();
        this.c = 0;
        this.a = fastScroller0;
    }

    public void a(com.futuremind.recyclerviewfastscroll.a.a a$a0) {
        this.b.add(a$a0);
    }

    public void b(float f) {
        for(Object object0: this.b) {
            ((com.futuremind.recyclerviewfastscroll.a.a)object0).a(f);
        }
    }

    void c(RecyclerView recyclerView0) {
        int v2;
        int v1;
        int v;
        if(this.a.m()) {
            v = recyclerView0.computeVerticalScrollOffset();
            v1 = recyclerView0.computeVerticalScrollExtent();
            v2 = recyclerView0.computeVerticalScrollRange();
        }
        else {
            v = recyclerView0.computeHorizontalScrollOffset();
            v1 = recyclerView0.computeHorizontalScrollExtent();
            v2 = recyclerView0.computeHorizontalScrollRange();
        }
        float f = ((float)v) / ((float)(v2 - v1));
        this.a.setScrollerPosition(f);
        this.b(f);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView0, int v) {
        super.onScrollStateChanged(recyclerView0, v);
        if(v == 0 && this.c != 0) {
            this.a.getViewProvider().h();
        }
        else if(v != 0 && this.c == 0) {
            this.a.getViewProvider().i();
        }
        this.c = v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrolled(RecyclerView recyclerView0, int v, int v1) {
        if(this.a.o()) {
            this.c(recyclerView0);
        }
    }
}

