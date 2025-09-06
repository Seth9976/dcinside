package com.beloo.widget.chipslayoutmanager.util;

import androidx.recyclerview.widget.RecyclerView.LayoutManager;

public class b {
    public static void a(LayoutManager recyclerView$LayoutManager0) {
        static final class a implements Runnable {
            final LayoutManager a;

            a(LayoutManager recyclerView$LayoutManager0) {
                this.a = recyclerView$LayoutManager0;
                super();
            }

            @Override
            public void run() {
                this.a.g2();
                this.a.h2();
            }
        }

        recyclerView$LayoutManager0.U1(new a(recyclerView$LayoutManager0));
    }
}

