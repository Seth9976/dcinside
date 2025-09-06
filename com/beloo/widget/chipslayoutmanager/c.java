package com.beloo.widget.chipslayoutmanager;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.Recycler;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.beloo.widget.chipslayoutmanager.layouter.m;
import java.util.Iterator;

class c implements g {
    class a {
        private SparseArray a;
        private SparseArray b;
        final c c;

        a() {
            this.a = new SparseArray();
            this.b = new SparseArray();
        }

        SparseArray c() {
            return this.a;
        }

        SparseArray d() {
            return this.b;
        }

        int e() {
            return this.a.size() + this.b.size();
        }
    }

    private com.beloo.widget.chipslayoutmanager.layouter.g a;
    private b b;
    private m c;
    private int d;

    c(com.beloo.widget.chipslayoutmanager.layouter.g g0, b b0, m m0) {
        this.a = g0;
        this.b = b0;
        this.c = m0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.g
    public int a(Recycler recyclerView$Recycler0) {
        Integer integer0 = 0x7FFFFFFF;
        Integer integer1 = 0x80000000;
        Iterator iterator0 = this.b.iterator();
        while(true) {
            boolean z = false;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            View view0 = (View)object0;
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(!recyclerView$LayoutParams0.g()) {
                int v = recyclerView$Recycler0.g(recyclerView$LayoutParams0.d());
                if(v < ((int)this.a.v()) || v > ((int)this.a.D())) {
                    z = true;
                }
            }
            if(recyclerView$LayoutParams0.g() || z) {
                ++this.d;
                integer0 = Math.min(((int)integer0), this.c.j(view0));
                integer1 = Math.max(((int)integer1), this.c.b(view0));
            }
        }
        return ((int)integer0) == 0x7FFFFFFF ? 0 : ((int)integer1) - ((int)integer0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.g
    public int b() {
        return this.d;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.g
    public a c(Recycler recyclerView$Recycler0) {
        a c$a0 = new a(this);
        for(Object object0: recyclerView$Recycler0.l()) {
            View view0 = ((ViewHolder)object0).itemView;
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(recyclerView$LayoutParams0.g()) {
            }
            else if(recyclerView$LayoutParams0.c() < ((int)this.a.v())) {
                c$a0.a.put(recyclerView$LayoutParams0.c(), view0);
            }
            else if(recyclerView$LayoutParams0.c() > ((int)this.a.D())) {
                c$a0.b.put(recyclerView$LayoutParams0.c(), view0);
            }
        }
        return c$a0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.g
    public void reset() {
        this.d = 0;
    }
}

