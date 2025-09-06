package com.beloo.widget.chipslayoutmanager.cache;

import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

class c implements a {
    private LayoutManager a;
    private NavigableSet b;
    private NavigableSet c;
    private int d;
    private boolean e;
    private static final String f = "c";
    private static final int g = 1000;

    static {
    }

    c(LayoutManager recyclerView$LayoutManager0) {
        this.b = new TreeSet();
        this.c = new TreeSet();
        this.d = 1000;
        this.a = recyclerView$LayoutManager0;
        this.e = true;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public Parcelable a() {
        return new CacheParcelableContainer(this.b, this.c);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public boolean b(int v) {
        return this.c.contains(v);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public void c(int v) {
        if(this.k()) {
            return;
        }
        Log.d("c", "cache purged to position " + v);
        Iterator iterator0 = this.b.headSet(v).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            iterator0.remove();
        }
        Iterator iterator1 = this.c.headSet(v).iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
            iterator1.remove();
        }
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public void d(@Nullable Parcelable parcelable0) {
        if(parcelable0 == null) {
            return;
        }
        if(!(parcelable0 instanceof CacheParcelableContainer)) {
            throw new IllegalStateException("wrong parcelable passed");
        }
        this.b = ((CacheParcelableContainer)parcelable0).c();
        this.c = ((CacheParcelableContainer)parcelable0).a();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public int e(int v) {
        Integer integer0 = (Integer)this.b.floor(v);
        if(integer0 == null) {
            integer0 = v;
        }
        return (int)integer0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public Integer f() {
        return this.k() ? null : ((Integer)this.c.last());
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public void g(List list0) {
        if(this.e && !list0.isEmpty()) {
            Pair pair0 = (Pair)list0.get(0);
            Pair pair1 = (Pair)list0.get(list0.size() - 1);
            int v = this.a.K0(((View)pair0.second));
            int v1 = this.a.K0(((View)pair1.second));
            this.o();
            this.b.add(v);
            this.c.add(v1);
        }
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public boolean h(int v) {
        return this.b.contains(v);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public void i() {
        this.b.clear();
        this.c.clear();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public void j(boolean z) {
        if(this.e == z) {
            return;
        }
        Log.i("c", (z ? "caching enabled" : "caching disabled"));
        this.e = z;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public boolean k() {
        return this.c.isEmpty();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public void l(int v) {
        if(this.k()) {
            return;
        }
        Iterator iterator0 = this.b.tailSet(v, true).iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            iterator0.remove();
        }
        Integer integer0 = (Integer)this.b.lower(v);
        if(integer0 != null) {
            v = (int)integer0;
        }
        Iterator iterator1 = this.c.tailSet(v, true).iterator();
        while(iterator1.hasNext()) {
            iterator1.next();
            iterator1.remove();
        }
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public boolean m() {
        return this.e;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.cache.a
    public boolean n(int v) {
        return this.b.ceiling(v) != null || this.c.ceiling(v) != null;
    }

    private void o() {
        if(this.b.size() > this.d) {
            this.b.remove(this.b.first());
        }
        if(this.c.size() > this.d) {
            this.c.remove(this.c.first());
        }
    }

    public void p(int v) {
        this.d = v;
    }
}

