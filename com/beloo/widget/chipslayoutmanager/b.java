package com.beloo.widget.chipslayoutmanager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import java.util.Iterator;

public class b implements Iterable {
    private LayoutManager a;

    public b(LayoutManager recyclerView$LayoutManager0) {
        this.a = recyclerView$LayoutManager0;
    }

    @Override
    public Iterator iterator() {
        class a implements Iterator {
            int a;
            final b b;

            a() {
                this.a = 0;
            }

            public View a() {
                LayoutManager recyclerView$LayoutManager0 = b.this.a;
                int v = this.a;
                this.a = v + 1;
                return recyclerView$LayoutManager0.i0(v);
            }

            @Override
            public boolean hasNext() {
                return this.a < b.this.a.j0();
            }

            @Override
            public Object next() {
                return this.a();
            }
        }

        return new a(this);
    }

    public int size() {
        return this.a.j0();
    }
}

